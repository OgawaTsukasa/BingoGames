package object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Card {
	private int range = 1;						//振り分け範囲
	private int[][] card = new int[5][5];		//カード


	public int[][] getCard() {
		return card;
	}


	/**
	 * コンストラクタ
	 *
	 */
	public Card() {
		//カードの作成
		for(int i = 0; i < 5; i++ ) {
			//ランダム生成
			ArrayList<Integer> numList = new ArrayList<Integer>();
			for(int num = range; num < (range + 15); num++) {
				numList.add(num);
			}
			//numListをシャッフル
			Collections.shuffle(numList);


			for(int j = 0; j < 5; j++ ) {
				//真ん中は0
				if(i == 2 && j == 2) {
					card[j][i] = 0 ;

				}else {
					card[j][i] = numList.get(j);

				}
			}range += 15;
		}
	}

	/**
	 * カードの表示
	 * @param numList
	 *
	 * @return  void
	 */
	public void cardDisplay(List<Integer> numList) {

		//カードの表示
		System.out.println("━━━━━━━━━━━━━━━━━━━━━");
		for(int i = 0; i < 5; i++) {
			System.out.print("｜");

			for(int j = 0; j < 5; j++) {
				//真ん中は「FR」と表示（0 = 真ん中）
				if(getCard()[i][j] == 0) {
					System.out.print("【FR】" + "｜");


				}else if(numList.contains(getCard()[i][j])) {
					if(getCard()[i][j] < 10 ){
						System.out.print(" 【" + getCard()[i][j] + "】｜");
					}else{
						System.out.print("【" + getCard()[i][j] + "】｜");
					}

				}else if(getCard()[i][j] < 10 ){
						System.out.print("   " + getCard()[i][j] + "  ｜");
					}else{
						System.out.print("  " + getCard()[i][j] + "  ｜");
					}

				//改行
				if(j == 4) {
					System.out.println();
					System.out.println("━━━━━━━━━━━━━━━━━━━━━");
				}
			}
		}
	}





}
