#include <stdio.h>

// 2023년 1회 3번
// 포인터, 이중 for문
// 실행 결과

int main() {
    char *a = "qwer";
    char *b = "qwety";

    for (int i = 0; a[i] != '\0'; i++)
        for (int j = 0; b[j] != '\0'; j++)
            if (a[i] == b[j]) printf("%c", a[i]);
}