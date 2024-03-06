package t3_constructor;

public class Test3 {
	//기본 생성자
	Test3() {} //#1
	
	int atom; //field = 초기값 0 
	int atom2;
	double atom3;
	
	Test3(int su1) {
		System.out.println("su1 :"+su1);
	} //#2
	
	Test3(int su1, int su2) {
		atom = su1;
		atom2 = su2;
	} //오버로딩 #3
	
	Test3(int atom, double atom3) {
		this.atom = atom; //내 field 라고 알려주는 예약어 : this
		this.atom3 = atom3; //개발자는 생성자를 통해 매개변수를 건들때 이름을 같은 이름으로 준다.
	} //오버로딩 #4
	
	Test3(double su2, int su1) {} //오버로딩 (변수명은 상관X 타입의 종류, 갯수, 순서만 해당)
}
