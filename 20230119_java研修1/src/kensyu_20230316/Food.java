package kensyu_20230316;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Food {

	protected String name;     //名称
	private int price;         //値段
	private double tax = 1.08; //税率
	private int kind;          //食品品目
	
	//コンストラクタ
	public Food() {
	}
	public Food(String str,int num,int xKind) {
		this.name = str;
		this.price = num;
		this.kind = xKind;
	}
	
	//食べ物の名前を取得する
	public String getName() {
		return name;
	}
	public void setName(String str) {
		this.name = str;
	}
	
	//食べ物の値段(税込み)を取得する
	public int getPrice() {
		return (int)((double)price * tax);
	}
	public void setPrice(int num) {
		this.price = num;
	}
	
	//期限を取得する if分が多岐にわたるものは、基底クラスでは定義しないメソッド化
 	protected abstract int getTermDate();
 	
 	protected String calculateDate() {
 		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");		
 		Calendar cal = Calendar.getInstance();
 		cal.add(Calendar.DATE,getTermDate());
 		return dateFormat.format(cal.getTime());
 	}
 /*	   親クラスは不変のものにする。分岐などはいれない。テストケースが大きくなる
   Date termDate = new Date();     //期限
 	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
 		int termDateNum = 0;
 		switch(kind) {
 		 case 1: //肉
 			 termDateNum = 5;
 			  break;
 		 case 2: //野菜
 			 termDateNum = 10;
 			  break;
 		 default:
 			  break;→
	}
	Calendar cal = Calendar.getInstance();
	cal.setTime(termDate);
	cal.add(Calendar.DATE,termDateNum);
	return dateFormat.format(cal.getTime());
*/

 		
	
	
	
	//大→小へ ふるまい、メソッド
	//調理方法・料理
	//じゃがいも、ナス：DBから取得する
	//育て方：育て方クラス⇒生き物の育て方、野菜の作り方クラスに継承させる
	//〇〇科：DBから取得するみたいな感じ
	//QRコードもしくはバーコード作成するクラス、DBに登録して商品管理するシステム

	//難しそうならゲームのキャラクターで行く
	//鳥クラス→泣き方→カラス・スズメ
	
	

}
