package exam2023;

// 2023년 3회 11번
// 실행 결과

class Parent2 {
    int compute(int num) {
        if (num <= 1) {
            return num;
        }

        return compute(num - 1) + compute(num - 2);
    }
}

class Child2 extends Parent2 {
    int compute(int num) {
        if (num <= 1) {
            return num;
        }

        return compute(num - 1) + compute(num - 3);
    }
}

public class Main_03_11 {
    public static void main(String[] args) {
        Parent2 obj = new Child2();

        System.out.print(obj.compute(7));
    }
}
