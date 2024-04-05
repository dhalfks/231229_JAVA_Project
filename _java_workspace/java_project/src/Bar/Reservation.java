package Bar;

import java.util.Scanner;

public class Reservation {
	// 사용자마다 단 한번만 예약가능한 조건
	// 좌석은 예약마다 단 한 좌석만 가능한 조건
	
	public String name; //예약자 이름
	public int group; //인원수
	public String seat; //좌석
	
	public Reservation() {}
	
	public Reservation(String name,int group) { // 예약자명 & 인원수 받는 생성자
		this.name=name;
		this.group=group;
	}
	
	public Reservation(String seat) {
		this.seat=seat;
	}
	
	public Reservation(String name,int group,String seat) {
		this.seat=seat;
		this.name=name;
		this.group=group;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Reservation [예약자명: " + name + ", 예약인원: " + group + ", 좌석 :" + seat + "]";
	}


}