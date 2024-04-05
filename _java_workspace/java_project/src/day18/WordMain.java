package day18;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/* 단어장 프로그램 작성
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
		 * WordManager 클래스를 생성하여 메서드 구현
		 * map을 이용하여 단어 등록
		 * 기본단어 등록 (5가지 등록)
		 * main에서는 메뉴가 반복 실행되도록 설정.
		 * */
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		wm.addWord(); //기본값 추가
		int menu = -1;
		do {
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료");
			System.out.println("선택 >");
			menu = scan.nextInt();
			switch (menu) {
			case 1: wm.insertWord(scan);   break;
			case 2: wm.searchWord(scan);    break;
			case 3: wm.modifyWord(scan);    break;
			case 4: wm.printWord();    break;
			case 5: wm.removeWord(scan);    break;
			case 6: break;
			default: System.out.println("잘못된 메뉴입니다.");
				break;
			}

		}while(menu != 6);
		System.out.println("프로그램 종료");
		scan.close();

	}

}
