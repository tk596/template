package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.CartDTO;
import com.internousdev.template.util.DBConnector;



/**
 * カート遷移に関するDAOクラス
* @author nakajima takuya
* @since 2017/09/12
* @version 1.1
*/
public class GoCartDAO {
    /**
     * カート内の商品情報を取得しリストに格納するメソッド
     * @param userId ユーザーID
     * @return cartList カート内の商品情報を返す
     */
    public ArrayList<CartDTO> selectedItem(int userId) {

        DBConnector db = new DBConnector();
        Connection con = db.getConnection();
        ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

        String sql = "select * from carts where user_id=?";
        String select2 = "SELECT * FROM items WHERE item_id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CartDTO dto = new CartDTO();
                dto.setUserId(rs.getInt("user_id"));
                dto.setCartId(rs.getInt("cart_id"));
                dto.setItemId(rs.getInt("item_id"));
                dto.setQuantities(rs.getInt("quantities"));


                PreparedStatement ps2 = con.prepareStatement(select2);
                ps2.setInt(1, dto.getItemId());
                ResultSet rs2 = ps2.executeQuery();

                while (rs2.next()) {

                    dto.setItemName(rs2.getString("item_name"));
                    dto.setPrice(rs2.getFloat("price"));
                    dto.setStocks(rs2.getInt("stocks"));
                    dto.setSubtotal((int) (dto.getPrice() * dto.getQuantities()));
                }

                cartList.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return cartList;
    }
}
