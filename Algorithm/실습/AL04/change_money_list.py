import time
import random


def make_change(coin_value_list, coin_change, counter = 0):
    pass


def main():
    """
    잔돈 거스르기
    """
    coin_value_list = [1, 5, 10, 21, 25]  # 동전의 종류
    # coin_value_list = [1, 5, 10, 25]  # 동전의 종류
    random.shuffle(coin_value_list)
    coin_change = input('거스름돈: ')  # 거스름돈
    coin_change = int(coin_change)  # 인트형으로 바꾸자!

    start = time.time()
    print(make_change(coin_value_list, coin_change))
    end = time.time()
    return_time = end-start
    print('Time: {0:7.3f}'.format(return_time))


if __name__ == '__main__':
    main()
