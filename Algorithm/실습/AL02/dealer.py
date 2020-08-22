import random

from card import Card

SUIT = ['Spades', 'Diamonds', 'Hearts', 'Clubs']
RANK = ['Ace',
        '2', '3', '4', '5', '6', '7', '8', '9', '10',
        'Jack', 'Queen', 'King']
VALUE = {'Ace': 11,
         '2': 2, '3': 3, '4': 4, '5': 5, '6': 6,
         '7': 7, '8': 8, '9': 9, '10': 10,
         'Jack': 10, 'Queen': 10, 'King': 10}


class Dealer(object):
    def __init__(self):
        self._create_deck()
        random.shuffle(self.deck)

    def _create_deck(self):
        self.deck = list()
        for suit in SUIT:
            for rank in RANK:
                self.deck.append(Card(suit, rank))
        return self.deck

    def get_card(self):
        pass

    def get_values(self, cards):
        pass