package algorism_Backjun.level1_InputOutAndOperations.L5_Divide;

import java.util.*;
public class Divide {
	private void solution(double a,double b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Divide divide = new Divide();
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		
		divide.solution(a, b);
	}

}
