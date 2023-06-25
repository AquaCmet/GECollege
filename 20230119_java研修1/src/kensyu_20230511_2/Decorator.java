package kensyu_20230511_2;
// 価格をあらわすインタフェース
interface Price{
    int getValue();
}

/** 原価を表すクラス */
class PrimePrice implements Price{
    private int value;
    PrimePrice(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}

/** マージンを介する価格 */
abstract class MarginPrice implements Price{
    protected Price originalPrice;
    MarginPrice(Price price){
        this.originalPrice = price;
    }
}

/** 設定された利益を仕入れ価格に上乗せする Price */
class WholesalePrice extends MarginPrice{
    private int advantage;
    WholesalePrice(Price price, int advantage){
        super(price);
        this.advantage = advantage;
    }
    public int getValue(){
        return this.originalPrice.getValue() + advantage;
    }
}

/** 仕入れ価格の 2 倍の値段を提示する Price */
class DoublePrice extends MarginPrice{
    DoublePrice(Price price){
        super(price);
    }
    public int getValue(){
        return this.originalPrice.getValue() * 2;
    }
}

/** 税率 Price */
class TaxPrice extends MarginPrice{
	TaxPrice(Price price){
        super(price);
    }
    public int getValue(){
        return  (int) Math.round(this.originalPrice.getValue() * 1.08);
    }
}

public class Decorator{
	public static void main(String[] argv){
		System.out.println(
				new TaxPrice(
						new WholesalePrice(
								new DoublePrice(
										new WholesalePrice(
												new DoublePrice(
														new PrimePrice(120)
														)
												,80
												)
										)
								,200
								)
						).getValue()
				);
	}
}