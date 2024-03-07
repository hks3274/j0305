package t8_static;

public class T3_finalRun2 {
	public static void main(String[] args) {

		
		T3_final t3_2 = new T3_final("1234-1234");
		System.out.println("t3_2.jimin: "+t3_2.jimin);
		System.out.println("1. name :" + t3_2.name);
		
//	t3_2.nation = "USA"; final 필드로 되어 있어 변경 불가능
//		t3_2.jimin = "2222-2222"; 이것도 final 때문에 못 바꿈 
		t3_2.name ="홍길동";
		System.out.println("2. name :" + t3_2.name);
		t3_2.name ="홍길창";
		System.out.println("3. name :" + t3_2.name);
	}
}
