package Bar;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationManager {

	private ArrayList<Reservation> res = new ArrayList<>();//예약 > myUser꺼
	private ArrayList<Reservation> seatn = new ArrayList<>();//좌석

	//좌석 세팅
	public void addseat() {  //기본 좌석 세팅 
		seatn.add(new Reservation(" A1 ")); 
		seatn.add(new Reservation(" A2 "));
		seatn.add(new Reservation(" A3 "));
		seatn.add(new Reservation(" A4 "));
		seatn.add(new Reservation(" B1 "));
		seatn.add(new Reservation(" B2 "));
		seatn.add(new Reservation(" B3 "));
		seatn.add(new Reservation(" B4 "));
		seatn.add(new Reservation(" C1 "));
		seatn.add(new Reservation(" C2 "));
		seatn.add(new Reservation(" C3 "));
		seatn.add(new Reservation(" C4 ")); 
		seatn.add(new Reservation(" D1 "));
		seatn.add(new Reservation(" D2 "));
		seatn.add(new Reservation(" D3 "));
		seatn.add(new Reservation(" D4 "));
	}

	public void printseat() { // 예약 전, 후 좌석 출력 

		System.out.println("   ┎━━━━━━━━━━━━━━━━ 좌석 ━━━━━━━━━━━━━━━┒");
		for(int i=0; i<seatn.size(); i++) {
			if(i % 4 == 0 && i !=0) {
				System.out.println();
			}
			System.out.print("     "+seatn.get(i).getSeat());
		}
		System.out.println();
		//      System.out.println(   "       A1      A2      A3     A4       ");
		//      System.out.println(   "       B1      B2      B3     B4       ");
		//      System.out.println(   "       C1      C2      C3     C4       ");
		//      System.out.println(   "       D1      D2   Reservation   D3     D4       ");
		System.out.println("   ┖━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┚");
	}

	public void reservation(Scanner scan) { // 좌석 예약을 구현하는 메서드 manager

		while (UserManager.isLogin()==true) {
			printseat();
			System.out.println();
			System.out.println("   ━━━━━━━━━━━━ menu ━━━━━━━━━━━━");
			System.out.println("   1. 예약하기 | 2. 예약조회 | 3. 종료");
			int menu=scan.nextInt();
			switch(menu) {
			case 1: addreservation(scan); break; // 예약하기 메서드
			case 2: printreservation(scan); break; // 예약조회 메서드
			case 3: System.out.println("예약시스템 종료");return;
			default :System.out.println("잘못누르셨습니다.");
			}
		}
		System.out.println("로그인 후 진행 가능합니다.");
	}

	public void addreservation(Scanner scan) { // 예약하기 메서드
		System.out.println("예약자명 >>");
		String name=scan.next();
		System.out.println("예약인원 >>");
		int group=scan.nextInt();
		System.out.println("좌석번호 >>");
		String seatnum = scan.next();
		seatnum = seatnum.toUpperCase();

		for (int i=0;i<seatn.size();i++) {
			if ((" "+seatnum+" ").equals(seatn.get(i).getSeat())) { //내가 입력한 좌석번호가 seatn에 있는지 확인
				// 입력한 좌석과 일치한다면 예약자명, 인원 생성자에 저장
				seatn.get(i).setSeat("["+seatnum+"]");
				res.add(new Reservation(name,group,seatnum));
				System.out.println("예약자 이름:"+name+" 예약인원: "+group+"명");
				System.out.println("예약한 좌석번호: "+seatnum);
				System.out.println("★☆★☆예약완료★☆★☆");
				System.out.println();
				return;
			}
		}
		System.out.println("입력한 좌석은 없습니다.");
	}

	public void  printreservation(Scanner scan) { //예약조회 메서드

		System.out.println("예약자명 >>");
		String openname=scan.next();
		for(int i=0; i<res.size(); i++) {
			if(res.get(i).getName().equals(openname)) {
				System.out.println("예약자 이름: "+res.get(i).getName()
						+" 예약인원: "+res.get(i).getGroup()
						+" 예약석: "+res.get(i).getSeat());
				return;
			}
		}
		System.out.println("명단에 없습니다.");
	}

	public void cancelreservation(Scanner scan) { // 예약취소

		while ((UserManager.isLogin()==true)) {
			for (int i=0;i<res.size();i++) {
				if (res.get(i).getName()!=null) { // 예약한 정보가 있을 경우
					printseat();
					System.out.println();
					System.out.println("   ━━━━━━━━━━━━ menu ━━━━━━━━━━━━");
					System.out.println("   1. 예약취소 | 2. 종료");

					int menu=scan.nextInt();
					switch(menu) {
					case 1: 
						System.out.println("예약자 이름>> "); 
						String cancelname=scan.next(); // 취소하는 예약자명
						if(cancelname.equals(res.get(i).getName())) {
							
							for (int j=0;j<seatn.size();j++) {
								if (("["+res.get(i).getSeat()+"]").equals(seatn.get(j).getSeat())) {
									String newSeat = seatn.get(j).getSeat();
									newSeat = newSeat.replace("[", " ");
									newSeat = newSeat.replace("]", " ");
									seatn.set(j, new Reservation(newSeat));
								}
							}
							res.remove(i);
							System.out.println("예약 취소 완료");
							return;
						}
						System.out.println("예약자 명단이 없습니다.");
						return;
					case 2: 
						System.out.println("예약시스템 종료");
						return;
					default :
						System.out.println("잘못누르셨습니다.");
						break;
					}
				} 
			}
			System.out.println("예약된 정보가 없습니다.");
			return;
		}
		System.out.println("로그인 후 진행 가능합니다.");
	}


}