package exam2025;

// 2025년 1회 20번
// 메서드 오버로딩, 재귀 메서드
// 실행 결과

public class Main_01_20 {
    public static void main(String[] args) {
        System.out.println(calc("5"));      // 인자값이 문자열
    }

    static int calc(int value) {
        if (value <= 1) return value;

        return calc(value - 1) + calc(value - 2);
    }

    static int calc(String str) {
        int value = Integer.valueOf(str);   // 문자열을 정수 타입으로 변환

        if (value <= 1) return value;

        return calc(value - 1) + calc(value - 3);   // 인자값이 정수
    }
}
