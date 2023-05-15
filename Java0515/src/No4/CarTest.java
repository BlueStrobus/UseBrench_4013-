package No4;

//4번 

    public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");
        Car c4 = new Car("붉은색");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumberOfCar(), 
        Car.getNumberOfRedCar());
    }
}