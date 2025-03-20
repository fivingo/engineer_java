package exam2024;

// 2024년 1회 10번
// 다른 타입의 객체 생성(다형성)
// 실행 순서

class Parent {
    int x, y;

    Parent(int x, int y) {      // [1] | 생성자 실행
        this.x = x;
        this.y = y;
    }

    int getT() {                // [2] | 변수 타입에 따라 메서드 호출
        return x * y;
    }
}

class Child extends Parent {
    int x;

    Child(int x) {              // [3] | 생성자 실행
        super(x + 1, x);        // 상위 클래스 호출

        this.x = x;
    }

    int getT(int n) {           // [4] | 사용 X
        return super.getT() + n;
    }
}

public class Main_01_10 {
    public static void main(String[] args) {    // [5] | 프로그램 시작
        Parent parent = new Child(3);           // [6] | Child 객체 생성 시작

        System.out.println(parent.getT());      // [7] | parent.getT() 호출
    }
}

// 실행 순서 : 5 -> ( 6 )-> ( 3 )-> ( 1 )-> ( 7 )-> ( 2 )
