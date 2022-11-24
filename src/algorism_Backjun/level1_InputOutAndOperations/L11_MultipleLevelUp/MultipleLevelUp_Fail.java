package algorism_Backjun.level1_InputOutAndOperations.L11_MultipleLevelUp;

import java.util.*;
import java.util.Map.Entry;
public class MultipleLevelUp_Fail {
	private Map<Integer,Integer> multipleDigitNumbers = new HashMap<>();

	public void solution(int a, int b) {
		calculateDigitNumbers(a, b);
		Object[] mapkey = multipleDigitNumbers.keySet().toArray();
		Arrays.sort(mapkey);
		printDgitNumber();
		printMultipleNumber();
	}
	
	private void printDgitNumber() {

		
		for(Integer nKey : multipleDigitNumbers.keySet())
		{
			System.out.println(multipleDigitNumbers.get(nKey));
		}
	}
	
	private void printMultipleNumber() {
		int sum = 0;
		for (Entry<Integer, Integer> entry : multipleDigitNumbers.entrySet())
		{
			System.out.println(entry.getKey());
		   sum +=entry.getValue()*entry.getKey();
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		MultipleLevelUp_Fail multipleLevelUp = new MultipleLevelUp_Fail();
		
		if(multipleLevelUp.isNaturalNumber(a) && multipleLevelUp.isNaturalNumber(b)) {
			multipleLevelUp.solution(a, b);
		}else {
			throw new RuntimeException();
		}
	}
	
	private boolean isNaturalNumber(int number) {
		if(number>0) {
			return true;
		}else {
			return false;
		}
	}
	
	private void calculateDigitNumbers(int a,int b) {
		int digitCount=2;
		int digit = 1;
		for(int i = 1; i<=3; i++) {
			char digitNuberChar = String.valueOf(b).charAt(digitCount);
//			System.out.println(digitNuberChar);
			int digitNumber = Character.getNumericValue(digitNuberChar);
//			System.out.println(digitNumber);
			int digitNumberMultiple = digitNumber*a;
//			System.out.println(digitNumberMultiple);
			multipleDigitNumbers.put(digit, digitNumberMultiple);
			digitCount--;
			digit*=10;
		}
	}
// 세자리수
}
