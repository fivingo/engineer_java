#include <stdio.h>

#define MAX_SIZE 10     // 전역 상수 | 스택 크기

// 2023년 2회 9번
// 전역 변수, 전역 상수, 스택 알고리즘
// 실행 결과

int isWhat[MAX_SIZE];   // 전역 변수 선언 | 스택 배열, 크기는 고정
int point = -1;         // 전역 변수 선언 | top 위치

void into(int num) {    // push 연산
    if (point >= 10) printf("Full");

    isWhat[++point] = num;
}

int take() {            // pop 연산
    if (isEmpty() == 1) printf("Empty");

    return isWhat[point--];
}

int isEmpty() {         // 스택이 비었는지 확인
    if (point == -1) return 1;

    return 0;
}

int isFull() {          // 스택이 가득 찼는지 확인
    if (point == 10) return 1;

    return 0;
}

int main(int argc, char const *argv[]) {
    int e;

    into(5);
    into(2);

    while (!isEmpty()) {
        printf("%d", take());

        into(4);
        into(1);

        printf("%d", take());

        into(3);

        printf("%d", take());
        printf("%d", take());

        into(6);

        printf("%d", take());
        printf("%d", take());
    }

    return 0;
}