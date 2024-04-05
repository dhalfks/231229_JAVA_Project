package word;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		WordManager wm = new WordManager();
		wm.addWord();
		int menu = -1;
		do {
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.단어파일출력|7.종료");
			System.out.println("선택 > ");
			menu = scan.nextInt();

			switch(menu) {
			case 1: wm.insertWord(scan); break;
			case 2: wm.searchWord(scan); break;
			case 3: wm.modifyWord(scan); break;
			case 4: wm.printWord(); break;
			case 5: wm.removeWord(scan); break;
			case 6: wm.filePrint(); break;
			case 7:  break;
			default:
				System.out.println("잘못된 메뉴~!!");
			
			}
		}while(menu != 7);
		System.out.println("프로그램 종료");

	}

}
