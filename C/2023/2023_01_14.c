#include <stdio.h>

// 2023년 1회 14번
// 배열, 포인터, 버블 정렬
// 괄호 채우기(변수명)

void swap(int *a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    // 문제 1
//  a[( 1 )] = t;
    a[idx2] = t;
}

void Usort(int *a, int len) {
    for (int i = 0; i < len - 1; i++)
        for (int j = 0; j < len - 1; j++)
            if (a[j] > a[j + 1])
                swap(a, j, j + 1);
}

void main() {
    int a[] = {85, 75, 50, 100, 95};
    int nx = 5;
    // 문제 2
//  Usort(a, ( 2 ));
    Usort(a, nx);
}