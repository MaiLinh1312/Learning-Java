package ketnoidata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class OracleConnUtils {
 

 public static Connection getOracleConnection() throws SQLException,
         ClassNotFoundException {
//     String hostName = "10.15.1.22";
//     String sid = "FVNDB01";
//     String userName = "DSQC";
//     String password = "qup3ej03";
//     return getOracleConnection(hostName, sid, userName, password);
//     String hostName = "5.1.182.121";
//     String sid = "fvgsdb01";
//     String userName = "dsod";
//     String password = "dsod";
//     return getOracleConnection(hostName, sid, userName, password);
   String hostName = "5.1.182.21";
   String sid = "pmkp";
   String userName = "system";
   String password = "dev";
   return getOracleConnection(hostName, sid, userName, password);
 }
 
 public static Connection getOracleConnection(String hostName, String sid,
         String userName, String password) throws ClassNotFoundException,
         SQLException {
 
    
     Class.forName("oracle.jdbc.driver.OracleDriver");
 

     String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
 
     Connection conn = DriverManager.getConnection(connectionURL, userName,
             password);
     return conn;
 }
}