package exam2024;

// 2024년 3회 1번
// 문자열 비교
// 실행 결과

public class Main_3_1 {
    static void func(String[] m, int n) {
        for (int i = 1; i < n; i++) {

            // 변수 내용 비교
            if (m[i - 1].equals(m[i])) {
                System.out.print("O");
            } else {
                System.out.print("N");
            }
        }

        // m배열 값 출력
        for (String mo : m) {
            System.out.print(mo);
        }
    }

    public static void main(String[] args) {
        String[] m = new String[3];

        m[0] = "A";
        m[1] = "A";
        m[2] = new String("A");

        func(m, 3);
    }
}
