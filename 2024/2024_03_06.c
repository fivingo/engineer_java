#include <stdio.h>

// 2024년 3회 6번
// 정적 지역 변수
// 실행 결과

int increment() {
    // 정적 지역 변수 | 함수 블록 안에서만 사용 가능, 함수가 끝나도 값이 유지됨
    static int x = 0;
    x += 2;

    return x;
}

int main() {
    int x = 1;
    int sum = 0;

    for (int i = 0; i < 4; i++) {
        x++;
        sum += increment();
    }

    printf("%d", sum);
}
