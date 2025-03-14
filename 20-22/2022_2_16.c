#include <stdio.h>

// 2022년 2회 16번
// 실행 결과

int main(int argc, char *argv[])
{
    int a[4] = {0, 2, 4, 8};
    int b[3] = {};
    int i = 1;
    int sum = 0;
    int *p1;

    for (i; i < 4; i++)
    {
        p1 = a + i;
        b[i - 1] = *p1 - a[i - 1];
        sum = sum + b[i - 1] + a[i];
    }

    printf("%d", sum);

    return 0;
}