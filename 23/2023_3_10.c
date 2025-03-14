#include <stdio.h>

// 2023년 3회 10번
// 실행 결과

int main()
{
    char *p = "KOREA";

    printf("%s\n", p);
    printf("%s\n", p + 1);
    printf("%c\n", *p);
    printf("%c\n", *(p + 3));
    printf("%c\n", *p + 4);
}