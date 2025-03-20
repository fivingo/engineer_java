package exam2023;

// 2023년 2회 2번
// 동전 교환 알고리즘 / 탐욕 알고리즘
// 괄호 채우기

public class Problem_2_2 {
    public static void main(String[] args) {
        int m = 4620;
        
        // 문제
//      int a = (              );
//      int b = (              );
//      int c = (              );
//      int d = (              );

        // [답]
        int a = m / 1000;
        int b = (m % 1000) / 500;
        int c = (m % 500) / 100;
        int d = (m % 100) / 10;

        System.out.println(a);  // 천원짜리 4장 출력
        System.out.println(b);  // 오백원짜리 1개 출력
        System.out.println(c);  // 백원짜리 1개 출력
        System.out.println(d);  // 십원짜리 2개 출력
    }
}

// [보기]
// 아래 주어진 항목들을 응용하여 괄호 안 코드를 작성.
// 변수 : m
// 연산자 : /, %
// 괄호 : [, ], (, )
// 정수 : 1000, 500, 100, 10
