#include <stdio.h>
#include <stdlib.h>

// 2023년 3회 5번
// 구조체 멤버 접근 괄호 채우기

typedef struct Data
{
    char c;
    int *numPtr;
} Data;

int main()
{
    int num = 10;
    Data d1;
    Data *d2 = malloc(sizeof(Data));

    d1.numPtr = &num;
//  d2(  )numPtr = &num;
    d2->numPtr = &num;

    printf("%d\n", *d1.numPtr);
//  printf("%d\n", *d1(  )numPtr);
    printf("%d\n", *d2->numPtr);

    free(d2);

    return 0;
}

// [출력결과]
// 10
// 10