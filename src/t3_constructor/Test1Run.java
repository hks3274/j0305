package t3_constructor;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("t1 :"+ t1); //@뒤에 나오는 것은 메모리 주소(16진수로 나타난다) => to.String()이 생략되어있음
		System.out.println("t1 :"+ t1.toString()); //왜 적용이 되는가? object 란 클래스가 가지고 있는 기본 객체 -> java 의 가장 꼭대기의 객체
	}
}
