package t1_class;

public class Test5_val {
	public static void main(String[] args) {
		int su1 = 100, su3;
		
		for (int i = 0; i < 5; i++) {
			int su2 = 200*i; //지역변수
			System.out.println(su1+su2);
		}
		
		// su3 = su1 + su2; //for 블럭 안에서 su2를 선언했기 때문에 
	}
}
