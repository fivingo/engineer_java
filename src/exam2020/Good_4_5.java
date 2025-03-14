package exam2020;

// 2020년 4회 5번
// 2진수 변환 | 괄호 채우기

public class Good_4_5 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int i = 0;
        int n = 10;

//      while (  A  ) {
        while (n > 0) {
//      while (n >= 1) {
//      while (i < 8) {
//      while (i <= 7) {
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
