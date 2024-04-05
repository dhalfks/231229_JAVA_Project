package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력 받아 (Scanner) map에 저장 후 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올 때까지 반복 (1=계속 / 0=종료)
		 * 과목과 점수를 입력해주세요 > 
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 저장 후 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		int exit = 1;  //종료 키워드
		while(exit !=0) {
			System.out.println("과목과 점수를 입력해주세요. >");
			String Subject = scan.next();
			int score = scan.nextInt();
			map.put(Subject, score);
			System.out.println("1:계속, 0:종료");
			exit = scan.nextInt();
		}
		
		int sum =0;
		double avg = 0;
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			int score = map.get(subject);
			sum+=score;
			System.out.println(subject+":"+score);
		}
		System.out.println("합계 : "+sum);
		
		System.out.println("평균 : "+((double)sum / map.size()));
		
		scan.close();

	}

}
