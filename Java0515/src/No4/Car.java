package No4;
// 4번 
class Car {
    private String color;
    static int numOfCar = 0;
    static int numOfRedCar = 0;


      public Car(String color) {
        this.color = color;
        numOfCar++; // 생성자 호출 시 클래스 변수 증가

        if (color.equalsIgnoreCase("red")||color.equals("붉은색")) 
        	//문자열 간의 “대소문자를 구분하지 않고“ 비교하여서 진위형(true/false) 값으로 반환을 해주는 함수
           numOfRedCar++;// 빨간색으로 간주되는 경우 카운트 증가
    }
    
     static public int getNumberOfCar() {
        return numOfCar;
     }

      static public int getNumberOfRedCar() {
          return numOfRedCar;
      }
}