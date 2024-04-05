package teamProject;

public class Player {

	private String playerName; // 플레이어 이름
	private int money; // 플레이어가 가지고 있는 돈 (기본값 : 100만원);
	private int playerID; // 땅의 주인을 알기위한 id번호
	private int playerLocation; // 현재 플레이어의 위치숫자
	private String playerLocationCityName; // 현재 플레이어의 위치 도시 이름
	private int playerLocationCityOwnerIndex; // 현재플레이어위치의 도시에 주인 인덱스
	private String playerLocationCityOwnerName; // 현재플레이어위치의 도시에 주인이름 인덱스
	private int desertIsland;
	private int tollPayPassTiket;

	// 생성자
	public Player() {
	}

	public Player(String playerName, int playerID) {
		this.playerID = playerID;
		this.playerName = playerName;
		this.money = 2000000; // 돈 초기설정값
		this.playerLocation = 0;
	}

	// 이벤트맵일 경우(무인도,기부,황금열쇠,시작지점)
	public boolean eventMapCheck() {
		if (this.playerLocation == 0 || this.playerLocation == 1 || this.playerLocation == 2 || this.playerLocation == 6
				|| this.playerLocation == 8 || this.playerLocation == 10 || this.playerLocation == 12
				|| this.playerLocation == 14 || this.playerLocation == 17) {
			return true;
		}
			return false;
	}

	// 현재위치가 기부일경우
	public boolean donationCheck() {
		if (this.playerLocation == 1 || this.playerLocation == 8 || this.playerLocation == 14) {
			return true;
		}
		return false;
	}
	
	//현재위치가 황금 열쇠일 경우
	public boolean goldKeyCheck() {
		if(playerLocation == 2 || playerLocation == 6 || playerLocation == 12 ||playerLocation == 17) {
			return true;
		}
		return false;
	}
	

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public int getPlayerLocation() {
		return playerLocation;
	}

	public void setPlayerLocation(int playerLocation) {
		this.playerLocation = playerLocation;
	}

	public int getDesertIsland() {
		return desertIsland;
	}

	public void setDesertIsland(int desertIsland) {
		this.desertIsland = desertIsland;
	}
	
	public int getTollPayPassTiket() {
		return tollPayPassTiket;
	}

	public void setTollPayPassTiket(int tollPayPassTiket) {
		this.tollPayPassTiket = tollPayPassTiket;
	}

	public String getPlayerLocationCityName() {
		return playerLocationCityName;
	}

	public void setPlayerLocationCityName(String playerLocationCityName) {
		this.playerLocationCityName = playerLocationCityName;
	}

	public int getPlayerLocationCityOwnerIndex() {
		return playerLocationCityOwnerIndex;
	}

	public void setPlayerLocationCityOwnerIndex(int playerLocationCityOwnerIndex) {
		this.playerLocationCityOwnerIndex = playerLocationCityOwnerIndex;
	}

	public String getPlayerLocationCityOwnerName() {
		return playerLocationCityOwnerName;
	}

	public void setPlayerLocationCityOwnerName(String playerLocationCityOwnerName) {
		this.playerLocationCityOwnerName = playerLocationCityOwnerName;
	}

	

}