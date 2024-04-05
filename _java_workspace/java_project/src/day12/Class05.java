package day12;

public class Class05 {

	/* 객체를 생성시 값을 초기화 하는 방법
	 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
	 * 1. 기본값 : 기본적으로 지정되는 값 int => 0, String => null
	 * 2. 명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * 		private String name = "홍길동";
	 * 3. 초기화 블럭 : {   } 멤버변수를 초기화
	 * 4. 생성자 : 객체를 생성할 때 초기화 해서 생성
	 * 
	 * 초기값의 우선순위
	 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자(가장 우선순위가 높음)
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenStudent ez = new EzenStudent("인천","홍길동", "java", "111");
		//toString()메서드가 없으면 객체의 주소가 출력
		//toString()메서드가 있으면 toString()가 출력
		System.out.println(ez); //ez.toString() 같은의미
		
		EzenStudent ez1 = new EzenStudent("강남","영이", "java", "222");
		System.out.println(ez1);
		
		EzenStudent ez3 = new EzenStudent();
		System.out.println(ez3);
		
		// 학생 5명 생성
		EzenStudent ez4 = new EzenStudent("인천","순이", "java", "333");
		EzenStudent ez5 = new EzenStudent("강남","철수", "빅데이터", "444");
		EzenStudent ez6 = new EzenStudent("인천","영철", "빅데이터", "555");
		EzenStudent ez7 = new EzenStudent("부천","순신", "빅데이터", "666");
		System.out.println(ez4);
		System.out.println(ez5);
		System.out.println(ez6);
		System.out.println(ez7);
		
		//학생정보를 담을 배열을 생성
		//studentArr[0]=ez
		EzenStudent[] studentArr = new EzenStudent[7];
		studentArr[0]=ez;
		studentArr[1]=ez1;
		studentArr[2]=ez3;
		studentArr[3]=ez4;
		studentArr[4]=ez5;
		studentArr[5]=ez6;
		studentArr[6]=ez7;
		
		//영이 학생이 듣고 있는 과목을 출력
		String searchName = "철수";
		System.out.println("--"+searchName+"학생이 듣고 있는 과목정보--");
		for(int i=0; i<studentArr.length;i++) {
			if(studentArr[i].getName().equals(searchName)) {
				System.out.println(studentArr[i].getGroup());
			}
		}
		
		//순이가 java를 들을려고 했는데 빅데이터로 변경 => 순이 정보를 출력
		String modify = "순이";
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getName().equals(modify)) {
				studentArr[i].setGroup("빅데이터");
				System.out.println(studentArr[i]);
			}
		}
		System.out.println("------------------");
		//자바를 듣고있는 학생명단을 출력 / 학생이 없으면 명단이 없습니다. 출력
		int cnt=0;
		String subject = "빅데이터";
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getGroup().equals(subject)) {
				System.out.println(studentArr[i]);
				cnt++;
			}
		}
		
		if(cnt==0) {
			System.out.println("명단이 없습니다.");
		}
	}

}

class EzenStudent{
	//학생 정보를 생성하는 클래스
	private String gigum="incheon"; //명시적 초기값
	private String name; //기본 초기값 null
	private String group;
	private String phone;
	
	//생성자
	public EzenStudent() {} //기본 생성자

	public EzenStudent(String gigum, String name, String group, String phone) {
		//super();// 내 부모 클래스의 생성자 호출
		this.gigum = gigum;
		this.name = name;
		this.group = group;
		this.phone = phone;
	}
	
	{
		//초기화 블럭 영역
		gigum = "인천";
		name = "미상";
		group="미정";
		phone = "000";
	}

	//toString() : print메서드와 비슷한 일을 함.
	@Override
	public String toString() {
		return gigum+" > "+name + "(" + group + "/" + phone + ")";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}