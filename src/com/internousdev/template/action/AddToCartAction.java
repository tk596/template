package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.AddToCartDAO;
import com.internousdev.template.dto.CartDTO;
import com.internousdev.template.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カートに商品を追加するアクションクラス
 *
 * @author nakajima takuya
 * @since 2017/09/12
 * @version 1.1
 */

public class AddToCartAction extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -616455276103431676L;
	/**
	 * カートID
	 */
	private int cartId;
	/**
	 * ユーザーID
	 */
	private int userId;
	/**
	 * 商品ID
	 */
	private int itemId;
	/**
	 * 商品名
	 */
	private String itemName;
	/**
	 * 単価
	 */
	private float price;
	/**
	 * 数量
	 */
	private int quantities;
	/**
	 * 在庫数
	 */
	private int stocks;

	/**
	 * 合計金額
	 */
	private int amountAll;

	/**
	 * カートへ商品追加処理をした件数
	 */
	private int addCount;
	/**
	 * カート情報
	 */
	private ArrayList<CartDTO> cartList;
	/**
	 * 商品情報
	 */
	private ArrayList<ItemDTO> itemStatus;
	/**
	 * セッション情報
	 */
	private Map<String, Object> session;

	/**
	 * カートに商品を追加する実行メソッド
	 *
	 * @author nakajima takuya
	 * @since 2017/09/12
	 * @version 1.0 実行メソッド 処理内容と順番 1：セッション情報を持っているか判断 2：購入数が在庫数を超えていないか判断
	 *          3：遷移元のitemId,itemName,price,quantity,
	 *          imgPathとsession内のuserIdを使用し、 カートへ指定商品を登録 4：カートへ登録された情報を取得
	 *          5：カート内の情報を元に購入商品の合計金額金額を算出
	 */
	public String execute() throws SQLException {

		String result = ERROR;

		if (session.containsKey("userId")) {
			if (quantities <= stocks) {
				userId = (int) session.get("userId");
				AddToCartDAO dao = new AddToCartDAO();
				itemStatus = dao.itemStatus(itemId);

				if (dao.addToCart(userId, itemId, quantities)) {
					return result;
				}
				cartList = dao.selected(userId);
				if (cartList.size() > 0) {
					for (int i = 0; i < cartList.size(); i++) {
						amountAll += (cartList.get(i).getPrice()) * (cartList.get(i).getQuantities());
					}
					result = SUCCESS;
				}
			} else {
				return ERROR;
			}
		} else {
			return LOGIN;
		}
		return result;
	}

	/**
	 * カートID取得メソッド
	 *
	 * @author nakajima takuya
	 * @return cartId カートID
	 */
	public int getCartId() {
		return cartId;
	}

	/**
	 * カートID格納メソッド
	 *
	 * @author nakajima takuya
	 * @param cartId
	 *            セットする cartID
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	/**
	 * ユーザーID取得メソッド
	 *
	 * @author nakajima takuya
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーID格納メソッド
	 *
	 * @author nakajima takuya
	 * @param userId
	 *            セットする userId
	 *
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 商品ID取得メソッド
	 *
	 * @author nakajima takuya
	 * @return itemId 商品ID
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品ID格納メソッド
	 *
	 * @author nakajima takuya
	 * @param itemId
	 *            セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * 商品名取得メソッド
	 *
	 * @author nakajima takuya
	 * @return itemName 商品名
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 商品名格納メソッド
	 *
	 * @author nakajima takuya
	 * @param itemName
	 *            セットする itemsName
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 単価取得メソッド
	 *
	 * @author nakajima takuya
	 * @return price 価格
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * 単価格納メソッド
	 *
	 * @author nakajima takuya
	 * @param price
	 *            セットする price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * 数量取得メソッド
	 *
	 * @author nakajima takuya
	 * @return quantities 購入数
	 */
	public int getQuantities() {
		return quantities;
	}

	/**
	 * 数量格納メソッド
	 *
	 * @author nakajima takuya
	 * @param quantities
	 *            購入数
	 */
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}

	/**
	 * 合計金額取得メソッド
	 *
	 * @author nakajima takuya
	 * @return amountAll 合計金額
	 */
	public int getAmountAll() {
		return amountAll;
	}

	/**
	 * 合計金額格納メソッド
	 *
	 * @author nakajima takuya
	 * @param amountAll
	 *            セットする amountAll
	 */
	public void setAmountAll(int amountAll) {
		this.amountAll = amountAll;
	}

	/**
	 * カートへ商品追加処理をした件数を取得するメソッド
	 *
	 * @author nakajima takuya
	 * @return addCount カートへ商品追加処理をした件数
	 */
	public int getAddCount() {
		return addCount;
	}

	/**
	 * カートへ商品追加処理をした件数を格納するメソッド
	 *
	 * @author nakajima takuya
	 * @param addCount
	 *            セットする addCount
	 */
	public void setAddcount(int addCount) {
		this.addCount = addCount;
	}

	/**
	 * カート情報を取得するメソッド
	 *
	 * @author nakajima takuya
	 * @return cartList カート情報
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カート情報を格納するメソッド
	 *
	 * @author nakajima takuya
	 * @param cartList
	 *            セットする cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * 商品情報を取得するメソッド
	 *
	 * @author nakajima takuya
	 * @return itemStatus 商品情報
	 */
	public ArrayList<ItemDTO> getItemStatus() {
		return itemStatus;
	}

	/**
	 * 商品情報を格納するメソッド
	 *
	 * @author nakajima takuya
	 * @param itemStatus
	 *            セットする itemStatus
	 */
	public void setItemStatus(ArrayList<ItemDTO> itemStatus) {
		this.itemStatus = itemStatus;
	}

	/**
	 * セッション操作用情報を取得するメソッド
	 *
	 * @author nakajima takuya
	 * @return session セッション情報
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 *
	 * @author nakajima takuya
	 * @param session
	 *            セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 在庫数を取得するメソッド
	 *
	 * @return stocks
	 */
	public int getStocks() {
		return stocks;
	}

	/**
	 * 在庫数を格納するメソッド
	 *
	 * @param stocks
	 *            セットする stocks
	 */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
}
