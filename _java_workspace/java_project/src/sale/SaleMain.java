package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/* menu
		 * 1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)
		 * 4.메뉴보기(전체메뉴출력)|5.주문|6.주문내역출력(영수증)
		 * 7.종료
		 * */
		
		SaleManager sm = new SaleManager();
		Scanner scan = new Scanner(System.in);
		sm.addMenu();
		int menu = 0; 
		
		do {
			System.out.println();
			System.out.println("1.메뉴추가|2.메뉴수정|3.메뉴삭제");
			System.out.println("4.메뉴리스트|5.주문|6.주문내역");
			System.out.println("7.종료|  선택>> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sm.add(scan); break;
			case 2: sm.update(scan); break;
			case 3: sm.delete(scan); break;
			case 4: sm.printSale(); break;
			case 5: 
				System.out.println("주문메뉴 > ");
				String name = scan.next();
				System.out.println("주문수량 > ");
				int count =scan.nextInt();
				sm.orderPick(name, count); 
				break;
			case 6: sm.orderPrint(); break;
			case 7: break;
			default:
				System.out.println("잘못된 메뉴");
			}
		}while(menu != 7);
		System.out.println("프로그램 종료");
	
		scan.close();
	}

}
