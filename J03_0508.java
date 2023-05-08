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





//package J0508;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
// 
//public class J03_0508 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int input = 0;
//        int
//        while (true) {
//            System.out.print("양의 정수를 입력하세요 : ");
//
//            if (scanner.hasNextInt(), scanner >= 0; ) { // 입력된 값이 정수인지 검사
//                input = scanner.nextInt();
//                nnum += input;
//               
//            } else {
//                System.out.println(nnum);
//                scanner.nextLine(); // 버퍼 비우기
//                break; // 정수를 입력받으면 반복문 탈출
//            }
//        }
//    	/*
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        // 반복해서 입력 데이터 읽기
//        String str;
//        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
// 
//        // 입력 데이터 읽기
//        /* String str = reader.readLine();  
//        
//    	*/
//        
//        
//        
//        
//        
// 
//    }
//}