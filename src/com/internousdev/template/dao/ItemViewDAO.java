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

    ArrayList<ItemViewDTO> searchList=new ArrayList<ItemViewDTO>();




       private int numImgPath = 5;

       public ArrayList<ItemViewDTO> display(String category){
           DBConnector dbConnector = new DBConnector();
           Connection connection = dbConnector.getConnection();
           String sql="select * from items where category=? and  is_deleted=0";
           String sql2 = "select * from items_images where item_id=?";


           try{
               PreparedStatement ps= connection.prepareStatement(sql);
               ps.setString(1, category);
               ResultSet rs=ps.executeQuery();


               while (rs.next()) {

                   ItemViewDTO dto= new ItemViewDTO();
                   int itemViewId = rs.getInt("item_id");
                   dto.setItemId(itemViewId);
                   dto.setItemName(rs.getString("item_name"));
                   dto.setPrice(rs.getBigDecimal("price"));
                   //dto.setImgAddress001(rs.getString("img_path2"));
                   //searchList.add(dto);




               //rs.close();

               PreparedStatement ps2 = connection.prepareStatement(sql2);
               ps2.setInt(1, itemViewId);
               ResultSet rs2 = ps2.executeQuery();
               int count = 1;
               if (rs2.next()) {
                   while (count <= numImgPath && rs2.getString("img_path" + count) != null) {
                       dto.setImagePath(count - 1, rs2.getString("img_path" + count));
                       count++;
                   }
               }

               searchList.add(dto);


               }
           connection.close();
           }catch (SQLException e){
               e.printStackTrace();
               }
           return searchList;
           }

}
