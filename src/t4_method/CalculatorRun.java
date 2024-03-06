package t4_method;

import java.util.Scanner;

//계산기-> 두수와 연산자를 입력하면 해당결과를 출력하는 프로그램....
public class CalculatorRun {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫번째 수를 입력하세요");
			int su1 = sc.nextInt();
			System.out.print("연산자를 입력하세요");
			String operator = sc.next();
			System.out.print("두번째 수를 입력하세요");
			int su2 = sc.nextInt();

			Calculator calc = new Calculator();
			calc.calc(su1, su2, operator);

			System.out.println("계속 하시겠습니까?(Y/N) ");
			String ans = sc.next();

//			if (ans.charAt(0) == 'N' || ans.charAt(0) == 'n') break; // yes or no 로 했을 경우
//			if (ans.equals("N") || ans.equals("n")) break; // yes or no 로 했을 경우
//			if (ans.toUpperCase().equals("N")) break; 
			// yes or no 로 했을 경우 toUppercase() -> 대문자 toLowwercase() -> 소문자
			if (ans.toLowerCase().equals("n")) break; 
 		}
		System.out.println("작업 끝~~~~~");
		sc.close();
	}
}
