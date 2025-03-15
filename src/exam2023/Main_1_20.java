package exam2023;

// 2023년 1회 20번
// 생성자 체이닝
// 실행 결과

class Parent {
    int x = 100;

    // 기본 생성자 | 하위 클래스에서 호출됨
    Parent() {
        this(500);  // 인자값이 있기 때문에 매개변수가 있는 Parent(int x) 호출
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

    // 기본 생성자
    // 원래는 암시적으로 상위 클래스의 기본 생성자를 호출함
    // 인자값이 있기 때문에 매개변수가 있는 Child(int x) 호출했기때문에
    // 상위 클래스의 기본 생성자를 호출하지 않음
    Child() {
        this(5000);
    }

    Child(int x) {
        this.x = x; // 암시적으로 super(); 삽입 -> 상위 클래스의 기본생성자 호출
    }
}

public class Main_1_20 {
    public static void main(String[] args) {
        Child obj = new Child();

        System.out.println(obj.getX());
    }
}
