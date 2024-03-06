package t4_method;

public class Test2_2 {
	void mod1() {
		System.out.println("안녕");
	}
	
	int mod2(int su1) { 
//		return 10; 혹은 
		return su1; //이렇게 놔도 됨 -> 리턴값이 타입에 맡게 있으면 오류X
	}
	
	
	int mod1(int su1) {  
		return su1; 
	}
	
	int add(int su1, int su2) {  
		return su1+su2; 
	} //함수 ==> 메소드

	int sub(int su1, int su2) {  
		return su1-su2; 
	}
	
	int mul(int su1, int su2) {  
		return su1*su2; 
	}
	
	double div(int su1, int su2) {  
		return (double)su1/su2; 
	}
	
	void prn(int su1, int su2, int res, String operator) {
		System.out.println( su1 +" "+ operator +" "+ su2 + " = " + res);
	}
}
