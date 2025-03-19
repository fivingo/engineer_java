package exam2021;

// 2021년 2회 17번
// 정적(static) 메서드 호출
// 괄호 채우기

public class Test_2_17 {
    public static void main(String[] args) {
        System.out.print(Test_2_17.check(1));   // 객체 생성 없이 클래스 이름으로 직접 호출
    }

    // 문제
//  (    ) String check(int num) {
    static String check(int num) {
        return (num >= 0) ? "positive" : "negative";
    }
}

// [출력결과]
// positive
