package kensyu_20230608;

import java.util.ArrayList;
import java.util.List;

public class HouseFactory extends Factory {

    private static HouseFactory factory = new HouseFactory();

    private HouseFactory() {
        // privateコンストラクタ
    }
    public static HouseFactory getInstance() {
        return factory;
    }

    // 建物を建てた住所を登録する変数
    private List<String> addresses = new ArrayList<>();

    @Override
    protected Building createBuilding(String material, String address) {
        return new House(material, address);
    }

    @Override
    protected void registerBuilding(Building building) {
        addresses.add(((House)building).getAddress());
    }

    public List<String> getAddresses() {
        return addresses;
    }

}
// 画面A　FACTORY
// →画面によって、項目数、処理数が違う
// 画面B　
//データ加工に似ている
//何かしら処理して、登録する

//　子クラス側に処理を渡すパターン
// オブジェクト指向は、効率敵（メモリを節約する）前はメモリを考えて作らないと重すぎるため
// 今はクラス図で提案しながら、設計所作って→将来こうロジック変更する場合は、ここを変更すれば
// 吸収できますよっていうのが提案できれば良い
// いきなりこのレベルのコーディングは、かけないし

// 次回 2023/6/15
// 生成に関するパタン Singleton()か、Bullder()
// 7月はframeworkに入る
// デプロイするためのサーバーの準備（最後仕上げ）