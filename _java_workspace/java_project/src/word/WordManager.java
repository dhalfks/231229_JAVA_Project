package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WordManager {

	private HashMap<String,String>map = new HashMap<>();

	public void addWord() {
		// TODO Auto-generated method stub
		map.put("dog","강아지");
		map.put("cat","고양이");
		map.put("apple","사과");
		map.put("banana","바나나");
		map.put("orange", "오렌지");
	}

	public void insertWord(Scanner scan) {
		System.out.println("단어:");
		String word = scan.next();
		System.out.println("의미:");
		String mean = scan.next();
		
		map.put(word, mean);
		System.out.println("등록완료!!");
	}

	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어:");
		String word = scan.next();
		System.out.println("--검색결과--");
		System.out.println(word+":"+map.get(word));
	}

	public void modifyWord(Scanner scan) {
		System.out.println("수정할 단어:");
		String word = scan.next();

		map.remove(word);

		System.out.println("의미:");
		scan.nextLine();
		String mean = scan.nextLine();
		
		map.put(word, mean);
		System.out.println("수정완료!!");
	}

	public void printWord() {
		System.out.println("---단어장---");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			System.out.println(word+":"+mean);
		}
		
	}

	public void removeWord(Scanner scan) {
		System.out.println("삭제할 단어:");
		String word = scan.next();
		map.remove(word);
		System.out.println("삭제완료!!");
	}

	public void filePrint() throws IOException {
		// StringBuffer 객체 
		// .append : 기존 String에 데이터 추가 가능.
		// 파일 출력
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		//sb.append : 기존 String에 데이터 추가
		String data = null;
		sb.append("--단어장--");
		sb.append("\r\n"); //줄바꿈
		
		for(String key : map.keySet()) {
			sb.append(key+":"+map.get(key));
			sb.append("\r\n"); //줄바꿈
		}
		
		data = sb.toString(); //StringBuffer 객체여서 String 객체로 변환
		System.out.println(data);
		bw.write(data);
		if(bw !=null) {
			bw.close();
		}
		if(fs != null) {
			fs.close();
		}
	}
	
	
}
