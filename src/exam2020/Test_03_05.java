package exam2020;

// 2020년 3회 5번
// wihle문
// 실행 결과

public class Test_03_05 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i < 10) {
            i++;

            if (i % 2 == 1) {
                continue;       // 다음 루프로 바로 이동
            }

            sum += i;
        }

        System.out.print(sum);
    }
}
