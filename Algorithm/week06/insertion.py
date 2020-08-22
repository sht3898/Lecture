def _swap(input_list, index_a, index_b):
    temp = input_list[index_a]
    input_list[index_a] = input_list[index_b]
    input_list[index_b] = temp


def insertion_sort(target, reverse=False):
    if reverse is False:
        i = 1
        while i < len(target):
            j = i
            while j > 0 and target[j-1] > target[j]:
                _swap(target, j, j-1)
                j = j-1
            i = i+1
    else:
        i = 1
        while i < len(target):
            j = i
            while j > 0 and target[j - 1] < target[j]:
                _swap(target, j, j-1)
                j = j - 1
            i = i + 1