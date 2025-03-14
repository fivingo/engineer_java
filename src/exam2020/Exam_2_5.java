package exam2020;

// 2020년 2회 5번
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
//      Parent pa = ( ) Child();
        Parent pa = new Child();

        pa.show();
    }
}

// [처리결과]
// Child