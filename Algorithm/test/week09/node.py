class Node(object):
    def __init__(self, key=None, value=None,
                 parent=None, left=None, right=None):
        self._key = key
        self._value = value
        self._parent = parent
        self._left = left
        self._right = right

    def set_key(self, key):
        self._key = key

    def get_key(self):
        return self._key

    def set_value(self, value):
        self._value = value

    def get_value(self):
        return self._value

    def set_parent(self, parent):
        self._parent = parent

    def get_parent(self):
        return self._parent

    def set_left(self, left):
        self._left = left

    def get_left(self):
        return self._left

    def set_right(self, right):
        self._right = right

    def get_right(self):
        return self._right

    def __str__(self):
        return str({'key': self._key, 'value': self._value,
                    'left': self._left, 'right': self._right})
