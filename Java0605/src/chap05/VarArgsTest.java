package chap05;

public class VarArgsTest {
	static int sumExceptFirst(int i, int... vars) {
		int total = 0;
		for (int v : vars) {
			total = total + v;
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = {2, 3};
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
	}
}