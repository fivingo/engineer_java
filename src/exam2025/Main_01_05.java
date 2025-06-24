package exam2025;

// 2025년 1회 5번
// 예외 처리
// 실행 결과

public class Main_01_05 {
    public static void main(String[] args) {
        int a = 5, b = 0;

        try {
            System.out.print(a / b);         // 예외가 발생할 수 있는 코드
        } catch (ArithmeticException e) {
            System.out.print("출력1");        // 수학적으로 계산할 수 없는 연산을 할때 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("출력2");        // 뱨열에 없는 인덱스 번호를 사용하려고 할 때 발생
        } catch (NumberFormatException e) {
            System.out.print("출력3");        // 숫자 형태가 아닌 문자열을 수자로 바꾸려고 할 때 발생
        } catch (Exception e) {
            System.out.print("출력4");        // 나머지 모든 예외 처리
        } finally {
            System.out.print("출력5");        // 예외 발생 여부와 상관없이, 반드시 실행
        }
    }
}
