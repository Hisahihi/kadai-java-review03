package baseball;

public class BaseBallTeam {

	private String name;     // チーム名
	private int win;         //勝利数
	private int lose;        //負け数
	private int draw;        //引き分け数

	//勝率計算のメソッド
	public double getRate() {
		double rate = (double)win/(double)(win+lose);
		return rate;
	}

	//成績表示
	public void report() {
		System.out.println(name+"の2022年の成績は"+ win +"勝"+ lose +"負"+ draw +"分、勝率は"+ getRate()+"です。");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

}
