package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WordManager {
	
	private HashMap<String,String> map = new HashMap<>();
	
	public void addWord() {
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("kiwi", "키위");
		map.put("orange", "오렌지");
		map.put("dog", "개");
		map.put("cat", "고양이");
	}

	public void insertWord(Scanner scan) {
		System.out.println("단어>");
		String word = scan.next();
		System.out.println("의미>");
		String mean = scan.next();
		
		map.put(word, mean);
	}

	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어 > ");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("--검색결과--");
			System.out.println(word+":"+map.get(word));
			return;
		}
		System.out.println("검색결과가 없습니다.");
		
	}

	public void modifyWord(Scanner scan) {
		//map은 set이 없음. remove => put
		// key 중복 불가능. put => 덮어쓰기
		System.out.println("수정할 단어 > ");
		String word = scan.next();
		
		if(map.remove(word)== null) {
			System.out.println("수정할 단어가 없습니다.");
			return;
		}
		System.out.println("의미 > ");
		String mean = scan.next();
		map.put(word, mean);
		System.out.println("수정완료");
		
//		if(map.containsKey(word)) {
//			System.out.println("의미 > ");
//			String mean = scan.next();
//			map.remove(word);
//			map.put(word, mean);
//			return;
//		}
//		System.out.println("수정할 단어가 없습니다.");
	}

	public void printWord() {
		int cnt=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			cnt++;
			System.out.println(cnt+". "+word+":"+mean);
		}
		
	}

	public void removeWord(Scanner scan) {
		System.out.println("삭제할 단어 > ");
		String word = scan.next();
		String result = map.remove(word);
		if(result == null) {
			System.out.println("삭제할 단어가 없습니다.");
			return;
		}
		System.out.println("삭제완료");
	}

}
