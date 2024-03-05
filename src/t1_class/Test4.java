package t1_class;

public class Test4 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
	
		if(t1 == t2) System.out.println("t1객체와 t2 객체는 서로 같은 객체입니다.");
		else System.out.println("t1객체와 t2 객체는 서로 다른 객체입니다.");
		
		Test1 t3 = t1; //얕은 복사
		
		if(t1 == t3) System.out.println("t1객체와 t2 객체는 서로 같은 객체입니다."); //초기화가 안되어 있음 값이 없음
		else System.out.println("t1객체와 t2 객체는 서로 다른 객체입니다.");
		
		Test1 t4 = null;
		
		if(t1 == t4) System.out.println("t1객체와 t2 객체는 서로 같은 객체입니다."); 
		else System.out.println("t1객체와 t2 객체는 서로 다른 객체입니다.");
		
		if(t4 == null) System.out.println("t4 객체는 null 입니다."); //null은 주소개념으로 비교해야한다. 
		else System.out.println("t4 객체는 null이 아닙니다.");
		
//	null 비교시는 == 또는 != 로 비교해야 한다.	
//		if(t4.equals(null)) System.out.println("t4 객체는 null 입니다."); //이건 값을 비교하는거이기 때문에 못한다.
//		else System.out.println("t4 객체는 null이 아닙니다.");
		
		//jvm은 main이 있는 클래스만 건든다.
		
		
		
	}
}
