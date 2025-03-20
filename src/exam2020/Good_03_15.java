package exam2020;

// 2020년 3회 15번
// 다른 타입의 객체 생성(다형성), 추상 메서드
// 실행 결과

abstract class Vehicle {
    private String name;
    abstract public String getName(String val);

    public String getName() {
        return "vehicle name : " + name;
    }

    public void setName(String val) {
        name = val;
    }
}

class Car extends Vehicle {
    public Car(String val) {
        setName(val);
    }

    // 매개변수가 없는 getName()는 오버라이드 하지않음
    
    public String getName(String val) {
        return "Car name : " + val;
    }

    public String getName(byte val[]) {
        return "Car name : " + val;
    }
}

public class Good_03_15 {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");     // 객체 Car로 생성(메서드), 참조 타입은 Vehicle(변수)

        System.out.print(obj.getName());    // 매개변수가 없는 getName() 호출
    }
}
