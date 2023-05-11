package J0508;
//
//
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Random;
//public class J06_0508 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		List<Character> rsp = new ArrayList<Character>();
//		// 리스트에 문자(Character) 타입의 변수 추가 및 제거 등의 작업 수행
//		    
//		rsp.add('r'); // 리스트에 추가하기는 작은 따음표!!!!
//		rsp.add('s');
//		rsp.add('p');
//		
//
//
//        // 리스트에서 랜덤하게 요소 선택하기
//        Random random = new Random();
//        int randomIndex = random.nextInt(rsp.size()); // 리스트 크기를 이용하여 랜덤한 인덱스 생성
//        char randomChar = rsp.get(randomIndex); // 생성된 인덱스에 해당하는 요소 가져오기
//
//        System.out.println("랜덤하게 선택된 문자: " + randomChar);
//    	}
//		
//		
//	
//
//
//	
//
//}
import java.util.InputMismatchException;
import java.util.Scanner;

public class J06_0508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("철수: ");
        // 예외처리
        String i = "";
        while (true) {
            try {
                i = scanner.nextLine();
                if (!i.equals("r") && !i.equals("s") && !i.equals("p")) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("r, s, p 중 하나만 입력하세요.");
            }
        }

        System.out.print("영희: ");
        
        String ii = "";

        // 예외처리
        while (true) {
            try {
                ii = scanner.nextLine();
                if (!ii.equals("r") && !ii.equals("s") && !ii.equals("p")) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("r, s, p 중 하나만 입력하세요.");
            }
        }

        char c = i.charAt(0);
        char y = ii.charAt(0);

        if ((c == 'r' || c == 's' || c == 'p') && (y == 'r' || y == 's' || y == 'p')) {
            if (c == y) {
                System.out.println("비겼습니다!");
            } else if ((c == 'r' && y == 'p') || (c == 'p' && y == 's') || (c == 's' && y == 'r')) {
                System.out.println("영희, 승!");
            } else {
                System.out.println("철수, 승!");
            }
        }
    }
}
