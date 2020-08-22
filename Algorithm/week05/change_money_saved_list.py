import time
import random


def make_change(coin_value_list, coin_change, known_result, counter=0):
    counter = counter + 1
    min_coins = coin_change
    min_coins_list = list()

    if coin_change in coin_value_list:
        min_coins_list.append(coin_change)
        known_result[coin_change] = min_coins_list
        return 1, counter, min_coins_list
    elif known_result[coin_change] is not None:
        return len(known_result[coin_change]), counter, known_result[coin_change]
    else:
        coins = list()
        for coin in coin_value_list:
            if coin <= coin_change:
                coins.append(coin)
        for coin in coins:
            new = list()
            new.append(coin)
            result = make_change(coin_value_list, coin_change - coin, known_result, counter=counter)
            num_coins = 1 + result[0]
            coins_list = new + result[2]
            counter = result[1]
            if num_coins <= min_coins:
                min_coins = num_coins
                min_coins_list = coins_list
                known_result[coin_change] = min_coins_list
    return min_coins, counter, min_coins_list


def main():
    """
    잔돈 거스르기
    """
    coin_value_list = [1, 5, 10, 21, 25]  # 동전의 종류
    # coin_value_list = [1, 5, 10, 25]  # 동전의 종류
    random.shuffle(coin_value_list)
    coin_change = input('거스름돈: ')  # 거스름돈
    coin_change = int(coin_change)  # 인트형으로 바꾸자!
    known_result = list()
    for index in range(0, coin_change+1):
        known_result.append(None)

    start = time.time()
    print(make_change(coin_value_list, coin_change, known_result))
    end = time.time()
    return_time = end-start
    print('Time: {0:7.3f}'.format(return_time))


if __name__ == '__main__':
    main()