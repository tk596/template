package com.internousdev.template.dto;

/**
 * 商品情報を格納するためのDTOクラス
 * @author REINA SATO
 * @since 2017/09/14
 * @version 1.1
 */

public class ItemDTO {

    /**
     * 商品ID
     */
    private int itemId;

    /**
     * 商品名
     */
    private String itemName;

    /**
     * カテゴリーID
     */
    private int categoryId;

    /**
     * 価格
     */
    private  int price;

    /**
     * 在庫数
     */
    private int stocks;

    /**
     * 売り上げ
     */
    private int sales;

    /**
     * 商品詳細
     */
    private String itemDetail;

    /**
     * デリートキー
     */
    private boolean isDeleted;

    /**
     *
     * 総数
     */
    private int quantities;


    /**
     * イメージパス
     */
    private String imagePath;


    /**
     * インデックス
     */
    private int index;

    private String errorMessage;

    /**
     * 商品IDを取得するメソッド
     * @return itemId 商品ID
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * 商品IDを格納するメソッド
     * @param itemId セットする 商品ID
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
     * @param itemName セットする 商品名
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * カテゴリーIDを取得するメソッド
     * @return categoryId カテゴリーID
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * カテゴリーIDを格納するメソッド
     * @param categoryId セットする カテゴリーID
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 価格を取得するメソッド
     * @return price 価格
     */
    public  int getPrice() {
        return price;
    }

    /**
     * 価格を格納するメソッド
     * @param price セットする 価格
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 在庫数を取得するメソッド
     * @return stocks 在庫数
     */
    public int getStocks() {
        return stocks;
    }

    /**
     * 在庫数を格納するメソッド
     * @param stocks セットする 在庫数
     */
    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    /**
     * 売り上げを取得するメソッド
     * @return sales 売り上げ
     */
    public int getSales() {
        return sales;
    }

    /**
     * 売り上げを格納するメソッド
     * @param sales セットする 売り上げ
     */
    public void setSales(int sales) {
        this.sales = sales;
    }

    /**
     * 商品詳細を取得するメソッド
     * @return itemDetail 商品詳細
     */
    public String getItemDetail() {
        return itemDetail;
    }

    /**
     * 商品詳細を格納するメソッド
     * @param itemDetail セットする 商品詳細
     */
    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }

    /**
     * デリートキーを取得するメソッド
     * @return isDeleted デリートキー
     */
    public boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * デリートキーを格納するメソッド
     * @param isDeleted セットする デリートキー
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * イメージパスを取得するメソッド
     * @return imagePath イメージパス
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * イメージパスを格納するメソッド
     * @param imagePath セットする イメージパス
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


    /**
     * インデックスを取得するメソッド
     * @return index インデックス
     */
    public int getIndex() {
        return index;
    }

    /**
     * インデックスを格納するメソッド
     * @param index セットする インデックス
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * 総数を取得するメソッド
     * @return quantities
     */
    public int getQuantities() {
        return quantities;
    }

    /**
     * 総数を格納するメソッド
     * @param quantities セットする quantities
     */
    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    /**
     * 総数を取得するメソッド
     * @return quantities
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 総数を格納するメソッド
     * @param quantities セットする quantities
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
