#include <stdio.h>

// 2020년 1회 18번
// switch-case문
// 실행 결과

main() {
    int c = 1;

    switch (3) {
        case 1:
            c += 3;
        case 2:
            c++;
        case 3:
            c = 0;
        case 4:
            c += 3;
        case 5:
            c -= 10;
        default:
            c--;
    }

    printf("%d", c);
}