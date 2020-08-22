from node import Node


def print_pre(tree):
    print(tree.get_key(), tree.get_value())
    if tree.get_left() is not None:
        print_pre(tree.get_left())
    if tree.get_right() is not None:
        print_pre(tree.get_right())


def print_pre2(node):
    s = []
    result = []
    s.append(node)
    while len(s)>0:
        node = s.pop()
        result.append(node.get_key())
        if node.get_right() is not None:
            s.append(node.get_right())
        if node.get_left() is not None:
            s.append(node.get_left())
    return result


def print_in(tree):
    if tree.get_left() is not None:
        print_in(tree.get_left())
    print(tree.get_key(), tree.get_value())
    if tree.get_right() is not None:
        print_in(tree.get_right())


def print_in2(node):
    s = []
    result = []
    while len(s)>0 or node is not None:
        if node is not None:
            s.append(node)
            node = node.get_left()
        else:
            node = s.pop()
            result.append(node.get_key())
            node = node.get_right()
    return result


def print_post(tree):
    if tree.get_left() is not None:
        print_post(tree.get_left())
    if tree.get_right() is not None:
        print_post(tree.get_right())
    print(tree.get_key(), tree.get_value())


def print_post2(node):
    s = []
    result = []
    last = []
    while len(s) > 0 or node is not None:
        if node is not None:
            s.append(node)
            node = node.get_left()
        else:
            peek = s.pop()
            s.append(peek)
            if peek.get_right() is not None and last != peek.get_right():
                node = peek.get_right()
            else:
                result.append(peek.get_key())
                last = s.pop()
    return result


def print_level(tree):
    node_queue = [tree]
    result = list()

    while len(node_queue) > 0:
        tree = node_queue.pop(0)
        print(tree.get_key(), tree.get_value())
        result.append(tree.get_key())
        if tree.get_left() is not None:
            node_queue.append(tree.get_left())
        if tree.get_right() is not None:
            node_queue.append(tree.get_right())
    return result


def main():
    tree = Node(key=2, value='F')

    tree.set_left(Node(key=7, value='B'))
    tree.set_right(Node(key=5, value='G'))

    tree.get_left().set_left(Node(key=2, value='A'))
    tree.get_left().set_right(Node(key=6, value='D'))
    tree.get_right().set_right(Node(key=9, value='I'))

    tree.get_left().get_right().set_left(Node(key=5, value='C'))
    tree.get_left().get_right().set_right(Node(key=11, value='E'))
    tree.get_right().get_right().set_left(Node(key=4, value='H'))

    print("@ Start Pre Order @")
    print_pre(tree)
    print("@ End Pre Order @")
    print("@ Start In Order @")
    print_in(tree)
    print("@ End In Order @")
    print("@ Start Post Order @")
    print_post(tree)
    print("@ End Post Order @")
    print("@ Start Level Order @")
    print_level(tree)
    print("@ End Level Order @")


if __name__ == '__main__':
    main()
