from order import Order
from food_truck import FoodTruck
from food_zone import FoodZone


def start_simulation(zone, test_second):
    pass


def print_food_zone_result(zone, open_seconds):
    average_wait = sum(zone.waiting_times) / len(zone.waiting_times)
    remain_order = len(zone.order_queue)
    total_income = sum(zone.income)
    setting_cost = len(zone.food_trucks) * 40000000
    recipe_cost = int(sum(zone.income)*0.3)
    staff_cost = (open_seconds//(60*60)) * 8350 * len(zone.food_trucks) * 1
    profit = total_income - setting_cost - recipe_cost - staff_cost
    for truck in zone.food_trucks:
        print('- Food price: {0:,d}, making time: {1:d}'.format(truck.price, truck.making_time))
    print('Average wait: {0:10.2f} secs'.format(average_wait))
    print('Order remain: {0:10d}'.format(remain_order))
    print('Total income: {0:10,d} Won'.format(total_income))
    print('Setting cost: {0:10,d} Won'.format(setting_cost))
    print('Recipe cost: {0:10,d} Won'.format(recipe_cost))
    print('Staff cost: {0:10,d} Won'.format(staff_cost))
    print('Profit: {0:10,d} Won'.format(profit))


def main():
    order_probability = 300
    open_seconds = 60*60*6*20*12
    food_list = [(2000, 60)]
    food_zone1 = FoodZone(order_probability)

    for price, making_time in food_list:
        food_zone1.add_truck(FoodTruck(price, making_time))

    start_simulation(food_zone1, open_seconds)
    print('----# Food zone 결과(영업 시간: {0:.1f}, 손님 확률: 대략 {1}초당 1명) #----'.format(
            open_seconds/(60*60), order_probability))
    print_food_zone_result(food_zone1, open_seconds)


if __name__ == '__main__':
    main()
