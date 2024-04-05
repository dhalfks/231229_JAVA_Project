package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class SaleManager {
	//메뉴를 저장하기위한 List
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	
	//주문을 저장하기위한 List
	private ArrayList<Order> order = new ArrayList<>();
	
	//기본메뉴 구성
	public void addMenu() {
		menu.add(new Sale("햄버거", 5000));
		menu.add(new Sale("피자", 15000));
		menu.add(new Sale("콜라", 2000));
		menu.add(new Sale("사탕", 1000));
		menu.add(new Sale("과자", 1000));
	}
	
	public void add(Scanner scan) {
		// 메뉴 추가
		System.out.println("메뉴와 가격을 입력해주세요.");
		String menu = scan.next();
		int price = scan.nextInt();
		this.menu.add(new Sale<String, Integer>(menu, price));
		System.out.println("메뉴추가완료!!");
	}

	public void update(Scanner scan) {
		// 메뉴 수정
		//list.set(index, object) : 해당 번지의 객체를 변경
		System.out.println("수정할 메뉴 > ");
		String upMenu = scan.next();
		System.out.println("가격 > ");
		int upPrice = scan.nextInt();
		
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(upMenu)) {
				//객체를 새로 만들어서 해당 번지에 set
				menu.set(i, new Sale(upMenu, upPrice)); 
				//menu.get(i).setPrice(upPrice); //해당 객체의 가격만 수정
				System.out.println("수정완료!!");
				return;
			}
		}
		System.out.println("찾는 메뉴가 없습니다.");
		
	}

	public void delete(Scanner scan) {
		// 메뉴삭제
		System.out.println("삭제할 메뉴 > ");
		String delMenu = scan.next();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(delMenu)) {
				//list.remove(index) / list.remove(Object)
				//menu.remove(i);  //i번지의 객체 삭제
				menu.remove(menu.get(i)); //Object로 삭제
				System.out.println("삭제완료!!");
				return;
			}
		}
		System.out.println("찾는 메뉴가 없습니다.");
		
	}

	public void printSale() {
		// 메뉴 출력
		System.out.println("---menu---");
		for(Sale s : menu) {
			System.out.println(s);
		}
		System.out.println("-----------");
	}

	public void orderPick(String name, int count) {
		// 주문
		//메뉴와 수량을 입력받아 order 객체를 생성 후 orderList에 추가
		//price는 menuList에서 가져와야 함.
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				//내가 주문한 메뉴의 가격
				int price = menu.get(i).getPrice();
				//order의 데이터가 없다면 비교자체가 불가
//				if(order.size()>0) {
//					for(int j=0; j<order.size(); j++) {
//						if()
//					}
//				}
				//주문한 같은 메뉴가 없으면 -1 / 있으면 해당 번지
				int index = orderSearch(name);
				if(index != -1) { //해당 메뉴가 있다면...
					//기존 값에서 count + / total +
					int cnt = order.get(index).getCount();//기존 주문 수량
					int tot = order.get(index).getTotal();//기존 주문 금액
					order.get(index).setCount(count+cnt);//주문수량+기존수량
					order.get(index).setTotal(tot+(price*count));
					System.out.println("주문추가완료!!");
					return;
				}
				Order o = new Order(name, price, count);
				order.add(o);
				System.out.println("주문 추가 완료!!");
				return;
			}
		}
		System.out.println("없는 메뉴입니다.");
	}
	
	public int orderSearch(String name) {
		int index = -1;
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(name)) {
				index = i;
				return index;
			}
		}
		return index;  //해당 메뉴가 없다면 -1리턴
	}

	public void orderPrint() {
		// 주문 출력
		int sum = 0;
		System.out.println("--주문내역--");
		for(Order o : order) {
			sum += o.getTotal();
			o.print();
		}
		System.out.println("----------");
		System.out.println("총지불금액 : "+ sum);
		
	}

}
