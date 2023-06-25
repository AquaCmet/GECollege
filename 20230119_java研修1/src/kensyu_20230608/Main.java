package kensyu_20230608;

public class Main {

    public static void main(String[] args) {
        Factory factory1 = HouseFactory.getInstance();
        Building house1 = factory1.create("木材", "東京都港区XXXXX");
        Building house2 = factory1.create("コンクリート", "東京都荒川区XXXXX");

        house1.live("斎藤さん");
        house2.live("佐藤さん");
    }

}

// だいたい、もうこれを読んでくださいって言ってあって
// こちらで制御しておきます～って
// useケースは、ほぼ見ない！
// 帳票とかで1，2度みかけたかなと思う
// javaとかで、最近はinjectionとか
// 
