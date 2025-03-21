package exam2020;

// 2020년 2회 19번
// 상속
// 실행 결과

class A {
    int a;

    public A(int n) {
        a = n;
    }

    public void print() {
        System.out.print("a=" + a);
    }
}

class B extends A {
    public B(int n) {
        super(n);
        super.print();
    }
}

public class Exam_02_19 {
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
