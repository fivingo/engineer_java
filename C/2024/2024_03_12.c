#include <stdio.h>

// 2024년 3회 6번
// 구조체 정의, 재귀 구조체, 구조체 포인터 멤버 접근, (Linked List)
// 실행 결과

struct Node {
    int value;
    struct Node *next;  // 자기 참조 구조체 | 다음 노드를 가리키는 포인터
};

void func(struct Node *node) {
    while (node != NULL && node->next != NULL) {
        int t = node->value;
        node->value = node->next->value;
        node->next->value = t;
        node = node->next->next;
    }
}

int main() {
    struct Node n1 = {1, NULL};
    struct Node n2 = {2, NULL};
    struct Node n3 = {3, NULL};

    n1.next = &n3;
    n3.next = &n2;

    func(&n1);

    struct Node *current = &n1;

    while (current != NULL) {
        printf("%d", current->value);
        current = current->next;
    }
}