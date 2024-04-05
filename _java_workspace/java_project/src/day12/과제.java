package day12;
/* - 학생 정보를 관리하기 위한 클래스
 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
 * - 학원 정보 : 학원명="EZEN"(final static), 지점
 * - 수강 정보 : 수강과목, 기간
 *   => 여러과목을 들을 수 있음 (여러과목 수강하기 위해서는 배열로 처리 5과목까지 가능)
 *   
 *  ex) 홍길동 000101 010-1111-1111 25
 *      EZEN(인천)
 *      자바 6개월, 파이썬 1개월, 빅데이터 3개월 
 *      
 * 기능 (메서드)
 * - 학생기본정보를 출력하는 기능
 * - 학원정보를 출력하는 기능
 * - 수강정보를 출력하는 기능
 * - 학생의 수강정보를 추가하는 기능
 * */
public class 과제 {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("홍길동");
		st.setPhone("010-1111-1111");
		st.pringInfo();
		st.printCompany();
		st.printCourse();
		
		Student st1 = new Student("hong","010-222-2222","incheon");
		st1.pringInfo();
		st1.printCompany();
		st1.insertCource("java", "5개월");
		st1.insertCource("html", "1개월");
		st1.printCourse();
		
		Student st2 = new Student("pack", "000101", "010-3333-3333", 25, "seoul");
		st2.pringInfo();
		st2.printCompany();
		st2.insertCource("java", "5개월");
		st2.printCourse();
		
		Student[] std = new Student[8];
		std[0]=st;
		std[1]=st1;
		std[2]=st2;
		//5명 추가  총 8명 생성
		std[3] = new Student("kim", "010-111-2222", "incheon");
		std[3].insertCource("java", "5개월");
		std[3].insertCource("html", "1개월");
		std[3].insertCource("phthon", "1개월");
		std[4] = new Student("lee", "010-111-3333", "seoul");
		std[4].insertCource("java", "5개월");
		std[4].insertCource("phthon", "1개월");
		std[5] = new Student("choi", "010-111-4444", "incheon");
		std[5].insertCource("java", "5개월");
		std[6] = new Student("kang", "010-111-5555", "seoul");
		std[6].insertCource("java", "5개월");
		std[7] = new Student("kim2", "010-111-6666", "incheon");
		
		System.out.println("-------------------------");
		String searchName = "hong"; 
		//hong 학생의 학생정보, 학원정보, 수강정보를 출력
		
		System.out.println(searchName+"님의 검색정보-------");
		for(int i=0; i<std.length; i++) {
			if(searchName.equals(std[i].getName())) {
				std[i].pringInfo();
				std[i].printCompany();
				std[i].printCourse();
			}
		}
		System.out.println("----------------------------");
		
		//인천지점의 학생들을 모두 검색하여 학생정보만 출력
		String searchBranch = "incheon"; 
		System.out.println(searchBranch+"의 검색정보-------");
		for(int i=0; i<std.length; i++) {
			if(std[i].getBranch() != null) {
				if(searchBranch.equals(std[i].getBranch())) {
					std[i].pringInfo();
				}				
			}
		}
		System.out.println("------------------");
		
		//java과목을 수강하는 학생들만 검색하여 학생정보/학원정보 출력
		String searchCourse = "java";
		System.out.println(searchCourse+"의 수강학생 검색------");
		int cnt = 0; //학생의 번지
		while(cnt < std.length) {
			for(int i=0; i<std[cnt].getCourse().length; i++){
				if(std[cnt].getCourse()[i] != null) {
					if(searchCourse.equals(std[cnt].getCourse()[i])) {
						std[cnt].printCompany();
						std[cnt].pringInfo();
						std[cnt].printCourse();
					}
				}
			}
			cnt++;
		}
	}

}

class Student{
	//멤버변수 선언
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY="EZEN"; //Final은 대문자로 변수명 처리
	private String branch;
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; //기간
	private int cnt; //배열의 index 처리용 번지
	
	//생성자
	public Student() {}
	
	public Student(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	public Student(String name, String birth, String phone, int age, String branch) {
		this(name, phone, branch);  //생성자 호출(생성자의 첫 라인에서만 호출 가능)
		this.birth = birth;
		this.age = age;
	}
	//method 
	public void pringInfo() {  //학생의 기본정보 출력
		System.out.println("--학생정보--");
		System.out.println("이름:"+name+"("+age+"세 "+ birth +") / "+phone);
	}
	
	public void printCompany() {
		System.out.println("==학원정보==");
		System.out.println("학원명:"+COMPANY+" / "+branch+"지점");
	}

	//수강정보출력
	public void printCourse() {
		if(course.length == 0 || cnt ==0) { //등록한 과목이 없음.
			System.out.println("수강과목이 없습니다.");
			return; //여기서 메서드 종료
		}
		//cnt까지만 출력 => 추가되지 않은 값은 출력X
		for(int i=0; i<cnt; i++) {
			System.out.println("과정:"+course[i]+"("+period[i]+")");
		}
	}
	
	//수강정보 등록
	//insertCourse() 
	//매개변수 course, period 주고 => 배열에 추가 (배열을 완성 / 리턴되는 값은 없음.)
	public void insertCource(String course, String period) {
		//cnt = 0 => 아직 추가값이 없음. 
		if(cnt >=5) {
			//배열을 더늘려 더 많은 수강을 받을 수도 있음. (배열복사)
			System.out.println("더이상 수강하실 수 없습니다.");
			return;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return COMPANY;
	}
	
}
