package J0508;


import java.util.InputMismatchException;
import java.util.Scanner;

public class J07_0508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("철수: ");
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

        whoswin(i, ii);
    }

    public static void whoswin(String c, String y) {
        char p1 = c.charAt(0);
        char p2 = y.charAt(0);

        if ((p1 == 'r' || p1 == 's' || p1 == 'p') && (p2 == 'r' || p2 == 's' || p2 == 'p')) {
            if (p1 == p2) {
                System.out.println("비겼습니다!");
            } else if ((p1 == 'r' && p2 == 'p') || (p1 == 'p' && p2 == 's') || (p1 == 's' && p2 == 'r')) {
                System.out.println("영희, 승!");
            } else {
                System.out.println("철수, 승!");
            }
        }
    }
}
