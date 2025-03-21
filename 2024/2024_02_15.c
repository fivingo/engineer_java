#include <stdio.h>

// 2024년 2회 15번
// 이차원 배열, 포인터 배열, 포인터 연산, (다중 역참조)
// 실행 결과

int main() {
    int arr[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int *parr[2] = {arr[1], arr[2]};

    printf("%d", parr[1][1] + *(parr[1] + 2) + **parr);

    return 0;
}