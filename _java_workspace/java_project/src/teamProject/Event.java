package teamProject;

import java.util.Scanner;

public class Event {
	
	private int donationPay;

	// 기부일 경우
	public void donation(Scanner scan, Player player) throws InterruptedException {

		if (player.donationCheck() && player.eventMapCheck()) {
			
			if(player.getMoney()<100000) {
				System.out.println("파산입니다 ㅠㅠ");
				player.setMoney(-1);
				return;
			}
			
			System.out.printf("%s님은 현재 <Donation>칸이여서 기부금 10만원을 내셔야 합니다.%n", player.getPlayerName());
			if (player.getPlayerName().equals("Bot")) {

			} else {
				donationSymbol();
				System.out.println("아무키나 누르시면 기부금을 냅니다.");
				scan.nextLine();
			}
			int total = player.getMoney() - 100000;
			donationPay += 100000;
			player.setMoney(total);
			System.out.println("기부금 100000원은 잘쓰겟습니다.");
			System.out.printf("적립된 기부금 : [%,d원]%n",donationPay);
			System.out.printf("Money [%,d원]%n", player.getMoney());
			Thread.sleep(1000);
		}
	}

	// 무인도일 경우
	public void desertIsland(Player player) {

			System.out.println(
					player.getPlayerName() + "님은 무인도에 갇혀있어 " + player.getDesertIsland() + "턴동안 주사위를 굴리실 수 없습니다.");
			player.setDesertIsland(player.getDesertIsland() - 1);
	}

	// 황금열쇠일 경우
	public void goldKey(Scanner scan, Player player) throws InterruptedException {

		int random = (int) (Math.random() * 2) + 1;

		if (player.goldKeyCheck()) {
			System.out.println(player.getPlayerName() + "님께서 황금 열쇠칸에 도착하셧습니다! ");
			if (player.getPlayerName().equals("Bot")) {
			} else {
				System.out.println("<통행료 패스권> | <기부금약탈> |");
				System.out.println("아무키나 누르시면 랜덤으로 위의 능력중 하나를 획득합니다.");
				scan.nextLine();
			}
			switch (random) {
			case 1:
				System.out.println("<통행료 패스권> 획득!!");
				player.setTollPayPassTiket(player.getTollPayPassTiket()+1);
				Thread.sleep(1000);
				break;
			case 2:
				System.out.println("<기부금약탈>획득!");
				System.out.printf("기부금(%,d원을 획득합니다.)%n",donationPay);
				player.setMoney(player.getMoney()+donationPay);
				donationPay = 0;
				Thread.sleep(1000);
				break;
			}

		}
	}
	public void donationSymbol() {
		System.out.println("                                                            \r\n"
				+ "                        jQBBBBU.       rgQBBBP:             \r\n"
				+ "                     :BBBBBQBBBBQ:   ZBBBBRBBBQBU           \r\n"
				+ "                    PBB5:.....:SBBs BBBi......7BBB          \r\n"
				+ "                   qBB:..:::::..:BBBBI ..:::::..MBB         \r\n"
				+ "                   SBv.:::i:::::.:BBE ::::i::::..BBi        \r\n"
				+ "                     .:::i:i:i:i:.rj.::::i:i:i:: BBq        \r\n"
				+ "                   RBL::i:i:i:i:::..::i:i:i:i::..BBL        \r\n"
				+ "                   ugr.::::i:i:i:::i:i:i:i:i::. uBB         \r\n"
				+ "                     :I:.:::i:i:i:i:i:i:i:i::..JBB:         \r\n"
				+ "                     RBB7..::::i:i:i:i:i:i::..gBB:          \r\n"
				+ "                      JQBQ: .:::i:i:i:i::...uBBB            \r\n"
				+ "                        gBBD:..::i:i::::..7BQBi             \r\n"
				+ "                         .BBBb:..:::::..7BBBJ               \r\n"
				+ "                           .BBBD:..:..rBBBU                 \r\n"
				+ "                             .BBBZ: rBBB5                   \r\n"
				+ ":XdBQBQBBP:                    .QBBBBBI                     \r\n"
				+ "BBBBBBBBBBBg..:::::.:.            BB5                       \r\n"
				+ "QBZ       QBBBBBBBBBBBBBd.                                  \r\n"
				+ "BBQ  BBi  BQ. ........7BBBBE:                               \r\n"
				+ "BBQ  7q.  BB             rQBBBMqqPqPqPq2:                   \r\n"
				+ "BBB       BB. .........     igBBBQBBBBBQBB:          rdBBI. \r\n"
				+ "QBQ       BB. ............              iBQ     iEQBBBBBBBQJ\r\n"
				+ "BBQ       BB. ...........                BBuSBBBBBBIi     BB\r\n"
				+ "QBQ       BB.  ......... .IS121212121UjPQBBBQB5i         .BB\r\n"
				+ "BBQ       BB. . ........ rBBBBBBBBBBBBBBBs:           rDBBB:\r\n"
				+ "BBQ       QB       ......                         iZBBBBQr  \r\n"
				+ "BBg       BBQSL.    . ...                     iPBBBBB7      \r\n"
				+ "BBB:i7rr:EBBBBBBBM:      . ... ...        :KBBBBQs          \r\n"
				+ "gBBQBBBBBQQ    :gBBBE.      .         :IBBBQBJ.             \r\n"
				+ "                  :BBBBP:         .2BBBBB2.                 \r\n"
				+ "                     rBQBQBBBQBBBBBBBS.                     \r\n"
				+ "                        .vbBBBBBZs.                         \r\n"
				+ "         ");
	}
}
