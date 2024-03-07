package t3_constructor;

public class Test5VO {
	private String name;
	private String mid;
	private String password;
	private int age;
	private boolean gender;
	private String address;
	
	
	// 기본 생성자는 중요하므로 만들어놔야 한다.
	public Test5VO() {}

	
	public Test5VO(String name, String mid, String password, int age, boolean gender, String address) {
		this.name = name;
		this.mid = mid;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
	} //생성자를 만들어서 처음 값을 가져간다.
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
