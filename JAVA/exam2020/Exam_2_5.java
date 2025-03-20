package exam2020;

// 2020년 2회 5번
// 다른 타입의 객체 생성(다형성)
// 괄호 채우기

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}

public class Exam_2_5 {
    public static void main(String[] args) {
        
        // 문제
//      Parent pa = ( ) Child();    // 객체 Child로 생성(메서드), 참조 타입은 Parent(변수)
        Parent pa = new Child();

        pa.show();
    }
}

// [처리결과]
// Child
