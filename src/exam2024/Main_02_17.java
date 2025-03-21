package exam2024;

// 2024년 2회 17번
// 재귀 메서드, 문자열 처리
// 실행 결과

public class Main_02_17 {
    public static String rf(String str, int index, boolean[] seen) {
        if (index < 0) {        // 재귀 종료 조건
            return "";
        }
        
        // 문자열에서 해당 인덱스 문자 반환
        char c = str.charAt(index);

        // 재귀 메서드 | 문자열 앞부터 체크
        String result = rf(str, index - 1, seen);

        // 해당 인덱스(문자)가 없으면 true로 바꾸고 문자를 반환
        if (!seen[c]) {         // 문자를 ASCII 코드를 인덱스로 사용
            seen[c] = true;

            return c + result;  // 반환된 메서드의 결과(문자)를 뒤에 붙임
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "abacabcd";
        int length = str.length();
        boolean[] seen = new boolean[256];  // 기본값은 false

        System.out.print(rf(str, length - 1, seen));
    }
}
