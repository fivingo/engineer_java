package exam2025;

// 2025년 1회 10번
// 다른 타입의 객체 생성(다형성)
// 실행 순서

public class Main_01_13 {
    public static void main(String[] args) {
        new Child();

        System.out.println(Parent.total);
    }
}

class Parent {
    static int total = 0;
    int v = 1;

    public Parent() {
        total += (++v);

        show();
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

        show();
    }

    @Override
    public void show() {
        total += total * 2;
    }
}
