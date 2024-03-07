package t7_instance;

public class Test1 {
//	double pi = 3.141592; //filed -> 인스턴스 필드
	public double pi = Math.PI; 
	//정적변수 -> 메소드에 올라가 있음 Math라는 클래스가 satic으로 되어 있음 -> 자주쓰기 때문에
	//고정된 값은 무조건 대문자로 쓰자 ==> static final ==> 상수값 ==> 변하지 않는 값
	//API => 자바에서 지원하는 API임 ==> 그냥 만들어놓은 주소값이라고 생각??
	
//인스턴스 메소드
	double cicleArea(int r) { 
		double res = r * r * pi;
		return res;
	}
}
