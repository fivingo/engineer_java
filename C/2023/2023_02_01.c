#include <stdio.h>

// 2023년 2회 1번
// 배열, for문
// 괄호 채우기

int main() {
    int n[5];
    int i;

    for (i = 0; i < 5; i++) {
        printf("숫자를 입력해주세요:");
        scanf("%d", &n[i]);
    }

    for (i = 0; i < 5; i++)
        // 문제
//      printf("%d", (            ));
        printf("%d", n[(i + 1) % 5]);

    return 0;
}

// [조건]
// 입력값이 54321일 경우
// 출력값이 43215로 출력되어야 한다.