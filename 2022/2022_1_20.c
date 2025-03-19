#include <stdio.h>

// 2022년 1회 20번
// 함수 정의, 소인수 분해 알고리즘
// 실행 결과

// 함수 정의
int isPrime(int number) {
    int i;

    for (i = 2; i < number; i++)
        if (number % i == 0)
            return 0;

    return 1;
}

int main(void) {
    int number = 13195, max_div = 0, i;

    for (i = 2; i < number; i++)
        if (isPrime(i) == 1 && number % i == 0)
            max_div = i;

    printf("%d", max_div);

    return 0;
}