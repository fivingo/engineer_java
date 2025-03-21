#include <stdio.h>

// 2021년 3회 12번
// 포인터 배열과 주소값(&)
// 실행 결과

int main() {
    int *arr[3];    // 포인터 배열 선언
    int a = 12, b = 24, c = 36;

    arr[0] = &a;    // 변수 a의 주소값 저장
    arr[1] = &b;    // 변수 b의 주소값 저장
    arr[2] = &c;    // 변수 c의 주소값 저장

    printf("%d\n", *arr[1] + **arr + 1);    // **arr == *arr[0]
}