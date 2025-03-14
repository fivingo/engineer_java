package exam2024;

// 2024년 1회 1번
// 실행 결과

class Printer {
    void print(Integer a) {
        System.out.print("A" + a);
    }

    void print(Object a) {
        System.out.print("B" + a);
    }

    void print(Number a) {
        System.out.print("C" + a);
    }
}

public class Generic_03_18 {
    public static void main(String[] args) {
        new Container<>(0).print();
    }

    public static class Container<T> {
        T value;

        public Container(T t) {
            value = t;
        }

        // [제네릭의 타입소거]
        // T가 컴파일 후 Object로 변환 됨
        // (제네릭을 사용하면 컴파일 후 타입 정보가 사라짐)
        public void print() {
            new Printer().print(value);
        }
    }
}
