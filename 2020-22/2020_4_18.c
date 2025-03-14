#include <stdio.h>


// 2020년 4회 18번
// 실행 결과

int main()
{
    char *p = "KOREA";

    printf("%s\n", p);
    printf("%s\n", p + 3);
    printf("%c\n", *p);
    printf("%c\n", *(p + 3));
    printf("%c\n", *p + 2);

    return 0;
}