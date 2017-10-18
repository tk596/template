/**
 *
 */
package com.internousdev.template.dto;

import java.math.BigDecimal;

/**
 * @author internousdev
 *
 */
public class ItemViewDTO {

    /**
    * 商品ID
    */
   private int itemId;

   /**
    * 商品名
    */
   private String itemName;

   /**
    * カテゴリー
    */
   private String itemCategory;

   /**
    * カテゴリーID
    */
   private int categoryId;

   /**
    * カテゴリー名
    */
   private String category;

   /**
    * 価格
    */
   private  BigDecimal price;

   /**
    * 数量
    */
   private int quantities;

   /**
    * 詳細文
    */
   private String overview;


   /**
    * イメージパス
    */
   private String[] imagePath = { "" };


   /**
    * 在庫数
    */
   private int stock=0;


   /**
    * 注文数
    */
   private int orderCount;

   /**
    * 売り上げ
    */
   private  int sales;



   /**
    * アイテムリストから値を取得するためのインデックス番号
    */
   private int index;


   /**
    * 商品IDを取得するメソッド
    * @return itemId 商品ID
    */
   public int getItemId(){
       return itemId;
   }

   /**
    * 商品IDを格納するメソッド
    * @param itemId セットする 商品ID
    */
   public void setItemId(int itemId){
       this.itemId=itemId;
   }

   /**
    * 商品名を取得するメソッド
    * @return itemName 商品名
    */
   public String getItemName(){
       return itemName;
   }

   /**
    * 商品名を格納するメソッド
    * @param itemName セットする 商品名
    */
   public void setItemName(String itemName){
       this.itemName=itemName;
   }

   /**
    * カテゴリーを取得するメソッド
    * @return itemCategory 商品カテゴリー
    */
   public String getItemCategory(){
       return itemCategory;
   }

   /**
    * カテゴリーを格納するメソッド
    * @param itemCategory セットする 商品カテゴリー
    */
   public void setItemCategory(String itemCategory){
       this.itemCategory=itemCategory;
   }

   /**
    * カテゴリーIDを取得するメソッド
    * @return categoryId カテゴリーID
    */
   public int getCategoryId(){
       return categoryId;
   }

   /**
    * カテゴリーIDを格納するメソッド
    * @param categoryId セットする カテゴリーID
    */
   public void setCategoryId(int categoryId){
       this.categoryId=categoryId;
   }

   /**
    * カテゴリー名を取得するメソッド
    * @return categoryName カテゴリー名
    */
   public String getCategoryName(){
       return category;
   }

   /**
    * カテゴリー名を格納するメソッド
    * @param categoryName セットする カテゴリー名
    */
   public void setCategoryName(String categoryName){
       this.category=categoryName;
   }

   /**
    * 価格を取得するメソッド
    * @return price 価格
    */
   public  BigDecimal getPrice(){
       return price;
   }

   /**
    * 価格を格納するメソッド
    * @param price セットする 価格
    */
   public void setPrice( BigDecimal price){
       this.price=price;
   }

   /**
    * 数量を取得するメソッド
    * @return quentities 数量
    */
   public int getQuantities(){
       return quantities;
   }

   /**
    * 数量を格納するメソッド
    * @param quantities セットする 数量
    */
   public void setQuantities(int quantities){
       this.quantities= quantities;
   }

   /**
    * 詳細文を取得するメソッド
    * @return overview 詳細文
    */
   public String getOverview(){
       return overview;
   }

   /**
    * 詳細文を格納するメソッド
    * @param overview セットする 詳細文
    */
   public void setOverview(String overview){
       this.overview=overview;
   }


   /**
    * イメージパスを取得するメソッド
    * @return imagePath イメージパス
    */
   public String[] getImagePath() {
       return imagePath;
   }

   /**
    * イメージパスを格納するメソッド
    * @param imagePath セットする イメージパス
    */
   public void setImagePath(String[] imagePath) {
       this.imagePath = imagePath;
   }

   public void setImagePath(int num, String imagePath) {
       this.imagePath[num] = imagePath;
   }

   /**
    * 在庫数を取得するメソッド
    * @return stock 在庫数
    */
   public int getStock(){
       return stock;
   }

   /**
    * 在庫数を格納するメソッド
    * @param stock セットする 在庫数
    */
   public void setStock(int stock){
       this.stock=stock;
   }


   /**
    * アイテムリストから値を取得するためのインデックス番号を取得します。
    * @return アイテムリストから値を取得するためのインデックス番号
    */
   public int getIndex() {
       return index;
   }

   /**
    * アイテムリストから値を取得するためのインデックス番号を設定します。
    * @param index アイテムリストから値を取得するためのインデックス番号
    */
   public void setIndex(int index) {
       this.index = index;
   }

   /**
    * 注文数を取得するメソッド
    * @return orderCount 注文数
    */
   public int getOrderCount() {
       return orderCount;
   }

   /**
    * 注文数を格納するメソッド
    * @param orderCount セットする 注文数
    */
   public void setOrderCount(int orderCount) {
       this.orderCount = orderCount;
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
    * @param sales セットする 売上げ
    */
   public void setSales(int sales) {
       this.sales = sales;
   }



   }



