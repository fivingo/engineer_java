package exam2023;

// 2023년 3회 13번
// 정적 멤버(static)
// 에러가 발생하는 라인 찾기

class Person {
    private String name;

    public Person(String val) {
        name = val;
    }

    // 정적(static) 멤버 | 프로그램 시작 시 메모리에 로드 -> 객체 생성과는 독립적으로 존재함
    // 인스턴스 멤버는 정적 멤버와 인스턴스 멤버에 모두 접근 가능
    // 정적 멤버는 정적 멤버만 접근 가능
//  public static String get() {
//      return name;    // [에러] | 인스턴스 멤버
//  }

    public void print() {
        System.out.println(name);
    }
}

public class Main_3_13 {
    public static void main(String[] args) {
        Person obj = new Person("Kim");

        obj.print();
    }
}
