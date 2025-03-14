#include <stdio.h>

// 2021년 2회 16번
// 실행 결과

int mp(int base, int exp);

int main()
{
    int res;

    res = mp(2, 10);

    printf("%d", res);

    return 0;
}

int mp(int base, int exp)
{
    int res = 1;

    for (int i = 0; i < exp; i++)
        res = res * base;

    return res;
}