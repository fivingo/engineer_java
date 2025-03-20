package exam2022;

// 2022년 1회 16번
// Thread 클래스
// 괄호 채우기

// Runnable 인터페이스를 구현하고, run()을 오버라이딩
class Car implements Runnable {
    int a;

    public void run() {
        System.out.println("Hello");
    }
}

public class Main_1_16 {
    public static void main(String[] args) {
        
        // 문제
//      Thread t1 = new Thread(new (   ));
        Thread t1 = new Thread(new Car());

        t1.start();
    }
}
