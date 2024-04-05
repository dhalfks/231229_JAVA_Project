package teamProject;

public class BotSelectAction {
	
	// 상대방이 봇일 경우 자동으로 눌러주는 기능
		public int selectAction() {
			int random = (int) (Math.random() * 10) + 1;
			int seletAction = 0;
			switch (random) {

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				seletAction = 1;
				break;
			case 9:
			case 10:
				seletAction = 2;
				break;
			}
			return seletAction;
		}

}
