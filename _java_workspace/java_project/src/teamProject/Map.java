package teamProject;

public class Map {

	private String cityName; // 건물 이름
	private int cityLandPrice; // 건물 가격(처음 땅 가격)
	private int cityOwner = -1; // 건물 소유주 code 빈땅일 경우 -1
	private String cityOwnerName;
	private int buildingConstructionPay; // 건물가격
	private int buldingConstructionCount;// 건물 개수

	// 생성자
	Map() {
	}

	public Map(String cityName) {
		this.cityName = cityName;
	}

	public Map(String cityname, int cityLandprice, int buildingConstructionPay) {
		this.cityName = cityname;
		this.cityLandPrice = cityLandprice;
		this.buildingConstructionPay = buildingConstructionPay;
		this.buldingConstructionCount = 0;
	}

	// getter / setter
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityOwner() {
		return cityOwner;
	}

	public void setCityOwner(int cityOwner) {
		this.cityOwner = cityOwner;
	}

	public int getCityLandPrice() {
		return cityLandPrice;
	}

	public void setCityLandPrice(int cityLandPrice) {
		this.cityLandPrice = cityLandPrice;
	}

	public String getCityOwnerName() {
		return cityOwnerName;
	}

	public void setCityOwnerName(String cityOwnerName) {
		this.cityOwnerName = cityOwnerName;
	}

	public int getBuildingConstructionPay() {
		return buildingConstructionPay;
	}

	public void setBuildingConstructionPay(int buildingConstructionPay) {
		this.buildingConstructionPay = buildingConstructionPay;
	}

	public int getBuldingConstructionCount() {
		return buldingConstructionCount;
	}

	public void setBuldingConstructionCount(int buldingConstructionCount) {
		this.buldingConstructionCount = buldingConstructionCount;
	}

}