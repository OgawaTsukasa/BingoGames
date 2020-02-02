package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import object.Ball;
import object.Card;

public class Play {
	private Ball ball = new Ball();
	private Card card = new Card();

	public void start() {
		try {
			//取ったボール
			List<Integer> numList = new ArrayList<Integer>();
			while(ball.getChallenges() < 75) {
				//ボールの取得
				int num = ball.getTheBall();
				numList.add(num);
				int challenges = ball.getChallenges();

				System.out.println("");
				System.out.println(" " + challenges + "回目の" +  "ボールは" + num + "番です");

				//現在のビンゴとリーチの表示
				int bingo =  GameSystem.bingo(card, numList);
				int reach =  GameSystem.reach(card, numList);

				System.out.println("　現在のビンゴ数 ：" + bingo + "   リーチ数 : " + (reach - bingo) + " です");

				//カードの結果表示

				card.cardDisplay(numList);

				System.out.println("");
				System.out.println("   ボールを取る   " + "↓Enter↓");

				System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");

				Scanner scan = new Scanner(System.in);

				scan.nextLine();
			}

			System.out.println(" お疲れさまでした。本日のビンゴ大会は終了です。");




		}catch(Exception e){
			System.out.println(e);
		}

	}

}
