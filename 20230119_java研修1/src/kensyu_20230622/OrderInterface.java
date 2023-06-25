package kensyu_20230622;

import java.util.List;

interface OrderInterface {
	public void defaultMethod(int depth);
	public List<OrderInterface> getChildren();
	public boolean addComponent(OrderInterface c);
	public boolean removeComponent(OrderInterface c);
}