package t3_constructor;

public class Test3Run {
	public static void main(String[] args) {
		Test3 t3_1 = new Test3();
		Test3 t3_2 = new Test3(100);
		
		System.out.println("t3_1.atom : "+t3_1.atom);
		System.out.println("t3_2.atom : "+t3_2.atom);
		
		t3_1.atom = 500;
		
		System.out.println("t3_1.atom : "+t3_1.atom);
		System.out.println("t3_2.atom : "+t3_2.atom);
		
		t3_2.atom = 600;
		System.out.println("t3_1.atom : "+t3_1.atom);
		System.out.println("t3_2.atom : "+t3_2.atom);
		
		Test3 t3_3 = new Test3(10,20);
		System.out.println("t3_3.atom : "+t3_3.atom);
		System.out.println("t3_3.atom2 : "+t3_3.atom2);
		
		t3_3.atom = -100; //직접 넣는것은 네트워크상에서 사용하지 않는다.
		t3_3.atom2 = -600;
		System.out.println("t3_3.atom : "+t3_3.atom);
		System.out.println("t3_3.atom2 : "+t3_3.atom2);
		
		
		Test3 t3_4 = new Test3(70, 3.14);
		System.out.println("t3_4.atom : "+t3_4.atom);
		System.out.println("t3_4.atom3 : "+t3_4.atom3);
		
	}
}
