package Bar;

public class MenuInfo {
	
	private String material;
	
	public MenuInfo() {}
	public MenuInfo(String material) {
		this.material = material; // 칵테일 재료
	}

	public void printMenuInfo() {
		System.out.println(material+" ");
	}
	
	//getter/setter
	public String getMaterial() {
			return material;
		}
	
	public void setMaterial(String material) {
			this.material = material;
		}

	@Override
	public String toString() {
		return "MenuInfo [material=" + material + "]";
	}

}