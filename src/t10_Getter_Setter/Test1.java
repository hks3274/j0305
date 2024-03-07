package t10_Getter_Setter;

public class Test1 {
	private String name = "홍길동";
	private int age;
	private boolean gender;
	private String address;
	
	private String sex;
	
	private String job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 20) this.age = age;
		// else this.age = 0;
		else System.out.println("미성년자는 가입하실 수 없습니다");
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getSex() {
		if(gender) return "남성";
		else return "여자";
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
