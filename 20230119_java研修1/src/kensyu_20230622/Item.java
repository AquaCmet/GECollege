package kensyu_20230622;

import java.util.List;

class Item implements OrderInterface {

	private String name;

	public Item(String name) {
		this.name = name;
	}

	public void defaultMethod(int depth) {
		for (int i = 0; i < depth; i++) System.out.print("  ");
		System.out.println("注文品:" + this.name);
	}

	public List<OrderInterface> getChildren() { return null; }
	public boolean addComponent(OrderInterface c) { return false; }
	public boolean removeComponent(OrderInterface c) { return false; }

}