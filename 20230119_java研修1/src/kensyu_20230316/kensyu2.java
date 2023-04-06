package kensyu_20230316;

import java.util.ArrayList;
import java.util.List;

public class kensyu2 {

	public static void main(String[] args) {
         //food food1 = new food();
         //food food2 = new food();
         Food food3 = new Meat();
         //cook cook1 = new cook("鶏肉",150,foodName.chicken.ordinal());
         //food2.setName("牛肉");
         //food1.setPrice(200);
         //food2.setPrice(300);
         
         //System.out.println("名前："+food1.getName()+"、"+"値段："+food1.getPrice());
         //System.out.println("名前："+food2.getName()+"、"+"値段："+food2.getPrice());
         System.out.println("名前："+food3.getName()+"、"+"値段："+food3.getPrice());
         System.out.println("賞味期限："+food3.getTermDate());
         //System.out.println(cook1.bakeCooking());
         System.out.println();
         
         List<String> list = new ArrayList<String>();
         
         
	}

}
