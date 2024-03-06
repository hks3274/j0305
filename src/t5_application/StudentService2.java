package t5_application;

public class StudentService2 {
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

	public void print(StudentVO vo) { //studenVO타입으로 생긴것
		String genderOk = genderCheck(vo.isGender()); //()가 있으면 메소드라 생각해라~~~
		String ageOk;
		
		if(ageCheck(vo.getAge())) ageOk = "성인";
		else ageOk = "미성년";
		
		System.out.println("번호 : "+ vo.getNo() +", 성명: "+ vo.getName() +", 나이: "+ vo.getAge() +", 성별: "+ genderOk +", 직업: "+vo.getJob()+", 비고: "+ageOk);
	}
	
}
 