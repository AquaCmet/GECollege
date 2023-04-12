package kensyu_20230407;

public class Main {

	public static void main(String[] args) {
		int numA = 10;
		int numB = 20;
		int retInt = 0;
		double retdouble = 0;
		
		CalculatorAdd2 calcA2 = new CalculatorAdd2();
		retInt = calcA2.calcAdd(numA,numB);
		System.out.println(retInt);
		
		
		CalculatorCustom2 calcC2 = new CalculatorCustom2();
		retInt = calcC2.calcSub(numA, numB);
		System.out.println(retInt);
		retInt = calcC2.calcAdd(numA, numB);
		System.out.println(retInt);
		retdouble = calcC2.calcDiv(numA,numB);
		System.out.println(retdouble);
		retInt = calcC2.getTax(numA);
		System.out.println(retInt);
		
		
	}

}
