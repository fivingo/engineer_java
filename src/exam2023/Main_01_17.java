package exam2023;

// 2023년 1회 17번
// 추상 클래스/메서드, 다른 타입의 객체 생성(다형성), 오버로딩
// 실행 결과

// 추상 클래스
abstract class Vehicle {
    String name;

    // 추상 메서드
    abstract public String getName(String val);

    public String getName() {
        return "Vehicle name: " + name;
    }
}

// 추상 클래스를 상속받아 구현
class Car extends Vehicle {

    // 생성자
    public Car(String val) {
        super.name = val;
    }

    public String getName(String val) {     // overloading
        return "Car name: " + val;
    }

    public String getName(byte[] val) {     // overloading
        return "Car name: " + val;
    }
}

public class Main_01_17 {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");     // 객체 Car로 생성(메서드), 참조 타입은 Vehicle(변수)

        System.out.println(obj.getName());  // 매개변수가 없기때문에 Vehicle 클래스의 메서드 호출
    }
}
