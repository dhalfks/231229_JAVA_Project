package day05;

public class Array03 {

	public static void main(String[] args) {
		//과제 => 카페에 제출
		
		int arr[] = new int[] {10,56,78,89,48,62,93,50};
		/* arr배열의 합계와 평균을 출력
		 * 최대값 / 최소값 출력
		 * Math.max  Math.min
		 * if문
		 * */
		
		int sum = 0;
		double avg = 0;
		//성적 데이터 (0 ~ 100)
		int max = 0; //가장 큰 값을 넣기 위한 변수
		int min = 100; //가장 작은 값을 넣기 위한 변수
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
//			if(max < arr[i]) {  //93
//				max = arr[i]; 
//			}
//			if(min > arr[i]) {  // 100  > 10
//				min = arr[i];
//			}
			
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			
		}
		avg = sum / (double)arr.length;
		System.out.println("합계:"+sum+" / 평균:"+avg);
		System.out.println("최대값:"+max+" / 최소값:"+min);
	

	}

}
