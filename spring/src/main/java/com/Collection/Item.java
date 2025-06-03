package com.Collection;

public class Item {
	public String name;
	public long price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Item(String name, long price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Item() {
		super();
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

}
