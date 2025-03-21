#include <stdio.h>

// 2023년 1회 2번
// 문자열 배열, 배열
// 실행 결과

int main() {
    char a[] = "Art";
    char *p = NULL;
    p = a;

    printf("%s\n", a);
    printf("%c\n", *p);
    printf("%c\n", *a);
    printf("%s\n", p);

    for (int i = 0; a[i] != '\0'; i++)
        printf("%c", a[i]);
}