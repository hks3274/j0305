package t4_method;

//사용자 라이브러리 -> 우리가 만들어내는 것 
/*
 * 오버로딩 => 하나에 클래스에서 메소드이름을 똑같이 써도 되는데 
 * 매개변수의 타입, 갯수, 순서에 따라 달라지는 것을 얘기한다.
 * + 오버 라이딩에 대해 설명하시오.
 */
public class Test1 {
	int su1;
	double su2;
	String name = "홍길동";
	
	public Test1() {}
	
	Test1(int su1){
		this.su1 = su1;
	}
	
	void mod1() {

	}

	void mod1(int su1) {
		this.su1 = su1;
	}
	

	void mod1(int su1, double su2) {  
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void mod2() {
		System.out.println("안녕하세요~");
	}
	
	void mod3() {
//		System.out.println(this.name+"안녕하세요~");
		System.out.println(name+"안녕하세요~");
	}
	
	void mod3(String name) {
		System.out.println(name+ "안녕하세요~");
	}
	
	void mod4(String name) {
		System.out.println(this.name+ "안녕하세요~");
		System.out.println(name+ "안녕하세요~");
	}
	
	void mod5(int i) {
		System.out.println(i+". 안녕하세요~");
	}
	
	void mod6() {
		int i = 0;
		while(i<5) {
			i++;
			System.out.println(i+". 안녕하세요~");
//			if(i % 3 == 0) break;
			if(i % 3 == 0) return; 
			// retrun을 만나면 바로 메소드가 끝나버린다. 
			// 스택은 복귀번지의 주소를 기억한다.
			System.out.println("작업중..");
		}
		System.out.println("작업끝~~~~~");
	}
	
}
