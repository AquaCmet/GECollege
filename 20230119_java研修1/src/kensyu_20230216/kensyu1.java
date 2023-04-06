package kensyu_20230216;

import java.util.Scanner;

public class kensyu1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = 0;
		for (int i=0 ; i< str.length();i++) {
			num += Integer.parseInt(str.substring(i,i+1));
		}
		System.out.println(num);
		sc.close();
	}

}
