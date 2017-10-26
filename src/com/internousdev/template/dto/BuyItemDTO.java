package com.internousdev.template.dto;

public class BuyItemDTO {

	public int id;

	public String itemName;

	public String itemPrice;

public int userId;

	public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

	public String getItemName() {
		return itemName;

	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	}

