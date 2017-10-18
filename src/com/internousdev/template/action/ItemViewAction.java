package com.internousdev.template.action;
/**
 *
 */




import java.math.BigDecimal;
import java.util.ArrayList;

import com.internousdev.template.dao.ItemViewDAO;
import com.internousdev.template.dto.ItemViewDTO;
import com.opensymphony.xwork2.ActionSupport;

/**商品表示する為のアクション
 * @author kenya suzuki
 * @since 2017/09/19
 * @version 1.1
 *
 */
public class ItemViewAction extends ActionSupport {

	 /**
     * シリアルID
     */
    private static final long serialVersionUID = 8119766214351162676L;

	 /**
     * 商品ID
     */
    private int itemId;

    /**
     * 商品名
     */
    private String itemName;

    /**
     * 商品カテゴリー
     */
    private String category;

    /**
     * 価格
     */
    private  BigDecimal price;

    /**
     * 画像パス
     */
    private String imgAddress001;

    /**
     * サーチリスト
     */
    public ArrayList<ItemViewDTO> searchList=new ArrayList<ItemViewDTO>();


    /**
     * 実行メソッド
     * @return success or error
     */
    public String execute(){
        String result=ERROR;

        ItemViewDAO dao =new ItemViewDAO();

        searchList=dao.display(category);

        if(searchList.size()>0){
            result=SUCCESS;
            }
        return result;
        }


    /**
     * 商品IDを取得するメソッド
     * @return itemId 商品ID
     */
    public int getItemId() {
        return itemId;
        }

    /**
     * 商品IDを格納するメソッド
     * @param itemId 商品ID
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
        }

    /**
     * 商品名を取得するメソッド
     * @return itemName 商品名
     */
    public String getItemName() {
        return itemName;
        }

    /**
     * 商品名を格納するメソッド
     * @param itemName 商品名
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
        }

    /**
     * 商品カテゴリーを取得するメソッド
     * @return category 商品カテゴリー
     */
    public String getCategory() {
        return category;
        }

    /**
     * 商品カテゴリーを格納するメソッド
     * @param category 商品カテゴリー
     */
    public void setCategory(String category) {
        this.category = category;
        }

    /**
     * 価格を取得するメソッド
     * @return price 価格
     */
    public  BigDecimal getPrice() {
        return price;
        }

    /**
     * 価格を格納するメソッド
     * @param price 価格
     */
    public void setPrice( BigDecimal price) {
        this.price = price;
        }

    /**
     * 画像パスを取得するメソッド
     * @return imgAddress001 画像パス
     */
    public String getImgAddress001() {
        return imgAddress001;
        }

    /**
     * 画像パスを格納するメソッド
     * @param imgAddress001 画像パス
     */
    public void setImgAddress001(String imgAddress001) {
        this.imgAddress001 = imgAddress001;
        }

    /**
     * サーチリストを取得するメソッド
     * @return searchList サーチリスト
     */
    public ArrayList<ItemViewDTO> getSearchList() {
        return searchList;
        }

    /**
     * サーチリストを格納するメソッド
     * @param searchList サーチリスト
     */
    public void setSearchList(ArrayList<ItemViewDTO> searchList) {
        this.searchList = searchList;
        }


}
