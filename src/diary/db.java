package com.mycompany.diary;

import java.sql.*;


public class db{
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/farmersdiary", "root", "root");
            System.out.println("congrats, db con established!");
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("select * from farmer");

//            String str1, str2;
//
//            while(res.next()){
//                str1 = res.getString(1);
//                str2 = res.getString(2);
//                System.out.println(str1+" "+str2);
//            }
//            int c = 500;
//            String name = "UIU";
//            PreparedStatement stmt = conn.prepareStatement("delete from university where ucode = ?");
//            //stmt.setString(1, name);
//            stmt.setString(1, Integer.toString(c));
//            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println("Sorry, db con failed!");
        }

    }
}