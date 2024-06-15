package com.in30mins.getData;

import java.sql.*;

public class GetClassData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/javajdbc";
        String un = "root";
        String pw = "Harsha@1997!";
        String query = "select * from db2";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,un,pw);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){
            System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
        }
        st.close();
        con.close();
    }
}
