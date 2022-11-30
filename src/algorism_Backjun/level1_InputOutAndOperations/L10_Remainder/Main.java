package algorism_Backjun.level1_InputOutAndOperations.L10_Remainder;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		main.solution(a, b, c);
		
	}
	
	private void solution(int a, int b, int c) {
		System.out.println( (a+b)%c );
		System.out.println( ((a%c)+(b%c))%c );
		System.out.println( (a*b)%c );
		System.out.println( ((a%c)*(b%c))%c );
	}

}
