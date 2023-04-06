package kensyu_20230330;
import java.util.Scanner;
//gitテスト jjj
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		ManualWatch mWatch = new ManualWatch();
		SmartWatch sWatch = new SmartWatch();
		SmartWatch sWatch2 = new SmartWatch("ウォッチ2");
		//主処理
		System.out.println("10:時計見る(手巻き)\r\n11:充電(手巻き)");
		System.out.println("20:時計見る(スマートウォッチ)\r\n21:充電(スマートウォッチ)");
		System.out.println("99:終了");
		//System.out.println("時計の処理を選んでください");
		while(true) {
			num = sc.nextInt();
			switch(num) {
			case 10:
				//手巻き時計の時間確認
				mWatch.getCheckWatch();
				break;
			case 11:
				//手巻き時計の充電
				mWatch.chargingTime();
				break;
			case 19:
				mWatch.getCheckWatchDebug();
				break;
			case 20:
				//スマートウォッチの時間確認
				sWatch.getCheckWatch();
				break;
			case 21:
				//スマートウォッチの充電
				sWatch.chargingTime();
				break;
			case 29:
				sWatch.getCheckWatchDebug();
				break;
			case 39:
				sWatch2.getCheckWatchDebug();
				break;
			default:
				System.out.println("対象外の番号");
				break;
			}

			//99の場合終了する
			if(num == 99){
				break;
			}
		}
		sc.close();
		System.out.println("終了");
	}

}
