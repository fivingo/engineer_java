#include <stdio.h>

// 2024년 2회 11번
// 실행 결과

void func(char *d, char *s)
{
    int sum = 0;

    while (*s)
    {
        *d = *s;
        d++;
        s++;
    }

    *d = '\0';
}

int main()
{
    char *str1 = "first";
    char str2[50] = "teststring";
    int result = 0;

    func(str2, str1);

    for (int i = 0; str2[i] != '\0'; i++)
        result += i;

    printf("%d", result);

    return 0;
}