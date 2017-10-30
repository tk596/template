package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentAction extends ActionSupport implements SessionAware {

	public static final String CONFIRM = "confirm";


	private int[] quantities;
	public String pay;
	public int itemDelete;
	public String result;
	public Map<String, Object> session;
	private ArrayList<CartDTO> CartList = new ArrayList<CartDTO>();

	@SuppressWarnings("unchecked")
	public String execute() {

		if (session.get("userId") != null) {
			if (session.get("cartList") != null) {
				CartList = (ArrayList<CartDTO>) session.get("cartList");
				int CartSize = CartList.size();
				for (int i = 0; i < CartSize; i++) {
					if (itemDelete == 0) {
						CartDTO dto = new CartDTO();
						dto.setUserId(CartList.get(i).getUserId());
						dto.setItemId(CartList.get(i).getItemId());
						dto.setItemName(CartList.get(i).getItemName());
						dto.setStocks(CartList.get(i).getStocks());
						dto.setPrice(CartList.get(i).getPrice());
						dto.setQuantities(CartList.get(i).getQuantities());
						dto.setTotalPrice(CartList.get(i).getTotalPrice());
						CartList.set(i, dto);
					} else {
						if (CartList.get(i).getItemId() == itemDelete) {
							CartList.remove(i);
							return NONE;
						}
					}
				}
				session.put("cartList", CartList);
				session.put("pay", pay);
				if (pay.equals("現金払い")) {
					return CONFIRM;
				}
			}
			return ERROR;
		}
		return LOGIN;
	}

	public ArrayList<CartDTO> getCartList() {
		return CartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		CartList = cartList;
	}

	public int[] getQuantities() {
		return quantities;
	}

	public void setQuantities(int[] quantities) {
		this.quantities = quantities;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public int getItemDelete() {
		return itemDelete;
	}

	public void setItemDelete(int itemDelete) {
		this.itemDelete = itemDelete;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public static String getConfirm() {
		return CONFIRM;
	}


}
