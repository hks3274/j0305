package t5_application;

public class StudentService {
	
	void print(int no, String name, int age, boolean gender, String job) {
		String genderOk = genderCheck(gender); //()가 있으면 메소드라 생각해라~~~
		String ageOk;
		
		if(ageCheck(age)) ageOk = "성인";
		else ageOk = "미성년";
		
		System.out.println("번호 : "+no+", 성명: "+name+", 나이: "+age+", 성별: "+genderOk+", 직업: "+job+", 비고: "+ageOk);
		
	}
	
	String genderCheck(boolean gender) {
		String res = "";
		if(gender) res = "남자";
		else res = "여자";
		return res;
	}
	
	boolean ageCheck(int age) {
		if(age >= 20) return true;
		else return false;
	}
	
	
	
}
