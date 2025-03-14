package exam2023;

// 2023년 1회 20번
// 실행 결과

class Parent {
    int x = 100;

    Parent() {
        this(500);
    }

    Parent(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 400;

    Child() {
        this(5000);
    }

    Child(int x) {
        this.x = x;
    }
}

public class Main_01_20 {
    public static void main(String[] args) {
        Child obj = new Child();

        System.out.println(obj.getX());
    }
}
