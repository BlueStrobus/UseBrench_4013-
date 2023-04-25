package sec01;

import java.util.Arrays;

public class Lambda1Demo {
    public static void main(String[] args) {
        String[] strings = { "로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다." };

        Arrays.sort(strings, (first, second) -> first.length() - second.length());
//  아래 3줄이 -> 로 변경 가
//        Arrays.sort(strings, 여기부터 new Comparator<String>() {
//            public int compare(String first, String second) {
//                return first.length() - second.length(); 여기까지 3
        
        
        
        for (String s : strings)
            System.out.println(s);
    }
}