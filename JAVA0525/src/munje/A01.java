package munje;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A01 {
    public static void main(String[] args) {
        String[] animal = {"갈매기", "나비", "다람쥐", "라마"};
        List<String> list = Arrays.asList(animal);

        for (String word : animal) {
            if (word.length() == 2) {
                System.out.println(word);
            }
        }
    }
}



