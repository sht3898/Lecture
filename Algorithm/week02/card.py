class Card(object):

    def __eq__(self, other):
        if (self.suit == other.suit) and (self.rank == other.rank):
            return True
        return False

    def __repr__(self):
        return '({0}, {1})'.format(self.suit, self.rank)

    def __init__(self, suit, rank):
        self.suit = suit
        self.rank = rank

    def get_value(self):
        return self.suit, self.rank
