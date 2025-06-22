package exam2025;

// 2025년 1회 5번
// 예외 처리
// 실행 결과

public class Main_01_05 {
    public static void main(String[] args) {
        int a = 5, b = 0;

        try {
            System.out.print(a / b);
        } catch (ArithmeticException e) {
            System.out.print("출력1");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("출력2");
        } catch (NumberFormatException e) {
            System.out.print("출력3");
        } catch (Exception e) {
            System.out.print("출력4");
        } finally {
            System.out.print("출력5");
        }
    }
}
