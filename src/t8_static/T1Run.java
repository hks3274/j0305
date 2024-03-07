package t8_static;

public class T1Run {
	public static void main(String[] args) {
		T1 t1 = new T1();
		
		System.out.println("pi : "+t1.pi);
		
		double area = t1.cicleArea(10); //비효율적
		System.out.printf("반지름 10인 원넓이는? %.2f" , area);
		
	//효율적 -> static은 자주쓰는것이므로 그냥 객체 생성 안하고 클래스 이름으로 메소드, 변수를 사용한다. 
		double area2 = T1.cicleArea(20); 
		System.out.printf("반지름 10인 원넓이는? %.2f" , area2);
	}
}
