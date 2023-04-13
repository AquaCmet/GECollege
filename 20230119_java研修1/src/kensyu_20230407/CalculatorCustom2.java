package kensyu_20230407;

public class CalculatorCustom2 extends CalculatorAdd2 implements CalculatorCustom ,CalculatorTax {

	@Override
	public int calcSub(int a, int b) {
		return a-b;
	}

	@Override
	public double calcMul(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		return a*b;
	}

	@Override
	public double calcDiv(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		if(b == 0) {
			return 0;
		}
		return (double)a/b;
	}

	@Override
	public int getTax(int price) {
		// TODO 自動生成されたメソッド・スタブ
		int ret = 0;
		double tax = 1.08;
		ret = (int)Math.round(price * tax);
		return ret;
	}

}
