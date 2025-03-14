#include <stdio.h>

// 2023년 3회 8번
// 실행 결과

int f(int n)
{
    if (n <= 1)
        return 1;
    else
        return n * f(n - 1);
}

int main()
{
    printf("%d", f(7));
}