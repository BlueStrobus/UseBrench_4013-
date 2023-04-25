package sec01;

interface Mathematical {
    double calculate(double d);
}

interface Pickable {
    char pick(String s, int i);
}

interface Computable {
    int compute(int x, int y);
}

class Utils {
    int add(int a, int b) {
        return a + b;
    }
}
/*"Mathematical", "Pickable", "Computable" 인터페이스는 각각 하나의 메소드를 정의
 *  "Mathematical" 인터페이스는 double 값을 받아서 double 값을 반환하는 "calculate" 메소드,
 *  "Pickable" 인터페이스는 String과 int 값을 받아서 char 값을 반환하는 "pick" 메소드, 
 *  "Computable" 인터페이스는 int 값 두 개를 받아서 int 값을 반환하는 "compute" 메소드를 정의
 *  그리고 "Utils" 클래스는 두 개의 int 값을 받아서 그 합을 반환하는 "add" 메소드를 가지고 있습니다.
 */

//interface Applyable {
//    boolean apply(Box a, Box b);
//}
//
//class Box {
//    int no;
//
//    public Box(int no) {
//        this.no = no;
//    }
//
//    boolean isSame(Box b) {
//        return this.no == b.no;
//    }
//}

public class MethodRefDemo {
    public static void main(String[] args) {
        Mathematical m;
        Pickable p;
        Computable c;

//        m = d -> Math.abs(d);
        m = Math::abs;
        System.out.println(m.calculate(-50.3));

//        p = (a, b) -> a.charAt(b);
        p = String::charAt;
        System.out.println(p.pick("안녕, 인스턴스 메서드 참조!", 4));

        Utils utils = new Utils();
//        c = (a, b) -> utils.add(a, b);
        c = utils::add;
        System.out.println(c.compute(20, 30));

//        Applyable app;
////        app = (a, b) -> a.isSame(b);
//        app = Box::isSame;
//        System.out.println(app.apply(new Box(1), new Box(2)));
//        System.out.println(app.apply(new Box(1), new Box(1)));
    }
}
