//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.metlife.components.DatabaseUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB2Connection {
    private static Connection conn = null;
    private static ResultSet rs;
    public static String DB2_userName = null;
    public static String DB2_password = null;
    public static String DB2_databaseName = null;
    public static String DB2_hostName = null;
    public static String DB2_port = null;

    public DB2Connection() {
        DB2_userName = "e6990ai";
        DB2_password = "Metnet13";
        DB2_hostName = "dbcsib01";
        DB2_databaseName = "n090dsn";
        DB2_port = "50006";
    }

    public static Connection getConnectionDB2() throws InterruptedException {
        String url = "jdbc:db2://" + DB2_hostName + ":" + DB2_port + "/" + DB2_databaseName;

        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            conn = DriverManager.getConnection(url, DB2_userName, DB2_password);
            System.out.println("conn--->" + conn);
        } catch (Exception var2) {
            var2.printStackTrace();
            System.out.println("Exception DB2Exception " + var2.getMessage());
            System.out.println("Exception Caused By " + var2.getCause());
        }

        return conn;
    }

    public static ResultSet ExecuteQuery(String DBQuery) throws SQLException, InterruptedException {
        try {
            System.out.println(conn);
            rs = conn.createStatement().executeQuery(DBQuery);
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

    public static void main(String[] args) {
        try {
            new DB2Connection();
            String query = "Select A.MASTER_ID, A.SEQUENCE_NUMBER, A.TRX_DATE, A.TRX_CODE, B.PAYMENT_AMOUNT From E0015DSP.TRXHX  A, E0015DSP.MAXXF B Where A.MASTER_ID = B.MASTER_ID AND A.SEQUENCE_NUMBER = B.SEQUENCE_NUMBER AND A.TRX_CODE = B.TRX_CODE AND A.MASTER_ID like '%1610031990' AND A.TRX_CODE IN ('NA') AND B.PAYMENT_AMOUNT > '0' UNION Select A.MASTER_ID, A.SEQUENCE_NUMBER, A.TRX_DATE, A.TRX_CODE, C.TRX_AMOUNT From E0015DSP.TRXHX  A, E0015DSP.TBXXF C Where A.MASTER_ID = C.MASTER_ID AND A.SEQUENCE_NUMBER = C.SEQUENCE_NUMBER AND A.TRX_CODE = C.TRX_CODE AND A.MASTER_ID like '%1610031990' AND A.TRX_CODE IN ('TB') AND C.TRX_AMOUNT > '0'";
            String DB2_AMP_query02 = "select A.master_id,A.servicing_agent from e0015dsp.contf A where trim(master_id)='";
            String DB2_AMP_query01 = "select A.PLAN_CODE,A.master_id,A.servicing_agent,B.Product_code  from e0015dsp.contf A,E0015DSP.FAN_PRODUCT_CODE_XREF B where A.Plan_code=B.Plan_code and  trim(master_id)='";
            getConnectionDB2();
            boolean flag = true;
            int i = 0;

            while(flag) {
                try {
                    ExecuteQuery(query);
                    System.out.println(rs + " --- " + rs);

                    while(rs.next()) {
                        System.out.println(rs.getInt(1));
                        int count = rs.getInt(1);
                        rs.getInt(1);
                        rs.getInt(2);
                        rs.getInt(3);
                        rs.getInt(4);
                        rs.getInt(5);
                    }
                } catch (NullPointerException var8) {
                    var8.printStackTrace();
                } catch (Exception var9) {
                    var9.printStackTrace();
                }

                ++i;
                if (i > 5) {
                    flag = false;
                }
            }

            closeConnection();
        } catch (NullPointerException var10) {
            var10.printStackTrace();
        } catch (Exception var11) {
            var11.printStackTrace();
        }

    }
}
