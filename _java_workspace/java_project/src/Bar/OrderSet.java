package Bar;

public class OrderSet {
	private String menuName; // 주문한 메뉴이름
	private int price; // 주문한 메뉴가격
	private int cnt; // 메뉴 주문 수량
	private int total; // 주문한 전체금액 
	
	public OrderSet() {}
	public OrderSet(String menuName, int price) {
		this.menuName=menuName;
		
	}
	public String getmenuName() {
		return menuName;
	}
	public void setmenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	} 
	

}