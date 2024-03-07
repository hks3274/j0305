package t8_static;


public class T2_staticBlock {
	
	int field;
	static int field2;
	
	void method1() {};
	static void method2() {};
	
	
	//정적블럭 > static 사용할 것을 따로 사용한다. 
	static {
		field2 = 200;
		method2();
		
//		field1 = 100; => static은 static만 된다. 
//		method1();
	}
	
}
