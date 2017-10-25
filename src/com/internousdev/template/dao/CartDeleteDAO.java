package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;


/**
 * カートテーブル内情報の削除に関するクラス
 * @author nakajima takuya
 * @since 2017/09/12
 * @version 1.1
 */
public class CartDeleteDAO {

    /**
     * カート内の商品を削除するメソッド
     * @param userId ユーザーID
     * @param cartId カートID
     * @return delCount 削除する件数
     */

    public int delete(int userId, int cartId) {
        int delCount = 0;
        DBConnector db = new DBConnector();
        Connection con = db.getConnection();
        String sql1 = "select * from carts where user_id=? and cart_id=?";
        String sql2 = "delete from carts where user_id=? and cart_id=?";
        String sql3 = "update items set stocks=stocks+? where item_id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setInt(1, userId);
            ps.setInt(2, cartId);//System.out.println(ps.toString());//
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                int itemId=rs.getInt("item_id");
                int quantities=rs.getInt("quantities");
                ps.close();
                rs.close();
                ps = con.prepareStatement(sql2);
                ps.setInt(1, userId);
                ps.setInt(2, cartId);//System.out.println(ps.toString());//
                delCount = ps.executeUpdate();

                if(delCount>0){
                    ps.close();
                    rs.close();
                    ps = con.prepareStatement(sql3);
                    ps.setInt(1, quantities);
                    ps.setInt(2, itemId);
                    delCount = ps.executeUpdate();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return delCount;
    }

}