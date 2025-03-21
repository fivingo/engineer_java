#include <stdio.h>

// 2024년 2회 19번
// 구조체 정의, 포인터, 구조체 포인터 멤버 접근
// 실행 결과

struct node {
    int n1;
    struct node *n2;
};

int main() {
    struct node a = {10, 0};
    struct node b = {20, 0};
    struct node c = {30, 0};

    struct node *head = &a;
    a.n2 = &b;
    b.n2 = &c;

    printf("%d", head->n2->n1);

    return 0;
}