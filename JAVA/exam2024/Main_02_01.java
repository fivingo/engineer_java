package exam2024;

// 2024년 2회 1번
// 배열의 주소 값 비교
// 실행 결과

public class Main_02_01 {
    public static void check(int[] x, int[] y) {

        // 배열의 주소 값 비교
        if (x == y) {
            System.out.print("O");
        } else {
            System.out.print("N");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3, 4};
        int[] c = new int[]{1, 2, 3};

        check(a, b);
        check(b, c);
        check(a, c);
    }
}
