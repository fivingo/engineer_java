#include <stdio.h>

// 2020년 3회 2번
// 실행 결과

void main()
{
    int c = 0;
    int i = 0;

    while (i < 10)
    {
        i++;
        c *= i;
    }

    printf("%d", c);
}