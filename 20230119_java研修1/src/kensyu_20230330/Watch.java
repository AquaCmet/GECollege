package kensyu_20230330;
import java.util.Calendar;
import java.util.Date;

public abstract class Watch {
	//スプリングFW
	//@override→@inject(スプリングFW)→勝手にnewしてくれる
	//アノテーションをつける

	//課題1
	//メイン
	//インスタンス化したときに有効時間(手動（子クラス）：1分、自動（子クラス）：3分)設定されて
	//その時間以降は動いていない。出力される

	//課題2
	//gitの個人アカウント登録をする
	private String watchName;  // 時計の名前
	private Date currentDate; // 現在時刻
	private Date untilDate;   // 動く期間
	
	public Watch() {
	}
	public Watch(String str) {
		this.watchName = str;
	}
	protected abstract int getTime();	
	
	// 時計を見る
	public void getCheckWatch() {
		currentDate = new Date(); //システム日付を取得
		if(untilDate != null && currentDate.before(untilDate)) { //充電前に時計表示するとnullエラーになる
			System.out.println(currentDate);
		}else {
			System.out.println("電池切れ");
		}
	}
	
	// 充電する
	protected Date chargingTime() {		
 		Calendar cal = Calendar.getInstance();
 		cal.add(Calendar.MINUTE,getTime());
 		untilDate = cal.getTime();
 		return untilDate;
	}

	// デバッグ用
	public void getCheckWatchDebug() {
		currentDate = new Date();
		System.out.println("untilDate:"+untilDate);
		System.out.println("currentDate:"+currentDate);
		System.out.println("watchName:"+watchName);
		
	}
}
