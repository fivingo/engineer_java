package exam2023;

// 2023년 3회 13번
// 에러가 발생하는 라인 찾기

class Person {
    private String name;

    public Person(String val) {
        name = val;
    }

//    public static String get() {
//        return name;    // 에러
//    }

    public void print() {
        System.out.println(name);
    }
}

public class Main_03_13 {
    public static void main(String[] args) {
        Person obj = new Person("Kim");

        obj.print();
    }
}
