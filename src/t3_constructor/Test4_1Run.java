package t3_constructor;

public class Test4_1Run {
	public static void main(String[] args) {
		Test4_1 t4_1 = new Test4_1("그랜져");
		
		System.out.println("모델명 :"+t4_1.model);
		System.out.println("색상 :"+ t4_1.color);
		System.out.println("최대속도 :"+t4_1.speed+"\n");
		
		Test4_1 t4_2 = new Test4_1("소나타", "은색");
		System.out.println("모델명 :"+t4_2.model);
		System.out.println("색상 :"+ t4_2.color);
		System.out.println("최대속도 :"+t4_2.speed+"\n");
		

		Test4_1 t4_3 = new Test4_1("모닝", "초록", 150);
		System.out.println("모델명 :"+t4_3.model);
		System.out.println("색상 :"+ t4_3.color);
		System.out.println("최대속도 :"+t4_3.speed);
		
	}
}
