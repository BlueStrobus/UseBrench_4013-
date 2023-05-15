package No4;
//  4단원 1번 

public class Triangle {
	
	// 요기부
    private double base;
    private double height;
    
    public Triangle(double base, double height) { // 오버라이딩인가 
        this.base = base;
        this.height = height;
    }
    
    public double findArea() {
        return 0.5 * base * height;
    }
    // 요기까지가 1답 
    
    // 여기부터 
    // 크기비교 
    public boolean isSameArea(Triangle triangle1) {
        double area = findArea();
        double area1 = triangle1.findArea();

        if (area == area1)
            return true;
        else
            return false;
    }
    // 여기까지가 추가한 2번 답 

    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	// 1번문제 출력
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
		
		//2번 문제 출력문 
		Triangle t1 = new Triangle(10.0,5.0);
	    Triangle t2 = new Triangle(5.0,10.0);
	    Triangle t3 = new Triangle(8.0,8.0);
	    
	    System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));


	}
}

