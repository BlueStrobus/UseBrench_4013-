package chap05;

import java.util.Scanner;

public class HistogramTest {

	public static void main(String[] args) {
		int x = 0;
		Scanner in = new Scanner(System.in);
		int[] freq = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		System.out.println("숫자를 10개 입력하세요");
		
		for (int i = 0; i < 10; i++) {
			x = in.nextInt();
			if (x >= 0)
				freq[x / freq.length]++; //범위에 빈도수 증가 
		}

		for (int i = 0; i < freq.length; i++) {
			System.out.printf("%2d ~ %2d : ", i * 10, (i + 1) * 10 - 1);
			System.out.print(freq[i]);
			//for (int k = 0; k < freq[i]; k++)
			//	System.out.print("*");
			System.out.println();
		}
	}

}
