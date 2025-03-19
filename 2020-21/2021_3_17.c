#include <stdio.h>

// 2021년 3회 17번
// 구조체 포인터
// 실행 결과

// 구조체 정의
struct jsu {
    char nea[12];
    int os, db, hab, hhab;
};

int main() {

    // 구조체 배열 선언 및 초기화
    struct jsu st[3] = {
            {"데이터1", 95, 88},
            {"데이터2", 84, 91},
            {"데이터3", 86, 75}
    };
    struct jsu *p;  // 구조체 배열를 가르키는 포인터 선언

    p = &st[0];     // 포인터 p를 구조체 배열 st[0] 설정

    // 구조체 배열에서 포인터를 사용한 멤버 접근 및 값 설정
    (p + 1)->hab = (p + 1)->os + (p + 2)->db;
    (p + 1)->hhab = (p + 1)->hab + p->os + p->db;

    printf("%d\n", (p + 1)->hab + (p + 1)->hhab);
}