package algorism_Backjun.level1_InputOutAndOperations.L2_Plus;

import java.util.Scanner;

public class Plus {
	
	public void solution(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		Plus plus = new Plus();
		plus.solution(a,b);
	}
	
}
