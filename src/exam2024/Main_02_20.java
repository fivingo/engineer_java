package exam2024;

// 2024년 2회 20번
// 실행 결과

public class Main_02_20 {
    public static void main(String[] args) {
        String str = "ITISTESTSTRING";
        String[] result = str.split("T");   // 문자열 T를 기준으로 분리하고 배열 생성

        System.out.print(result[3]);
    }
}
