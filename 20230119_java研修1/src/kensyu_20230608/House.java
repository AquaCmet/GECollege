package kensyu_20230608;

public class House extends Building {

    private String material;
    private String address;

    House(String material, String address) {
        System.out.println(material + "で" + address + "に作ります。");
        this.material = material;
        this.address = address;
    }

    @Override
    public void live(String person) {
        System.out.println(person + "が住みました。");
    }

    public String getAddress() {
        return address;
    }

}
