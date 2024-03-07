package t8_static;

public class T3_finalRun {
	public static void main(String[] args) {
		
		T3_final t3 = new T3_final ();
		
		System.out.println("t3.nation: "+t3.nation);
		System.out.println("t3.jimin: "+t3.jimin); 
		System.out.println();
		
//		t3.nation = "USA"; final 필드로 되어 있어 변경 불가능
		
		T3_final t3_2 = new T3_final("1234-1234");
		System.out.println("t3_2.jimin: "+t3_2.jimin);
		

		
	}
}
