package No4;
// 5번 출력문 
class Line {
    private int length;

      public Line(int length) {
        this.length = length;
    }

    public boolean isSameLine (Line line1) {
          if (length == line1.length)
              return true;
          else
              return false;
    }
}
    public class LineTest {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}