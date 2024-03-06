package t5_application;

/*
 * 정말로 중요한 객체 => value object(VO) ==> 변수 관리하는 객체
 * Data Transfer Object(DTO)라고도 함 => 데이터 변환 객체
 * 인터넷에 VO DTO 차이점을 정리하여 올리기 --> 숙제인가?
 */

/*
 * 저장 - return 이 없어도 됨 ==> set ==> 자바용어 : setter
 * 읽어오는 것 - return 이 있어야 됨  ==> get ==> 자바용어 : getter
 * void setNo(int no) { //이건 약속이다. 이클립스에서 이렇게해야 오류를 잘 잡아줌 
 * this.no = no;
 * }
 * 이렇게 쓰는 것이 setter 이다. 
 * 
 * int getNo() {
 * return no;
 * }
 * 이렇게 쓰는 것이 getter 이다.
 * 
 * -> 다축키 Alt, s,  R, Alt+A, Alt+R ==> 순서대로 치기
 * 
 * DAO - Data Access object 데이터 연결 객체
 */



public class StudentVO { 
	private int no;
	String name;
	int age;
	boolean gender;
	String job;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
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
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
