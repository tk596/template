package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.ItemDTO;
import com.internousdev.template.util.DBConnector;
/**
 * 商品詳細表示に関するDAOクラス
 * @author kenya suzuki
 * @since 2017/09/19
 * @version 1.1
 */
public class GoItemDetailDAO {
    public ArrayList<ItemDTO> searchList=new ArrayList<ItemDTO>();


    /**
     *商品IDで商品詳細を取得しリストに格納するメソッド
     * @throws SQLException SQLのエラー
     * @param itemId 商品ID
     * @return itemList 商品情報を返す
     */
    public ArrayList<ItemDTO> selectbyItem(int itemId)throws SQLException {
        DBConnector db = new DBConnector();
        Connection con = db.getConnection();
        PreparedStatement ps = null;
        ItemDTO dto = new ItemDTO();
        ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
        String sql;
        sql = "select * from items where item_id=?";

        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, itemId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                dto.setItemId(rs.getInt("item_id"));
                dto.setItemName(rs.getString("item_name"));
                dto.setPrice(rs.getInt("price"));
                dto.setStocks(rs.getInt("stocks"));
                dto.setItemDetail(rs.getString("item_detail").replace("\n","<br>"));
                dto.setImagePath(rs.getString("img_path"));
                itemList.add(dto);

                ps.close();

                ps.setInt(1, itemId);
                rs = ps.executeQuery();


                    }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null)
                ps.close();
            if (con != null)
                con.close();
        }
        return itemList;
    }
}
