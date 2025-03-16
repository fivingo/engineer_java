package exam2022;

// 2022년 3회 19번
// 배열 생성과 반환
// 실행 결과

public class Main_3_19 {
    static int[] makeArray() {
        int[] tempArr = new int[4];

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = i;
        }

        return tempArr;
    }

    public static void main(String[] args) {
        int[] intArr;

        intArr = makeArray();

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
        }
    }
}
