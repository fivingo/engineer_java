package exam2022;

// 2022년 2회 7번
// switch-case 문
// 실행 결과

public class Main_2_7 {
    public static void main(String[] args) {
        int i = 3;
        int k = 1;

        switch (i) {
            case 1:
                k += 1;
            case 2:
                k++;
            case 3:
                k = 0;
            case 4:
                k += 3;
            case 5:
                k -= 10;
            default:
                k--;
        }

        System.out.print(k);
    }
}
