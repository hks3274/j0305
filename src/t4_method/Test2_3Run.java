package t4_method;

import java.util.Scanner;

public class Test2_3Run {
	public static void main(String[] args) {
		Test2_3 t2 = new Test2_3();
		int res;
		
		t2.mod1();
		res = t2.mod2(50);
		
		System.out.println("res: " + res);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int su1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int su2 = sc.nextInt();
		
		t2.add(su1,su2);
		
		t2.sub(su1,su2);
		
		t2.mul(su1,su2);
		
		double res1 = t2.div(su1,su2);
		System.out.printf("%d / %d = %.1f", su1, su2, res1);
		
	}
}
