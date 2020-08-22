class FoodTruck(object):
    def __init__(self, price, making_time):
        self.price = price
        self.making_time = making_time
        self.current_order = None
        self.time_remaining = 0

    def tick(self):
        if self.current_order is not None:
            self.time_remaining = self.time_remaining - 1
            if self.time_remaining <= 0:
                self.current_order = None

    def is_busy(self):
        if (self.current_order == None) and (self.time_remaining == 0):
            return False
        else:
            return True

    def start_next_food(self, next_order):
        self.current_order = next_order
        self.time_remaining = self.making_time * next_order.get_qty()