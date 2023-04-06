package kensyu_20230119;

import java.util.Scanner;

public class Kensyu1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//問題1
		/*
		System.out.println("Hello world!!"); 
		 */

		//問題2
		/*
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("こんにちは"+name);
		 */

		//問題3
		/*
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("数値を入力してください。100以上で終了");
			num = sc.nextInt();
			if(num%3==0 && num%5==0) {
				System.out.println("FizzBuzz");
			}else if(num%3==0) {
				System.out.println("Fizz");
			}else if(num%5==0){
				System.out.println("Buzz");
			}else {
				System.out.println(num);
			}
			if(num >= 100) {
				break;
			}
		 */

		//問題4
		Scanner sc = new Scanner(System.in); //スカラーを使用する時はsc.close()する！　
		//nextLint()なら配列で入力フォームがとれる
		
		boolean dec1,dec2,dec3;
		
		while(true) {
			String str = sc.next();
			int num[] = new int[str.length()];
			dec1 = false;
			dec2 = false;
			dec3 = false;

			for (int i=0; i < str.length() ; i++) {
				num[i] = Integer.parseInt(str.substring(i,i+1));
			}
			
			//データが575にできるか判定する
			//制約 1≦A,B,C≦10​
			if (str.length()==3 && num[0] >= 1 && num[2] <=10) {

				for (int i = 0; i < num.length;i++) {
					if(num[i]==5) {
						if(dec1) {
							dec2 = true; //2回目の5
						}else {
						    dec1 = true; //1回目の5
						}
					}
					if(num[i]==7) {
						dec3 = true; //7の判定
					}					
				}
				//判定
				if(dec1 && dec2 && dec3) {
					System.out.println("OK");	
					break;
				}else {
					System.out.println("NG");	
				}
			}
			else {
				System.out.println("制約と異なる");
			}

		}
	}




}
