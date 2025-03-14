#include <stdio.h>

// 2023년 2회 3번
// 괄호 채우기

char n[30];
char *test()
{
    printf("입력하세요:");
    gets(n);

    return n;
}

int main()
{
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