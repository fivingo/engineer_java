#include <stdio.h>

// 2023년 3회 8번
// 함수 정의
// 실행 결과

// 함수 정의
int f(int n) {
    if (n <= 1)
        return 1;
    else
        return n * f(n - 1);
}

int main() {
    printf("%d", f(7));
}