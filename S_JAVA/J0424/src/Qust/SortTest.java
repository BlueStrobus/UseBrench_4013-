package Qust;// 1

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        String[] sa = { "K", "o", "r", "e", "a", "n" };
        	// 문자인데도 스트링 쓰
        System.out.print("정렬 전 : ");
        for (String s : sa)  // 배열 sa를 그대로 s에 넣
            System.out.print(s + " ");
        System.out.println();

        Arrays.sort(sa, (s1, s2) -> s1.compareToIgnoreCase(s2));  //방법1
        //Comparator 인터페이스를 구현한 람다 표현식 (s1, s2) -> s1.compareToIgnoreCase(s2)를 두 번째 인수로 전달합니다. 
        //이 람다 표현식은 두 개의 문자열을 비교하여 대소문자를 구분하지 않고 정렬할 수 있도록 합니다.
        //s1과 s2는 두 개의 문자열입니다.
        //s1.compareToIgnoreCase(s2)는 s1이 s2보다 작으면 음수, 같으면 0, 크면 양수를 반환합니다.
        //이 람다 표현식은 compare 메서드를 오버라이드하며, 두 개의 문자열을 compareToIgnoreCase 메서드로 비교하여 정렬합니다.
        //따라서, Arrays.sort(sa, (s1, s2) -> s1.compareToIgnoreCase(s2)) 코드는 문자열 배열을 대소문자 구분 없이 정렬하는 방법을 보여주는 또 다른 방법입니다.
        
        
        
        
        
        //Arrays.sort(sa, String::compareToIgnoreCase); //방법2
       
        //compareToIgnoreCase 메서드는 문자열을 대소문자 구분 없이 비교합니다.
        //이 메서드 참조를 사용하여 Arrays.sort 메서드가 각 문자열을 대소문자 구분 없이 비교하고 정렬할 수 있습니다.


        System.out.print("정렬 후 : ");
        for (String s : sa)
            System.out.print(s + " ");
    }
}

