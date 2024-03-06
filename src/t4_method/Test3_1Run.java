package t4_method;

/*
 * static 정적메모리 ->메소드 영역에 올라간다. 
 * jvm 에 가장 먼저 올라가고 끝날 때 나중에 끝나는 것이다. 
 * 메소드영역은 힙, 스택이 참조하는 영역임
 * static이 개체에서 메소드를 만들면 그 메소드에서는 static이 있어야 함
 */

public class Test3_1Run {
	public static void main(String[] args) { 
		
		
		int[] su = {90,80,100,70,60};
		
		Test3_1 t3 = new Test3_1();
		
		int res = t3.hap(su);
		System.out.println("총합 : "+res);
		System.out.println();
		
		res = t3.sum(su);
		System.out.println("총합2 : "+res);
		
		res = t3.hap(new int[] {1,2,3,4,5});
		System.out.println("총합3 : "+res);
		
		res = t3.sum(new int[] {1,2,3,4,5});
		System.out.println("총합4 : "+res);
		
//		res = t3.hap({1,2,3,4,5}); //(x)
//		res = t3.hap(1,2,3,4,5); //(x)
		res = t3.sum(1,2,3,4,5);//(o) => 무작위로 몇개를 넘길지 몰랐을때 사용
		System.out.println("총합5 : "+res);
		
	}
}
