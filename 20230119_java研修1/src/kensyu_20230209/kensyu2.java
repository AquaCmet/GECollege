package kensyu_20230209;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kensyu2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<Integer>();

		String[] input = ((String)sc.nextLine()).split(" "); // A B C入力
		try {
			int numA = Integer.valueOf(input[0]);       //兄
			int numB = Integer.valueOf(input[1]);
			int numC = Integer.valueOf(input[2]);       //弟
			int N = 100000;
			
			//Nの整数を求める
			for (int i = 1;i < N;i++) {
				numA = Integer.valueOf(input[0]) * i; //整数N倍 兄
				if(0 < (numA - numB)) {  //兄からもらった、（A-B）が0より大きい場合 弟はBの値を引く
					numA = numA - numB;
				}
				if(numC==numA){          //弟はCをもっている
					nums.add(i);
				}
			}

			//値を取り出す
			if(nums.size() == 0) { //Nがない場合
				System.out.println("-1");
			}else {                //Nはある場合、その分出力する
				for (int i=0;i<nums.size();i++) {
					System.out.println(nums.get(i));
				}
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}


		sc.close();
	}

}
