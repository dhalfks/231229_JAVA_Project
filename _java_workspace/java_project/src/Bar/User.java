package Bar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class User {
	
	private String id;
	private String pw;
	private String name; // user 이름
	private String brith; // user 생년월일
	private String phone; // user 전화번호
	private HashMap<String, Integer> coupon = new HashMap<>(); // 쿠폰 정보
	private boolean loginad; // 쿠폰을 가지고 있는지 유무
	private int money;
	
	public User(String id, String pw, String name, String brith, 
			String phone) { // 회원가입용 생성자
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.brith = brith;
		this.phone = phone;
		coupon.put("Wellcom Coupon", 10000);
		this.loginad = true;
		this.money = 0;
	}
	
	public void userPrint () {
//		AddMoney am = new AddMoney();
		System.out.println("** myPage **");
		System.out.println("이름 : " + name +" / 생년월일 : "+ brith +" / 전화번호 : " + phone);
		System.out.println("ID : "+ id + " / PW : " + pw);
		System.out.println("현재 잔액 : " + money);
		
		System.out.println("쿠폰 : "+ coupon);	
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "UserAdd [coupon=" + coupon + "]";
	}

}
