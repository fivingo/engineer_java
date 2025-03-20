#include <stdio.h>

// 2023년 3회 4번
// for문, 함수 정의
// 실행 결과

// 함수 정의
int test(int n) {
    int i, sum = 0;

    for (i = 1; i <= n / 2; i++)
        if (n % i == 0)
            sum += i;

    if (n == sum)
        return 1;

    return 0;
}

int main() {
    int i, sum = 0;

    for (i = 2; i <= 100; i++) {
        if (test(i))
            sum += i;
    }

    printf("%d", sum);

    return 0;
}