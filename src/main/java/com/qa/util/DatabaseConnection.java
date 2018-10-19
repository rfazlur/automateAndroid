package com.qa.util;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnection {

    public static String getDataAsArrayFirst(String query, String database) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Object output = null;
        String prnt = null;
        String prnt1 = null;
        String prnt2 = null;
        String prnt3 = null;
        ArrayList<prodItem> docters;
        docters = new ArrayList<prodItem>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            switch (database) {
                case "prod":
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://54.169.68.90/staging_fdbr_salon", "qaeng", "7y@#ER7654#$%7ytf~!@#$%^87y");
                    break;
                case "staging":
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://54.169.68.90/staging_fdbr_salon", "serverteam", "DDKW31Kr31");
                    break;
                default:
                    throw new Exception("No Database with that name");
            }

            stmt = (Statement) con.createStatement();
            rs = stmt.executeQuery(query);


            while (rs.next()) {
                output = rs.getObject("brands_item");
                prodItem pr = new prodItem(output.toString());
                docters.add(pr);
            }

        } catch (Exception e) {
            return "Error:" + e.getMessage();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        prnt = docters.get(0).getProdId();
        prnt1 = docters.get(1).getProdId();
//          prnt = output.toString();

        return prnt;
    }

}
