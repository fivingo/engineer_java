package exam2020;

// 2020년 4회 19번
// 다른 타입의 객체 생성(다형성), 재귀 메서드
// 실행 결과

class Parent2 {
    public int compute(int num) {
        if (num <= 1) {
            return num;
        }

        return compute(num - 1) + compute(num - 2);
    }
}

class Child2 extends Parent2 {
    public int compute(int num) {
        if (num <= 1) {
            return num;
        }

        return compute(num - 1) + compute(num - 3);
    }
}

public class Good_4_19 {
    public static void main(String[] args) {
        Parent2 obj = new Child2();         // 객체 Child2로 생성(메서드), 참조 타입은 Parent2(변수)

        System.out.print(obj.compute(4));
    }
}
