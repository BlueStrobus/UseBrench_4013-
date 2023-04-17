// package ABC;

public class Paaa {
    
    public static void main(String[] args) {
        Reso reso = new Reso();
//try 는 자원 쓰고 반환 필요
        try (reso) {
            reso.show();
        } catch (Exception e) {
            System.out.println("예외 처리");
        }
    }
}

class Reso implements AutoCloseable {
    // implements는 인터페이스 쓸 떄
    //인터페이스 상속받음
    void show() {
        System.out.println("자원 사용");
    }

    public void close() throws Exception {
        System.out.println("자원 닫기");
    }
}
