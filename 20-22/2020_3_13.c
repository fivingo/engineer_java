#include <stdio.h>

// 2020년 3회 13번
// 실행 결과

int r1()
{
    return 4;
}

int r10()
{
    return (30 + r1());
}

int r100()
{
    return (200 + r10());
}

int main()
{
    printf("%d\n", r100());

    return 0;
}