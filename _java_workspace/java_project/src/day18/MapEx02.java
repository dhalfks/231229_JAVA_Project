package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * map에 저장 후 출력
		 * 
		 * */
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		int size = 3;
		while(map.size() < size) {
			System.out.println("단어:");
			String word = scan.next();
			System.out.println("의미:");
			String mean = scan.next();
			
			map.put(word, mean);
		}
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			System.out.println(word+":"+mean);
		}
		
		
		
		
		
		scan.close();
		
		
		

	}

}
