package exam2022;

// 2022년 3회 20번
// for문, 논리 연산자
// 실행 결과

public class Exam_3_20 {
    public static void main(String[] args) {
        int a = 0;

        for (int i = 1; i < 999; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                a = i;
            }
        }

        System.out.print(a);
    }
}
