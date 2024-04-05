package Bar;

import java.util.Scanner;



public class BarMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		UserManager ul = new UserManager();
		AddMoney am = new AddMoney();
		MenuManager mm = new MenuManager();
		Order o = new Order();
		ReservationManager rv = new ReservationManager();
		UserManager um = new UserManager(); // 고객 관리하는 시스템
		User myUser = um.getMyUser(); // 로그인한 고객의 정보

		int menu=0;
		mm.addMenu();
		rv.addseat();
		System.out.println("                                *                           ***     \n"
				+ "                              **          *             *    ***    \n"
				+ "                              **         **            ***    **    \n"
				+ "                              **         **             *     **    \n"
				+ "             ****             **       ********               **    \n"
				+ "   ****     * ***  *  ****    **  *** ******** ****   ***     **    \n"
				+ "  * ***  * *   ****  * ***  * ** * ***   **   * ***  * ***    **    \n"
				+ " *   **** **    **  *   ****  ***   *    **  *   ****   **    **    \n"
				+ "**        **    ** **         **   *     ** **    **    **    **    \n"
				+ "**        **    ** **         **  *      ** **    **    **    **    \n"
				+ "**        **    ** **         ** **      ** **    **    **    **    \n"
				+ "**        **    ** **         ******     ** **    **    **    **    \n"
				+ "***     *  ******  ***     *  **  ***    ** **    **    **    **    \n"
				+ " ******* ** ****    *******   **   *** *  ** ***** **   *** * *** * \n"
				+ "  *****  **          *****     **   ***       ***   **   ***   ***  \n"
				+ "         **                                                         \n"
				+ "         **                ***  ****                     ▓▓ /          \n"
				+ "         ** ****     ****   **** **** *                ▓▓▓▓/            \n"
				+ "         *** ***  * * ***  * **   ****        ░░░░░░░░░▓▓▓▓░░░                     \n"
				+ "         **   **** *   ****  **                ░░░░░░░░░░░░░░                     \n"
				+ "         **    ** **    **   **                 ░░░░░░░░░░░░                    \n"
				+ "         **    ** **    **   **                  ░░░░░░░░░░                   \n"
				+ "         **    ** **    **   **                    ░░░░░░░                  \n"
				+ "         **    ** **    **   **                       ░░              \n"
				+ "         **    ** **    **   ***                      ░░              \n"
				+ "          *****    ***** **   ***                    ░░░░             \n"
				+ "           ***      ***   **                                        \n"
				+ "                                        ");
		System.out.println("     ~ E Z E N 칵 테 일 바 에   오 신   것 을   환 영 합 니 다 ~           ");
		do {
			System.out.println();
			System.out.println("   ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("     1.  회 원 가 입    2. 로  그  인    3. 충 전 하 기    ");
			System.out.println("     4. 마 이 페 이 지   5. 예 약 하 기   6. 예 약 취 소    ");
			System.out.println("     7. 메 뉴 보 기    8. 주 문 하 기   9. 영  수  증      ");
			System.out.println("             10. 로 그 아 웃   11. 종      료             ");
			System.out.println("   ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("               이용하실 서비스를 선택해주세요.               ");


			menu=scan.nextInt();

			switch (menu) {
			case 1: ul.addUser(scan); break;
			case 2: ul.logIn(scan); break;
			case 3: am.addMoney(scan); break;
			case 4: ul.myPage(scan); break;
			case 5: rv.reservation(scan); break;
			case 6: rv.cancelreservation(scan); break;
			case 7: mm.printMenu(scan);; break;
			case 8: o.orderPick(scan); break;
			case 9: 
//				if (um.getMyUser().getMoney() >= o.getSum()) {
					System.out.println("                      영수증 출력중");
					o.run();
					Thread.sleep(700);
					o.run();
					Thread.sleep(700);
					o.run();
					Thread.sleep(700);
					o.orderReceipt(scan);
					o.newReceipt(scan);
					//	return;
//				}
				//	return;
				break;
			case 10 : ul.logOut(scan); break;
			case 11: break;
			default: System.out.println("잘못된 메뉴입니다.");
			break;
			}

		} while (menu!=11);
		System.out.println("Bar가 종료되었습니다.");


		scan.close();

	}

}