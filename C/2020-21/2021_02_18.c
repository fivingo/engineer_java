#include <stdio.h>

// 2021년 2회 16번
// 배열과 포인터 연산
// 실행 결과

int main() {
    int ary[3];
    int s = 0;

    *(ary + 0) = 1;             // 0번 인덱스
    ary[1] = *(ary + 0) + 2;    // 0번 인덱스 + 2
    ary[2] = *ary + 3;          // 0번 인덱스 + 3

    for (int i = 0; i < 3; i++)
        s = s + ary[i];

    printf("%d", s);
}