package J0605;
import java.util.*;

public class A04 {
	    public static void main(String[] args) {
	        Set<String> hashSet = new HashSet<>();
	        hashSet.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우"));
	        System.out.println("HashSet: " + hashSet);

	        Set<String> treeSet = new TreeSet<>(hashSet);
	        System.out.println("TreeSet: " + treeSet);

	        System.out.println("첫번째 동물: " + treeSet.iterator().next());
	        System.out.println("마지막 동물: " + ((TreeSet<String>) treeSet).last());
	        System.out.println("나비 앞에 있는 동물: " + ((TreeSet<String>) treeSet).lower("나비"));
	    }
	  
}

	
	
	
	




/*
public s t a t i c void main(String[] args) {
Set<String> al = new HashSet<>();
a1.addA11(Arrays.asList("독수리", "나비","염소"," 고양이","개미","여우"));
Systemout-println("hashset" + al); / / 코드추가
}
*/