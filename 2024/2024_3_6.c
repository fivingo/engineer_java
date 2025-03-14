#include <stdio.h>

// 2024년 3회 6번
// 실행 결과

int increment()
{
    static int x = 0;
    x += 2;

    return x;
}

int main()
{
    int x = 1;
    int sum = 0;

    for (int i = 0; i < 4; i++)
    {
        x++;
        sum += increment();
    }

    printf("%d", sum);
}
