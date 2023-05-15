package No4;
// 
public class MemberDemo {
	// name, id, pw, age
	private String name;
    private String id;
    private String pw;
    private int age;
	
    
    public MemberDemo(String name, String id, String passwd, int age) {
        this.id = id;
        this.name = name;
        this.pw = pw;
        this.age = age;
    }
    
    public String getID() { // get은 반환값 
        return id;
    }

    public void setID() { // set은 변환가능?
        this.id = id;
    }

    public String getName() {
          return name;
    }

    public void setName() {
          this.name = name;
    }
    public String getPW() {
          return pw;
    }

    public void setPW() {
          this.pw = pw;
    }
    public int getAge() {
          return age;
    }

    public void setAge() {
          this.age = age;
    }

	
	

	public static void main(String[] args) {
        MemberDemo m1 = new MemberDemo("fox", "red", "Clawd",111);
        System.out.println(m1.getID());
        System.out.println(m1.getAge());
		
		
		
		// private
		
		// 접근자와 설정자로만 접근가능 (은닉성)
		
		// 모든 회원정보를 사용해 객체를 생성할 생성자

	}

}


/*
 * `MemberDemo` 클래스의 `name`, `id`, `pw`, `age` 멤버 변수는 private 접근 지정자로 선언되어 있습니다. 
 * 이렇게 하면 멤버 변수가 클래스 내부에서만 접근 가능하도록 은닉성을 유지할 수 있습니다.

그리고, `getID()`, `getName()`, `getPW()`, `getAge()` 메소드는 public 접근 지정자로 선언되어 있으므로, 
외부에서 해당 멤버 변수의 값을 가져오는 것만 가능합니다. 이러한 방법으로 클래스 내부의 멤버 변수를 숨기고, 
클래스 외부에서는 메소드를 통해 간접적으로 접근할 수 있도록 하여 은닉성을 유지할 수 있습니다.

마찬가지로, `setID()`, `setName()`, `setPW()`, `setAge()` 메소드도 public 접근 지정자로 선언되어 있습니다.
 이 메소드들은 클래스 외부에서 해당 멤버 변수의 값을 수정하는 것만 가능합니다. 
 이러한 방법으로 클래스 내부의 멤버 변수를 외부에서 직접적으로 수정하는 것을 막고, 
 메소드를 통해 간접적으로 수정할 수 있도록 하여 은닉성을 유지할 수 있습니다.
 */
