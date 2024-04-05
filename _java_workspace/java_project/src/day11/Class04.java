package day11;

public class Class04 {

	public static void main(String[] args) {
		/* Tv 클래스 생성
		 * 멤버변수 : brand, power, ch, vol
		 * 메서드 : 
		 * power()
		 * power가 켜지면 "TV가 켜졌습니다." 꺼지면 "TV가 꺼졌습니다."
		 * 
		 * chUp() : 1씩 증가 ch은 20까지 있음. 20이 넘어가면 다시 0번으로 순환구조
		 * chDown() : 1씩 감소 Up처럼 순환구조
		 * 
		 * volUp() / volDown() : 1씩증가 / 1씩감소
		 * vol은 10까지 있음. 10이 넘으면 10, 0이면 음소거라고 출력
		 * 
		 * */
		Tv t = new Tv();
		//t.print();
		t.power();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.power();
	}

}

class Tv{
	private final String BRAND = "LG"; //final은 변경할수 없는 값을 지정
	private boolean power; //false
	private int ch; //0
	private int vol; //0
	
	public Tv() {
		this.vol = 3;
	}
	public void print() {
		System.out.println(BRAND+"TV,ch:"+ch +",vol:"+vol);
	}
	
	public void power() {
		power = !power;
		if(power) { //TV가 켜져있는 상태
			System.out.println("전원이 켜집니다.");
			print();
		}else { //가 꺼진 상태
			System.out.println("전원이 꺼집니다.");
		}
	}
	
	public void chUp() { //기본값 0
		if(power) {
			ch++;
			System.out.println("ch:"+ch);
			if(ch>=20) {
				ch=-1;
			}
		}else {
			System.out.println("TV를 켜주세요.");
		}
	}
	
	public void chDown() {
		if(power) {
			ch--;
			System.out.println("ch:"+ch);
			if(ch<=0) {
				ch=21;
			}
		}else {
			System.out.println("TV를 켜주세요.");
		}
	}
	
	public void volUp() {  //기본 3
		if(power) {
			vol++;			
			System.out.println("vol:"+vol);
			if(vol>=10) {
				vol=9;
			}
		}else {
			System.out.println("전원을 켜주세요.");
		}
	}
	public void volDown() {
		if(power) {
			vol--;
			if(vol <=0) {
				vol=0;
				System.out.println("음소거");
			}else {
				System.out.println("vol:"+vol);
			}
		}else {
			System.out.println("전원을 켜주세요.");
		}
	}
	public String getBrand() {
		return BRAND;
	}

	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
}
