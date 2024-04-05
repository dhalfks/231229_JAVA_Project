package day03;

public class For02 {

	public static void main(String[] args) {
		/* 1~10까지 출력
		 * */
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		/* 1부터 10까지 짝수만 출력
		 * */
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) { //짝수
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		/* 1~10까지 합계를 구하기
		 * */
		int sum=0;  //지역변수는 반드시 초기화 해야함. 초기화 기본값 0  / null
		for(int i=1; i<=10; i++) {
			sum = sum + i;   //sum += i;
		}
		System.out.println(sum);
		
		/* 1~10까지의 짝수합과, 홀수합을 출력
		 * */
		//sum의 값은 55
		sum=0;
		int sum_even = 0;
		//int sum_odd = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				sum_even += i;
			}else {
				sum += i;
			}
		}
		System.out.println("짝수 합:"+sum_even);
		System.out.println("홀수 합:"+sum);
		
		
		
		
		
		

	}

}
