package exam2024;

// 2024년 3회 16번
// 실행 결과

public class Main_3_16 {
    public static void main(String[] args) {
        int sum = 0;

        try {
            func();             // 예외 발생
        } catch (NullPointerException e) {  // 사용자가 정의한 예외 처리
            sum = sum + 1;
        } catch (Exception e) { // 예외가 이미 처리됐으므로 통과
            sum = sum + 10;
        } finally {             // 예외 발생 여부와 관계없이 실행
            sum = sum + 100;
        }

        System.out.print(sum);
    }

    // 사용자 정의 예외(자바 기본 예외 X)
    static void func() throws Exception {
        throw new NullPointerException();
    }dddd
}
