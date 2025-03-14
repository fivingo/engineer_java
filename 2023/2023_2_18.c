#include <stdio.h>

// 2023년 2회 18번
// 선택정렬(오름차순) 괄호 채우기

int main()
{
    int E[] = {64, 25, 12, 22, 11};
    int n = sizeof(E) / sizeof(E[0]);
    int i = 0;

    do
    {
        int j = i + 1;

        do
        {
//          if (E[i] ( ) E[j])
            if (E[i] > E[j])
            {
                int tmp = E[i];
                E[i] = E[j];
                E[j] = tmp;
            }

            j++;
        } while (j < n);

        i++;
    } while (i < n - 1);

    for (int i = 0; i <= 4; i++)
        printf("%d", E[i]);
}

// [보기]
// >, >=, <, <=, ==, /, %