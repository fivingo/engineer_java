package exam2021;

// 2021년 2회 19번
// 실행 결과

public class Ovr1_2_19 {
    public static void main(String[] args) {
        Ovr1_2_19 a1 = new Ovr1_2_19();
        Ovr2 a2 = new Ovr2();

        System.out.println(a1.sun(3, 2) + a2.sun(3, 2));
    }

    int sun(int x, int y) {
        return x + y;
    }
}

class Ovr2 extends Ovr1_2_19 {
    int sun(int x, int y) {
        return x - y + super.sun(x, y);
    }
}
