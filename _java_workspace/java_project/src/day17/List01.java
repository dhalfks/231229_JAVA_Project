package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성
		 * 출력 for / 향상된 for / iterator 출력 
		 * import 단축키 ctrl+shift+o
		 * */
		ArrayList<String> list = new ArrayList<String>();
		list.add("기상");
		list.add("출근");
		list.add("수업");
		list.add("점심먹기");
		list.add("수업");
		list.add("저녁먹기");
		list.add("수업");
		list.add("퇴근");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" / ");
		}
		System.out.println();
		
		for(String s : list) {
			System.out.print(s+" / ");
		}
		System.out.println();
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" / ");
		}
		
		System.out.println();
		
		//정렬 
		Collections.sort(list); 
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는(크다/작다를 이용) -/+의 값이 출력
				//문자는 compareTo 메서드를 활용하여 정렬
				//o1.compareTo(o2) : 오름차순
				return o2.compareTo(o1); //내림차순
			}
		});
		System.out.println(list);

	}

}
