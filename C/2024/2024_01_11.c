#include <stdio.h>

// 2024년 1회 11번
// 구조체 정의, 구조체 포인터 멤버 접근
// 실행 결과

typedef struct {
    int accNum;
    double bal;
} BankAcc;

double sim_pow(double base, int year) {
    int i;
    double r = 1.0;

    for (i = 0; i < year; i++)
        r = r * base;

    return r;
}

void initAcc(BankAcc *acc, int x, double y) {
    acc->accNum = x;
    acc->bal = y;
}

void xxx(BankAcc *acc, double *en) {
    if (*en > 0 && *en < acc->bal)
        acc->bal = acc->bal - *en;
    else
        acc->bal = acc->bal + *en;
}

void yyy(BankAcc *acc) {
    acc->bal = acc->bal * sim_pow((1 + 0.1), 3);
}

int main() {
    BankAcc myAcc;          // 구조체 변수 선언

    initAcc(&myAcc, 9981, 2200.0);  // 함수 호출, 구조체 변수의 주소값 인자로 전달

    double amount = 100.0;  // double 자료형 | 8byte

    xxx(&myAcc, &amount);   // 함수 호출, 구조체 변수의 주소값 인자로 전달
    yyy(&myAcc);            // 함수 호출, 구조체 변수의 주소값 인자로 전달

    printf("%d and %.2f", myAcc.accNum, myAcc.bal); // %.2f는 소수점 둘째 자리까지 표시

    return 0;
}