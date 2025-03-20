package exam2022;

// 2022년 1회 17번
// 전역 메서드, 객체 참조
// 실행 결과

class A {
    int a;
    int b;
}

public class Main_01_17 {
    static void func1(A m) {
        m.a *= 10;
    }

    static void func2(A m) {
        m.a += m.b;
    }

    public static void main(String[] args) {
        A m = new A();

        m.a = 100;

        func1(m);

        m.b = m.a;

        func2(m);

        System.out.printf("%d", m.a);
    }
}
