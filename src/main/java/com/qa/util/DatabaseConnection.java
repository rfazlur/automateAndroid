package com.qa.util;

import java.sql.*;
import java.util.ArrayList;
//
public class DatabaseConnection {

    public static Object getDataUsername(String query, String database) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Object username = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            switch (database) {
                case "prod":
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://103.58.100.148/utstag2015", "qaeng", "7y@#ER7654#$%7ytf~!@#$%^87y");
                    break;
                case "staging":
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://54.169.68.90/staging_fdbr_salon", "serverteam", "DDKW31Kr31");
                    break;
                default:
                    throw new Exception("No Database with that name");
            }

            stmt = (Statement) con.createStatement();
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                username = rs.getObject("username");
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

        return username;
    }


    public static String getDataBrandsArrayFirst(String query, String database) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Object output = null;
        String brandName = null;
        String brandName1 = null;
        String brandName2 = null;
        String brandName3 = null;
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

        brandName = docters.get(0).getProdId();
        brandName1 = docters.get(1).getProdId();
//          prnt = output.toString();

        return brandName;
    }

    public static String getDataProductArrayFirst(String query, String database) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Object output = null;
        String prodname = null;
        String prodname1 = null;
        String prodname2 = null;
        ArrayList<prodName> product_Name;
        product_Name = new ArrayList<prodName>();
        try {
            Class.forName("com.mysql.jdbc.Driver");

            switch (database) {
                case "prod":
                    con = (Connection) DriverManager.getConnection("jdbc:mysql://103.58.100.148/utstag2015", "qaeng", "7y@#ER7654#$%7ytf~!@#$%^87y");
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
                output = rs.getObject("prod_item");
                prodName pn = new prodName(output.toString());
                product_Name.add(pn);
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

        prodname = product_Name.get(0).getProdName();
        prodname1 = product_Name.get(1).getProdName();
        prodname2 = product_Name.get(2).getProdName();
//          prnt = output.toString();

        return prodname;
    }

}
