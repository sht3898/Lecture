def _swap(input_list, index_a, index_b):
    temp = input_list[index_a]
    input_list[index_a] = input_list[index_b]
    input_list[index_b] = temp


def selection_sort(target, reverse=False):
    if reverse is False:
        for j in range(0, len(target) - 1):
            i_min = j
            for i in range(j+1, len(target)):
                if target[i] < target[i_min]:
                    i_min = i
            if i_min != j:
                _swap(target, i_min, j)
    else:
        for j in range(0, len(target) - 1):
            i_min = j
            for i in range(j+1, len(target)):
                if target[i] > target[i_min]:
                    i_min = i
            if i_min != j:
                _swap(target, i_min, j)
