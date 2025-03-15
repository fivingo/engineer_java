package exam2023;

// 2023년 1회 1번
// 정적(static) 멤버, 후치 연산자
// 실행 결과

class Static {
    public int a = 20;
    static int b = 0;
}

public class Test_1_1 {
    public static void main(String[] args) {
        int a = 10;
        Static.b = a;
        Static st = new Static();

        System.out.println(Static.b++);
        System.out.println(st.b);
        System.out.println(a);
        System.out.print(st.a);
    }
}
