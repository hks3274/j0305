package t8_static;

public class T1 {
//	double pi = 3.141592; //filed -> 인스턴스 필드
	
	//정적 필드
	public static double pi = Math.PI; 
	
	//정적 메소드
	static double cicleArea(int r) { 
		double res = r * r * pi;
		return res;
	}
}
