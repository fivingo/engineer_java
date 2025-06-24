package exam2025;

// 2025년 1회 16번
// 정적 메서드, 재귀 메서드
// 실행 결과

public class Main_01_16 {
    public static void main(String[] args) {
        int[] data = {3, 5, 8, 12, 17};

        System.out.println(func(data, 0, data.length - 1));
    }

    // 정적 메서드 선언 (객체 생성 불필요), 재귀 메서드
    static int func(int[] a, int st, int end) {
        if (st >= end) return 0;

        int mid = (st + end) / 2;

        return a[mid] + Math.max(func(a, st, mid), func(a, mid + 1, end));
    }
}
