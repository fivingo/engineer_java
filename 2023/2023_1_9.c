#include <stdio.h>

// 2023년 1회 9번
// 괄호 채우기

int main() {
    int input = 101110;
    int di = 1;
    int sum = 0;

    while (1) {
        if (input == 0)
            break;
        else {
            // 문제
//          sum = sum + (input ( a ) ( b )) * di;
            sum = sum + (input % 10) * di;  // 답이 4개
//          sum = sum + (input % 5) * di;
//          sum = sum + (input % 2) * di;
//          sum = sum + (input & 1) * di;   // 비트 연산
            di = di * 2;
            input = input / 10;
        }
    }

    printf("%d", sum);

    return 0;
}

// 결과 : 46