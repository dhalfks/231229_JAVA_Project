package teamProject;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {

	private ArrayList<Map> map = new ArrayList<>();
	private ArrayList<Player> players = new ArrayList<>();

	public GameManager() {
	}

	// 도시 추가 메서드
	public void addCities() {

		map.add(new Map("Start"));
		map.add(new Map("Donation"));
		map.add(new Map("GoldKey"));
		map.add(new Map("Sejong", 100000, 150000));
		map.add(new Map("Busan", 200000, 250000));
		map.add(new Map("Jeju", 300000, 350000));
		map.add(new Map("GoldKey"));
		map.add(new Map("Incheon", 300000, 350000));
		map.add(new Map("Donation"));
		map.add(new Map("DokDo", 400000, 450000));
		map.add(new Map("Muindo"));
		map.add(new Map("Ulleungdo", 400000, 450000));
		map.add(new Map("GoldKey"));
		map.add(new Map("Daegu", 400000, 450000));
		map.add(new Map("Donation"));
		map.add(new Map("Daejeon", 450000, 500000));
		map.add(new Map("GwangJo", 450000, 500000));
		map.add(new Map("GoldKey"));
		map.add(new Map("Ulsan", 500000, 550000));
		map.add(new Map("Seoul", 500000, 550000));
	}

	public boolean gameOver() { // 게임 종료 메서드
		for (Player player : players) {
			if (player.getMoney() < 0) {
				return true; // 두 플레이어 중 하나의 돈이 0 미만이면 true 반환하여 게임 종료
			}
		}
		return false; // 두 플레이어의 돈이 모두 0 이상이면 false 반환하여 게임 계속 진행
	}

	// 누가승리했는지 나타내는 메서드
	public void gameOverInfo() {
		Player playerFirstInfo = players.get(0);
		Player playerSecondInfo = players.get(1);

		System.out.println(playerFirstInfo.getMoney() > playerSecondInfo.getMoney()
				? playerFirstInfo.getPlayerName() + "님께서 승리하였습니다!"
				: playerSecondInfo.getPlayerName() + "님께서 승리하였습니다!");
	}

	// 현재 플레이어의 정보
	public void playerInfo(int playerIndex) throws InterruptedException {

		Player playerInfo = players.get(playerIndex);
		String currentMap = map.get(playerInfo.getPlayerLocation()).getCityName();

		System.out.println("<--------------------------------------------------------------------------------->");
		System.out.printf("---<%s님의 턴>---%n", playerInfo.getPlayerName());
		System.out.printf("현재 위치 [%s] | pay[%,d원]%n", currentMap, playerInfo.getMoney());
		System.out.println("<--------------------------------------------------------------------------------->");
		Thread.sleep(2000);
	}

	// 플레이어 생성
	public void playerCreating(Scanner scan) {
		System.out.println("플레이하실 이름>");
		String name = scan.next();
		scan.nextLine();
		int random = (int) (Math.random() * 2);

		if (random == 0) {
			getPlayers().add(new Player(name, 0));
			getPlayers().add(new Player("Bot", 1));
			return;
		}
		getPlayers().add(new Player("Bot", 0));
		getPlayers().add(new Player(name, 1));

	}

	// getter setter
	public ArrayList<Map> getMap() {
		return map;
	}

	public void setMap(ArrayList<Map> map) {
		this.map = map;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
}
