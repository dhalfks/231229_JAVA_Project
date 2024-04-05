package day10;

public class Class03 {

	public static void main(String[] args) {
		//Car1클래스를 통해 c객체를 생성 new 키워드를 통해 생성 Car1() 생성자에 의해 초기화 된다.
		Car1 c = new Car1(); 
		c.setName("카니발");
		c.setYear("2023");
		c.setDoor(4);
		c.setColor("흰색");
		c.printInfo();
		c.speedUp();
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.power();//끔
		c.power();//켬
		c.power();//끔
		c.power();//켬
	
		Car1 c2 = new Car1("소나타","2021");
		c2.printInfo();
		
		Car1 c3 = new Car1("아반테", "2020", "빨강", 4);
		c3.printInfo();

	}

}
//같은 패키지에서 같은 이름의 클래스를 사용하면 error
class Car1{
	
	//멤버변수 : name, year, color, door(문짝개수), power, speed
	private String name;
	private String year;
	private String color;
	private int door;
	private boolean power;
	private int speed;
	
	//생성자 위치
	public Car1() {
		//기본 생성자
	}
	//생성자는 여러개 만들 수 있음.(생성자 오버로딩)
	//오버로딩 조건 : 매개변수의 개수가 달라야함, 타입이 달라야함
	public Car1(String name, String year, String color, int door) {
		this(name, year); //생성자 호출
		this.color = color;
		this.door = door;
	}
	public Car1(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	{
		//원하는 맴버변수의 값을 초기화
		color = "red";
		door = 4;
	}
	
	//내 차량의 정보를 출력하는 메서드 (name, year, color, door)
	public void printInfo() {
		System.out.println(name+"("+year+")");
		System.out.println(color+"("+door+"도어)");
	}
	
	//power()
	//시동이 켜졌습니다. / 시동이 꺼졌습니다.
	public void power() {
		this.power = !power;
		if(this.power && speed <= 0) {
			System.out.println("시동이 켜졌습니다.");
		} else if(power && speed>0) {
			System.out.println("주행중입니다.");
		}else if(!power && speed >0) {
			System.out.println("주행중에 시동을 끌수 없습니다.");
		}else {
			System.out.println("시동을 끕니다.");
			this.power = false;
		}
	}
	
	
	//speedup / down의 기본조건은 power가 켜져야 가능.
	//시동이 꺼져있는 상태라면 시동이 꺼져있습니다. 시동을 켜주세요. 출력
	//speedup
	//300이상이면 최고속도입니다.라고 출력
	//현재속도를 출력
	public void speedUp() {
		if(!power) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
		}else {
			if(speed>=300) {
				speed=300;
				System.out.println("최고속도입니다.");
			}else {
				speed+=10;
				System.out.println("현재속도:"+speed);
			}
		}
	}
	
	
	//speeddown
	//속도가 0이되면 더이상 내려가지 않음. (멈췄습니다.)
	//현재속도 얼마인지 출력
	
	public void speedDown() {
		if(power) {
			if(speed <=0) {
				System.out.println("멈춰있습니다.");
				speed=0;
			}else {
				speed-=10;
				System.out.println("현재속도:"+speed);
			}
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
	}

	//getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

	
	
}