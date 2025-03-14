package exam2023;

// 2023년 1회 17번
// 실행 결과

abstract class Vehicle {
    String name;
    abstract public String getName(String val);

    public String getName() {
        return "Vehicle name: " + name;
    }
}

class Car extends Vehicle {
    public Car(String val) {
        super.name = val;
    }

    public String getName(String val) {
        return "Car name: " + val;
    }

    public String getName(byte val[]) {
        return "Car name: " + val;
    }
}

public class Main_1_17 {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");

        System.out.println(obj.getName());
    }
}
