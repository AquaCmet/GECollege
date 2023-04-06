package kensyu_20230309;
import java.util.Scanner;

public class kensyu2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		
		//素数判定
		for(int i=1;i<num;i++) {
			if(num %i==0) {
				count++;
			}
		}
		
		//出力 1個以上あれば素数ではない
		if(count>1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}

}
