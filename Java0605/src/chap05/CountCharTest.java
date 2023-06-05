package chap05;

public class CountCharTest {
	static int countChar(String s, char c) { 
		//String s는 "", char c는 ''로 써야함 
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				count++;
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countChar("jazz", 'z'));
		// z가 몇개?
	}

}
