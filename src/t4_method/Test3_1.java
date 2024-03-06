package t4_method;

public class Test3_1 {

	public int hap(int[] su) {
		int hap = 0;
		for (int i = 0; i < su.length; i++) {
			hap += su[i];
		} 
		
		return hap;
	}

	public int sum(int ... su) { 
		//... => 자바에서 지원하는 값을 넘기는 예약어 ==> 여러개의 값을 넘기는 연산자
		int sum = 0;
		for (int i = 0; i < su.length; i++) {
			sum += su[i];
		} 
		return sum;
	}
	
}
