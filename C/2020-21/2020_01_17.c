d#include <stdio.h>

// 2020년 1회 17번
// 이중 for문, 버블 정렬
// 실행 결과

void align(int a[]) {
    int temp;

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4 - i; j++) {
            if (a[j] > a[j + 1]) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}

main() {
    int a[] = {85, 75, 50, 100, 95};

    align(a);

    for (int i = 0; i < 5; i++)
        printf("%d ", a[i]);
}