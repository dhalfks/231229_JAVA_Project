package day20;

import java.util.ArrayList;
import java.util.Comparator;

public class Stream03 {

	public static void main(String[] args) {
		// Student 클래스로 리스트 구성
		// add로 5명 추가
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",98));
		list.add(new Student("김길동",78));
		list.add(new Student("이길동",48));
		list.add(new Student("박길동",45));
		list.add(new Student("최길동",76));
		list.add(new Student("고길동",85));
		
		//스트림을 이용하여 콘솔에 출력 ex) 홍길동 : 98
		list.stream()
		.forEach(n->System.out.println(n));
		
		System.out.println("----------");
		list.stream()
		.forEach(n->{
			String name = n.getName(); 
			int score = n.getScore();
			System.out.println(name+":"+score);
		});
		
		//list의 점수 합계 / 전체 인원수 출력
		System.out.println("--점수합계--");
		int sum = list.stream()
				.mapToInt(n->n.getScore())
				.sum();
		System.out.println("점수합계:"+sum);
		
		//인원수
		long count = list.stream().count();
		System.out.println(count+"명");
		
		list.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		})
		.forEach(n-> System.out.println(n));
				
	}

}
