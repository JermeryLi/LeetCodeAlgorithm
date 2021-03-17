package com.lining.another;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lining
 * @date 2021/3/15 14:44
 */
public class ConnectDemo {
    public boolean verifyPassword(String username, String password) {
        // getConnection（） 方法是个已有的方法可以获取到数据库连接 ，
        Connection con = getConnection();
        String sql = "select password from users where user_name = ? limit 1";
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean flag = false;
        try {
            pst = con.prepareStatement(sql);
            pst.setObject(1, username);
            rs = pst.executeQuery();
            while (rs.next()) {
                if (rs.getString("password").equals(password)) {
                    flag = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

    public Connection getConnection() {
        return null;
    }


}
