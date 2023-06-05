package J0605;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class A07 {
	
	    public static void main(String[] args) {
	        String[] s1 = { "a", "b", "a", "b", "c" };
	        String[] s2 = { "c" };

	        // 두 배열을 HashSet 객체로 생성
	        Set<String> set1 = new HashSet<>();
	        Collections.addAll(set1, s1);
	        Set<String> set2 = new HashSet<>();
	        Collections.addAll(set2, s2);

	        // 두 개의 HashSet 객체를 출력
	        System.out.println("set1: " + set1);
	        System.out.println("set2: " + set2);

	        // 두 개의 HashSet 객체가 동일한지 비교한 값 출력
	        System.out.println("set1과 set2는 같다: " + set1.equals(set2));

	        // set1이 set2의 모든 원소를 포함하는지 출력
	        System.out.println("set1은 set2의 모든 원소를 포함한다: " + set1.containsAll(set2));

	        // 합집합과 교집합을 구해서 출력
	        Set<String> union = new HashSet<>(set1);
	        union.addAll(set2);
	        System.out.println("합집합: " + union);

	        Set<String> intersection = new HashSet<>(set1);
	        intersection.retainAll(set2);
	        System.out.println("교집합: " + intersection);
	    }
	


}
