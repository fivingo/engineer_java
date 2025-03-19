#include <stdio.h>

// 2021년 2회 16번
// 함수 선언과 정의
// 실행 결과

// 함수 선언
int mp(int base, int exp);

int main() {
    int res;

    res = mp(2, 10);

    printf("%d", res);

    return 0;
}

// 선언한 함수 정의
int mp(int base, int exp) {
    int res = 1;

    for (int i = 0; i < exp; i++)
        res = res * base;

    return res;
}