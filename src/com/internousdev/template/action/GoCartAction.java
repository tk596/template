package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 */

public class GoCartAction extends ActionSupport implements SessionAware {

	private int userId;
	private int itemId;
	private String itemName;
	private int price;
	private int quantities;
	private int stocks;
	private ArrayList<CartDTO> CartList = new ArrayList<CartDTO>();
	private Map<String, Object> session;

	@SuppressWarnings("unchecked")

	public String execute() {
		if (session.containsKey("userId")) {
			CartDTO dto = new CartDTO();
			if (quantities <= stocks) {
				userId = (int) session.get("userId");
				dto.setUserId(userId);
				dto.setItemId(itemId);
				dto.setStocks(stocks);
				dto.setPrice(price);
				dto.setItemName(itemName);
				dto.setQuantities(quantities);
				dto.setTotalPrice(price * quantities);
				if (session.get("cartList") != null) {
					CartList = (ArrayList<CartDTO>) session.get("cartList");
					int cartSize = CartList.size();
					for (int i = 0; i < cartSize; i++) {
						if (CartList.get(i).getItemId() == itemId) {
							int ListIndex = i;
							CartDTO dto2 = new CartDTO();
							dto2.setUserId(CartList.get(i).getUserId());
							dto2.setItemId(CartList.get(i).getItemId());
							dto2.setItemName(CartList.get(i).getItemName());
							dto2.setStocks(CartList.get(i).getStocks());
							dto2.setPrice(CartList.get(i).getPrice());
							dto2.setQuantities(CartList.get(i).getPrice());
							dto2.setTotalPrice(CartList.get(i).getTotalPrice());
							if (ListIndex >= 0 && cartSize > 1) {
								CartList.set(ListIndex, dto2);
								session.put("cartList", CartList);
								return SUCCESS;
							} else if (ListIndex == 0 && cartSize == 1) {
								CartList.set(ListIndex, dto2);
								session.put("cartList", CartList);
								return SUCCESS;
							}
						}
					}
				}
				CartList.add(dto);
				session.put("cartList", CartList);
				return SUCCESS;

			}
			return ERROR;
		} else {
			return LOGIN;
		}
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantities() {
		return quantities;
	}

	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	public int getStocks() {
		return stocks;
	}

	public void setStock(int stocks) {
		this.stocks = stocks;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<CartDTO> getCartList() {
		return CartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		CartList = cartList;
	}

}