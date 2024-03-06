package t3_constructor;

public class Test2 {
	//기본 생성자
	Test2() {}
	
	Test2(int su1) {} //오버로딩
	
	Test2(int su1, int su2) {} //오버로딩
	
	Test2(int su1, double su2) {} //오버로딩
	
	Test2(double su2, int su1) {} //오버로딩 (변수명은 상관X 타입의 종류, 갯수, 순서만 해당)
}
