package t2_field;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println(t1.su1); //얘는 참조타입이므로 기본값이 0이 들어가 있음 즉, 기본타입인 경우만! 기본값을 지정해야한다는 것을 알 수 있더다다다다ㅏ다다다다다다다
		System.out.println(t1.su2);
		System.out.println(t1.d1);
		System.out.println(t1.d2);
		System.out.println(t1.l1);
		System.out.println(t1.l2);
		
		System.out.println();
		
		Test2 t2 =new Test2();
		System.out.println("t2.name : "+ t2.name);
		

		Test2 t3 =new Test2();
		t3.name ="김말숙";
		System.out.println("t3.name : "+ t3.name);
	}
}
