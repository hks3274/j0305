package t6_exam;

public class Test_format {
	public static void main(String[] args) {
		int su = 1234000;
		double su2 = 1324000.132;
		String  su3 = "1234000";
		
		System.out.printf("금액: %,d\n", su);    //일반적인 String에서 제공해주는 방식 -> 천 단위를 찍을 때 사용
		System.out.printf("금액: %,10d\n", su);
		System.out.printf("금액: %,15.2f\n", su2); 
		
		//String 클래스에 있는 포맷 사용하기
		System.out.println(String.format("%,15d",su)); //이렇게 사용하면 좋다~ 애매할 때 사용하기
		System.out.println(String.format("%,15d",Integer.parseInt(su3))); //Integet.parseInt() -> 문자열을 정수로 버꾸는 것
	}
}
