package kensyu_20230126;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//ラムダ式、Streamを覚えておくと便利ではある
public class kensyu1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int num;
		while(true) {
			System.out.println("数値を入力してください。100以上で終了");
			str = sc.next();
			
			if(!isNumber(str)) {
				System.out.println(str);
				break;
			}
			num = Integer.valueOf(str);
			if(num%3==0 && num%5==0) {
				System.out.println("FizzBuzz");
			}else if(num%3==0) {
				System.out.println("Fizz");
			}else if(num%5==0){
				System.out.println("Buzz");
			}else {
				System.out.println(num);
			}

			if(Integer.valueOf(str) >= 100) {
				break;
			}
		}

		System.out.println("処理終了");
		sc.close();
	}
	public static boolean isNumber(String num) {
	    String regex = "^[0-9]+$";
	    Pattern pt = Pattern.compile(regex);
	    Matcher mt = pt.matcher(num);
	    return mt.find();
	}
}/*正規表現
記号	記号の説明	例	例の説明
.	任意の1文字。改行文字は除く。	.+	任意の文字列
*	直前の1文字の0回以上の繰り返しと一致	hoge*	hogeもしくはhogee...と一致
^	行の先頭	^[0-9]	行頭が数字
$	行の末尾	^.{10}$	10文字の行
[ ]	カッコ内の任意の1文字と一致。「-」で範囲指定可。	[a-z]	小文字のアルファベット1文字と一致
[^ ]	カッコ内の任意の1文字と不一致。「-」で範囲指定可。	[^A-Z]	大文字のアルファベット以外
+	直前の文字の1個以上の繰り返しと一致	hoge+	hogee...と一致
?	直前の文字が0個または1個の場合に一致	hoge?	hogeもしくはhogと一致
{ }	カッコ内の数値の繰り返しと一致	{n}	直前の文字のn個の繰り返しと一致
同上	{,n}	直前の文字のn個以下の繰り返しと一致
同上	{m,}	直前の文字のm個以上の繰り返しと一致
同上	{m,n}	直前の文字のm個以上、n個以下の繰り返しと一致
|	直前、直後どちらかのパターンに一致	hoge|piyo	hogeまたはpiyo
( )	カッコ内をグループ化。マッチした内容は参照可。	ー	ー*/