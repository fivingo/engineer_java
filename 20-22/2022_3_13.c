#include <stdio.h>

// 2022년 3회 13번
// 실행 결과

void main()
{
    int n;
    int k;
    int s;
    int el = 0;


    for (n = 6; n <= 30; n++)
    {
        s = 0;
        k = n / 2;

        for (int j = 1; j <= k; j++)
        {
            if (n % j == 0)
                s = s + j;
        }

        if (s == n)
        {
            el++;
        }
    }

    printf("%d", el);
}