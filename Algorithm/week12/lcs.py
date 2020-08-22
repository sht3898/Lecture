def lcs(x, y):
    m = len(x)
    n = len(y)
    c = [[0] * (n + 1) for _ in range(m + 1)]
    for i in range(1, m+1):
        for j in range(1, n+1):
            if x[i-1] == y[j-1]:
                c[i][j] = c[i-1][j-1] + 1
            else:
                c[i][j] = max(c[i][j-1], c[i-1][j])
    return c


def backtrack(c, x, y, i, j):
    if i == 0 or j == 0:
        return ""
    elif x[i-1] == y[j-1]:
        return backtrack(c, x, y, i-1, j-1) + x[i-1]
    else:
        if c[i][j-1] > c[i-1][j]:
            return backtrack(c, x, y, i, j-1)
        else:
            return backtrack(c, x, y, i-1, j)


def backtrack_all(c, x, y, i, j):
    if i == 0 or j == 0:
        return set([""])
    elif x[i-1] == y[j-1]:
        return set([z+x[i-1] for z in backtrack_all(c, x, y, i-1, j-1)])
    else:
        r = set()
        if c[i][j-1] >= c[i-1][j]:
            r.update(backtrack_all(c, x, y, i, j-1))
        if c[i-1][j] >= c[i][j-1]:
            r.update(backtrack_all(c, x, y, i-1, j))
        return r


def main():
    x = "REALJMT"
    y = "EARMTJL"
    m = len(x)
    n = len(y)
    c = lcs(x, y)

    print("Some LCS: '%s'" % backtrack(c, x, y, m, n))
    print("All LCSs: %s" % backtrack_all(c, x, y, m, n), "\n")

    input_word = input("비속어인지 확인할 단어를 입력하세요: ")
    word = "시바"
    word2 = "개아이"
    input_length = len(input_word)
    word_length = len(word)
    word_length2 = len(word2)
    table = lcs(input_word, word)
    table2 = lcs(input_word, word2)
    if backtrack(table, input_word, word, input_length, word_length) == "시바":
        print("비속어가 있습니다.", backtrack_all(table, input_word, word, input_length, word_length))
    elif backtrack(table2, input_word, word2, input_length, word_length2) == "개아이":
        print("비속어가 있습니다.", backtrack_all(table2, input_word, word2, input_length, word_length2) )
    else:
        print("비속어가 아닙니다.")


if __name__ == "__main__":
    main()
