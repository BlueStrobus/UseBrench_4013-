package J0508;

import java.util.Arrays;

public class J05_0508 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 10000; i++) {
            a = (int) (Math.random() * 21);
            b = (int) (Math.random() * 21);
            c = (int) (Math.random() * 21);
            if (a > 0 && b > 0 && c > 0 && a + b + c <= 20 && a * a + b * b == c * c) {
                int[] arr = {a, b, c};
                Arrays.sort(arr); // 배열 요소 정렬
                System.out.printf("각 변의 길이가 정수인 직각 삼각형의 모든 변의 값 : %d, %d, %d", arr[0], arr[1], arr[2]);
                break;
            }
        }
    }
}
