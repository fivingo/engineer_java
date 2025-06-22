package exam2025;

// 2025년 1회 20번
// 메서드 오버로딩, 재귀 메서드
// 실행 결과

public class Main_01_20 {
    public static void main(String[] args) {
        System.out.println(calc("5"));
    }

    static int calc(int value) {
        if (value <= 1) return value;

        return calc(value - 1) + calc(value - 2);
    }

    static int calc(String str) {
        int value = Integer.valueOf(str);

        if (value <= 1) return value;

        return calc(value - 1) + calc(value - 3);
    }
}
