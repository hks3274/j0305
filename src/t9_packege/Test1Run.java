package t9_packege;

import t4_method.Calculator; //import를 사용하면 다른 패키지의 클래스를 사용할 수 있다.
import t4_method.Test2_1;
import t4_method.Test3_1;

import t4_method.*; //*를 사용하면 모든 클래스를 다 사용할 수 있다.



public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.print("1. 번호 :"+ t1.getNo()+", ");  //peivate는 꼭 숨어서 보지 못한다.
		System.out.println("1. 성명 : "+t1.getName()); 
		
		t1.setNo(1000);
		t1.setName("홍길동");
		
		System.out.print("2. 번호 :"+ t1.getNo()+", ");  //peivate는 꼭 숨어서 보지 못한다.
		System.out.println("2. 성명 : "+t1.getName());
		
		System.out.println("t8_static.T1의 PI : "+ t8_static.T1.pi); 
		
		t7_instance.Test1 t7 = new t7_instance.Test1();
		
		System.out.println("t7_instance.Test1의 PI : "+ t7.pi);
		//접근제한자 때문에 안온다. --> 3번쨰 접근제한자. ==> 접근제한자를 하나도 안 붙이면 defalut 접근제한자.
		// ==> 자기패키지 안에서만 자유롭게 사용한다. -> 이것이 캡슐화이다.
		
		new Calculator();
		
		new Test3_1();
		
		new Test2_1();
		
	}
}
