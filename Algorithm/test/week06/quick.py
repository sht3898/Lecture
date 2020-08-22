def _swap(input_list, index_a, index_b):
    temp = input_list[index_a]
    input_list[index_a] = input_list[index_b]
    input_list[index_b] = temp


def quick(target, lo, hi, reverse=False):
    if lo < hi:
        p = partition(target, lo, hi, reverse)
        quick(target, lo, p-1, reverse)
        quick(target, p+1, hi, reverse)


def quick_sort(target, reverse=False):
    quick(target, 0, len(target)-1, reverse)


def partition(target, lo, hi, reverse):
    pivot = target[hi]
    i = lo
    if reverse is False:
        for j in range(lo, hi):
            if target[j] < pivot:
                _swap(target, i, j)
                i = i+1
    else:
        for j in range(lo, hi):
            if target[j] > pivot:
                _swap(target, i, j)
                i = i + 1
    _swap(target, i, hi)
    return i

