//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.metlife.components.DatabaseUtility;

import com.metlife.components.Utilities.Create_TestNGXML;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class SQLServerConnection {
    Properties pro = new Properties();
    InputStream inputStream = null;
    public static int columnCount = 0;
    Connection conn = null;
    static Statement statement = null;
    static ResultSet reSet = null;
    public static int passCount = 0;
    public static int failCount = 0;
    Create_TestNGXML devicecon = new Create_TestNGXML();
    public static String SQL_userName = null;
    public static String SQL_password = null;
    public static String SQL_databaseName = null;
    public static String SQL_hostName = null;
    public static String SQL_port = null;

    SQLServerConnection() {
        Create_TestNGXML var10000 = this.devicecon;
        SQL_userName = Create_TestNGXML.getConfigData("SQLServerUserName");
        var10000 = this.devicecon;
        SQL_password = Create_TestNGXML.getConfigData("SQLServerPassword");
        var10000 = this.devicecon;
        SQL_hostName = Create_TestNGXML.getConfigData("SQLServerDatabaseName");
        var10000 = this.devicecon;
        SQL_databaseName = Create_TestNGXML.getConfigData("SQLServerHostName");
        var10000 = this.devicecon;
        SQL_port = Create_TestNGXML.getConfigData("SQLServerPort");
    }

    public void DBconnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://" + SQL_hostName + ":" + SQL_port + ";databaseName=" + SQL_databaseName + ";integratedSecurity=true";
            this.conn = DriverManager.getConnection(url);
            statement = this.conn.createStatement(1004, 1007);
        } catch (Exception var2) {
            System.err.println(var2.getMessage());
            var2.printStackTrace();
        }

    }

    public boolean executeQuery(String query) {
        boolean flag = false;

        try {
            reSet = statement.executeQuery(query);

            int rowCount;
            for(rowCount = 0; reSet.next(); ++rowCount) {
            }

            if (rowCount == 0) {
                flag = false;
                ++failCount;
            } else {
                flag = true;
                ++passCount;
            }

            System.out.println("Pass count -->" + passCount + " Fail count-->" + failCount);
        } catch (SQLException var4) {
            var4.printStackTrace();
        }

        return flag;
    }

    public void getColumnNameList(String query, String[] string) {
        try {
            reSet = statement.executeQuery(query);
            ResultSetMetaData rsmd = reSet.getMetaData();
            columnCount = rsmd.getColumnCount();
            System.out.println(columnCount);
            boolean flag = false;
            int i = 1;

            while(i <= columnCount) {
                String name = rsmd.getColumnName(i);
                int j = 0;

                while(true) {
                    if (j < string.length) {
                        if (!name.equalsIgnoreCase(string[j])) {
                            ++j;
                            continue;
                        }

                        flag = true;
                    }

                    if (flag) {
                        System.out.println("Colmun Name Matched in Database table and Flat file--" + name);
                        flag = false;
                    } else {
                        System.out.println("Colmun Name not Matched in Database table and Flat file--" + name);
                    }

                    ++i;
                    break;
                }
            }
        } catch (SQLException var8) {
            var8.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        SQLServerConnection db = new SQLServerConnection();
        db.DBconnection();
    }

    public static String getDBColCount(String query) {
        String dbColCount = null;

        try {
            reSet = statement.executeQuery(query);
            ResultSetMetaData rsmd = reSet.getMetaData();
            columnCount = rsmd.getColumnCount();
            System.out.println(columnCount);
            dbColCount = String.valueOf(columnCount);
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

        return dbColCount;
    }

    public static String getDBRowCount(String query) {
        String dbRowCount = null;

        try {
            reSet = statement.executeQuery(query);

            int rowCount;
            for(rowCount = 0; reSet.next(); ++rowCount) {
            }

            System.out.println(rowCount);
            dbRowCount = String.valueOf(rowCount);
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

        return dbRowCount;
    }

    public String[][] getDBData(String query) {
        try {
            reSet = statement.executeQuery(query);

            int row;
            for(row = 0; reSet.next(); ++row) {
            }

            ResultSetMetaData rsmd = reSet.getMetaData();
            int col = rsmd.getColumnCount();
            reSet.beforeFirst();
            String[][] dbData = new String[row][col];
            int i = 0;
            int j = 0;
            int k = 1;
            System.out.println("*************************************************************************************************");

            while(reSet.next()) {
                while(k <= col) {
                    dbData[i][j] = reSet.getString(k);
                    System.out.print(dbData[i][j] + "  ");
                    ++k;
                    ++j;
                }

                ++i;
                k = 1;
                j = 0;
                System.out.println("");
            }

            return dbData;
        } catch (SQLException var9) {
            var9.printStackTrace();
            return (String[][])null;
        }
    }
}
