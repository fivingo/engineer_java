package exam2025;

// 2025년 1회 10번
// 정적 변수, 다른 타입의 객체 생성(다형성)
// 실행 순서

public class Main_01_13 {
    public static void main(String[] args) {
        new Child();        // Child 타입의 객체 생성 -> Parent의 생성자 호출

        System.out.println(Parent.total);
    }
}

class Parent {
    static int total = 0;   // 정적 변수 선언
    int v = 1;

    public Parent() {
        total += (++v);

        show();             // 생성한 객체 타입(Child)의 show()가 호출됨 (다형성)
    }

    public void show() {
        total += total;
    }
}

class Child extends Parent {
    int v = 10;

    public Child() {
        v += 2;
        total += v++;

        show();         // 생성한 객체 타입(Child)의 show()가 호출됨 (다형성)
    }

    @Override
    public void show() {
        total += total * 2;
    }
}
