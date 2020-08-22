from node import Node


def print_pre2(tree):
    node_queue = [tree]
    result = list()

    while len(node_queue) > 0:
        node = node_queue.pop()
        print(node.get_key(), node.get_value())
        result.append(node.get_key())
        if False:  # FILL_HERE
            pass  # FILL_HERE
        if False:  # FILL_HERE
            pass  # FILL_HERE

    return result


def main():
    tree = Node(key=2)

    tree.set_left(Node(key=7))
    tree.set_right(Node(key=5))

    tree.get_left().set_left(Node(key=2))
    tree.get_left().set_right(Node(key=6))
    tree.get_right().set_right(Node(key=9))

    tree.get_left().get_right().set_left(Node(key=5))
    tree.get_left().get_right().set_right(Node(key=11))
    tree.get_right().get_right().set_left(Node(key=4))

    print('@ Start Pre Order @')
    print_pre2(tree)
    print('@ End Pre Order @')


if __name__ == '__main__':
    main()
