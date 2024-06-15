package com.in30mins.postData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/javajdbc";
        String un = "root";
        String pw = "Harsha@1997!";
        String query = "insert into db2 values(?,?,?)";

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter number ...");
        int no = sc.nextInt();

        System.out.println(" Enter Name ...");
        String name = sc.next();

        System.out.println("Enter Age ...");
        int age = sc.nextInt();

        Connection con = DriverManager.getConnection(url,un,pw);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,no);
        ps.setString(2,name);
        ps.setInt(3,age);

        int rs = ps.executeUpdate();
        System.out.println("succussfully added ...");
        ps.close();
        con.close();
    }
}
