package J0508;

import java.util.Scanner;

public class J03_0508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("양의 정수를 입력하세요: ");
            int num = scanner.nextInt();

            if (num < 0) { // 입력된 값이 양의 정수인지 검사
                break;
            }

            if (num % 2 == 0) { // 짝수인지 검사
                sum += num;
            }
        }

        System.out.println("입력받은 양의 정수 중 짝수의 합: " + sum);
    }
}

// 트라이캐치문 달아서 이셉션 찾아서 "이거 정수 아님 다시하셈"출력
// 맥 디버깅 단축키
// 커맨드+쉬프트+B+fn+F11
