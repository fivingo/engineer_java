#include <stdio.h>

// 2021년 1회 15번
// 구조체, 구조체 포인터
// 실행 결과

// 구조체 정의
struct good {
    char name[10];
    int age;
};

void main() {

    // 구조체 선언 및 초기화
    struct good s[] = {"Kim", 28, "Lee", 38, "Seo", 50, "Park", 35};

    // 구조체 포인터 선언
    struct good *p;

    p = s;  // 0번 인덱스의 주소 할당
    p++;    // 1번 인덱스를 가리킴

    // 구조체 포인터 멤버 접근
    printf("%s\n", p->name);
    printf("%d\n", p->age);
}