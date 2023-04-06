package kensyu_20230302;
import java.util.Scanner;

public class kensyu1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = ((String)sc.nextLine()).split(" ");
		int num1 = 0,num2 = 0;

		//コンボあり
		for(int i=0;i<input.length;i++) {
			num1 += Integer.parseInt(input[i]);
		}
		//コンボなしを求める→比較しなくてもA1​≤A2​≤A3​のルールからA3をとれば最大値
			num2 = Integer.parseInt(input[0]);
		for (int i=0;i<input.length-1;i++) {
			if(num2 < Integer.parseInt(input[i])) {
				num2 = Integer.parseInt(input[i]);
			}
		}
		num2 = num2 * 3;
		

		//判定
		if(num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);	
		}

		sc.close();

	}

}
