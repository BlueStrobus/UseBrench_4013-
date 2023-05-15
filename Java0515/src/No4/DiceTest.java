package No4;
//8번

class Dice {
    private double d1;

    public int roll () {
        this.d1 = (Math.random() * 6) + 1;
        return (int)d1;
    }

}
    public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
