package Bar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class UserManager { //회원 정보

	// 모든 회원 정보를 가지고 있는 list
	public static ArrayList<User> userList = new ArrayList<>();

	// 로그인 한 내 계정 / 로그인을 안 했을 때는 null & 로그인을 했을 때는 정보 저장 
	private static User myUser = null;

	// 다른 클래스에서 로그인한 사용자 정보를 가져가서 사용할 때
	public User getMyUser() {
		return myUser;
	}
	
	// 다른 클래스에서 로그인을 했는지 안 했는지 알 수 있는 함수
	// 로그인을 했다면 true / 안했다면 false
	public static boolean isLogin() {
		return myUser != null;
//		if (this.myUser != null) { // 로그인을 한 상태 일 때
//			return true;
//		}
//		return false; // 로그인을 안 한 상태일 때
	}

	public void addUser (Scanner scan) { // 회원가입 메서드 
		System.out.println("   ━━━━━━━━━━ 회원가입 ━━━━━━━━━━");
		System.out.println("이름 > ");
		String name = scan.next();
		System.out.println("생일 > ");
		System.out.println("ex) 19900101");
		String brith = scan.next();
		if (Integer.parseInt(brith) > 20060000) {
			System.out.println("미성년자 가입 불가합니다.");
			return;
		} else if (brith.length() < 8) {
			System.out.println("잘못된 입력값입니다.");
			brith = scan.next();
		}
		System.out.println("전화번호 > ");
		System.out.println("ex) 010-0000-0000");
		String phone = scan.next();
		if (phone.length() < 13) {
			System.out.println("잘못된 입력값입니다.");
			phone = scan.next();
		}
		System.out.println("id > ");
		String id = scan.next();
		System.out.println("pw > ");
		String pw = scan.next();
		if (pw.length() < 5) {
			System.out.println("5글자 이상으로 작성해주세요.");
			pw = scan.next();
		}		
		User user = new User(id, pw, name, brith, phone);
		userList.add(user);
		System.out.println("Ezen Bar 회원가입 완료");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣷⠀⢹⡏⠀⢸⡿⠀⣼⡇⢠⣤⣤⣤⣿⠀⢸⣿⣿⣿⡿⠁⣠⣤⡈⠹⣿⠋⢀⣤⣄⠈⢿⡇⠀⠈⣿⡇⠀⢸⣿⠀⢠⣤⣤⣼⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⡆⠘⠃⣠⠈⡇⢠⣿⡇⢈⣉⣉⣹⣿⠀⢸⣿⣿⣿⡇⠀⣿⣿⣿⣿⣿⠀⣾⣿⣿⠄⢸⡇⠀⡄⢹⠀⡆⢸⣿⠀⢈⣉⣉⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⠀⠀⣿⡀⠀⣼⣿⡇⠘⠛⠛⠛⣿⠀⠘⠛⠛⢻⣧⠀⠻⠟⠃⣰⣿⡀⠘⠿⠛⠀⣼⡇⠀⣇⠀⢰⡇⢸⣿⠀⠘⠛⠛⢻⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣷⣶⣿⣿⣷⣶⣶⣶⣶⣿⣶⣶⣶⣶⣾⣿⣿⣶⣶⣾⣿⣿⣿⣷⣶⣶⣿⣿⣷⣶⣿⣶⣾⣷⣾⣿⣶⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠛⠿⣿⣿⣿⠿⠛⠻⢿⣿⣿⠿⢿⣿⡿⠿⣿⡿⠿⠿⠿⢿⣿⣿⠿⠛⠻⢿⣿⣿⠿⢿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⣴⣶⣄⣘⣿⠁⢠⣶⣶⡀⢹⣿⠀⢸⣿⡇⠀⣿⡇⢰⣶⡆⠀⣿⠁⢠⣶⣶⡀⢹⣿⠀⡀⢻⡇⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⣿⣿⡿⠿⣿⠀⢸⣿⣿⠇⢠⣿⠀⢸⣿⡇⠀⣿⡇⢈⣉⣀⣴⣿⠀⢸⣿⣿⠇⢠⣿⠀⣷⡀⠃⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠈⠉⣀⣼⣿⣦⡀⠉⠉⣠⣾⣿⣄⡈⠉⢁⣰⣿⡇⢸⣿⣿⣿⣿⣦⡀⠉⠉⣠⣾⣿⠀⣿⣿⡄⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

	}

	public void logIn (Scanner scan) { //로그인 메서드

		System.out.println("id 입력 > ");
		String id = scan.next();

		for (int i=0;i<userList.size();i++) {
			if (id.equals(userList.get(i).getId())){				
				System.out.println("pw 입력 > ");	
				String pw = scan.next();
				if (pw.equals(userList.get(i).getPw())) {				
					myUser = userList.get(i);
					System.out.println("로그인 완료");		
					return;
				}
				System.out.println("pw가 틀렸습니다.");
				return;
			}
		}
		System.out.println("가입된 정보가 없습니다.");
	}

	public void myPage(Scanner scan) {
		// 로그인을 했는지 안했는지 확인을 하는데
		while (myUser != null) { // 로그인이 되어있는 상태라면 반복
			// pw를 입력
			System.out.println("pw를 입력하세요 > ");
			String pw = scan.next();
			// myUser에 pw와 입력한 pw가 일치하는지 비교
			if (myUser.getPw().equals(pw)) { // 일치한다면 회원정보 출력
				myUser.userPrint();
				return;
			} else { // 일치하지 않다면 pw 재입력
				System.out.println("pw가 틀렸습니다.");
			}
		}
		System.out.println("로그인 후 확인 가능합니다.");
	}

	public void logOut(Scanner scan) {

		System.out.println("로그아웃 하시겠습니까? y / n");
		String logOut = scan.next();
		if (logOut.equals("y")) {
			myUser = null;
			System.out.println("로그아웃 되었습니다.");
			return;
		}
		
	}

}
