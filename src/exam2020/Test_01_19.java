package exam2020;

// 2020년 1회 19번
// 실행 결과

public class Test_01_19 {
    static int[] arr() {
        int[] a = new int[4];
        int b = a.length;

        for (int i = 0; i < b; i++) {
            a[i] = i;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = arr();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
