import random

class FoodZone(object):


    def __init__(self, order_probability):
        self.food_trucks = set()
        self.order_queue = list()
        self.waiting_times = list()
        self.income = list()
        self.order_probability = order_probability

    def add_truck(self, var_truck):
        self.food_trucks.add(var_truck)

    def is_new_order(self, picked_num = 0):
        if picked_num == 0:
            picked_num = random.randint(1, self.order_probability)
        if picked_num == self.order_probability:
            return True
        else:
            return False