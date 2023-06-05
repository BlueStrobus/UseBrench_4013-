package chap05;

import java.util.Scanner;

public class URLTest {
	public static void main(String a[]) {
		String s;
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("URL을 입력하세요 : ");
			s = in.nextLine();
			if (s.equals("bye"))
				break;
			if (s.endsWith("com"))
				System.out.println(s + "은 'com'으로 끝납니다.");
			if (s.contains("java"))
				System.out.println(s + "은 'java'를 포함합니다.");
		}
	}
}
