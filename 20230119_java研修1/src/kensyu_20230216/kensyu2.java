package kensyu_20230216;
import java.util.Scanner;
public class kensyu2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		//変更できる文字数⇒一文字ずつ回して、equlsでカウントあげるがきれいかも
		int number = 0;
		int symbol = 0;
		number += strnum(str,'o');
		number += strnum(str,'l');
		symbol += strnum(str,'a');
		symbol += strnum(str,'s');

		
		//可能な文字パターンを出力する
		if(str.length() >= 8) { //8文字以上であること
			if(str.matches(".*(o|l).*") && str.matches(".*(a|s).*") && (number+symbol)!=str.length()) { //記号、数字どちらもある、かつ、すべて変換される文字じゃない時
				symbol= patternnum(number) *  patternnum(symbol);//数字パターン * 記号パターン
			}else if(str.matches(".*(o|l).*") && str.matches(".*(a|s).*")){//数字と記号のパタンの時
				symbol = (patternnum(number) *  patternnum(symbol)) -1; //すべて変換して、一つだけアルファベットのままのパターンがあるため-1する
			}else{
				symbol = 0;//System.out.println("0　：数字、記号がないパターン or すべて数字、記号のパターン");
			}
		}else {
			System.out.println("8文字以上入力する");
		}
		System.out.println(symbol);
	}

	//文字列から特定の文字数を検索する（文字列,検索文字列)
	public static int strnum(String str2, char ch) {
		int cnt = 0;
		for (int i = 0; i < str2.length(); i++)
		{
			if (str2.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//パターンの数を求める
	public static int patternnum(int num) {
		int ret = 0;
		if(num > 1) {
			ret = (int)Math.pow(2,num)-1; //二乗した数-1（すべて裏）
		}else {
			ret = num;
		}
		return ret;
	}
	/*
		if(str.length() >= 8) { //8文字以上であること
			if(str.matches(".*(o|l).*") && str.matches(".*(a|s).*")) { 
				System.out.println("yes");	
			}else{
				System.out.println("数字、記号どちらかがないパターン");
			}
		}else {
			System.out.println("8文字以上入力する");
		}
		sc.close();

		for(int i=0;i<0;i++) {
			for(int j=0;j<0;j++) {

			}
		}*/

	/*
	 * 入力は半角英小文字のみ str
	 * str.length() >= 8
	 * "o"か"l"は必ず検知する
	 * "a"か"s"は必ず検知する
	 * それ以外も検知する
	 * 
	 * 条件みたしているか判定いれる match
	 * ★ループのネストをして、パターンをまずリスト化する list.add(pattern)
	 * パターンのサイズを出力する	 list.size()
	 *解決策1：すべてfor文で再起処理をする
	 *解決策2：コインの裏表のすべて裏(-1)の数したパタンに分けて"記号パタン*数字パタン"する
	 *
	 */

}


