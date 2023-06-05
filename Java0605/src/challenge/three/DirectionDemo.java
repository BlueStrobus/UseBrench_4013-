package challenge.three;
// 03번 
public class DirectionDemo {
    public static void main(String[] args) {    	
        for (Direction d : Direction.values())
      // Direction 열거형의 모든 상수를 반복하고 출력
    	//: for-each 루프를 사용하여 Direction 열거형의 모든 상수를 반복하고
    	// 각 상수를 출력하는 부분
                System.out.print(d + " ");
    }
}

enum Direction {
    동, 서, 남, 북
}
