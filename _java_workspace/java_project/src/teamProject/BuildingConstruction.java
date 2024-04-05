package teamProject;

import java.util.Scanner;

public class BuildingConstruction { // 내 땅인지 아닌지 체크

	BotSelectAction botSelectAction = new BotSelectAction();

	public boolean myLandCheck(Player player) {
		if (player.getPlayerLocationCityOwnerIndex() == player.getPlayerID() && !player.eventMapCheck()) {
			return true;
		}
		return false;
	}

	public void buildingConstructionSet(Player player, Map map) {
		if (player.getMoney() < map.getBuildingConstructionPay()) {
			System.out.println("건물을 건설할 비용이 부족합니다...");
			return;
		} else if (map.getBuldingConstructionCount() == 3) {
			System.out.println("최대로 건설할 수 있는 건물을 3개입니다.\n더이상 빌딩을 건설하실 수 없습니다.");
			return;
		}else {			
		player.setMoney(player.getMoney() - map.getBuildingConstructionPay()); // 내돈-건물건설비용
		map.setBuldingConstructionCount(map.getBuldingConstructionCount() + 1); // 건물 카운트 +1
		map.setBuildingConstructionPay((int) (map.getBuildingConstructionPay() * 1.5)); // 빌딩 건설비용 증가
		System.out.printf("%s님께서 [%d]개건물을 건설하였습니당. | 구매후 잔액 : [%,d원]%n", player.getPlayerName(),
				map.getBuldingConstructionCount(), player.getMoney());
		}
	}

	public void buildingConstructionCoice(Scanner scan, Player player, Map map) {

		if (myLandCheck(player)) {

			int answer = 0;

			System.out.printf("현재 <%s>은(는) 당신의 땅입니다. 도시를 건설하시겠습니까?)1.건설 )2.비건설%n", player.getPlayerLocationCityName());
			System.out.printf("%s님의 보유금액 : [%,d원 ] | 건설 가격 [%,d원]%n", player.getPlayerName(), player.getMoney(),
					map.getBuildingConstructionPay());

			if (player.getPlayerName().equals("Bot")) {
				answer = botSelectAction.selectAction();
			} else {
			}
			while (answer != 1 && answer != 2) {
				answer = scan.nextInt();
				scan.nextLine();
				switch (answer) {
				case 1:
					buildingConstructionSet(player, map);
					break;
				case 2:
					System.out.println("토지를 구매하지 않고 넘어갑니다.");
					break;
				default:
					System.out.println("잘못된 선택입니다 1번과 2번 중 다시 입력해주세요.");
					break;
				}
			}
		}
	}
}
