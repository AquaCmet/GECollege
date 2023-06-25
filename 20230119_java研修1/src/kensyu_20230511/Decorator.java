package kensyu_20230511;
// 価格をあらわすインタフェース
interface Str{	
    String getValue();
}

/** 原価を表すクラス */
class PrimePrice implements Str{
    private String value;
    PrimePrice(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}

/** マージンを介する価格 */
abstract class MarginPrice implements Str{
    protected Str originalPrice;
    MarginPrice(Str price){
        this.originalPrice = price;
    }
}

/** 文字列を連結する */
class AddString extends MarginPrice{
    private String advantage;
    AddString(Str price, String advantage){
        super(price);
        this.advantage = advantage;
    }
    public String getValue(){
        return this.originalPrice.getValue() + advantage;
    }
}

/** スペースを追加する */
class AddSpace extends MarginPrice{
    AddSpace(Str price){
        super(price);
    }
    public String getValue(){
        return this.originalPrice.getValue() +" ";
    }
}

public class Decorator{
	public static void main(String[] argv){
		System.out.println(
				new AddString(
						new AddSpace(
								new AddString(
										new AddSpace(
												new PrimePrice("Hello")
												),
										"a")
								),"b"
						
				).getValue()
		);
	}
}