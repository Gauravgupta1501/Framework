//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.metlife.components.DatabaseUtility;

import com.metlife.components.Utilities.Create_TestNGXML;

import java.sql.*;
import java.util.Properties;

public class OracleDBConnections {
    private static Connection conn = null;
    private static ResultSet rs;
    public static String OracleDB_userName = null;
    public static String OracleDB_password = null;
    public static String OracleDB_databaseName = null;
    public static String OracleDB_hostName = null;
    public static String OracleDB_port = null;

    public OracleDBConnections() {
        OracleDB_userName = Create_TestNGXML.getConfigData("OracleUserName");
        OracleDB_password = Create_TestNGXML.getConfigData("OraclePassword");
        OracleDB_hostName = Create_TestNGXML.getConfigData("OraclehostName");
        OracleDB_databaseName = Create_TestNGXML.getConfigData("OracledatabaseName");
        OracleDB_port = Create_TestNGXML.getConfigData("Oracleport");
    }

    public static Connection getConnectionOracle() throws InterruptedException {
        String url = "jdbc:oracle:thin:@//" + OracleDB_hostName + ":" + OracleDB_port + "/" + OracleDB_databaseName;

        try {
            Properties props = new Properties();
            props.setProperty("user", OracleDB_userName);
            props.setProperty("password", OracleDB_password);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(url, props);
            System.out.println("conn--->" + conn);
        } catch (Exception var3) {
            var3.printStackTrace();
            System.out.println("Exception OracleException " + var3.getMessage());
            System.out.println("Exception Caused By " + var3.getCause());
        }

        return OracleDBConnections.conn;
    }

    public static ResultSet ExecuteQuery(String DBQuery) throws SQLException, InterruptedException {
        try {
            System.out.println(conn);
            PreparedStatement preStatement = conn.prepareStatement(DBQuery);
            rs = preStatement.executeQuery();
            System.out.println(rs);
        } catch (SQLException var2) {
            System.out.println("SQLException " + var2.getMessage());
            System.out.println("Caused By " + var2.getCause());
        } catch (Exception var3) {
            System.out.println("Exception SQLException " + var3.getMessage());
            System.out.println("Exception Caused By " + var3.getCause());
        }

        return rs;
    }

    public static void closeConnection() throws InterruptedException {
        try {
            if (rs != null) {
                rs.close();
            }

            if (conn != null) {
                conn.close();
            }
        } catch (Exception var1) {
            var1.printStackTrace();
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:oracle:thin:@//USSISSQLD05/Actuarial:1632:DEVROOT32";
        String userName = "username";
        String password = "password";
        Properties props = new Properties();
        props.setProperty("user", userName);
        props.setProperty("password", password);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection(url, props);
        String sql = "select sysdate as current_day from dual";
        PreparedStatement preStatement = conn.prepareStatement(sql);
        ResultSet result = preStatement.executeQuery();

        while(result.next()) {
            System.out.println("Current Date from Oracle : " + result.getString("current_day"));
        }

        System.out.println("done");
    }
}
