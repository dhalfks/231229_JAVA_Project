package Bar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class Order extends Thread{

	MenuManager mm = new MenuManager(); // 메뉴정보들 저장
	UserManager um = new UserManager(); // 고객 관리하는 시스템
	User myUser = um.getMyUser(); // 로그인한 고객의 정보

	private ArrayList<OrderSet> order = new ArrayList<>();

	private int sum;
	private int sum2; // 결제된 금액 빼는 용
	private int paycnt;
	private int payMoney;

	public void orderPick(Scanner scan) { // 주문하기
		while(UserManager.isLogin() ==true) {
			System.out.println("pw를 입력하세요");
			String userPw = scan.next();
			if(userPw.equals(um.getMyUser().getPw())) {
				mm.addMenu();
				System.out.println("주문하실 메뉴를 입력해주세요.");
				String orderName = scan.next(); // 메뉴 list에서 주문할 메뉴 입력
				for(int i=0; i<mm.alc.size(); i++) {
					if(orderName.equals(mm.alc.get(i).getDrink())) {  
						System.out.println("몇 잔 주문하시겠습니까? / 숫자로 입력해주세요.");
						int cup = scan.nextInt();
						int index=orderSearch(orderName); 
						if(index!=-1) { // 동일한 음료 메뉴를 추가했을 때 누적
							int price=order.get(index).getPrice();
							order.get(index).setCnt(cup+(order.get(index).getCnt()));
							order.get(index).setTotal(price+(order.get(index).getTotal()));
							System.out.println("주문 추가가 완료되었습니다.");
							return;
						}
						OrderSet o = new OrderSet();
						if(orderName.contains(mm.alc.get(i).getDrink())) { // 음료 메뉴를 처음 시켰을 때 
							o.setmenuName(orderName);
							o.setCnt(cup);
							o.setPrice(mm.alc.get(i).getPrice());
							o.setTotal(o.getCnt()*o.getPrice());
							this.order.add(o);
							addOrder(scan);
							return;

						}
					}

				}

				for(int j=0; j<mm.food.size(); j++) {
					if(orderName.equals(mm.food.get(j).getFood())) {
						System.out.println("해당 메뉴를 몇 개 주문하시겠습니까? / 숫자로 입력해주세요.");
						int ea = scan.nextInt();
						int index2=orderSearch(orderName);
						if(index2!=-1) { // 동일한 음식 메뉴를 추가했을 때 누적
							int price=order.get(index2).getPrice();
							order.get(index2).setCnt(ea+(order.get(index2).getCnt()));
							order.get(index2).setTotal(price+(order.get(index2).getTotal()));
							System.out.println("주문 추가가 완료되었습니다.");
							return;
						}
						OrderSet o = new OrderSet();
						if(orderName.contains(mm.food.get(j).getFood())) { // 음식 메뉴를 처음 시켰을 때 
							o.setmenuName(orderName);
							o.setCnt(ea);
							o.setPrice(mm.food.get(j).getPrice());
							o.setTotal(o.getCnt()*o.getPrice());
							this.order.add(o);
							addOrder(scan);
							return;
						}
					}

				}
				for(int i=0; i<mm.alc.size(); i++) {			
					if(!orderName.equals(mm.alc.get(i).getDrink()) ||
							orderName.equals(mm.food.get(i).getFood())) {
						System.out.println("없는메뉴입니다.");
						return;
					}

				}
			}
			System.out.println("회원 정보가 일치하지 않습니다.");
		}
		System.out.println("로그인 후 진행 가능합니다.");
	}

	public int orderSearch(String orderName) { // 음료&음식 중복인지 아닌지 확인
		//name=주문 메뉴
		int index=-1;
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getmenuName().equals(orderName)) {
				index=i;
				return index;
			}	
		}
		return index;
	}

	public void addOrder(Scanner scan) { //추가주문

		for(int i=0; i<mm.alc.size(); i++) {
			System.out.println("추가로 주문하시겠습니까? > y / n");
			String addO = scan.next();
			if(addO.equals("y")) {
				orderPick(scan);
				return;
			} else if(addO.equals("n")){
				System.out.println("주문이 완료되었습니다.");
				return;
			}
		}
		return;
	}

	public void orderReceipt(Scanner scan) {
		while(UserManager.isLogin() == true) {			
			int cnt=0;
			System.out.println("   ===================== 영 수 증 =====================");
			System.out.println("   상품명         단가          주문수량                금액");
			for(int i=0; i<order.size(); i++) {
				String name = order.get(i).getmenuName();
				int price = order.get(i).getPrice();
				sum+=order.get(i).getTotal(); // sum > get(i).getTotal() 누적
				sum2 = order.get(i).getTotal(); // sum2 > get(i).getTotal() 하나의 값을 저장
				cnt=order.get(i).getCnt();
				System.out.println("   "+name+"    "+order.get(i).getPrice()+"원          "+cnt+"개               "+(price*cnt)+"원");
			}

			System.out.println("   --------------------------------------------------");
			for (int i=0;i<order.size();i++) {
				System.out.println("   받을 금액 :                                   "+sum2+"원");
				return;
			}

			LocalDateTime today = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("   yyyy/MM/dd hh:mm:ss");
			System.out.println("   사업자번호 : 265-92-00112");
			System.out.println("   주소 : 인천광역시 남동구 인주대로 593 엔타스빌딩 12층");
			System.out.println("   전화번호 : 032-719-4074");
			System.out.println("              "+dtf.format(today));

			System.out.println();
			return;
		}
		System.out.println("   로그인 및 주문 후 확인 가능합니다.");
	}


	public void newReceipt (Scanner scan) {
		System.out.println();
		System.out.println("   계산하시겠습니다? y / n");
		String newReceipt = scan.next();
		if (newReceipt.equals("y")) {
			if (um.getMyUser().getMoney() >= sum2) { // user가 가지고 있는 금액이 결제 금액보다 많을 때

				System.out.println("   웰컴 쿠폰을 사용하시겠습니까? y / n");
				String coupon = scan.next();

				if (coupon.equals("y")) {
					sum2 = um.getMyUser().getMoney()-(sum2-10000);
					um.getMyUser().setMoney(sum2);
					System.out.println("   할인 적용 되었습니다!");
					System.out.println("   현재 남은 잔액 : " + um.getMyUser().getMoney());	
					paycnt++;
					return;
				} else {
					sum2 = um.getMyUser().getMoney()-sum2;
					um.getMyUser().setMoney(sum2);
					System.out.println("   결제가 완료되었습니다.");
					System.out.println("   현재 남은 잔액 : " + um.getMyUser().getMoney());	
					paycnt++;
					return;
				}				
			} else {	
				System.out.println("   잔액이 부족합니다.");
				return;
			}
		} 
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}

	@Override
	public void run() {
		System.out.println("                           .    ");
	}

}