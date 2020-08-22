import random


class Order(object):
    def __init__(self, order_time):
        self.order_time = order_time
        self.qty = random.randint(1, 5)


    def get_order_time(self):
        return self.order_time

    def get_qty(self):
        return self.qty

    def wait_time(self, current_time):
        return current_time - self.order_time
