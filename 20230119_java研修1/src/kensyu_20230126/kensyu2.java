package kensyu_20230126;

import java.util.Arrays;
import java.util.Scanner;

public class kensyu2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] chrs = str.toCharArray();
		Arrays.sort(chrs);

		int even=0,addnum = 0;
		int count = 0;

		//1文字ならしかないから奇数のためNOとする、
		if(str.length() == 1 ) {
			System.out.println("NO");
		}else {

			for(int i = 0 ; i < str.length(); i++) {
				//System.out.println(chrs[i]);
				//System.out.println("even : "+even+",addnum : "+addnum+",count : "+count);

				if(i > 0) { //初回は入らない
					if(chrs[i-1] != chrs[i]) { //前回と文字が違う場合、カウントした数が偶数か奇数か判定する
						if(count%2 == 0) {  //偶数
							even++;
							//System.out.println("even in⇒now:"+even);
						}else {             //奇数
							addnum++;
							//System.out.println("addnum in⇒now:"+addnum);
						}
						count=0;
					}
				}
				count++;

				//最後の文字の時に判定する
				if(i==str.length()-1) {
					if(count%2 == 0) {  //偶数
						even++;
					}else {             //奇数
						addnum++;
					}
				}
			}


			//判定
			if((even==0 && addnum>0) || addnum==0 && even>0) { //きれいな文字
				System.out.println("YES");
			}else {
				System.out.println("NO"); //奇数、偶数混在
			}

		}

		sc.close();
	}
}
