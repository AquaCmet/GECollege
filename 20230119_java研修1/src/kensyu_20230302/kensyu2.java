package kensyu_20230302;
import java.util.Scanner;

public class kensyu2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scannerのインスタンス宣言
		int nNum = sc.nextInt(); //Nを入力(int型)
		String sStr = sc.next(); //Sを入力(String型)
		String tStr = sc.next(); //Tを入力(String型)
		String[] S1Str = sStr.split("");//入力されたSを一文字ずつ区切る("")
		String[] T1Str = tStr.split("");//入力されたTを一文字ずつ区切る("")
		int outNum = 0;

		//差分を求める
		int SSnum=0,TTnum=0,sabun=0; //int型 S,Tの差分用、計算差分用を0で宣言、初期化する
		for(int i = 0; i<nNum ; i++) {//Nの数分for分ループする
			SSnum += Integer.parseInt(sStr.substring(i,i+1)); //Sの1の数を足す
			TTnum += Integer.parseInt(tStr.substring(i,i+1)); //Tの1の数を足す
		}
		sabun = Math.abs(SSnum - TTnum);//SとT差の絶対値(abs)を求める

		//処理層
		if(sabun%2 == 0) {//差分が偶数か奇数か
			//偶数ならそのまま比較し、差分数を求める
			for(int i=0;i<nNum;i++) {
				if(!S1Str[i].equals(T1Str[i])) {//s[i] != t[i]異なる箇所をカウントする
			    	outNum++;
				}
			}
		}else {
			//奇数なら反転して差分数を求める⇒ぱっとみわかりずらい!
			for(int i=0;i<nNum;i++) { //例)N=10 0～9 
				if(!S1Str[i].equals(T1Str[nNum-i-1])) { //s[i]!=t[反転]     例)N=10 n[9]10-{0～9}-1
					outNum++;
				}
			}

		}
		
		//出力
		System.out.println(outNum); //差分のカウントを出力する

		sc.close();
	}
}
//if(!sStr.substring(i,i+1).equals(tStr.substring(i,i+1))) {//異なる箇所を

//C#とか頭文字大文字もある C#(C++とjava)Windows系 ローカル変数も頭文字大文字
//javaはLowerCamelケース
	/*
    //1文字ずつ数値にする
    for(int i=0;i<Nnum;i++) {	  
    	Snum[i] = Integer.parseInt(SStr.substring(i,i+1));
    	Tnum[i] = Integer.parseInt(TStr.substring(i,i+1));
    }


    //算出
    for(int i=0;i<Nnum/2;i++) {
    	int num2 = Snum[i]+Snum[Nnum-i-1];//頭と後ろの値を足す
    	int num3 = Tnum[i]+Tnum[Nnum-i-1];
    	outnum += Math.abs(num2-num3);//差分の数が最低数となる
    }
    //Nが奇数なら 真ん中の数値を計算する
    if(Nnum%2!=0) {
    	int i = Math.round(Nnum/2);
    	outnum += Math.abs(Snum[i]+Tnum[i]);
    }
	 */
	//Nが偶数の場合 S-Tの見比べて偶数なら、そのまま違う分の数。奇数の場合は反転して差分を出す
	//4
	//1110→(1010)0101→(0001)1000→
	//0001
	//2→4回になる


