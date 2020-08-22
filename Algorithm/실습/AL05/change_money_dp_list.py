def make_change(coin_value_list, coin_change, known_result):
    pass


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
