package teamProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		Controller user = new Controller();
		
		System.out.println("--<부루마블 게임장에 오신것을 환영합니다.>--");
		System.out.println(" ____       ___                                                     __         ___              \r\n"
				+ "/\\  _`\\    /\\_ \\                       /'\\_/`\\                     /\\ \\       /\\_ \\             \r\n"
				+ "\\ \\ \\L\\ \\  \\//\\ \\     __  __     __   /\\      \\      __      _ __  \\ \\ \\____  \\//\\ \\       __   \r\n"
				+ " \\ \\  _ <'   \\ \\ \\   /\\ \\/\\ \\  /'__`\\ \\ \\ \\__\\ \\   /'__`\\   /\\`'__\\ \\ \\ '__`\\   \\ \\ \\    /'__`\\ \r\n"
				+ "  \\ \\ \\L\\ \\   \\_\\ \\_ \\ \\ \\_\\ \\/\\  __/  \\ \\ \\_/\\ \\ /\\ \\L\\.\\_ \\ \\ \\/   \\ \\ \\L\\ \\   \\_\\ \\_ /\\  __/ \r\n"
				+ "   \\ \\____/   /\\____\\ \\ \\____/\\ \\____\\  \\ \\_\\\\ \\_\\\\ \\__/.\\_\\ \\ \\_\\    \\ \\_,__/   /\\____\\\\ \\____\\\r\n"
				+ "    \\/___/    \\/____/  \\/___/  \\/____/   \\/_/ \\/_/ \\/__/\\/_/  \\/_/     \\/___/    \\/____/ \\/____/\r\n"
				+ "                                                                                                \r\n"
				+ "                                                                                                ");
		System.out.println("<시작하기전 플레이어를 생성하여 주세요>.");
		user.playerCreating(scan);
		user.addCities();
		System.out.println("시작하려면 아무키나 입력 입력>");
		scan.nextLine();
		System.out.println(user.getPlayers().get(0).getPlayerName()+"님이 선공 입니다.");
			while (!user.gameOver()) {
			user.control(scan);
			}
		user.gameOverInfo();
		
		scan.close();
	}
}
