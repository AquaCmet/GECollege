package kensyu_20230209;

import java.util.Scanner;

public class kensyu1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
         Scanner sc = new Scanner(System.in);
         
         int num = sc.nextInt();
         
         //うるう年を判定する
         if(num%400==0) {
        	 System.out.println("Yes");	 
         }else if (num%100==0) {
        	 System.out.println("No");
         }else if(num%4==0) {
        	 System.out.println("Yes");
         }else {
        	 System.out.println("No");
         }
         
         sc.close();
	}

}
