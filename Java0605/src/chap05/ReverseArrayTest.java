package chap05;

public class ReverseArrayTest {
	public static int[] reverse(int[] org) {
		int[] des = new int[org.length];

		for (int i = 0, j = des.length - 1; i < org.length; i++, j--) {
			des[j] = org[i];
		}
		return des;
	}

	public static void main(String a[]) {
		int[] data = {1, 3, 5, 7, 9};
		int[] result = reverse(data);

		for (int i : result)
			System.out.print(i + " ");
	}
}