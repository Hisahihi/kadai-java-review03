package baseball;
public class Review03 {

	public static void main(String[] args) {
		// チームデータ
		BaseBallTeam swallows = new BaseBallTeam();
		swallows.setName ("東京ヤクルトスワローズ")  ;
		swallows.setWin  (80);
		swallows.setLose (59);
		swallows.setDraw (4);
		swallows.report();

		BaseBallTeam baystars = new BaseBallTeam();
		baystars.setName ("横浜DeNAベイスターズ");
		baystars.setWin  (73);
		baystars.setLose (68);
		baystars.setDraw (2);
		baystars.report();

		BaseBallTeam tigers = new BaseBallTeam();
        tigers.setName ("阪神タイガース");
        tigers.setWin  (68);
        tigers.setLose (71);
        tigers.setDraw (4);
        tigers.report();

		BaseBallTeam giants = new BaseBallTeam();
		giants.setName ("読売ジャイアンツ");
		giants.setWin  (68);
		giants.setLose (72);
		giants.setDraw (3);
		giants.report();

		BaseBallTeam carp = new BaseBallTeam();
		carp.setName ("広島東洋カープ");
		carp.setWin  (66);
		carp.setLose (74);
		carp.setDraw (3);
		carp.report();

		BaseBallTeam dragons = new BaseBallTeam();
		dragons.setName ("中日ドラゴンズ");
		dragons.setWin  (66);
		dragons.setLose (75);
		dragons.setDraw (2);
		dragons.report();


	}

}
