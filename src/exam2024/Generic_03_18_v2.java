package exam2024;

// 제네릭의 타입소거
// 실행 결과

public class Generic_03_18_v2 {
    public static class Collection<T> {
        T value;

        public Collection(T t) {
            value = t;
        }

        public void print() {
            new Printer().print(value);
        }

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
    }

    public static void main(String[] args) {

        // T가 컴파일 후 Object로 변환 됨
        // (제네릭을 사용하면 컴파일 후 타입 정보가 사라짐)
        new Collection<>(0).print();
    }
}
