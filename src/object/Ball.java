package object;

import java.util.ArrayList;
import java.util.Collections;

public class Ball {
	//ボールを引いた回数
	private int challenges;
	//75個のボール
	private ArrayList<Integer> ball = new ArrayList<Integer>();



	public int getChallenges() {
		return challenges;
	}
	public void setChallenges(int challenges) {
		this.challenges = challenges;
	}


	public ArrayList<Integer> getBall() {
		return ball;
	}
	public void setBall(ArrayList<Integer> ball) {
		this.ball = ball;
	}


	/**
	* コンストラクタ
	*
	*/
	public Ball() {
		//引いた回数の初期値
		challenges = 0;

		//75個のボールを作成
		ArrayList<Integer> ballList = new ArrayList<Integer>();
		for(int i = 1; i < 76; i++) {
			ballList.add(i);
		}
		//75個のボールをシャッフル
		Collections.shuffle(ballList);

		for(int i = 0; i < 75; i++) {
			ball.add(ballList.get(i));
		}
	}


	/**
	 * ボールの取得と引いた回数のカウント
	 *
	 * @return ball[int]  ランダムに引いたボール
	 */

	public int getTheBall() {

		//現在の引いた回数を取得
		int Challenges = getChallenges();

		//ボールを引く
		int ball = (int)getBall().get(Challenges);

		//一回引いたので回数を１増やしてフィールドにセット
		Challenges ++;
		setChallenges(Challenges);

		return ball;
	}
}
