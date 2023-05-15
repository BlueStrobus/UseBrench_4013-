package Balpyo;

//이 코드는 복소수(Complex number)를 나타내는 클래스인 Complex를 구현하고,
//이 클래스를 테스트하는 ComplexTest 클래스를 포함합니다.


//Complex 클래스는 실수부와 허수부를 저장하는 num과 num1이라는 private 인스턴스 변수를 가짐 
class Complex {
    private double num;
    private double num1;
    
    
    
//    생성자를 두 개 정의
 // 생성자 1 - 파라미터 값 1개 ;  실수부만 받아서 복소수 생성
      public Complex (double num) {
        this.num = num;
    }
      
 // 생성자 2 - 파라미터값 2개 ; 실수부와 허수부를 받아서 복소수 생성
    public Complex (double num, double num1) {
          this.num = num;
          this.num1 = num1;
      }

 // 복소수 출력 메소드 - 반환값 없어서 void
    public void print () {
        System.out.println(num + " + " + num1 + "i");
    }

}

//복소수 클래스 테스트를 위한 클래스
/*
 * ComplexTest 클래스에서는 Complex 클래스를 테스트하기 위해 
 * 두 개의 복소수 객체를 생성하고, 
 * 생성된 객체의 print 메소드를 호출하여 복소수를 출력하도록 작성되어 있습니다.
 */
    public class ComplexTest {
    public static void main(String[] args) {
    	// 실수부만 있는 복소수 생성 후 출력
    	Complex c1 = new Complex(2.0); // 파라미터값이 1개 
        c1.print();
        
        // 실수부와 허수부가 있는 복소수 생성 후 출력
        Complex c2 = new Complex(1.5, 2.5); // 파라미터 값이 2개 
        c2.print();
        // => 생성자 2가지 만들
    }
}