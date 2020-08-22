def make_change(coin_value_list, coin_change, known_result):
    min_coins = [0] * (coin_change + 1)
    for cents in range(0, coin_change+1):
        coin_count = cents
        new_coin = 1
        coins = list()
        for coin in coin_value_list:
            if coin <= cents:
                coins.append(coin)
        for coin in coins:
            if min_coins[cents - coin] + 1 < coin_count:
                coin_count = min_coins[cents - coin] + 1
                new_coin = coin
            min_coins[cents] = coin_count
            known_result[cents] = [new_coin] + known_result[cents - new_coin]
    return min_coins[coin_change]


def main():
    coin_value_list = [1, 5, 10, 21, 25]
    coin_change = input('Change: ')
    coin_change = int(coin_change)
    known_result = [[]] * (coin_change+1)

    print('Making change for', coin_change, 'requires')
    print(make_change(coin_value_list, coin_change, known_result), 'coins')
    print('They are:')
    print(known_result[coin_change])
    print('The used list is as follows:')
    print(known_result)


if __name__ == '__main__':
    main()
