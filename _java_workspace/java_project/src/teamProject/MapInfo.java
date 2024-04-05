package teamProject;

public class MapInfo {

	public void mapPrint(Player player1, Player player2, Player currentPlayer) {
		String a0 = "  ";
		String a1 = "  ";
		String a2 = "  ";
		String a3 = "  ";
		String a4 = "  ";
		String a5 = "  ";
		String a6 = "  ";
		String a7 = "  ";
		String a8 = "  ";
		String a9 = "  ";
		String a10 = "  ";
		String a11 = "  ";
		String a12 = "  ";
		String a13 = "  ";
		String a14 = "  ";
		String a15 = "  ";
		String a16 = "  ";
		String a17 = "  ";
		String a18 = "  ";
		String a19 = "  ";

		String b0 = " ";
		String b1 = " ";
		String b2 = " ";
		String b3 = " ";
		String b4 = " ";
		String b5 = " ";
		String b6 = " ";
		String b7 = " ";
		String b8 = " ";
		String b9 = " ";
		String b10 = " ";
		String b11 = " ";
		String b12 = " ";
		String b13 = " ";
		String b14 = " ";
		String b15 = " ";
		String b16 = " ";
		String b17 = " ";
		String b18 = " ";
		String b19 = " ";

		int player1Location1 = player1.getPlayerLocation();
		int player1Location2= player2.getPlayerLocation();

		switch (player1Location1) {
		case 0:
			a0 = "♠ ";
			break;
		case 1:
			a1 = "♠ ";
			break;
		case 2:
			a2 = "♠ ";
			break;
		case 3:
			a3 = "♠ ";
			break;
		case 4:
			a4 = "♠ ";
			break;
		case 5:
			a5 = "♠ ";
			break;
		case 6:
			a6 = "♠ ";
			break;
		case 7:
			a7 = "♠ ";
			break;
		case 8:
			a8 = "♠ ";
			break;
		case 9:
			a9 = "♠ ";
			break;
		case 10:
			a10 = "♠ ";
			break;
		case 11:
			a11 = "♠ ";
			break;
		case 12:
			a12 = "♠ ";
			break;
		case 13:
			a13 = "♠ ";
			break;
		case 14:
			a14 = "♠ ";
			break;
		case 15:
			a15 = "♠ ";
			break;
		case 16:
			a16 = "♠ ";
			break;
		case 17:
			a17 = "♠ ";
			break;
		case 18:
			a18 = "♠ ";
			break;
		case 19:
			a19 = "♠ ";
			break;
		}

		switch (player1Location2) {
		case 0:
			b0 = "♣";
			break;
		case 1:
			b1 = "♣";
			break;
		case 2:
			b2 = "♣";
			break;
		case 3:
			b3 = "♣";
			break;
		case 4:
			b4 = "♣";
			break;
		case 5:
			b5 = "♣";
			break;
		case 6:
			b6 = "♣";
			break;
		case 7:
			b7 = "♣";
			break;
		case 8:
			b8 = "♣";
			break;
		case 9:
			b9 = "♣";
			break;
		case 10:
			b10 = "♣";
			break;
		case 11:
			b11 = "♣";
			break;
		case 12:
			b12 = "♣";
			break;
		case 13:
			b13 = "♣";
			break;
		case 14:
			b14 = "♣";
			break;
		case 15:
			b15 = "♣";
			break;
		case 16:
			b16 = "♣";
			break;
		case 17:
			b17 = "♣";
			break;
		case 18:
			b18 = "♣";
			break;
		case 19:
			b19 = "♣";
			break;
		}

		System.out.printf(
		          " ┌────────────────┬┬────────────────┬┬────────────────┬┬────────────────┬┬─────────────────┬┬────────────────┬┬────────────────┐  \r\n"
				+ " │                ││                ││                ││                ││                 ││                ││                │  \r\n"
				+ " │     muindo     ││      Dogdo     ││    Donation    ││     Inchen     ││     GoldKey     ││      Jeju      ││     Busan      │  \r\n"
				+ " │       %s%s      ││       %s%s      ││      %s%s       ││      %s%s       ││       %s%s       ││      %s%s       ││       %s%s      │  \r\n"
				+ " │                ││                ││                ││                ││                 ││                ││                │  \r\n"
				+ " │                ││                ││                ││                ││                 ││                ││                │  \r\n"
				+ " ├────────────────┼┼────────────────┴┴────────────────┴┴────────────────┴┴─────────────────┴┴────────────────┼┼────────────────┤  \r\n"
				+ " │                ││                                                                                         ││                │  \r\n"
				+ " │    Ulleungdo   ││                                                                                         ││     Sejong     │  \r\n"
				+ " │      %s%s       ││                                                                                         ││      %s%s       │  \r\n"
				+ " │                ││     ♠ player1 : %-7s                                                                 ││                │  \r\n"
				+ " │                ││                                                                                         ││                │  \r\n"
				+ " ├────────────────┤│       Money : %,9d₩                                                                │├────────────────┤  \r\n"
				+ " │                ││                                                                <현재위치>                 ││                │  \r\n"
				+ " │     GoldKey    ││                                                                                         ││    GoldKey     │  \r\n"
				+ " │      %s%s       ││                                                                %-8s                 ││       %s%s      │  \r\n"
				+ " │                ││     ♣ player2 : %-7s                                                                 ││                │  \r\n"
				+ " │                ││                                                                                         ││                │  \r\n"
				+ " ├────────────────┤│       Money : %,9d₩                                                                │├────────────────┤  \r\n"
				+ " │                ││                                                                                         ││                │  \r\n"
				+ " │      Daegu     ││                                                                                         ││    Donation    │  \r\n"
				+ " │       %s%s      ││                                                                                         ││      %s%s       │  \r\n"
				+ " │                ││                                                                                         ││                │  \r\n"
				+ " │                ││                                                                                         ││                │  \r\n"
				+ " ├────────────────┼┼────────────────┬┬────────────────┬┬────────────────┬┬─────────────────┬┬────────────────┼┼────────────────┤  \r\n"
				+ " │                ││                ││                ││                ││                 ││                ││                │  \r\n"
				+ " │    Donation    ││     Daejeon    ││    GwangJo     ││     GoldKey    ││      Ulsan      ││     Seoul      ││     Start      │  \r\n"
				+ " │      %s%s       ││       %s%s      ││      %s%s       ││      %s%s       ││       %s%s       ││      %s%s       ││       %s%s      │  \r\n"
				+ " │                ││                ││                ││                ││                 ││                ││                │  \r\n"
				+ " │                ││                ││                ││                ││                 ││                ││                │  \r\n"
				+ " └────────────────┴┴────────────────┴┴────────────────┴┴────────────────┴┴─────────────────┴┴────────────────┴┴────────────────┘  \r\n"
				,a10,b10,a9,b9,a8,b8,a7,b7,a6,b6,a5,b5,a4,b4,a11,b11,a3,b3,player1.getPlayerName(),player1.getMoney(),a12,b12,currentPlayer.getPlayerLocationCityName(),a2,b2,player2.getPlayerName(),player2.getMoney(),a13,b13,a1,b1,a14,b14,a15,b15,a16,b16,a17,b17,a18,b18,a19,b19,a0,b0);
	}

}
