package teamProject;

import java.util.Scanner;

public class Toll {

	BotSelectAction botSelectAction = new BotSelectAction();

	public boolean myLandCheck(Player player, Map map) {
		if (player.getPlayerLocationCityOwnerIndex() != -1 && map.getCityOwner() != player.getPlayerID()
				&& !player.eventMapCheck()) {
			return true;
		}
		return false;
	}

	public void tollPayment(Scanner scan, Player currentPlayer, Player opponentPlayer, Map map) {

		if (myLandCheck(currentPlayer, map) &&currentPlayer.getTollPayPassTiket()==0) {

			if (currentPlayer.getMoney() < map.getBuildingConstructionPay()) {
				currentPlayer.setMoney(-1);
				System.out.println("!!!통행료를 지불할 비용이 없어!!!");
				System.out.println("!!!파산!!!!");
				return;
			} else {

				int tollPay = (int) (map.getBuildingConstructionPay() * 1.5);
				int myTotal = currentPlayer.getMoney() - tollPay;
				int yourTotal = opponentPlayer.getMoney() + tollPay;

				System.out.printf("현재 <%s>도시는 %s님의 땅입니다. 통행료를 지불하셔야 됩니다ㅠㅠ%n", map.getCityName(),
						map.getCityOwnerName());
				System.out.printf("통행료는 [%,d원] 입니다.%n", tollPay);

				if (currentPlayer.getPlayerName().equals("Bot")) {
				} else {
					System.out.println("아무키나 입력하면 통행료를 지불합니다.");
					scan.next();
					scan.nextLine();
				}
				currentPlayer.setMoney(myTotal);
				opponentPlayer.setMoney(yourTotal);

				System.out.printf("%s님께 통행료(%,d원)을 지불하였습니다.%n", currentPlayer.getPlayerName(), tollPay);
				System.out.printf("지불 후 금액 : [%,d원]%n", myTotal);
			}
		}
	}

	public void tollPaymentAndTollPassTiket(Scanner scan, Player currentPlayer, Player opponentPlayer, Map map) {

		int answer = 0;

		if (currentPlayer.getTollPayPassTiket() > 0 && myLandCheck(currentPlayer, map)) {
			System.out.printf("<%s>도시는 %s님의 땅입니다.",currentPlayer.getPlayerLocationCityName(),opponentPlayer.getPlayerName());
			System.out.printf("현재 %s님은 <통행료 패스권> %d장을 가지고 있습니다. 사용하시겠습니까? 1)사용 2)미사용",currentPlayer.getPlayerName(),currentPlayer.getTollPayPassTiket());
			answer = scan.nextInt();
			scan.nextLine();

			switch (answer) {
			case 1:
				System.out.println("<통행료 패스권을 사용하였습니다.>");
				currentPlayer.setTollPayPassTiket(currentPlayer.getTollPayPassTiket() - 1);
				break;
			case 2:
				tollPayment(scan, currentPlayer, opponentPlayer, map);
				break;
			}
		}
	}

}
