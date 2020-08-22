import time
import random


counter = 0


def make_change(coin_value_list, coin_change, known_result):
    """
    잔돈
    """
    global counter
    counter = counter + 1
    min_coins = coin_change

    if coin_change in coin_value_list:
        known_result[coin_change] = 1
        return 1
    elif known_result[coin_change] > 0:
        return known_result[coin_change]
    else:
        coins = list()
        for coin in coin_value_list:
            if coin <= coin_change:
                coins.append(coin)
        for coin in coins:
            pass
    return min_coins


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
    print(make_change(coin_value_list, coin_change, [0] * (coin_change+1)))
    end = time.time()
    print(counter)
    return_time = end-start
    print('Time: {0:7.3f}'.format(return_time))
    print(COIN)

if __name__ == '__main__':
    main()