package algorism_Backjun.level1_InputOutAndOperations.L3_Minus;
import java.util.*;
public class Minus {
	
	private void solution(int a, int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		Minus minus = new Minus();
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		minus.solution(a, b);
	}

}
