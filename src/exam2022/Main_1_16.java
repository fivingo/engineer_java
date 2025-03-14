package exam2022;

// 2022년 1회 16번
// 괄호 채우기

class Car implements Runnable {
    int a;

    public void run() {
        System.out.println("Hello");
    }
}

public class Main_1_16 {
    public static void main(String[] args) {
//      Thread t1 = new Thread(new (   ));
        Thread t1 = new Thread(new Car());

        t1.start();
    }
}
