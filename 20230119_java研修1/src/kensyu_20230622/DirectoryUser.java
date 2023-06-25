package kensyu_20230622;

public class DirectoryUser {
	public static void main(String [] args){
		OrderInterface tableA = new Order("テーブルA");
		OrderInterface order1 = new Order("オーダー1");
		OrderInterface order2 = new Order("オーダー2");
		
		
 		OrderInterface beer = new Item("ビール");
 		OrderInterface wine = new Item("ワイン");
 		OrderInterface sake = new Item("日本酒");
 		OrderInterface meet = new Item("お肉");
 		OrderInterface fish = new Item("魚");
 		OrderInterface cheese = new Item("チーズ");

 		tableA.addComponent(order1);
 		order1.addComponent(beer);
 		order1.addComponent(wine);
 		order1.addComponent(sake);
 		
		tableA.addComponent(order2);
 		order2.addComponent(meet);
 		order2.addComponent(meet);
 		order2.addComponent(fish);
 		order2.addComponent(cheese);
 		
 		// List<Order> order = new List<Order>{}
 		// tableA.addComponent(List<T>);
 		// オーダークラス側で、自分でオーダークラスをnewする
 		// オーダーをためておく
 		// プッシュオーダーしたときに、オーダーが閉じる
 		// オーダーインスタンスを複数作らずにシームレスなものができる
 		tableA.defaultMethod(0);

	}
}
// オーダーインスタンスを自動で生成する
// テーブルインスタンスを自動で生成する
// ------------------------------------------------
// コンポジット（composite）パターン
// わかりやすい例：エクスプローラー
// 注文1、注文明細、
// 1オーダー：注文が複数
// メニュー画面とか
// 機械は多い