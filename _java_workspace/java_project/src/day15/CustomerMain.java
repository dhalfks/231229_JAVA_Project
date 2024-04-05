package day15;

public class CustomerMain {

	public static void main(String[] args) {
		Customer[] customerList = new Customer[10];
		
		Customer cLee = new Customer(1001, "리정혁");
		Customer cHong = new GoldCustomer(1002, "홍길동");
		Customer cKim = new VipCoustomer(1003, "김철수", 1111);
		
		int cnt = 0;
		customerList[cnt]=cLee;
		cnt++;
		customerList[cnt]=cHong;
		cnt++;
		customerList[cnt]=cKim;
		cnt++;
		customerList[cnt]=new Customer(1004, "영이");
		cnt++;
		customerList[cnt]=new GoldCustomer(1005, "순이");
		cnt++;
		customerList[cnt]=new VipCoustomer(1006, "영철", 2222);
		cnt++;
		customerList[cnt]=new VipCoustomer(1007, "영수", 1111);
		cnt++;
		
		//다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		//자식 고유의 멤버변수나 메서드를 호출하고자 할 때 사용
		//다운캐스팅 : 반드시 명시적으로 형변환 해야함.
		//instanceof : 객체의 형이 맞는 체크하는 명령어 true / false
		
		System.out.println("--할인율과 포인트 계산--");
		
		int price = 100000;
		for(int i=0; i<cnt; i++) {
			int salePrice = customerList[i].calcPrice(price);
			System.out.println(customerList[i].getCustomerName()
					+"님의 지불금액 "+salePrice + " / 보너스 포인트 "+
					customerList[i].getBonusPoint());
			System.out.println("------------------------------");
		}
		
		
		System.out.println("-- 고객 정보 출력 ---");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
		}
		
		System.out.println("----------------------------");
		//agentID = 1111  => 3333 변경
		for(int i=0; i<cnt; i++) {
			Customer c = customerList[i];
			if(c instanceof VipCoustomer) {
				VipCoustomer vip = (VipCoustomer)c;
				if(vip.getAgentID()==1111) {
					vip.setAgentID(3333);
				}
			}
		}
		
		
		System.out.println("-- 고객 정보 출력 ---");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
		}
		
		
		
		
		
		
		
//		int price = cLee.calcPrice(10000);
//		System.out.println("지불금액 "+price);
//		cLee.customerInfo();
//		
//		System.out.println("지불금액 "+cHong.calcPrice(10000));
//		cHong.customerInfo();
//		
//		System.out.println("지불금액 "+cKim.calcPrice(10000));
//		cKim.customerInfo();
	}
}
