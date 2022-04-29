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
//   String hostName = "5.1.182.21";
//   String sid = "pmkp";
//   String userName = "system";
//   String password = "dev";
//		<property name="hibernate.connection.url" value="jdbc:oracle:thin:@10.1.1.91:1521:VMDB01" />
//		<property name="hibernate.connection.username" value="DSOD" />
//		<property name="hibernate.connection.password" value="DSOD" />
//	 <!-- 			<property name="hibernate.connection.url" value="jdbc:oracle:thin:@10.8.1.32:1521:ftldb03" /> -->
//	 <!-- 			<property name="hibernate.connection.username" value="dsod" /> -->
//	 <!-- 			<property name="hibernate.connection.password" value="ora@it2013" /> -->
   String hostName = "10.1.1.91";
   String sid = "VMDB01";
   String userName = "DSOD";
   String password = "DSOD";
//	   String hostName = "10.8.1.32";
//	   String sid = "ftldb03";
//	   String userName = "dsod";
//	   String password = "ora@it2013";
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