#include <stdio.h>

// 2022년 2회 15번
// 함수 선언과 정의, 문자열 포인터 처리
// 실행 결과

// 함수 선언
int len(char *p);

int main() {

    // 문자열의 0번 인덱스 문자를 가리키는 포인터 변수 선언
    // C언어의 문자열은 항상 마지막 인덱스에 널 문자('\0')를 포함 -> 문자열의 끝을 표시하는 역할
    char *p1 = "2022";
    char *p2 = "202207";

    int a = len(p1);
    int b = len(p2);

    printf("%d", a + b);
}

// 함수 정의
int len(char *p) {
    int r = 0;

    while (*p != '\0') {
        p++;
        r++;
    }

    return r;
}