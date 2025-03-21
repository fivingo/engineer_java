#include <stdio.h>
#include <stdlib.h>

// 2023년 3회 5번
// 구조체 변수 접근(Call by Value), 구조체 멤버 접근(Call by Reference)
// 괄호 채우기

typedef struct Data {   // 구조체 선언
    char c;
    int *numPtr;
} Data;

int main() {
    int num = 10;
    Data d1;                            // 구조체 변수
    Data *d2 = malloc(sizeof(Data));    // 구조체 포인터, 동적 메모리 할당

    d1.numPtr = &num;
    // 문제
//  d2(  )numPtr = &num;
    d2->numPtr = &num;

    printf("%d\n", *d1.numPtr);
    // 문제
//  printf("%d\n", *d1(  )numPtr);
    printf("%d\n", *d2->numPtr);

    free(d2);           // 메모리 할당 해제

    return 0;
}

// [출력결과]
// 10
// 10