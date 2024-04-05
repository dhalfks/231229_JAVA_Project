package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * 컴퓨터가 랜덤 수 생성 : 23
		 * 입력> 10
		 * up~!!
		 * 입력> 20
		 * up~!!
		 * 입력> 30
		 * down~!!
		 * 입력> 23
		 * 정답!!  종료.
		 * */
		Scanner scan = new Scanner(System.in);
		//1~50까지의 랜덤 수 생성
		int random = (int)(Math.random()*50)+1;  //1~50까지의 랜덤수 생성
		System.out.println(random);
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다. start~!!");
		int num =0; //사용자 입력값
		int count=0; //횟수
		while(count < 5) {  //true 여야 반복
			System.out.println("입력> ");
			num = scan.nextInt();
			count++; //게임 횟수 증가
//			if(count>5) {
//				System.out.println("횟수제한 5회 초과 실패~!!");
//				break;
//			}
			
			if(num > random) {
				System.out.println("down~!! " + count+"회");
			}else if(num < random) {
				System.out.println("up~!! "+count+"회");
			}else {
				System.out.println("정답~!! "+count+"회");
				break;
			}
			
		}
		
		if(count >5) {
			System.out.println("횟수제한 실패~!! ");			
		}
			
		
		scan.close();

	}

}
