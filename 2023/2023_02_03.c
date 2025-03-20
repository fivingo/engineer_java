#include <stdio.h>

// 2023년 2회 3번
// 전역 변수
// 실행 결과

char n[30];

char *test() {
    printf("입력하세요:");
    gets(n);    // 한 줄 입력 받는 함수

    return n;
}

int main() {
    char *test1;
    char *test2;
    char *test3;

    test1 = test();
    test2 = test();
    test3 = test();

    printf("%s\n", test1);
    printf("%s\n", test2);
    printf("%s", test3);
}

// [조건]
// 입력값은 홍길동, 김철수, 박영희 순서로 주어진다.