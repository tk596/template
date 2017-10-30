package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.PaymentCompleteDAO;
import com.internousdev.template.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private ArrayList<CartDTO> CartList = new ArrayList<CartDTO>();

	public String result;

	/**
	 * 商品購入情報登録完了メソッド
	 *
	 * @author internous
	 */
	@SuppressWarnings({ "unchecked" })
	public String execute() {

		CartList = (ArrayList<CartDTO>) session.get("cartList");
		int CartSize = CartList.size();
		for (int i = 0; i < CartSize; i++) {
			int userId = CartList.get(i).getUserId();
			int itemId = CartList.get(i).getItemId();
			String itemName = CartList.get(i).getItemName();
			int count = CartList.get(i).getQuantities();
			int price = (int) CartList.get(i).getPrice();
			int totalPrice = count * price;
			String pay = (String) session.get("pay");
			try {
				PaymentCompleteDAO dao = new PaymentCompleteDAO();
				dao.buyItemInfo(userId, itemId, itemName, count, price, totalPrice, pay);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		for (int j = 0; j < CartSize; j++) {
			CartList.remove(0);
		}

		result = SUCCESS;
		return result;
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