#include <stdio.h>

// 2024년 1회 19번
// 포인터, 배열, 문자열 처리
// 실행 결과

int main() {
    char *p = "It is 8";    // 문자 포인터 변수 | 'I'의 주소를 가리킴
    char result[100];
    int i;

    for (i = 0; p[i] != '\0'; i++) {
        if (isupper(p[i]))
            result[i] = (p[i] - 'A' + 5) % 26 + 'A';
        else if (islower(p[i]))
            result[i] = (p[i] - 'a' + 10) % 26 + 'a';
        else if (isdigit(p[i]))
            result[i] = (p[i] - '0' + 3) % 10 + '0';
        else if (!(isupper(p[i]) || islower(p[i]) || isdigit(p[i])))
            result[i] = p[i];
    }

    result[i] = '\0';

    printf("%s\n", result);

    return 0;
}