package teamProject;

public class Dice {

	private int diceNum;

	public void rollTheDice(Player player) throws InterruptedException {

		diceNum = (int) (Math.random() * 6) + 1;

		player.setPlayerLocation(player.getPlayerLocation() + diceNum); // 자기 위치 + 주사위 1~6까지 나온 인덱스를 더함

		if (player.getPlayerLocation() == 10 && player.getDesertIsland() == 0) {
			player.setDesertIsland(2);
			System.out.println("무인도에 갇혔다........2턴동안 무인도에서 못나가요");
			Thread.sleep(2000);
			return;
		} else {
			System.out.println("주사위를 굴리는 중");
			diceMotion1();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("주사위를 굴리는 중.");
			diceMotion2();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("주사위를 굴리는 중..");
			diceMotion1();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("주사위를 굴리는 중...");
			diceMotion2();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (player.getPlayerLocation() > 19) {
			player.setPlayerLocation(player.getPlayerLocation() - 20);
			System.out.println("한바퀴를 돌아 월급 10만원 지급~!");
			player.setMoney(player.getMoney() + 100000);
		}
	}

	public void playerSet(Player player, Map map) { // 주사위를 돌린 후 셋팅

		if (player.getDesertIsland() > 0) {
			return;
		} else {

			player.setPlayerLocationCityName(map.getCityName());
			player.setPlayerLocationCityOwnerIndex(map.getCityOwner());
			player.setPlayerLocationCityOwnerName(map.getCityName());

			switch (this.diceNum) {
			case 1:
				diceResult1();
				break;
			case 2:
				diceResult2();
				break;
			case 3:
				diceResult3();
				break;
			case 4:
				diceResult4();
				break;
			case 5:
				diceResult5();
				break;
			case 6:
				diceResult6();
				break;
			}
			System.out.println("<--------------------------------------------------------------------------------->");
			System.out.printf("<                        <%d>칸 이동하여 [%s] 도착!                               >%n",
					diceNum, map.getCityName());
			System.out.println("<--------------------------------------------------------------------------------->");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void diceResult1() {
		System.out.println("\r\n"
				+ "                      .gBQBBBBBBBBBQBBBBBBBBBBBQBBBBBBBBBBBBBBBBBBBBBBBBBQBBBBd                     \r\n"
				+ "                     gBBBXvLLYLsvYLYvsvsLsLYvsvsvYvsLYvYLYLYLYLYLsvYLsvsLYvYqBBBK                   \r\n"
				+ "                    BBB:                                                      rBBQ                  \r\n"
				+ "                   2BB                                                         .BBr                 \r\n"
				+ "                   sBB                                                          BQi                 \r\n"
				+ "                   sBB                                                          BBi                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   sBB                                                          BBi                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   JBB                                                          BBi                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   JBB                       r2dgQQQDbui                        BBi                 \r\n"
				+ "                   YBQ                    iPQggEEPbPEdgMQq:                     BBi                 \r\n"
				+ "                   JBB                  .DMDPPqPSKXqSqKbPgQP                    QB:                 \r\n"
				+ "                   YBQ                 :BZbqKXKSKSKSKSKXPqdgB.                  BBi                 \r\n"
				+ "                   sBB                .BEPXKSXSKSKXKXKXKXbXEDB                  BB:                 \r\n"
				+ "                   LBB                PDPXKSKXKXKSKSKSKKdvr1DMU                 BQi                 \r\n"
				+ "                   sBB           .    QDKPXqKPKPKqXPXKKbsrvrIMM                 BB:                 \r\n"
				+ "                   YBB                BuKPJI5Lu1K77L5XPui1ZLrdB                 BBi                 \r\n"
				+ "                   sQB           .    gsSZrU5LJUPvYbKPUisdqbvuq                 BBi                 \r\n"
				+ "                   YBB                7Eu271SJYrbj7JSKrvbKqPDP.                 BQi                 \r\n"
				+ "                   sBB                 5QdqPX5IqqPI5Sq5PKPqZQL                  BB:                 \r\n"
				+ "                   YBB                  sQgPPqPXqKqXqXqqPPgQr                   BBi                 \r\n"
				+ "                   JBB                   .SBMgPPPbPPqdbDMQU                     BBi                 \r\n"
				+ "                   YBB                      7qQQQMQMQRRXr                       BQi                 \r\n"
				+ "                   JBB                         ..:::.                           BB:                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   JBB                                                          BB:                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   JBB                                                          BBi                 \r\n"
				+ "                   YBQ                                                          BBi                 \r\n"
				+ "                   sQB                                                          BBi                 \r\n"
				+ "                   UBB                                                          BBr                 \r\n"
				+ "                   iBBg                                                        BBB.                 \r\n"
				+ "                    rBBB1                                                   .SBBB:                  \r\n"
				+ "                      XBBBQBQBBBBBBBBBBBBBQBBBBBBBBBBBBBBBBBBBQBBBBBBBBBBBBBBBBu                    \r\n"
				+ "                        :iriririririririririririririririririririririririririi.  ");
	}

	public void diceResult2() {
		System.out.println("\r\n"
				+ "                      .gBBBBBBBBBQBBBBBBBBBBBBBBBBBBBBBBBBBQBQBBBBBBBQBBBBBBBQE                     \r\n"
				+ "                     gQBBXvLvYvYvsvLLsvYLYvYLYLYvYvsLYLYLYvYLsLYLYLYLsvYvsvYqBBBK                   \r\n"
				+ "                    BBB:                                                      rBBB                  \r\n"
				+ "                   IBB                                                         .BBr                 \r\n"
				+ "                   sBB          .iLvr                                           BBi                 \r\n"
				+ "                   JBB        PBQBBBQBBX                                        BBi                 \r\n"
				+ "                   LBB      iQBBBBBBBBBBB.                                      BBi                 \r\n"
				+ "                   sBB      BBBBBBBBBBBBBB                                      BBi                 \r\n"
				+ "                   YBQ     2BBBBBBBBBBBBBBL                                     BBi                 \r\n"
				+ "                   JBB     sQBBBBBBBQBQBBBi                                     BB:                 \r\n"
				+ "                   YBB      BBBBBBBBBBBBBB                                      BBi                 \r\n"
				+ "                   sBB       BBBBBBBBBBBM                                       BB:                 \r\n"
				+ "                   YBB        :dBQBBBBP.                                        BQi                 \r\n"
				+ "                   JBB                                                          BB:                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   sBB                                                          BBi                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   JBB                                                          BBi                 \r\n"
				+ "                   LBQ                .                   .                     BBi                 \r\n"
				+ "                   sBB                .                       .                 BB:                 \r\n"
				+ "                   YBQ                .                                         BBi                 \r\n"
				+ "                   sQB                                                          BBi                 \r\n"
				+ "                   LBB                                                          BQi                 \r\n"
				+ "                   JBB                                          :1PZKY.         QBi                 \r\n"
				+ "                   LBB                                        dBBQBBBBBBL       BBi                 \r\n"
				+ "                   JBB                                       BBBBBBBBBBBBB      QBi                 \r\n"
				+ "                   YBB                                      BBBBBBBBBBBBBQS     BBi                 \r\n"
				+ "                   sBB                                      BBBBBBBBBBQBBBB     BBi                 \r\n"
				+ "                   YBB                                      BBBQBBBBBBBBBBQ     BBi                 \r\n"
				+ "                   sQB                                      rBBBBBBBBBBBBB      BBi                 \r\n"
				+ "                   YBB                                       :BBBBBBBBBBB       BBi                 \r\n"
				+ "                   JBB                                         iPBBBBB2.        BBi                 \r\n"
				+ "                   2BB                                                          BQr                 \r\n"
				+ "                   iBBM                                                        BQB.                 \r\n"
				+ "                    rBBBU                                                   .SBBB:                  \r\n"
				+ "                      XBBBBBQBBBBBQBBBBBBBBBBBBBQBBBBBBBBBBBQBQBBBBBBBBBBBQBBBB1                    \r\n"
				+ "                        :iriririririririririririririririririririririririririr. ");
	}

	public void diceResult3() {
		System.out.println("\r\n"
				+ "                      .gBBBBBBBBBBBBBBBQBBBBBBBBBQBBBBBBBBBBBBBBBQBBBBBBBBBBBBd                     \r\n"
				+ "                     gBBQXvLLYvYLYvYvYvsvsvYLYLYvYvYvsvYLYvYvYLsLYLYLYvYvYvLKBQBK                   \r\n"
				+ "                    BQB:                                                      rBBB                  \r\n"
				+ "                   2BB                                                         .BBr                 \r\n"
				+ "                   JBB          .iLvr.                                          BBi                 \r\n"
				+ "                   JBB        qBBBBBBBBK                                        BBi                 \r\n"
				+ "                   YBB      iBBQBBBQBBBBB.                                      BBi                 \r\n"
				+ "                   sBB      BBBBBBBBBBQBBB                                      BBi                 \r\n"
				+ "                   YBB     IBBBBBBBBBQBBBBL                                     BBi                 \r\n"
				+ "                   sBB     YQBBBBBQBBBQBBBi                                     BB:                 \r\n"
				+ "                   LBB      BBBBBBBBBBBBBB                                      BBi                 \r\n"
				+ "                   JBB       BBBBBBBBBBBM                                       BBi                 \r\n"
				+ "                   YBB        :dBBBQBBP.                                        BBi                 \r\n"
				+ "                   JQB                                                          BBi                 \r\n"
				+ "                   YBB                        .qBBBQBBq.                        BBi                 \r\n"
				+ "                   sBB                       QBBBBBBBBBBM                       BB:                 \r\n"
				+ "                   LBB                      BQBBBQBBBQBBBg                      BBi                 \r\n"
				+ "                   sQB           .         vBBBBBBBBBBBBgBi                     BBi                 \r\n"
				+ "                   LBB                .    5BdZgBUIPQBBZ1B5                     BBi                 \r\n"
				+ "                   JBB           .    .    .BQDgBXqBBBgJBB                      BBi                 \r\n"
				+ "                   LBB                .     rBBPBgXEBBqBB:                      BBi                 \r\n"
				+ "                   sQB                        qBBBBBBBBZ                        QB:                 \r\n"
				+ "                   YBQ                          .71sr.                          BBi                 \r\n"
				+ "                   sBB                                          :1PDKL.         BB:                 \r\n"
				+ "                   LBB                                        bBBBBBBQBBv       BBi                 \r\n"
				+ "                   sQB                                       BBBBBQBBBBBBB      BBi                 \r\n"
				+ "                   YBB                                      BBBBBQBBBBBQBBS     BBi                 \r\n"
				+ "                   sBB                                      QBBBBBBBBBBBBBB     BBi                 \r\n"
				+ "                   LBB                                      BBBBBBBBBBBBBBQ     BBi                 \r\n"
				+ "                   JBB                                      rBBBBBBBBBBBQB      BBi                 \r\n"
				+ "                   YBB                                       iBBBQBBBBBBB       BQi                 \r\n"
				+ "                   JBB                                         iPBQBBB2.        BB:                 \r\n"
				+ "                   UBB                                                          BBr                 \r\n"
				+ "                   iBBM                                                        BBB.                 \r\n"
				+ "                    rQBB1                                                   .SBQB.                  \r\n"
				+ "                      SBBBBBBBBBBBBBBBQBQBQBBBQBBBBBBBQBBBBBQBBBBBBBBBQBBBBBBBBu                    \r\n"
				+ "                        :iriririririririririririririririririririririririririi.");
	}

	public void diceResult4() {
		System.out.println("\r\n"
				+ "                      .gBBBBBBBQBBBBBBBBBBBBBBBBBQBBBQBBBBBQBBBBBBBBBBBBBBBBBBE                     \r\n"
				+ "                     gBBQXvLLYLYvLLYvYLYLYLYvYvYLYvYvYvYvYLsLsvsLsvYvsLYLsvYqBQBq                   \r\n"
				+ "                    BBB:                                                      rQBB                  \r\n"
				+ "                   2BB                                                         .QBr                 \r\n"
				+ "                   JBB          .iLvr.                           :vL7.          BBi                 \r\n"
				+ "                   JBB        PBBBBBBBBX                      7BQBBBQBBQ:       BBi                 \r\n"
				+ "                   LBB      iBBBBBBBBQBBB.                   BBBBBBQBBBQBK      BBi                 \r\n"
				+ "                   JBB      BBBBBBBBBBBBBB                  BBBBBBBBQBBBBBv     BB:                 \r\n"
				+ "                   YBB     IBBBBBQBBBBBBBBL                 BBBBBQBBBBBQBBB     BBi                 \r\n"
				+ "                   sQB     YBBBBBBBBBBQBBBi                 QBBBQBBBBBBBQBQ     QBi                 \r\n"
				+ "                   YBQ      BBBQBBBBBQBBBB                  IBBBBBBBBBBBBB.     BBi                 \r\n"
				+ "                   JBB       BBBBBQBBBBBM                    UBBBBBBBBBBQ:      BBi                 \r\n"
				+ "                   LBB        :bBBBQBBP.                       jBBBBBQQr        BQi                 \r\n"
				+ "                   JBB                                                          QBi                 \r\n"
				+ "                   LBB                                                          BBi                 \r\n"
				+ "                   JBB                                                          BBi                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   sBB                                                          BBi                 \r\n"
				+ "                   LBB                .                   .                     BBi                 \r\n"
				+ "                   JBB           .    .                       .                 BBi                 \r\n"
				+ "                   LBB                .                                         BBi                 \r\n"
				+ "                   sBB                                                          BB:                 \r\n"
				+ "                   YBB                                                          BBi                 \r\n"
				+ "                   sBB          r5dEIr                          :uqZKY.         BB:                 \r\n"
				+ "                   YBB       .BQBBBBBBBQ.                     bBBBBBBBBBL       BBi                 \r\n"
				+ "                   JBB      jBBBBBBBBBBBBv                   BQBBBQBBBBBBB      BB:                 \r\n"
				+ "                   YBB     .BBBBBBBBBQBBBQ.                 BBBBBBBQBBBBBB5     BQi                 \r\n"
				+ "                   sBB     qBBBBBBBBBBBBBBL                 BBBBBBBBBBBBBBB     BBi                 \r\n"
				+ "                   YBB     rBBBBBBBBBBBBBB:                 BQBBBBBBBBBBBBQ     BBi                 \r\n"
				+ "                   sQB      BBQBBBBBBBBBBR                  rBBBBBBBBBBBBB      BBi                 \r\n"
				+ "                   YBB       XBBBBBBBBBB2                    iBBBBBBBQBBB       BBi                 \r\n"
				+ "                   JQB         YMBBBQM7                        ibBBBBB2.        BBi                 \r\n"
				+ "                   UBB                                                          BBr                 \r\n"
				+ "                   iBBg                                                        BBB.                 \r\n"
				+ "                    rBBQ1                                                   .5BQB:                  \r\n"
				+ "                      SBBBBBBBQBQBBBBBBBQBQBQBBBBBBBBBBBBBBBQBBBBBBBBBBBBBBBQBBU                    \r\n"
				+ "                        :iriririririririririririririririririririririririririi.");
	}

	public void diceResult5() {
		System.out.println("\r\n"
				+ "                      .gBBBBBQBBBBBBBBBBBBBBBBBBBBBBBQBBBBBQBQBQBBBBBBBBBBBBBBd                     \r\n"
				+ "                     gQBBKvYvYLsvYvYvsvYLYvYvsvYvYvsLYLYLYLYLsvYLsvYvsvsvYvYKBBBq                   \r\n"
				+ "                    BBB:                                                      rBBB                  \r\n"
				+ "                   2BB                                                         .BBr                 \r\n"
				+ "                   sBB          .iLvi.                           :7v7.          BBi                 \r\n"
				+ "                   JBB        qBBBBBBBBK                      7BQBQBQBBB.       BB:                 \r\n"
				+ "                   YBQ      iQBBBQBQBBBQB.                   BBBBBBBBBBBBK      BBi                 \r\n"
				+ "                   JBB      BBBBBBQBQBBBBB                  BBQBBBQBBBBBBBv     BBi                 \r\n"
				+ "                   LBB     IBBBQBBBQBBBBBQL                 BBBBBBBBBBBBBBB     BBi                 \r\n"
				+ "                   JBB     YBBBBBBBBBBBBBBi                 BBBBBBQBQBQBBBB     BBi                 \r\n"
				+ "                   YBB      BBBQBBBBBBBBBQ                  5BBBBQBBBBBBBB.     BBi                 \r\n"
				+ "                   sBB       BBBQBQBBBBBM                    UBBQBBBBBBBB:      BBi                 \r\n"
				+ "                   LBB        :dBBBBBBP.                       uBBBBBBQr        BBi                 \r\n"
				+ "                   JBB                                                          BBi                 \r\n"
				+ "                   LBB                        .qBBBBBQq.                        BQi                 \r\n"
				+ "                   sBB                       QBBBBBBBBBBM                       BBi                 \r\n"
				+ "                   YBB                      BBBBBBBQBBBBBg                      BBi                 \r\n"
				+ "                   sBB                     7QBBBBBBBBBBBgB:                     BB:                 \r\n"
				+ "                   LBB                .    IBdDgBU5PQBBD1B5   .                 BBi                 \r\n"
				+ "                   JBB           .         .QQgMBXPBBBgjBB    .                 QB:                 \r\n"
				+ "                   YBQ                .     rBBbBgXZBQPBB:                      BBi                 \r\n"
				+ "                   JBB                        qBBBBBBBBZ                        QBi                 \r\n"
				+ "                   YBB                          .rus7.                          BBi                 \r\n"
				+ "                   JBB          rSddIr                          :1PEXL.         BBi                 \r\n"
				+ "                   YBB       .BBBBBBBBBQ.                     bBBBBBBBBQL       BBi                 \r\n"
				+ "                   sBB      jBBBQBBBBBBBBv                   BBBQBBBBBBBBB      BBi                 \r\n"
				+ "                   LBB     .BBBBBQBBBBBBBB.                 BQBBBBBBBBBBBBS     BBi                 \r\n"
				+ "                   sBB     qBBBBBBBBQBBBBBL                 BBBBBBBBBBBBQBB     BBi                 \r\n"
				+ "                   YBB     rBBBBBQBBBBBBBB:                 BBBBBQBBBBBBBQQ     BBi                 \r\n"
				+ "                   JQB      QBBBBBBBBBQBBQ                  rBBBQBQBBBBBBB      BB:                 \r\n"
				+ "                   LBB       KBBBBBQBBBB2                    :BBBQBQBBBBB       BQi                 \r\n"
				+ "                   sBB         YMBBBBM7                        iPBBBQBU.        BBi                 \r\n"
				+ "                   UBB                                                          BBr                 \r\n"
				+ "                   iBBg                                                        BBB.                 \r\n"
				+ "                    rBBQ1                                                   .5BBB.                  \r\n"
				+ "                      XBBBBBBBBBBBBBQBBBBBBBBBQBBBBBBBQBBBBBQBBBBBQBBBBBBBBBBBBU                    \r\n"
				+ "                        :iriririririririririririririririririririririririririi. ");
	}

	public void diceResult6() {
		System.out.println("\r\n"
				+ "                      .gBBBBBBBQBBBBBBBBBBBBBQBBBQBQBQBBBBBBBBBBBBBBBBBBBBBBBBE                     \r\n"
				+ "                     gQBBXvLvsLsLYvYvsvsvYvYLYvsvYvsvsvYvsvYvYLYvYLYvLvYvYvLqBBBq                   \r\n"
				+ "                    BBB:                                                      rBBB                  \r\n"
				+ "                   2QB                                                         .BBr                 \r\n"
				+ "                   YBB          .iL7i.                           :vL7.          BBi                 \r\n"
				+ "                   sBB        PBQBBBBBBX                      7BBBBBQBBB:       BBi                 \r\n"
				+ "                   YBB      iBBQBBBBBQBBB.                   BBBBBBBBQBBBK      BQi                 \r\n"
				+ "                   JBB      BBBBBBBBQBQBBB                  BBBBQBBBBBQBBBv     BBi                 \r\n"
				+ "                   LBB     2BBBBBBBBBQBBBBL                 BBBBBQBBBBBBBQB     BBi                 \r\n"
				+ "                   sBB     YBBBBBBQBBBBBBBi                 BBBBBBQBBBBBBBQ     BB:                 \r\n"
				+ "                   YBB      BQBBBBBBBBBBBB                  IBBBBBBBBBBBBB.     BBi                 \r\n"
				+ "                   sBB       BQBBBBBBBBBM                    1BBBBBBBBBBQ:      BBi                 \r\n"
				+ "                   YBB        .KBBBBBBX.                       YBBBBBBgi        BBi                 \r\n"
				+ "                   JBB                                                          BB:                 \r\n"
				+ "                   LBB        .uQBBBBMj                        rgBBBBQP:        BBi                 \r\n"
				+ "                   JBB       gBBBBQBBBBBd                    vBBBBBBBBBBQ.      QB:                 \r\n"
				+ "                   LBB      BBBBBBBQBQBBBB                  UBBBg121XBBBBB.     BBi                 \r\n"
				+ "                   JQB     vBBBBPB2DR1BBBBi                 BBBKsRBBBBBBBBQ     BB:                 \r\n"
				+ "                   YBB     5BBBBbBKDBUBPBBv                 BBBYdBBBBBBBBBB     BQi                 \r\n"
				+ "                   sBB     .QBBBsBSgQIBUBB                  bQBdJMBBBBBBBBs     BB:                 \r\n"
				+ "                   YBQ      7BBBSBPRBKBBBi                   DBBQI52qQBBBE      BBi                 \r\n"
				+ "                   JBB       .gBBBBBBBBg                      uBQBQBQBBBi       QB:                 \r\n"
				+ "                   LBQ           .i:.                            .:i:           BBi                 \r\n"
				+ "                   sBB          .i77:.                           :rvi.          BB:                 \r\n"
				+ "                   YBB       .BBBBBBBQBQ.                     PBBBBBBBBBL       BBi                 \r\n"
				+ "                   sBB      uBQBBBBBQBBBB7                   BBBQBQBQBBBBB      BB:                 \r\n"
				+ "                   YBQ     .BBBBBBBBBBBBBB.                 BBBBBQBBBQBBBBS     BBi                 \r\n"
				+ "                   sBB     KBBBBBBBBBBBBBBL                 QBBBBBBBBBBBBBB     BB:                 \r\n"
				+ "                   YBB     rBBBQBBBBBBBBBQ:                 BBBQBQBBBBBBBBQ     BQi                 \r\n"
				+ "                   JQB      BBBBBBBBBBBBBR                  rBQBBBQBBBBBBB      BBi                 \r\n"
				+ "                   LBQ       KBBBBBBBQBB2                    :BQBBBBBBBBB       BQi                 \r\n"
				+ "                   JQB         YgBBBBM7                        iPBBBBB2.        BBi                 \r\n"
				+ "                   2BB                                                          BBr                 \r\n"
				+ "                   iBBM                                                        BQB.                 \r\n"
				+ "                    rBBBU                                                   .SBBB.                  \r\n"
				+ "                      XBQBBBBBBBBBQBBBBBBBBBBBBBBBQBBBBBBBBBBBBBBBBBBBBBBBQBBBB1                    \r\n"
				+ "                        :iriririririririririririririririririririririririririi.");
	}

	public void diceMotion1() {
		System.out.println(
				". ... . . ....... ....... . ... ....... . ..... ... ..... ... ......... . . ... ... ... ... ... ... \r\n"
						+ "                                                                                                    \r\n"
						+ ". . .       . . .   .   .     . .       ..            . . . . .       .   .   . . ... . . . .   . . \r\n"
						+ ". ..     . . .  ..   . . . .          ..   .:::i::.      . . . .     . .   . .    .i:.   .       .  \r\n"
						+ ". . .   . .   .       . .       ..i:irLvvvsssLYLsYsvr.    .       . . . .   .   .   .   . . .   . . \r\n"
						+ "   . .   . . . .     .       .iLLJY77L77r7r7r7rrr7r7vJv:         . . . .     . .     . . . . . . .. \r\n"
						+ ". . .     . . . . . . .    :LYY77rrr7rrrrrrrrrrrrr7rrrvs7   . . . . .   . .  .. . . . . . . . . . . \r\n"
						+ ".  .     .       .   .   :Ls77rrrrrrrrrrrrrrrrrrrrrrrrr7vj.    .   . . . ..... .   .   .   .   . .. \r\n"
						+ ". . ...   . . .         7Lvvv7rrrrrrrrrrrrrrrrrrr77vrrrrr7j:  .   . . . ... .     . . .   . . .   . \r\n"
						+ ".   .i:.   . . . .    .Jv7rs7LrrrrrrrrrrrrrrrrrrrY7Lrrrrrr7u.    . . . ...   . . .   . . . .   . .. \r\n"
						+ ". .   . .   . . .    :j77rrrrrrrrrrr7rrrrrrr7r7rrrrrrrrrrr77u.  . . . .   . . . . . .   . . . . . . \r\n"
						+ "   .     .   . .    :u7rrrrrrrrrirrrrrrrr7r7rrrrrrrrrrrrrrr77Y   . . .   .   . .   . . . . .   . .  \r\n"
						+ ". .     . . . .    :u77rrrrrriirUirrrrrrrrrrrrrrrirr7r7rrr7r7Yr   . .     . . . .   . . . . . .   . \r\n"
						+ ". ..   . . . . .  .j77rrrrrriiLQJrrrrrrrrrrrrrrrirr77Lj7rrrrr7s.   .     . . .   .       .       .. \r\n"
						+ ". . . .   . . .  .j77rrrrrriiXgrirrr7rrr7rrirJvLujUUi..7vrrr7rvv    .     .   . . .:i.        . . . \r\n"
						+ ".  .   . .   .   vv7r7rrrrrvZq:rrrrrrrrrrrirYPEjL1uUIYrsUvirrrrj:  .   . . .   .  .::.   . .   . .  \r\n"
						+ ". . . . .   .   rL7r7rrr777:Jirrrrrrrrrrrrr7usId5vuv12Iu1jsirrrvL         .   . .     . .   .     . \r\n"
						+ "   . . .  ..   rY7rrrrr77L  :Lrrr7rrrrrrrrrUu2JjPPY. .vuj2IKvrr7Y:   .           .   . . .     . .  \r\n"
						+ ". .   . ...   7L7rrrrr77j.  .Y7irr7r7rrrrrUuU:ijsIEKX5dPZPPPLrrrvr  .                     . .   . . \r\n"
						+ "   . .....   vv7rrr7rrvj.    7irrrrrrrrrrv121  7j7PQjii5i .uirrrrJ        .72ji.         . .   . .. \r\n"
						+ ". . . . .   vL7rrr7r7sv   ...rvrrrrrrr7rriv1IsrJJ5Ej  vS..YrrrrrrL:   .72EEKXSKXXYi.    . . . . . . \r\n"
						+ "  .. . .   iu7rrr7rssi   ... 777rrrrrrrrrrrrJU11LQ5vi5Sr:KJ7rrrrrrr.7Sqdr...r1sj2bMBQv   . . . . .. \r\n"
						+ ". . . . .  :2Lv7YYYi.   ..   rvrrr7rrrrrrrrrrL2LDP. :S: :1rrrrr7JJ225UUJsvJsu1SKbPqY2E.   . . . . . \r\n"
						+ ".  . .   .  .r77i:     .     rv7rrrrrrrrrrrrirrSgu:ru1r7L7rrrriIbEKS1uLYYUKdbPI1s7.  Sv  . .     .  \r\n"
						+ ". . . . .           .   .    iYrrr7rrrrrrrrrrirrrr777r7r7rrvL77rvvI5bdPXqPdIuJjJ5.  .Id   . .   . . \r\n"
						+ "  ..            ..   . . .   rv7rrrrrrirrrrrrrrrrrrrrrrrr7r..r7i7sJu7.sQIs:. r12I1r725Kr   . .   .  \r\n"
						+ ". .     . .    .ii.   . . .  iYr7r7rrrrdrrrr7r7rr77rrrrr7rv.   :1I2U2  SM:   7Sv::UI52KP    . . . . \r\n"
						+ ". .. .   .   .  ..     .     :Y7r7rrrriBirrrr7rrri7vrrrrrri77:   SSi.j.7Rv.:vK7   rSJriPr  . . . .. \r\n"
						+ ". .     . . .       . . . .  .u7rirrrriZUirrrrrrv. vLrrr7irrLLv. :Pj .SYbbu2SI7..iSv. .7D   .   . . \r\n"
						+ ". .. .   . .   . .   . . .    7L:::7rri7Qiirrrr777  7Jr7rrr7r7vsrir.7i1uuMsIur:Y5XIr .rZZ:   .   .. \r\n"
						+ ". .   . . . . . . . . . . .   .vrr7rrrr:Xbiirrrr7vi  ijv7r7r7rrr77u..5IuJqv7. ..q5qbXsv.    .     . \r\n"
						+ ". .. . . .   .     .   . . . . .sLrrrrrr:ESirrrrr7L:   rvsLs77r7r7vUiKXSvvj7 ..UbXv:.      . ..:.   \r\n"
						+ ". . ... . . .     . .   . ...   .YLrrrrrr:Z5irrrrr7vv:    :ivYY77r77Jr:iv5BEK127.         .  .i:. . \r\n"
						+ ".  .     . . . . . . . . . . .   .vYr7rrri:BYrrrrrr77YYr.    .:7Yv777.   .:vi.         . .     . .  \r\n"
						+ ". .     . .   . .   . . .   . .    7sr7rrriJQ7v77r7r7r77j7.     :77r:             .   . . . .   . . \r\n"
						+ ".  . . . . . .     . . . .   .      ij77r7rL::rvLJLv77r77ju.                   . .     . . . . . .  \r\n"
						+ ". . . . . . . .             . . .    .vLLLu7     .:rvYJYsuj   .             . . .     .   .   .   . \r\n"
						+ "  .. .       . .::   .   . .     .    .rrr:          .:iii   .   . .   .   . . . . .   .   .   . .. \r\n"
						+ ". .   . . . .  .::. . . . .           ..                      . . . .   .   . .     . . . . . . . . \r\n"
						+ ".  . . .     .     .         . . . .       . . . .         .   . .   . . . .   . . . . . . .   . .  \r\n"
						+ "                                                                                                    \r\n");
	}

	public void diceMotion2() {
		System.out.println(
				". ..... . . . ....... . . ....... ......... ... . . . ....... . ....... ... ... ..... ... ..... ... \r\n"
						+ ".  . .   . .   .          .iL25X5S5XS2Yr.                . . . . . . . . .   . .       . . . . . .  \r\n"
						+ ". . . .   .   . .   .:7vLsK521uJ1jujUU5JJj2r:.              ...   . . . . . . .   .:i.  .   . . . . \r\n"
						+ ".  . . . .   .    .uXS2I1UjjYJYJYJsjv7iru11I5KIJr:.          .       . .     .    .:.. . . .   . .. \r\n"
						+ ". . . . . . .    .P2UJjYJYJYsLJYsLsir7usjYJYjJ11IIXIu7i.            .   .   . .       . . . . .   . \r\n"
						+ "  .. . .   . .   12uYJYJLsLsYJLJLsYssJsJYJYsLJsJsjJ11I2S5IYr:..      . . .   ... .     . .   .   .. \r\n"
						+ ". . .   . .     .X1ssLsLJYsYsvsLJYsYJssYsYsYJYsLjsJsjJ1u11I2XSKSKIi .       . . .   . .   . . . . . \r\n"
						+ ".  . .   .      .KjJYsLsLJYJsJLsYsLJLJLsLsLsvsvsu5I52S25221215IKPd:  .   ....    .     . .   .   .. \r\n"
						+ ". . .:i.  . .   .51ssYJYsLsus1sYsYv7LvLvL7v7LvU2i:ir::irvY2252Jr:       ...     . .   .   .   ... . \r\n"
						+ "    .:.. . . .   51sYJYsLJLUYJLYYPK522122S5KXqqX.                    . . .   . .       .   . . . .. \r\n"
						+ ". .       .   .  7IssLsYsLJvYvsLLvj1525I5UUsJvLJU                   . . . . .   .   . .     . .   . \r\n"
						+ ".  . .   . . .   :5uYsLsYJYsLsLLvYvv7vvvvLvYLsLu2r     . .       ... . .   . .     . . . .   . . .  \r\n"
						+ ". .   . .   . .   5UjYsLJLsLsvvJ1sLLYYsLYLsYJLsY1S.       . . . . . . . .   . . .     . .         . \r\n"
						+ ".  . . . . . . .  :KjJYJYJLsvvqP1dIvYsLYYsYJYsYss21    .   . . .     .   .   . .   ... .     . . .  \r\n"
						+ ". .     . . . . .  YSJJYsYJL7PK77sg7sLY7YYJYsLsYJJ57    . . ...   . . . .   . . . .ii.    .   . . . \r\n"
						+ "  .. . . .   . .    JSjjYJYY7gvLvJZvvsLsYsLsLsYsLJJSi    . .   .   . . .     .   . .     .   . . .. \r\n"
						+ ". . .     ...   .    vXujsYvjgLLLLD7YLL7v7vvLLJssYJuKi    .   .   .   .       . .       . .     . . \r\n"
						+ ". .. . . ... .   .    :K2uLJbIvsvYZ77L75SK1u2UYUsJYJjXr    . . . . . .       .   . . .   . . . . .  \r\n"
						+ ". . . ..... .           sS2JJ77iL7QS5KQ2svbZU1 :SJsvjjX7    . . .   . .     . . . .   . . . .   ... \r\n"
						+ ".  . ...   . . . . .     :UXv771s5g7vgJ777Iqrjr .PU2YJjSv    . .     . ..:.    . . . .   .     . .. \r\n"
						+ ". . ... .     . .   . .   .:7KqXI1PsZjvLsvgYYs2r .55uYjJXL    .   . .  .i:. . . . .   . . . ..... . \r\n"
						+ ". ..   .   . . .   . . ...   ...  :q1jsusXQLYJJIv  u2uYJjX7    . . . .     . .   .     . ... .   .. \r\n"
						+ ". . . . . . . . . . .   .          .1SXSK:iIUjuJ2S: s21sJJXi      . . .   . . . .   .   ... .   . . \r\n"
						+ ".  .   . . . .     . .   . .         .i:   :5X2U1Sd  LI1sjuq.    .   . . . . . . . .   . . . . . .  \r\n"
						+ ". . .   .   . .     .   .   .   .            :Y2KK1   J51JuIJ  ...    .   . . . . .   .   . .   . . \r\n"
						+ ".  . . .   .   .:i.  .   .   . . .     .               LS52X5      .   .     . . . ..  . .   .   .  \r\n"
						+ ". .   .        .:.. .   . . . .   . .  .. .             :YIY. i:irvii       . .   . . . . . . . . . \r\n"
						+ "   . . . .   .     . . .   . . . ...   . . .   . .           .5bj7r7vY.        . . . . . . . . . .. \r\n"
						+ ". . . . . . . . .     . .   .   . . . . . . . .   .   .     .J7r1Yirj2Er      ... . .   . . . . . . \r\n"
						+ "  .. . . .   . . . . . . . . . . . . .   . . . . . .   . .  rX:.iSjiYi7.         .   . .   .        \r\n"
						+ ". ...   . .   . . . .   . . ....      . . . . . .   . . .    :u7s5::rr:    .:                 . . . \r\n"
						+ "  .. ... . . .     .   .   . .     . . .         ... . . .    .sgr:L.:  .::7YYrri.       . . .ii. . \r\n"
						+ ". . . . . . . .       . . . . .     . .   .     . . . . . .     :   ..:i77iivsISSu    . . .   ... . \r\n"
						+ ".  . . . .   . . . . . . .   . . . . .   . . . .   . . .   .        :U22JsuIjYv: ri    .   .     .. \r\n"
						+ ". . .   .   . .   . .....   .   . . . .     .   . . . . . .       .  Ysriqr..77:iYu     . . .   . . \r\n"
						+ ". ..       . .     . . .   .   . . .       .             . . . . .   rs:.ur.:r..Y7vi   . . . . . .  \r\n"
						+ ". . . . .   .  ....     . . . . .     ... . . . . .     . . . . . .  .v.rv57sr:rr.i1.   . .   .   . \r\n"
						+ "   . . . . .   .ii.    . .   . . . .  :i:  .   . .   . . .   ..       irJ75s..Y5vi:.   . . .     .. \r\n"
						+ ". .   .   . .   .     . . .     . .   ..  .       . . . .     . . .   ..ir2qiii.      .   . . . . . \r\n"
						+ "                                                                                                    \r\n");
	}

	public int getDiceNum() {
		return diceNum;
	}

	public void setDiceNum(int diceNum) {
		this.diceNum = diceNum;
	}

}
