package controller;

import java.util.List;

import object.Card;

public class GameSystem {

	/**
	 * ビンゴ数の判定
	 *
	 * @param card
	 * @param ballList 引いたボールのList
	 * @return bingo ビンゴ数
	 */
	public static  int bingo(Card card, List ballList) {
		int bingo = 0;

		//縦横のビンゴ判定
		for(int i = 0; i < 5; i++) {
			int countRow = 0;
			int countCol = 0;
			for(int j = 0; j < 5; j++) {
				//横の判定
				if(i == 2) {
					if(ballList.contains(card.getCard()[i][j])) {
						countRow++;
						if(countRow == 4){
							bingo++;
						}
					}
				}else if(ballList.contains(card.getCard()[i][j])) {
					countRow++;
					if(countRow == 5){
						bingo++;
					}
				}


				//縦の判定
				if(i == 2) {
					if(ballList.contains(card.getCard()[j][i])) {
						countCol++;
						if(countCol == 4){
							bingo++;
						}
					}
				}else if(ballList.contains(card.getCard()[j][i])) {
					countCol++;
					if(countCol == 5){
						bingo++;
					}
				}

			}
		}

		//斜めのビンゴ判定
		int countSlash = 0;
		int countReSlash = 0;

		for(int i = 0; i < 5; i++) {
			//右上の判定
			if(ballList.contains(card.getCard()[4 - i][i])) {
				countSlash++;
				if(countSlash == 4) {
					bingo++;
				}
			}
			//左上の判定
			if(ballList.contains(card.getCard()[i][i])) {
				countReSlash++;
				if(countReSlash == 4) {
					bingo++;
				}
			}
		}
		return bingo;
	}

	/**
	 * リーチ数の判定
	 *
	 * @param card
	 * @param ballList  引いたボールのList
	 * @return reach リーチ数
	 */
	public static  int reach(Card card, List ballList) {
		int reach = 0;

		//縦横のビンゴ判定
		for(int i = 0; i < 5; i++) {
			int countRow = 0;
			int countCol = 0;
			for(int j = 0; j < 5; j++) {
				//横の判定
				if(i == 2) {
					if(ballList.contains(card.getCard()[i][j])) {
						countRow++;
						if(countRow == 3){
							reach++;
						}
					}
				}else if(ballList.contains(card.getCard()[i][j])) {
					countRow++;
					if(countRow == 4){
						reach++;
					}
				}


				//縦の判定
				if(i == 2) {
					if(ballList.contains(card.getCard()[j][i])) {
						countCol++;
						if(countCol == 3){
							reach++;
						}
					}
				}else if(ballList.contains(card.getCard()[j][i])) {
					countCol++;
					if(countCol == 4){
						reach++;
					}
				}
			}
		}

		//斜めのリーチ判定
		int countSlash = 0;
		int countReSlash = 0;

		for(int i = 0; i < 5; i++) {
			//右上の判定
			if(ballList.contains(card.getCard()[4 - i][i])) {
				countSlash++;
				if(countSlash == 3) {
					reach++;
				}
			}
			//左上の判定
			if(ballList.contains(card.getCard()[i][i])) {
				countReSlash++;
				if(countReSlash == 3) {
					reach++;
				}
			}
		}
		return reach;
	}
}
