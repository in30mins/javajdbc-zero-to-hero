package com.in30mins.deleteData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/javajdbc";
        String un = "root";
        String pw = "Harsha@1997!";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no ... ");
        int no = sc.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,un,pw);
        PreparedStatement ps = null;
        try {
            String sql="delete from db2 where no="+no;
            ps= con.prepareStatement(sql);
            ps.execute();
        }catch (SQLException e){
            System.out.println(e);
        }
        System.out.println("Successfully Deleted...");


    }
    //	public static void main(String[] args) {
//
//		String url = "jdbc:mysql://localhost:3306/javajdbc";
//		String username = "root";
//		String password = "Harsha@1997!";
//		String QUERY = "SELECT no,name,location FROM teacher";
//	      // Open a connection
//	      try(Connection conn = DriverManager.getConnection(url, username, password);
//	         Statement stmt = conn.createStatement();
//	      ) {
//	         String sql = "DELETE FROM teacher " +
//	            "WHERE no = 302";
//	         stmt.executeUpdate(sql);
//	         ResultSet rs = stmt.executeQuery(QUERY);
//	         while(rs.next()){
//	            //Display values
//	            System.out.print("ID: " + rs.getInt(1));
//	            System.out.print(", Age: " + rs.getString(2));
//	            System.out.print(", First: " + rs.getString(3));
//
//	         }
//	         rs.close();
//	      } catch (SQLException e) {
//	         e.printStackTrace();
//	      }
//	}
}
