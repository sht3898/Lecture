import time
import matplotlib.pyplot as plt

import change_money_list as cml
import change_money_saved_list as cmsl
import change_money_dp_list as dp

def func_logn(num_loop):
    while num_loop > 0:
        num_loop = num_loop // 2



def func_n(num_loop):
    for index in range(0, num_loop):
        pass


def func_n2(num_loop):
    for index in range(0, num_loop):
        for index2 in range(0, num_loop):
            pass


def main():
    x_data = range(0, 51, 1)  # X 축
    y_data1 = list()  # Y축1
    y_data2 = list()  # Y축2
    y_data3 = list()  # Y축3

    coin_value_list = [1, 5, 10, 21, 25]

    for x in x_data:  # X축 만큼 순환
        # Y1
        start_time = time.time()

        cml.make_change(coin_value_list, x)

        end_time = time.time()
        execution_time = end_time - start_time
        y_data1.append(execution_time)

        # Y2
        start_time = time.time()

        known_result = list()
        for index in range(0, x + 1):
            known_result.append(None)
        cmsl.make_change(coin_value_list, x, known_result)

        end_time = time.time()
        execution_time = end_time - start_time
        y_data2.append(execution_time)

        # Y3
        start_time = time.time()

        known_result = [[]] * (x + 1)
        dp.make_change(coin_value_list, x, known_result)

        end_time = time.time()
        execution_time = end_time - start_time
        y_data3.append(execution_time)

    # 차트 그리기
    plt.plot(x_data, y_data1, 'r.-', label='DP')
    plt.plot(x_data, y_data2, 'g.-', label='Saved_Recursion')
    plt.plot(x_data, y_data3, 'b.-', label='Recursion')
    # 범례 추가
    plt.legend(bbox_to_anchor=(0.005, 0.95), loc=2, borderaxespad=0.0)
    plt.title('Time Complexity')  # 제목
    plt.ylabel('Execution time (sec)')  # Y축
    plt.xlabel('N')  # X축
    # 차트 저장 및 표시
    plt.savefig('time_complexity_dp.png', bbox_inches='tight')  # 차트 저장
    plt.show() # 차트 표시
    plt.close()  # 차트 닫기


if __name__ == '__main__':
    main()