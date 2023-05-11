package J0508;


import java.util.InputMismatchException;
import java.util.Scanner;

public class J03_0508_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            try {
                System.out.print("양의 정수를 입력하세요: ");
                int num = scanner.nextInt();
                
                if (num < 0) { // 입력된 값이 양의 정수인지 검사
                    break;
                }

                if (num % 2 == 0) { // 짝수인지 검사
                    sum += num;
                }
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력하세요");
                scanner.nextLine(); // 입력 버퍼를 비워줍니다.
            }
        }

        System.out.println("입력받은 양의 정수 중 짝수의 합: " + sum);
    }
}

