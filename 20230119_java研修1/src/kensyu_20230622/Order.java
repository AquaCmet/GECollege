package kensyu_20230622;

import java.util.ArrayList;
import java.util.List;

class Order implements OrderInterface {
	private String name;
	private List<OrderInterface> fileList = new ArrayList<OrderInterface>();
	// 
	public Order(String name) { 
		this.name = name; 
	}

	// 
	public void defaultMethod(int depth) {
		// 文頭に、空白を挿入する
		for (int i = 0; i < depth; i++) {
			System.out.print("  ");
		}
		// 
		System.out.println(name);
		// 
		for (OrderInterface file : fileList) {
 			file.defaultMethod(depth + 1);
		}
	}

	public List<OrderInterface> getChildren() { return this.fileList; }
	public boolean addComponent(OrderInterface c) { return this.fileList.add(c); }
	public boolean removeComponent(OrderInterface c) { return this.fileList.remove(c); }
}