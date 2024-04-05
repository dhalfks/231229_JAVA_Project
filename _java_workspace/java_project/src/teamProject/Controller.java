package teamProject;

import java.util.Scanner;

public class Controller extends GameManager {

	private Dice dice = new Dice();
	private MapInfo locationIndicatorMap = new MapInfo();
	private EmptyLand emptyLand = new EmptyLand();
	private BuildingConstruction buildingConstruction = new BuildingConstruction();
	private Toll toll = new Toll();
	private Event event = new Event();

	public void control(Scanner scan) throws InterruptedException {
		

		for (int i = 0; i < getPlayers().size(); i++) {
			if(getPlayers().get(i).getDesertIsland()>0) {   //무인도일 경우 주사위를 못굴림
				event.desertIsland(getPlayers().get(i));
				Thread.sleep(2000);
			}else {
						
			if (getPlayers().get(i).getPlayerName().equals("Bot")) {
				yourTurn();
				Thread.sleep(2000);
			} else {
				myTurn();
				Thread.sleep(2000);
				System.out.println("주사위를 던지시려면 아무키나 입력>");
				scan.nextLine();
			}
			dice.rollTheDice(getPlayers().get(i));// 주사위를 굴린다.
			dice.playerSet(getPlayers().get(i), getMap().get(getPlayers().get(i).getPlayerLocation())); //주사위를 굴린값 맵정보 셋팅
		}	
						
			Map mapInfo = getMap().get(getPlayers().get(i).getPlayerLocation()); // 현재 맵 정보 추출
			
			locationIndicatorMap.mapPrint(getPlayers().get(0),getPlayers().get(1),getPlayers().get(i)); //맵정보 표시
			
			emptyLand.emptyLandPurchaseCoice(scan, getPlayers().get(i), mapInfo); //빈땅일 경우
			buildingConstruction.buildingConstructionCoice(scan, getPlayers().get(i), mapInfo); //내땅일경우 건물 건설
			toll.tollPayment(scan, getPlayers().get(i),i == 0 ? getPlayers().get(1) : getPlayers().get(0), mapInfo); //상대방 땅일경우 통행료 지불
			toll.tollPaymentAndTollPassTiket(scan, getPlayers().get(i),i == 0 ? getPlayers().get(1) : getPlayers().get(0), mapInfo); //통행료 패스를 가지고 있을 경우		
			event.donation(scan, getPlayers().get(i));
			event.goldKey(scan, getPlayers().get(i));
			
			if(!getPlayers().get(i).getPlayerName().equals("Bot")) {
				locationIndicatorMap.mapPrint(getPlayers().get(0),getPlayers().get(1),getPlayers().get(i)); //맵정보 표시
				System.out.println(getPlayers().get(i).getPlayerName()+"님의 턴이 끝났습니다 . 다음턴으로 넘기시려면 아무키나 눌러주세요>");
				scan.nextLine();
			}else{
				System.out.println(getPlayers().get(i).getPlayerName()+"님의 턴이 끝났습니다 .");				
			}
			if(getPlayers().get(i).getMoney()<0) { //현재 플레이어가 0원이 되면 for문 종료
				return;
		}
			
		}
	}
	
	public void myTurn() {
		System.out.println("                                                                                                                                         \r\n"
				+ "                                                                         QBB                                                                          \r\n"
				+ "                                                                         XBD                                                                          \r\n"
				+ "                 BB7 ZBBBBBP   qBBQBQBi    BBB         UBB            dBBBBBBBBB   PBB        XBQ     MBj SBBBQ  vBB iBBBBBBP                         \r\n"
				+ "                 BBBBD:  :BQB:BB7   2BBu   .BB7        BBr            :r:RBB:i7r   RBB        gQB     BBgBBjir7  jBBRBU.  iBBB.                       \r\n"
				+ "                 BBB.      BBBR      7BB    uBB       BBZ                XBD       dBB        qBB     QBBd       vQBM       BBB                       \r\n"
				+ "                 BBq       rBB        BQ.    QBP     iBB                 PBR       PBQ        qBB     QQB        7BB        7BB                       \r\n"
				+ "                 BB1       iBB        BB.    .BB     BB:                 EBB       dBB        XBB     QBK        vBB        rBB                       \r\n"
				+ "                 BB2       rBB        BB.     KBB   qBg                  dBQ       bBQ        SBB     QQb        7BB        7BB                       \r\n"
				+ "                 BB5       rQB        QB.      BB:  BB                   gBQ       dBB        EBQ     QBb        vBB        7BB                       \r\n"
				+ "                 BB2       rBQ        BB.      .BB QB:                   gBB       rBB       iBQB     BBZ        7BQ        vBB                       \r\n"
				+ "                 BBd       YQB        QB:       ZBgBM                    rBBL  :    QBBU.  rBBBBB     BBR        1QB        jBB                       \r\n"
				+ "                 BB2       rBB        BB:        BBB                      7BBBBB     rBBBBBBd vBR     RBP        vBB        vBB                       \r\n"
				+ "                                                 BQi                                                                                                  \r\n"
				+ "                                                RBR                                                                                                   \r\n"
				+ "                                               IQB                                                                                                    \r\n"
				+ "                                           2BBBBQ                                                                                                     \r\n"
				+ "                                           7QQs                                                                                                       ");
	}
	
	public void yourTurn() {
		System.out.println("\r\n"
				+ "         .QEgMQQBQZv:                                                                                                                                 \r\n"
				+ "         iBBBBBBBBBBBB1                                :                         .                                                                    \r\n"
				+ "         .BB7      .QBBQ                             XBB                      .BB1                                                                    \r\n"
				+ "         .BB7        BBB.                            dBB                      .BBr                                                                    \r\n"
				+ "         .BBY        DBB            isusr.        .  PBB. ...               . :BBv  ..    .             .            :YL.   .     :vuY:               \r\n"
				+ "         .BB7       .BBq        .RQBBBBBQBBB.     BBQBBBBBBBB              gBBBBQBBBBB.   BBB         gBQ      BBB 1BBQBB   BBI MBQBBBBBB.            \r\n"
				+ "         .BBv     :PBBr        dBBQ.     .QBBd    .  qBQ                    . :BB7   .    BBQ         PBB      BBBZB2  .:   BBQBB:    :BBB.           \r\n"
				+ "         .BBQBBBQBQBE         RBQ:         rBBq      SBB                       BQi        BBg         XBB      QQBB         BBQ7        QBB           \r\n"
				+ "         .BBgv1UIUPBBBB1     :BBu           gBB      qBB                      .BBr        BQM         KBB      QBB.         BBQ         RQB           \r\n"
				+ "         .BBi        vBBB    bBB            :BQ7     bQB                      .BB7        QBg         XBB      BBB          BB2         ZBQ           \r\n"
				+ "         .BBv         YBBv   gBB            .BBv     PBB                      .BB7        BBM         SQB      QBB          BBK         RBB           \r\n"
				+ "         .BBv         .BQP   2BB.           vBB:     dBB                      .BB7        BBZ         5BB      BBB          BBS         gBQ           \r\n"
				+ "         .BBv         BBB.    BBB           BBB      EBB                      :QBi        BBB         BBB      QBB          BBq         MBB           \r\n"
				+ "         :BBr       7BQBY     :BBB         BBB       XBB.                      BBK        YBB5       BBBB      BBB          BBK         gBB           \r\n"
				+ "         :BBBQBBBBBBBBQ.        BBBBZvvvZBBBq         BBB2vuK                  gBBQ7Yd.    bBQBPvvXBB5EBB      BBB          BBQ         BBB           \r\n"
				+ "         .gZEMMQRQZJ:            .sBBBBBBQr            IQBBBR                   rBBBBB.     .SQBBBBD. igD      Sgd          gQv         1RZ   ");
	}

}
