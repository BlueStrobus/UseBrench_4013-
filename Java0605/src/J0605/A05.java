package J0605;
import java.util.ArrayList;
import java.util.Scanner;

public class A05 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> scores = new ArrayList<>();

	        System.out.print("점수를 입력하세요: ");
	        int score = scanner.nextInt();
	        while (score >= 0) {
	            scores.add(score);
	            System.out.print("점수를 입력하세요: ");
	            score = scanner.nextInt();
	        }

	        System.out.println("전체 학생은 " + scores.size() + "명이다.");
	        System.out.print("학생들의 성적: ");
	        for (int i = 0; i < scores.size(); i++) {
	            System.out.print(scores.get(i));
	        }
	        System.out.println();

	        int maxScore = getMaxScore(scores);

	        for (int i = 0; i < scores.size(); i++) {
	            int currentScore = scores.get(i);
	            String grade = calculateGrade(currentScore, maxScore);
	            System.out.println(i + "번 학생의 성적은 " + currentScore + "점이며 등급은 " + grade + "이다.");
	        }
	    }

	    private static int getMaxScore(ArrayList<Integer> scores) {
	        int maxScore = Integer.MIN_VALUE;
	        for (int score : scores) {
	            if (score > maxScore) {
	                maxScore = score;
	            }
	        }
	        return maxScore;
	    }
	    
	    private static String calculateGrade(int score, int maxScore) {
	        int difference = maxScore - score;
	        if (difference <= 10) {
	            return "A";
	        } else if (difference <= 20) {
	            return "B";
	        } else {
	            return "C";
	        }
	    }



	

}
