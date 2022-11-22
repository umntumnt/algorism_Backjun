package algorism_Backjun.level1_InputOutAndOperations.L7_IdCheck;

import java.util.*;
public class IdCheck_Fail {
	private List<String> userList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userId = scanner.next();
		
		
		IdCheck_Fail idCheck = new IdCheck_Fail();
		idCheck.addUser(userId);
		idCheck.solution(userId);
	}
	
	private void addUser(String userId) {
		userList.add(userId);
	}
	
	
	private boolean isUserIdExists(String userId) {
		return userList.contains(userId.toLowerCase());
	}
	
	private void solution(String userId) {
		if(isUserIdExists(userId)) {
			System.out.println(userId+"??i");
		}
	}

	
	
}
