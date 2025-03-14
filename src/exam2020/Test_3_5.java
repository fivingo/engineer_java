package exam2020;

// 2020년 3회 5번
// 실행 결과

public class Test_3_5 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i < 10) {
            i++;

            if (i % 2 == 1) {
                continue;
            }

            sum += i;
        }

        System.out.print(sum);
    }
}
