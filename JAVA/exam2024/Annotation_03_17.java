package exam2024;

// 2024년 3회 17번
// 다른 타입의 객체 생성(다형성)
// 실행 결과

class B {
    int x = 3;

    int getX() {
        return x * 2;
    }
}

class A extends B {
    int x = 7;

    @Override
    int getX() {
        return x * 3;
    }
}

public class Annotation_03_17 {
    public static void main(String[] args) {
        B b1 = new A();     // 객체 A로 생성 (메서드), 참조 타입은 B (변수)
        A b2 = new A();     // 객체 A로 생성 (메서드), 참조 타입은 A (변수)

        System.out.print(b1.getX() + b1.x + b2.getX() + b2.x);
    }
}
