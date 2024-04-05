package day06;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성한 후
		 * 1~50랜덤수를 배열에 저장 한 후 출력
		 * 합계, 평균, 최대, 최소 출력
		 * */
		int arr[] = new int[10]; //배열의 초기값은 0
		int sum=0;
		double avg=0;
		int max= 0;
		int min = 50;
		
		//배열의 완성
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i]+" ");
		}
		
		//배열에서 탐색
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		avg = sum / (double)arr.length;
		System.out.println("합계:"+sum+" / 평균:"+avg);
		System.out.println("최대값:"+max+" / 최소값:"+min);

	}

}
