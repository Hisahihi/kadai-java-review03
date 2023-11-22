
public class BaseBallTeam {

    public String name;     // チーム名
    public int win;         //勝利数
    public int lose;        //負け数
    public int drow;        //引き分け数

    //勝率計算のメソッド
　　　public double getRate() {
	double getRate = win/(win+lose);
	return getRate;
　　　}

public void report() {
    System.out.println(name+"の2022年の成績は"+ win +"勝"+ lose +"負"+ drow +"分、勝率は"+ getRate +);
    }

}
