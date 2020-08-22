from node import Node


class BinarySearchTree(object):
    def __init__(self):
        self._root = None
        self._size = 0

    def get_size(self):
        return self._size

    def get_root(self):
        return self._root

    def search_by_key(self, key):
        pass

    def insert_node(self, key, value):
        pass

    def find_min(self, current_node=None):
        pass

    def delete_node(self, key):
        pass

    def print_bst(self):
        stack = list()
        current_node = self._root
        while True:
            while current_node is not None:
                stack.append(current_node)
                current_node = current_node.get_left()
            if len(stack) != 0:
                pop_node = stack.pop()
                print(pop_node.get_key(), pop_node.get_value())
                current_node = pop_node.get_right()
            else:
                break


def is_bst(root):
    isit = True
    queue = list()
    queue.append(root)
    while len(queue) != 0:
        current_node = queue.pop(0)
        if current_node.get_left() is not None:
            queue.append(current_node.get_left())
            if current_node.get_key() < current_node.get_left().get_key():
                isit = False
        if current_node.get_right() is not None:
            queue.append(current_node.get_right())
            if current_node.get_key() > current_node.get_right().get_key():
                isit = False

    return isit
