package exam2024;

// 2024년 1회 1번
// 실행 결과

class Connection {
    private static Connection _inst = null;
    private int count = 0;

    // 싱글톤 패턴
    static public Connection get() {
        if (_inst == null) {
            _inst = new Connection();

            return _inst;
        }

        return _inst;
    }

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Main_01_01 {
    public static void main(String[] args) {
        Connection conn1 = Connection.get();    // 싱글톤 객체 반환 (최초 객체 생성)
        conn1.count();  // count = 1

        Connection conn2 = Connection.get();    // 동일한 객체 반환
        conn2.count();  // count = 2

        Connection conn3 = Connection.get();    // 동일한 객체 반환
        conn3.count();  // count = 3

        conn1.count();  // count = 4

        System.out.print(conn1.getCount());
    }
}
