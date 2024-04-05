package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 과제 {

	public static void main(String[] args) {
		/* 스트림으로 출력
		 * 여행사 상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 그미만은 50만원으로 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용계산 => 출력, 2. 고객명단 검색 => 출력
		 * 고객 클래스를 생성하고, ArrayList로 고객관리
		 * 
		 * 예시) 고객정보 -> 고객명단
		 * 이름:이순신, 나이:40, 비용:100
		 * 이름:신사임당, 나이:35, 비용:100
		 * 이름:홍길동, 나이:10, 비용:50
		 * 총 여행 경비 : 250
		 * 
		 * 20대 이상 고객명단 => 이름순으로 정렬
		 * 이름:신사임당, 나이:35, 비용:100
		 * 이름:이순신, 나이:40, 비용:100
		 * 
		 * */
		Customer lee = new Customer("이순신", 40);
		Customer sin = new Customer("신사임당", 35);
		Customer hong = new Customer("홍길동", 10);
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(lee);
		list.add(sin);
		list.add(hong);
		
		int sum =0; 
		System.out.println("--고객명단--");
		for(Customer tmp : list) {
			String name = tmp.getName();
			int age = tmp.getAge();
			int price = tmp.getPrice();
			sum += price;
			System.out.println(name+"("+age+")"+"비용:"+price);
		}
		System.out.println("총지불비용:"+sum);
		
		Collections.sort(list); //클래스에 정렬 구현되어있으면 사용가능
		System.out.println("--20대이상 명단--");
		for(Customer tmp : list) {
			if(tmp.getAge() >= 20) {
				System.out.println(tmp);
			}
		}
		
		System.out.println("----스트림을 이용한 방법 --");
		list.stream().forEach(s->System.out.println(s));
		
		//원하는 요소만 출력
//		System.out.println("--고객명만 출력--");
//		list.stream()
//		.map(m->m.getName())
//		.forEach(n->System.out.println(n));
		
		//총비용
		int tot = list.stream()
				.mapToInt(n->n.getPrice())
				.sum();
		System.out.println("총지불금액 :"+tot);
		
		//나이가 20세 이상인데이터만 추출
		list.stream()
		.filter(c->c.getAge() >= 20)
		.sorted() //정렬이 구현되어 있는 경우
		//기존 클래스 자체에서 정렬이 구현되어 있지 않을 경우
//		.sorted(new Comparator<Customer>() {
//
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		})
		.forEach(a->System.out.println(a));
		
		
		//익명클래스 사용할 경우 Comparator 대상(매개변수) 2개
		//클래스 내부에서 구현할 경우 Comparable구현 대상(매개변수) 1개

	}

}
