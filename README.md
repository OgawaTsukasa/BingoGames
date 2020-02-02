# BingoGames
JavaによるCUIビンゴゲーム

# 開発環境
* Eclipse(4.7.3a)
* OS：Windows10

# 使用言語
* Java(フレームワーク：無し)

# 仕様
## ビンゴボールの取り出し
* ランダムに数字が出る　
* 一度出た数字は出ない
* 出た数字を画面に表示する
### カードの作成
* ランダムにビンゴカードを作成する
* BINGOカード内の数字配列は
1.  B列：１～１５
2.  I列：１６～３０
3.  N列：３１～４５
4.　G列：４６～６０
5.  O列：６１～７５
* BINGOカードは二次元配列
* 真ん中はFR(穴の開いた状態)
* カードを画面に表示する
### ゲームの開始とカードチェック
* 開始時にカードと数字を初期化（ランダム）
* 出たボールとカードの状態を表示
* 穴が開いた状態でも元の数字が確認できる
* 数字が出るたびに現在のリーチ数、ビンゴ数を表示する 
# パッケージの構成
```
|-controller
|   |_ GameSystem.java
|   |_ Play.java
|
|-main
|   |_ Main.java
|  
|-object
    |_ ball.java
    |_ card.java
```
# 各クラス説明
```
・Main.java
開始時のテキスト表示
処理はGameSystem

・Play.java
ビンゴカード表示、
ボール取得
現在のカード、ボール、ビンゴおよびリーチの数を表示
途中終了処理

GameSystem.java
ビンゴ、リーチ判定
ビンゴカードの位置とボールの値が一致しているか判定

Ball.java
ランダムな1~75のボールを作成

Card.java
ランダムな1~75の値をセットしたカードの作成、表示
```