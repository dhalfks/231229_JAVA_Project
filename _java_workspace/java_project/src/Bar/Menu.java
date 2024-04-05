package Bar;

public class Menu {
	
	private String drink; // 음료이름
	private String food; // 음식이름
	private int price; // 음료/음식 가격
	private String ac; // 음료 알콜도수
	
	public Menu() {}
	public Menu(String drink, int price, String ac) { 
		this.drink = drink;
		this.price = price;
		this.ac = ac; // 알콜
	}
	public Menu(String food, int price) {
		this.food = food;
		this.price = price;
	}
	
	//getter/setter
	public String getDrink() {
		return drink;
	}
	public String getFood() {
		return food;
	}
	public int getPrice() {
		return price;
	}
	public String getAc() {
		return ac;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	
	@Override
	public String toString() {
		return drink+" "+price+" "+ac+"% alc";
	}

	
}