package exam2023;

// 2023년 3회 1번
// 다른 타입의 객체 생성(다형성), 동적 바인딩
// 실행 결과

public class Main_03_01 {
    public static void main(String[] args) {
        A b = new B();  // 객체 B로 생성(메서드), 참조 타입은 A(변수)

        b.paint();
        b.draw();
    }
}

class A {
    public void paint() {
        System.out.print("A");

        draw();
    }

    public void draw() {
        System.out.print("B");

        draw();         // 재귀 호출 | 동적 바인딩 -> B 클래스의 draw() 호출
    }
}

class B extends A {
    public void paint() {
        super.draw();   // 상위 클래스의 draw() 호출

        System.out.print("C");

        this.draw();
    }

    public void draw() {
        System.out.print("D");
    }
}
