package exam2023;

// 2023년 2회 14번
// 문자열 비교
// 실행 결과

public class Main_02_14 {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "Programming";
        String str3 = new String("Programming");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.print(str2.equals(str3));
    }
}
