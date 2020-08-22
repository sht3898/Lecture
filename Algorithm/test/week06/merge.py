def _merge_sort(target, reverse=False):
    if len(target) <= 1:
        return target

    left = []
    right = []
    mid = len(target)//2

    for x in target[:mid]:
        left.append(x)
    for x in target[mid:]:
        right.append(x)

    left = _merge_sort(left, reverse)
    right = _merge_sort(right, reverse)

    return merge(left, right, reverse)


def merge_sort(target, reverse=False):
    result = _merge_sort(target, reverse)
    target.clear()
    target.extend(result)


def merge(left, right, reverse):
    result = []
    while len(left) > 0 and len(right) > 0:
        if reverse is False:
            if left[0] <= right[0]:
                result.append(left.pop(0))
            else:
                result.append(right.pop(0))

        else:
            if left[0] <= right[0]:
                result.append(right.pop(0))
            else:
                result.append(left.pop(0))

    while len(left) > 0:
        result.append(left.pop(0))

    while len(right) > 0:
        result.append(right.pop(0))

    return result
