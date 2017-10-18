/**
 *
 */
package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.ItemViewDTO;
import com.internousdev.template.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class ItemViewDAO {

    ArrayList<ItemViewDTO> searchList = new ArrayList<ItemViewDTO>();

    public ArrayList<ItemViewDTO> display(int categoryId) {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.getConnection();
        String sql = "select * from items where category_id=?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ItemViewDTO dto = new ItemViewDTO();
                dto.setItemId(rs.getInt("item_id"));
                dto.setItemName(rs.getString("item_name"));
                dto.setImagePath(rs.getString("img_path"));
                searchList.add(dto);
           }
            rs.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return searchList;
    }

}
