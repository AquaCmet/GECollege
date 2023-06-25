package kensyu_20230608;

public abstract class Factory  {
    public final Building create(String material, String address) {
        Building b = createBuilding(material, address);
        registerBuilding(b);
        return b;
    }

    // 画面によって処理を分けるために子クラス側で任せるよ
    // メソッドで処理を別々にするためのものにする
    protected abstract Building createBuilding(String material, String address);
    protected abstract void registerBuilding(Building building);
}