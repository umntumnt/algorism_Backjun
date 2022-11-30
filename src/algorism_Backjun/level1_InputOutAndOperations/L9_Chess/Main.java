package algorism_Backjun.level1_InputOutAndOperations.L9_Chess;

import java.util.*;
public class Main {
	private final List<Integer> chess = new ArrayList<>();
	
	public static void main(String[] args) {
		Main main = new Main();
		List<Integer> inputChessList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int look = sc.nextInt();
		int bishop = sc.nextInt();
		int night = sc.nextInt();
		int porn = sc.nextInt();
		
		inputChessList.add(king);
		inputChessList.add(queen);
		inputChessList.add(look);
		inputChessList.add(bishop);
		inputChessList.add(night);
		inputChessList.add(porn);
		
		List<Integer> needChessList = main.getNeedChessList(inputChessList);
		main.solution(needChessList);
	}
	
	private void solution(List<Integer> needChessList) {
		for(int i : needChessList) {
			System.out.print(i+" ");
		}
	}

	private List<Integer> getNeedChessList(List<Integer> arrayList) {
		List<Integer> needChessList = new ArrayList<>(); 
		for(int i=0; i<arrayList.size(); i++) {
			int needChessCount = chess.get(i)-arrayList.get(i);
			needChessList.add(needChessCount);
		}
		return needChessList;
	}

	public Main() {
		chess.add(1);
		chess.add(1);
		chess.add(2);
		chess.add(2);
		chess.add(2);
		chess.add(8);
	}

}
