package kensyu_20230407;

public class CalculatorAdd2 implements CalculatorAdd{
	@Override
	public int  calcAdd(int a,int b) {
		return a+b;
	}
}



/*
 * interfaceは、複数人で開発する場合には大きなメリットとなる
 * 共通のクラスの実装がまだの場合、そのクラスが作成できないと、別の人はコンパイルエラーとなる
 * そこで先に定義しておく。
 * 実装：クラス定義の後に、implementsで実装する
 *       overrideで定義した内容を変更するのが多い
 * 継承：extendsで継承する
 */
   