package exam2020;

// 2020년 4회 5번
// while문
// 2진수 변환 | 괄호 채우기(답이 여러개)

public class Good_4_5 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int i = 0;
        int n = 10;

        // 문제
//      while (  A  ) {
        while (n > 0) {
//      while (n >= 1) {
//      while (i < 8) {
//      while (i <= 7) {

            // 문제
//          a[i++] = ( B );
//          a[i++] = n & 1;
            a[i++] = n % 2;
            n /= 2;
        }

        for (i = 7; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}
