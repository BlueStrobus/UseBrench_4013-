// package PLEEEES;

class Sup{
    public Sup(){
        System.out.println("Sup");
    }
    public Sup(int x) {
        System.out.println("Sup : " + x);
    }
}
class Sub extends Sup {
    public Sub(){
        super(100);
    }
    public Sub(int x){
        System.out.println("Sub : " + x);
    }
}




public class PaHaHa {
    public static void main(String[]args){
        Sub a = new Sub();
        Sub b = new Sub(55);
    }
}