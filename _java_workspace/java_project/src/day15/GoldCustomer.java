package day15;

public class GoldCustomer extends Customer {
	
	//gold / VIP 할인율 존재
	private double saleRatio;
	
	public GoldCustomer() {}
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio=0.02;
		saleRatio=0.1;
	}
	//할인금액 리턴이 필요하므로 calcPrice메서드를 오버라이딩
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		//세일가격 구하기
		price = price - (int)(price*saleRatio);
		return price;
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

}
