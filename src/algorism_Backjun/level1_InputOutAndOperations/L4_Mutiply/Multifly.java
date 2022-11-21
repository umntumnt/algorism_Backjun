package algorism_Backjun.level1_InputOutAndOperations.L4_Mutiply;

import java.util.*;
public class Multifly {

	private void solution(int a, int b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Multifly multifly = new Multifly();
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		multifly.solution(a, b);
	}

}
