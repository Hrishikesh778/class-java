package com.Collection;

import java.util.List;
import java.util.Map;

public class Order {

	public List<Item> item;

//	map

	private Map<String, Item> itemMap;

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public Order(List<Item> item) {
		super();
		this.item = item;
	}

	public Order() {
		super();
	}

	public Map<String, Item> getItemMap() {
		return itemMap;
	}

	public void setItemMap(Map<String, Item> itemMap) {
		this.itemMap = itemMap;
	}

	public Order(Map<String, Item> itemMap) {
		super();

		this.itemMap = itemMap;
	}

}