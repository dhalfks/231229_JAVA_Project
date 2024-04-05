package Bar;

import java.util.Scanner;

public class AddMoney{
	// 로그인을 한 사용자가 본인 계정에 돈을 입금하고, 환불하고, 잔액을 조회하는 클래스

	private int sumMoney;
	public void addMoney(Scanner scan){
		
		UserManager um = new UserManager(); // 고객 관리하는 시스템
		User myUser = um.getMyUser(); // 로그인한 고객의 정보
		int money = 0;
		this.sumMoney = 0;
		while(UserManager.isLogin()==true) {
			System.out.println();
			System.out.println("             Cocktail Bar Cash");
			System.out.println("   ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");        		
			System.out.println("     1.충전 | 2. 환불 | 3. 잔액 조회 | 4. 종료");
			int s = scan.nextInt();

			switch (s) {
			case 1:
				System.out.println("입금액 > ");
				int amonut = scan.nextInt();
				myUser.setMoney(money+amonut);
				System.out.println("--충전 완료--");
				um.getMyUser().setMoney(sumMoney+=myUser.getMoney());
				System.out.println("잔액:"+ myUser.getMoney());
				break;
			case 2:
				System.out.println("인출액 >>");
				int minus = scan.nextInt();
				if (money < minus) {
					System.out.println("잔액부족, 환불 불가합니다.");
					break;
				}
				myUser.setMoney(money-minus);
				System.out.println("--인출 완료--");
				um.getMyUser().setMoney(sumMoney-=myUser.getMoney());
				System.out.println("잔액 :"+myUser.getMoney());
				
				break;
			case 3:
				System.out.println("--현재 잔액--");  
				System.out.println("잔액 : "+myUser.getMoney());
				
				break;
			case 4:
				System.out.println("충전 종료");
				myUser.setMoney(myUser.getMoney());
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
		System.out.println("로그인 후 진행 가능합니다.");
	}
	public int getSumMoney() {
		return sumMoney;
	}
	public void setSumMoney(int sumMoney) {
		this.sumMoney = sumMoney;
	}
	
	
	
}  
