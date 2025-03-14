package exam2021;

// 2021년 2회 17번
// 괄호 채우기

public class Test_2_17 {
    public static void main(String[] args) {
        System.out.print(Test_2_17.check(1));
    }

//  (    ) String check(int num) {
    static String check(int num) {
        return (num >= 0) ? "positive" : "negative";
    }
}

// [출력결과]
// positive