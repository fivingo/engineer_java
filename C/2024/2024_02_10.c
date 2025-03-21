#include <stdio.h>

// 2024년 2회 10번
// 함수 선언, switch-case문
// 실행 결과

void swap() {
    int a = 11;     // 함수의 지역 변수
    int b = 19;     // 함수의 지역 변수
    int t = a;
    a = b;
    b = t;
}

int main() {
    int a = 11;
    int b = 19;

    swap();         // 함수 내부의 처리가 main 함수의 변수에 영향없음

    switch (a) {
        case 1:
            b += 1;
        case 11:
            b += 2;
        default:
            b += 3;
            break;
    }

    printf("%d", a - b);
}