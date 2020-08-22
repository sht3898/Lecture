def _swap(input_list, index_a, index_b):
    temp = input_list[index_a]
    input_list[index_a] = input_list[index_b]
    input_list[index_b] = temp


def bubble_sort(target, reverse=False):
    swapped = True
    while swapped:
        swapped = False
        for index in range(0, len(target) - 1, 1):
            if reverse:
                if target[index] < target[index+1]:
                    _swap(target, index, index + 1)
                    swapped = True
            else:
                if target[index] > target[index+1]:
                    _swap(target, index, index + 1)
                    swapped = True
