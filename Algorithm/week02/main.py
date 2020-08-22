from dealer import Dealer


def main():
    dealer = Dealer()
    user_input = None
    hands = list()

    while user_input != 'n':
        print('----+ 당신의 패 ----+')
        for hand in hands:
            print('{0} {1}'.format(hand.suit,hand.rank))
        user_input = input('카드를 더 받을까요? (y/n): ')
        user_input = user_input.strip()
        user_input = user_input.lower()
        if user_input == 'y':
            hands.append(dealer.get_card())

    print('----+ 당신의 점수 ----+')
    print('총점: {0}'.format(dealer.get_values(hands)))


if __name__ == '__main__':
    main()