import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("#");
        // 소숫점 없음
		DecimalFormat f2 = new DecimalFormat("000000000.00");
        //소숙점2개
		DecimalFormat f3 = new DecimalFormat("#.000");

		DecimalFormat f4 = new DecimalFormat("#,###.##");
        //천단위로 콤마 찍어주고 소숫점 2개
		DecimalFormat f5 = new DecimalFormat("-#.#");
		DecimalFormat f6 = new DecimalFormat("#.##E00");
		DecimalFormat f7 = new DecimalFormat("+#.#;-#.#");
        // 중간에 ; 찍어서 2줄 출력
		DecimalFormat f8 = new DecimalFormat("#.00%");
        //

		System.out.println(f1.format(1234567.890));
		System.out.println(f2.format(1234567.890));
		System.out.println(f3.format(1234567.890));
		System.out.println(f4.format(1234567.890));
		System.out.println(f5.format(1234567.890));
		System.out.println(f6.format(1234567.890));
		System.out.println(f7.format(1234567.890));
		System.out.println(f7.format(-1234567.890));
		System.out.println(f8.format(1234567.890));
	}
}