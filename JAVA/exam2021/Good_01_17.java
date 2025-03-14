package exam2021;

// 2021년 1회 17번
// 실행 결과

public class Good_01_17 {
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j = 0; i <= 5; i++) {
            j += i;

            System.out.print(i);

            if (i == 5) {
                System.out.print(" = ");
                System.out.print(j);
            } else {
                System.out.print(" + ");
            }
        }
    }
}
