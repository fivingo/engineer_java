package exam2024;

// 2024년 1회 16번
// 다른 타입의 객체 생성(다형성)
// 실행 결과

class ClassOne {
    int a, b;

    public ClassOne(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println(a + b);
    }
}

class ClassTwo extends ClassOne {
    int po = 3;

    public ClassTwo(int i) {
        super(i, i + 1);
    }

    @Override
    public void print() {
        System.out.println(po * po);
    }
}

public class Main_1_16 {
    public static void main(String[] args) {
        ClassOne one = new ClassTwo(10);    // 객체 Two로 생성(메서드), 참조 타입은 One(변수)

        one.print();    // 실제 객체는 Two라 오버라이드된 메서드 호출
    }
}
