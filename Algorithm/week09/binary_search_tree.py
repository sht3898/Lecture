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
        self._root = Node(key=key)
        if self._root is None:
            return False
        elif key == self._root.get_key():
            return True
        elif key < self._root.get_key():
            return self.search_by_key(self._root.get_left(), key=key)
        else:
            return self.search_by_key(self._root.get_right(), key=key)

    '''def search_by_key(self, key):
        if self.get_key() is None:
            return False
        elif self.get_key() == key:
            return True
        elif self.get_key() > key:
            return self.get_left().search_by_key(key)
        else:
            return self.get_right().search_by_key(key)'''

    def insert_node(self, key, value):
        if self._root is None:
            self._root = Node(key=key, value=value, parent=self._root)
            self._size = self._size+1
        else:
            self.__insert_node(current_node=self._root, key=key, value=value)

    def __insert_node(self, current_node, key, value):
        if key <= current_node.get_key():
            if current_node.get_left():
                self.__insert_node(current_node=current_node.get_left(), key=key,value=value)
            else:
                current_node._left = Node(key=key, value=value)
        elif key > current_node.get_key():
            if current_node.get_right():
                self.__insert_node(current_node=current_node.get_right(), key=key, value=value)
            else:
                current_node._right = Node(key=key,value=value)

    '''def insert_node(self, key, value):
        if self._root is None:
            self._root = Node(key=key, value=value, parent=self._root)
            self._size = self._size+1
        else:
            self.__insert_node(current_node=self._root, key=key, value=value)

    def __insert_node(self, current_node, key, value):
        if current_node.get_key() >= key:
            if current_node.get_left() is not None:
                return self.__insert_node(current_node.get_left(), key, value)
            else:
                current_node._left = Node(key, value)
        else:
            if current_node.get_right() is not None:
                return self.__insert_node(current_node.get_right(), key, value)
            else:
                current_node._right = Node(key, value)'''

    def find_min(self, current_node=None):
        pass

    '''def delete_node(self, key):
        if self._size > 1:
            temp = self._root
            while temp:
                if temp.get_left() and temp.get_left().get_key() == key:
                    temp._left = None
                    self._size = self._size-1
                    break
                if temp.get_right() and temp.get_right().get_key() == key:
                    temp._right = None
                    self._size = self._size-1
                    break
                if temp.get_key() > key:
                    temp = temp._left
                else:
                    temp = temp._right'''

    def delete_node(self, key):
        self._root, deleted = self._deleted_node(node=self._root, key=key)
        return deleted

    def _deleted_node(self, node, key):
        if node is None:
            return node, False
        if key == node.get_key():
            deleted = True
            if node.get_left() and node.get_right():
                parent = node
                child = node.get_right()
                while child.get_left() is not None:
                    parent = child
                    child = child.get_left()
                child._left = node.get_left()
                if parent != node:
                    parent._left = child._right
                    child._right = node._right
                node = child
            elif node.get_left() or node.get_right():
                node = node.get_left() or node. get_right()
            else:
                node = None
        elif key < node.get_key():
            node._left, deleted = self._deleted_node(node.get_left(),key=key)
        else:
            node._right, deleted = self._deleted_node(node.get_right(), key=key)
        return node, deleted

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
