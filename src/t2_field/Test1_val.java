package t2_field;

public class Test1_val {
	int su3 = 10; //field이기 때문에 속성이 다르다.??
	
	public void atom() {
		int su1 = 100;
		
		for (int i = 0; i < 5; i++) {
			int su2 = 200*i; //지역변수
			System.out.println(su1+su2);
		}
		
		su3 += su1;
		
		System.out.println("su3 : "+su3);
	}
}
