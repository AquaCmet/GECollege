package kensyu_20230309;
import java.util.Scanner;

public class kensyu1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;

		//使わない分食べるから、2のべき乗した以下の数にすればよい？
		if(num > 1) {
			while(true) {
				if(num <= Math.pow(2,count)) {
					break;
				}
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
