package algorism_Backjun.level1_InputOutAndOperations.L6_FourArithmeticOperations;

import java.util.*;
public class FourArithmeticOperations {
	private void solution(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		FourArithmeticOperations fourArithmeticOperations = new FourArithmeticOperations();
		fourArithmeticOperations.solution(a, b);
	}

}
