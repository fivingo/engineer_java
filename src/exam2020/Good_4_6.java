package exam2020;

// 2020년 4회 6번
// 괄호 채우기

public class Good_4_6 {
    public static void main(String[] args) {
//      int[][] a = new int[(A)][(B)];
        int[][] a = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = j * 3 + (i + 1);

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}

// [출력 결과]
// 1 4 7 10 13
// 2 5 8 11 14
// 3 6 9 12 15