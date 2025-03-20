package exam2022;

// 2022년 2회 17번
// 객체의 멤버 변수(필드) 변경
// 실행 결과

class Conv {
    public Conv(int a) {
        this.a = a;
    }

    int func() {
        int b = 1;

        for (int i = 1; i < a; i++) {
            b = a * i + b;
        }

        return a + b;
    }

    int a;
}

public class Main_02_17 {
    public static void main(String[] args) {
        Conv obj = new Conv(3);

        obj.a = 5;
        int b = obj.func();

        System.out.println(obj.a + b);
    }
}
