package teamProject;

import java.util.Scanner;

public class EmptyLand {

	BotSelectAction botSelectAction = new BotSelectAction();

	public boolean emptyLandCheck(Player player) { // 빈땅인지 아닌지 체크

		if (player.getPlayerLocationCityOwnerIndex() == -1 && !player.eventMapCheck()) {
			return true;
		}
		return false;
	}

	public void emptyLandPurchaseSet(Player player, Map map) throws InterruptedException {

		if (player.getMoney() < map.getCityLandPrice()) {
			System.out.println("토지 구매 비용이 부족합니다...");
		}else {
		player.setMoney(player.getMoney() - map.getCityLandPrice()); // 원래돈-토지금액
		map.setCityOwner(player.getPlayerID()); // 오너 Id변경
		map.setCityOwnerName(player.getPlayerName()); // 오너 이름변경
		movement1();
		Thread.sleep(500);
		movement2();
		Thread.sleep(500);
		movement1();
		Thread.sleep(500);
		movement2();
		Thread.sleep(500);
		System.out.println("<--------------------------------------------------------------------------------->");
		System.out.printf("             %s님께서 <%s>토지를 구매하였습니다. 구매후 잔액  : [%,d]원%n",player.getPlayerName(),player.getPlayerLocationCityName(),player.getMoney());
		System.out.println("<--------------------------------------------------------------------------------->");
		}
	}

	public void emptyLandPurchaseCoice(Scanner scan, Player player, Map map) throws InterruptedException {

		if (emptyLandCheck(player)) {

			int answer = 0;

			while (answer != 1 && answer != 2) {
				if (player.getPlayerName().equals("Bot")) {
					answer = botSelectAction.selectAction();
				}else {					
					System.out.printf("현재 <%s>은(는) 빈 토지입니다. 토지를 구매하시겠습니까?)1.구매 )2.비구매%n", player.getPlayerLocationCityName());
					System.out.printf("%s님의 보유금액 : [%,d원 ] | 토지 가격 [%,d원]%n", player.getPlayerName(), player.getMoney(),
							map.getCityLandPrice());
				answer = scan.nextInt();
				scan.nextLine();
				}
				switch (answer) {
				case 1:
					if(player.getPlayerName().equals("Bot")) {
						System.out.println("<--------------------------------------------------------------------------------->");
						System.out.printf("                %s님께서 <%s>토지를 구매합니다.%n",player.getPlayerName(),player.getPlayerLocationCityName());
						System.out.println("<--------------------------------------------------------------------------------->");
						Thread.sleep(2000);
						emptyLandPurchaseSet(player, map);
					}else {						
					emptyLandPurchaseSet(player, map);
					}
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
	public void movement1() {
		System.out.println("                                                                                          . . . . . .           .     . . . . . . . .                 \r\n"
				+ "                    .       .   .        .ir::rj17:LgjJU1iiPD7:...      .   .       .    ..     .     ..    ...                                       \r\n"
				+ "                   .       .        vgQPPBgDjvLDdIrPMPKZXrvBBPEb21vi.              .     .       .     ..     .......                                 \r\n"
				+ "                    .       .     :PBBQJuZKU7ir5Svi2J25U7:7MQYu5PKdj7r7.    .           .   .    ..    ....          ..   .   .   . .                 \r\n"
				+ "                   .             .bIRQb7rZPjr:i5Ujv2::iir:7BQ7:::iiiisIEX:      .JRK..:7i.        ..    ....         ..    .                          \r\n"
				+ "                      . . .      BQEgZgPPRRLJvu1uYdQY7YUKYSqJvYvv777JusYPgZ:   BBQBBs.rirri        .. ...   ..........            .                   \r\n"
				+ "                                .BQgZZEgMMg5vUuusYXBII2UYJv77LvJsusJLY7JI5r::riL:  BB.:i:iri     .   .       . . ...   . . .   . . . .                \r\n"
				+ "                                iQMZDEZZMZMgsvjJjvSBPvL777LvYvsLsvsLv7vjU7..i:.. :QBB:::i:ir.                                                         \r\n"
				+ "                   .            rBDDdDdgEDEgbvvuujJSv77LLYvYvLvL777LvYu1vJ.:i:::.:..BU.i:ii7                                                          \r\n"
				+ "                                7BgdZdZgZEDZgPvYJ777vvsLYvL77r7vsYJJu2IvvsUi.:i::.. iviirrr.                                                          \r\n"
				+ "                   .            rBDDEZZgdZEZZMPYrrvLvYLYvvvsU1JUUIU2Uuv7L2L   :iii::.iri..                                                            \r\n"
				+ "                                7QgEZdMEZdZEZDQgUivvsvYvs5qdBQEPEqX1jvYY1S           :i                                                               \r\n"
				+ "                   .            vBZZdZDEdZEZdMRRBIrvvYvYJ:::iv:::.rIYsYYL1r                    .         .       .                   .                \r\n"
				+ "                                IBgdZZgbZEggMDgMRQYiLvYL1:         1J7LvYJK               .                                       .                   \r\n"
				+ "                   .            XBEDdMdZEgRgBQggMQRvrLvYs5.        iIJLYLs27             .                                 .     .   .                \r\n"
				+ "                    .           ZQgdDgZEgBK XBQgMgQM7rLvs1Y         I1JLsvj5                . . .   . . . .   .   . .   .                             \r\n"
				+ "                   .            MBZEZgdDQB   XBBgQQBQL7YLj5.        .quJLsY2L                                                                         \r\n"
				+ "                                BRDdgdDgBL    UBBBBdQQuvssIJ         .q2uYssIr                                                                        \r\n"
				+ "                   .           .BMdDgZgBM      sBv ..:rLvj1X     .     YS2sjs5Ii                                                                      \r\n"
				+ "                               PBZZDDZBB.       :.5gQU.:5::..           .LXU1JU5I:                                                                    \r\n"
				+ "                   .          rBgZdgEQBi        .:RBPI.:B .::i.            7I5uu1S2r                                                                  \r\n"
				+ "                              BQgdgZgBK          i.:: .DB7.:::i:.            .L11j12Xr.                                                               \r\n"
				+ "                   .         qQgdDgDBB           BdJLSQBBr ::i.jQQRMggPXjvi:   .:7LYYUi                                                               \r\n"
				+ "                    .       .BQEZgggB:           BBBBQQQB   .        .:i7v2SbdEqqPQBBMKSIJvri.                                                        \r\n"
				+ "                   .        KBgEDgDBX            BQQgggBB                            :rjIPdggQRDdP2u7.                                                \r\n"
				+ "                            BQDbgEQB             BQggEgQg                                       ..::BK                                                \r\n"
				+ "                   .       .BMEgDgQ7             BQMDggBU          .UsL77v7v7777r777r7rrrrrrrriiii::r7r7777777777v777v7777777v777777v7                \r\n"
				+ "                           7BDDggBR              gBggZRBr          .Xss77777v7v7v7v7v777777777vr777rrr777777v777777777v7v7777777v7v7J7                \r\n"
				+ "                   .       bBDDggB.              KQRgDMB.          .Uv7rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrvr                \r\n"
				+ "                      .    QQZMDBX            .  7BMMZBQ        .   277rrirrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrvr                \r\n"
				+ "                   . . .  .BgggQB    . . . . .   .QQgMBR   . . . . .1v77irrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr77     .          \r\n"
				+ "                          vQRRQBv                 BQBQB2           .U7777irirrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrvr                \r\n"
				+ "                          ZBQBBB                  sBBBB:           .1v7777irirrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr77                \r\n"
				+ "                          irir7                    ...:            .U77777vrrirrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrvr                \r\n"
				+ "                        .7:.....                  .:..:i:.         .u7777777r7rrirrrirrrrrrrrrrrrriririrrriririrrrrrirrrirrrirrrrrrr7r                \r\n"
				+ "                        qBQSLi::i:.              vBUvii:iiiiri     .2vv77777v7v77r7r7r7r7r7r7r7rrrrrrr7rrrrr7rrr7r7r7r7r7r7rrrrr7r7rL7                \r\n"
				+ "                          .rUdZgbPPQL            :IXIqPEZMQBBB     .PI1UuUuUuU1I1IUIU2U21I1IU2UIU2UIU2U21212U212U2UIU2U21I12U21212UIKU                \r\n"
				+ "                               .rsXK:                               i::.:.:::.:::.:::.:.:.:::::.:::.:.:::::::.:.:::.:.:.:.:::::.:.:::: ");
	}
	public void movement2() {
		System.out.println("                                      ...                \r\n\n\n\n\n\n"
				
				
				+ "                   :KPPS2Jvr:.         ...::ii:             \r\n"
				+ "                  JEXPPZZZPPPPqqIUr  .BBU: ..:r:            \r\n"
				+ "                 SbXdr .i7juuJjj2IdX QB.BBEi..r.            \r\n"
				+ "               .PPP2.       7IYss2577L  rr7s:7.             \r\n"
				+ "              .Dgbr     .i :KI5ISJ: b......:...             \r\n"
				+ "              ir7       XBi .rrr:. iM::::...                \r\n"
				+ "            .i:.    .B7 .RB. .. . .BJPr                     \r\n"
				+ "             :::.  .:BB. .QB. .. 7B2rI:                     \r\n"
				+ "                Bq. .iBK   RR. i5B7.r1                      \r\n"
				+ "                dBQ.   QQ.  YKRQ:  Lu          .            \r\n"
				+ "               uBBgPS   XDi   IQ7iDK            .           \r\n"
				+ "               SPIvvQB.  .vMI  7uDj                         \r\n"
				+ "               1QbDPZBBQ5rr2. vuKi                          \r\n"
				+ "               iBRZgEdDBBBBB  Pbs                           \r\n"
				+ "                BMDEZdEPgBBBQ7qP                            \r\n"
				+ "                gBEZdZbEPZQBu ..                            \r\n"
				+ "                YBgEZbEdEEg5RP.                             \r\n"
				+ "                .BgZbZbZbgZZXBBi                            \r\n"
				+ "                 BQEZdEdMBggMZBBM                           \r\n"
				+ "                 SBDdEEQ51BQDDZBBBs                         \r\n"
				+ "                 .BZZdgB7 vQMEDBu BB                        \r\n"
				+ "                 :BDdDRB.  BBgEQB  XBI                      \r\n"
				+ "                :BRdDgBJ   uBggMB   .BB.                    \r\n"
				+ "               :BBEDDB5    .BQZMQ:    1BK                   \r\n"
				+ "               BBZDDBP      BBggBv      BB.                 \r\n"
				+ "              rBDDZBg       vBggBP       sBd                \r\n"
				+ "              bBgDBQ         QBDBR         BBr              \r\n"
				+ "              BQDBB          1BQBB          vBBB2           \r\n"
				+ "             .BQQB.           BBBB           .BQBBv         \r\n"
				+ "             iBRBi            :s:X7.           gBBBB.       \r\n"
				+ "             u::S             BDPPMQQBBd        .EBBBP      \r\n"
				+ "            BBgP5P7.          qXu12KKPXr           rXK      \r\n"
				+ "            .iLXMBBBBS                                      \r\n"
				+ "                  .r7.");
	}
}
