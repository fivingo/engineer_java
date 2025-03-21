#include <stdio.h>

// 2022년 3회 4번
// 이중 for문
// 실행 결과

void main() {
    int result[5] = {};
    int arr[5] = {77, 32, 10, 99, 50};

    for (int i = 0; i < 5; i++) {
        result[i] = 1;

        for (int j = 0; j < 5; j++) {
            if (arr[i] < arr[j])
                result[i]++;
        }
    }

    for (int k = 0; k < 5; k++) {
        printf("%d", result[k]);
    }
}