package ketnoidata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//
public class InsertDB {
	static SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
	static Connection conn1 = null;
	static Connection conn = null;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		int a = 1;
//		int b = 1;
//		int c = 1;
//		int d = 1;
		int f = 1;
//		if (a > 0) {
//
//			Connection conn = null;
//			PreparedStatement ps = null;
//
//			ResultSet rs = null;
//			conn = ConnectionUtils.getMyConnection();
//
//			// BlackBox blackBox = new BlackBox();
//			String vID = "";
//			// vID = setID(conn);
//			String vTRY_KEY = "";
//			try {
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 WHERE TRY_KEY
//				// BETWEEN '202012280025' AND '202012280040' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 ORDER BY
//				// TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202102%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202012%' ORDER BY TRY_KEY";
//
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202012%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202101%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202102%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202103%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202104%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202105%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202106%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202107%' ORDER BY TRY_KEY";
////				String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like  '202108%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202109%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202110%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202111%' ORDER BY TRY_KEY";
//				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202112%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202201%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202202%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202203%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202204%' ORDER BY TRY_KEY";
//				// WHERE TRY_KEY BETWEEN '202012230000' AND '202012230020' ORDER
//				// BY
//				// TRY_KEY;
//				ps = conn.prepareStatement(sql01);
//				rs = ps.executeQuery();
//				int count = 0;
//				while (rs.next()) {
//					PreparedStatement ps1 = null;
//					ResultSet rs1 = null;
//					String sql02 = "SELECT * FROM DSPQM02 WHERE TRY_KEY = '" + rs.getString("TRY_KEY") + "'";
//					ps1 = conn.prepareStatement(sql02);
//					rs1 = ps1.executeQuery();
//
//					// conn.setAutoCommit(false);
//					// System.out.println("RB0001: "+rs1.getString("RB0001"));
//					if (rs1.next()) {
//						// inSertDSPQM02L(rs1.getString("TRY_KEY"),
//						// rs1.getString("OD_NO") == null ? "" :
//						// rs1.getString("OD_NO"), rs1.getString("FAC_ID"),
//						// rs1.getDate("CHECK_DATE")
//						// , rs1.getString("SH_ARITCLENO"),
//						// rs1.getString("SH_NO"),
//						// rs1.getString("CHECK_USER")== null ? "" :
//						// rs1.getString("CHECK_USER"),
//						// rs1.getString("TRY_REMARK")== null ? "" :
//						// rs1.getString("TRY_REMARK"),
//						// rs1.getString("OD_NO_MEMO") == null ? "" :
//						// rs1.getString("OD_NO_MEMO"),
//						// rs1.getString("UP_USER"),rs1.getString("UP_DATE").substring(0,
//						// 19), rs1.getString("RB_STATUS"),
//						// rs1.getString("PL_STATUS"),
//						// rs1.getString("IP_STATUS"),
//						// rs1.getString("DP_STATUS"),
//						// rs1.getString("PS_STATUS") == null ? "" :
//						// rs1.getString("PS_STATUS"));
//
//						// if(rs1.getString("RB_MAKE_QTY") != null &&
//						// !rs1.getString("RB_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "01",
//						// BlackBox.getValue(rs1.getString("RB_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("RB_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("RB_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("RB_BP")),
//						// BlackBox.getValue(rs1.getString("RB_SD")),
//						// rs1.getString("RB_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("PL_MAKE_QTY") != null &&
//						// !rs1.getString("PL_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "02",
//						// BlackBox.getValue(rs1.getString("PL_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("PL_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("PL_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("PL_BP")),
//						// BlackBox.getValue(rs1.getString("PL_SD")),
//						// rs1.getString("PL_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("IP_MAKE_QTY") != null &&
//						// !rs1.getString("IP_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "03",
//						// BlackBox.getValue(rs1.getString("IP_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("IP_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("IP_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("IP_BP")),
//						// BlackBox.getValue(rs1.getString("IP_SD")),
//						// rs1.getString("IP_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("DP_MAKE_QTY") != null &&
//						// !rs1.getString("DP_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "04",
//						// BlackBox.getValue(rs1.getString("DP_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("DP_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("DP_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("DP_BP")),
//						// BlackBox.getValue(rs1.getString("DP_SD")),
//						// rs1.getString("DP_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("PS_MAKE_QTY") != null &&
//						// !rs1.getString("PS_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "05",
//						// BlackBox.getValue(rs1.getString("PS_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("PS_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("PS_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("PS_BP")),
//						// BlackBox.getValue(rs1.getString("PS_SD")),
//						// rs1.getString("PS_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						//// rb
//						if (rs1.getString("RB0001") != null && !rs1.getString("RB0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0001",
//									BlackBox.getValue(rs1.getString("RB_BP0001")),
//									BlackBox.getValue(rs1.getString("RB_SD0001")), rs1.getString("RB0001"));
//						}
//
//						if (rs1.getString("RB0005") != null && !rs1.getString("RB0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0002",
//									BlackBox.getValue(rs1.getString("RB_BP0005")),
//									BlackBox.getValue(rs1.getString("RB_SD0005")), rs1.getString("RB0005"));
//						}
//						if (rs1.getString("RB0006") != null && !rs1.getString("RB0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0003",
//									BlackBox.getValue(rs1.getString("RB_BP0006")),
//									BlackBox.getValue(rs1.getString("RB_SD0006")), rs1.getString("RB0006"));
//						}
//						if (rs1.getString("RB0018") != null && !rs1.getString("RB0018").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0004",
//									BlackBox.getValue(rs1.getString("RB_BP0018")),
//									BlackBox.getValue(rs1.getString("RB_SD0018")), rs1.getString("RB0018"));
//						}
//						if (rs1.getString("RB0019") != null && !rs1.getString("RB0019").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0005",
//									BlackBox.getValue(rs1.getString("RB_BP0019")),
//									BlackBox.getValue(rs1.getString("RB_SD0019")), rs1.getString("RB0019"));
//						}
//						if (rs1.getString("RB0020") != null && !rs1.getString("RB0020").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0006",
//									BlackBox.getValue(rs1.getString("RB_BP0020")),
//									BlackBox.getValue(rs1.getString("RB_SD0020")), rs1.getString("RB0020"));
//						}
//						if (rs1.getString("RB0021") != null && !rs1.getString("RB0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0007",
//									BlackBox.getValue(rs1.getString("RB_BP0021")),
//									BlackBox.getValue(rs1.getString("RB_SD0021")), rs1.getString("RB0021"));
//						}
//						if (rs1.getString("RB0022") != null && !rs1.getString("RB0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0008",
//									BlackBox.getValue(rs1.getString("RB_BP0022")),
//									BlackBox.getValue(rs1.getString("RB_SD0022")), rs1.getString("RB0022"));
//						}
//						if (rs1.getString("RB0023") != null && !rs1.getString("RB0023").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0009",
//									BlackBox.getValue(rs1.getString("RB_BP0023")),
//									BlackBox.getValue(rs1.getString("RB_SD0023")), rs1.getString("RB0023"));
//						}
//						if (rs1.getString("RB0024") != null && !rs1.getString("RB0024").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0010",
//									BlackBox.getValue(rs1.getString("RB_BP0024")),
//									BlackBox.getValue(rs1.getString("RB_SD0024")), rs1.getString("RB0024"));
//						}
//
//						// pl
//						if (rs1.getString("PL0001") != null && !rs1.getString("PL0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0001",
//									BlackBox.getValue(rs1.getString("PL_BP0001")),
//									BlackBox.getValue(rs1.getString("PL_SD0001")), rs1.getString("PL0001"));
//						}
//
//						if (rs1.getString("PL0002") != null && !rs1.getString("PL0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0002",
//									BlackBox.getValue(rs1.getString("PL_BP0002")),
//									BlackBox.getValue(rs1.getString("PL_SD0002")), rs1.getString("PL0002"));
//						}
//						if (rs1.getString("PL0003") != null && !rs1.getString("PL0003").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0003",
//									BlackBox.getValue(rs1.getString("PL_BP0003")),
//									BlackBox.getValue(rs1.getString("PL_SD0003")), rs1.getString("PL0003"));
//						}
//						if (rs1.getString("PL0004") != null && !rs1.getString("PL0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0004",
//									BlackBox.getValue(rs1.getString("PL_BP0004")),
//									BlackBox.getValue(rs1.getString("PL_SD0004")), rs1.getString("PL0004"));
//						}
//						if (rs1.getString("PL0005") != null && !rs1.getString("PL0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0005",
//									BlackBox.getValue(rs1.getString("PL_BP0005")),
//									BlackBox.getValue(rs1.getString("PL_SD0005")), rs1.getString("PL0005"));
//						}
//						if (rs1.getString("PL0006") != null && !rs1.getString("PL0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0006",
//									BlackBox.getValue(rs1.getString("PL_BP0006")),
//									BlackBox.getValue(rs1.getString("PL_SD0006")), rs1.getString("PL0006"));
//						}
//						if (rs1.getString("PL0007") != null && !rs1.getString("PL0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0007",
//									BlackBox.getValue(rs1.getString("PL_BP0007")),
//									BlackBox.getValue(rs1.getString("PL_SD0007")), rs1.getString("PL0007"));
//						}
//						if (rs1.getString("PL0008") != null && !rs1.getString("PL0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0008",
//									BlackBox.getValue(rs1.getString("PL_BP0008")),
//									BlackBox.getValue(rs1.getString("PL_SD0008")), rs1.getString("PL0008"));
//						}
//						if (rs1.getString("PL0009") != null && !rs1.getString("PL0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0009",
//									BlackBox.getValue(rs1.getString("PL_BP0009")),
//									BlackBox.getValue(rs1.getString("PL_SD0009")), rs1.getString("PL0009"));
//						}
//						if (rs1.getString("PL0010") != null && !rs1.getString("PL0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0010",
//									BlackBox.getValue(rs1.getString("PL_BP0010")),
//									BlackBox.getValue(rs1.getString("PL_SD0010")), rs1.getString("PL0010"));
//
//						}
//						if (rs1.getString("PL0021") != null && !rs1.getString("PL0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0011",
//									BlackBox.getValue(rs1.getString("PL_BP0021")),
//									BlackBox.getValue(rs1.getString("PL_SD0021")), rs1.getString("PL0021"));
//
//						}
//						if (rs1.getString("PL0022") != null && !rs1.getString("PL0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0022",
//									BlackBox.getValue(rs1.getString("PL_BP0022")),
//									BlackBox.getValue(rs1.getString("PL_SD0022")), rs1.getString("PL0022"));
//
//						}
//						if (rs1.getString("PL0023") != null && !rs1.getString("PL0023").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0023",
//									BlackBox.getValue(rs1.getString("PL_BP0023")),
//									BlackBox.getValue(rs1.getString("PL_SD0023")), rs1.getString("PL0023"));
//
//						}
//						if (rs1.getString("PL0024") != null && !rs1.getString("PL0024").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0024",
//									BlackBox.getValue(rs1.getString("PL_BP0024")),
//									BlackBox.getValue(rs1.getString("PL_SD0024")), rs1.getString("PL0024"));
//
//						}
//						// pl
//						if (rs1.getString("IP0001") != null && !rs1.getString("IP0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0001",
//									BlackBox.getValue(rs1.getString("IP_BP0001")),
//									BlackBox.getValue(rs1.getString("IP_SD0001")), rs1.getString("IP0001"));
//						}
//
//						if (rs1.getString("IP0002") != null && !rs1.getString("IP0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0002",
//									BlackBox.getValue(rs1.getString("IP_BP0002")),
//									BlackBox.getValue(rs1.getString("IP_SD0002")), rs1.getString("IP0002"));
//						}
//						if (rs1.getString("IP0003") != null && !rs1.getString("IP0003").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0003",
//									BlackBox.getValue(rs1.getString("IP_BP0003")),
//									BlackBox.getValue(rs1.getString("IP_SD0003")), rs1.getString("IP0003"));
//						}
//						if (rs1.getString("IP0004") != null && !rs1.getString("IP0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0004",
//									BlackBox.getValue(rs1.getString("IP_BP0004")),
//									BlackBox.getValue(rs1.getString("IP_SD0004")), rs1.getString("IP0004"));
//						}
//						if (rs1.getString("IP0005") != null && !rs1.getString("IP0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0005",
//									BlackBox.getValue(rs1.getString("IP_BP0005")),
//									BlackBox.getValue(rs1.getString("IP_SD0005")), rs1.getString("IP0005"));
//						}
//						if (rs1.getString("IP0006") != null && !rs1.getString("IP0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0006",
//									BlackBox.getValue(rs1.getString("IP_BP0006")),
//									BlackBox.getValue(rs1.getString("IP_SD0006")), rs1.getString("IP0006"));
//						}
//						if (rs1.getString("IP0007") != null && !rs1.getString("IP0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0007",
//
//									BlackBox.getValue(rs1.getString("IP_BP0007")),
//									BlackBox.getValue(rs1.getString("IP_SD0007")), rs1.getString("IP0007"));
//						}
//						if (rs1.getString("IP0008") != null && !rs1.getString("IP0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0008",
//									BlackBox.getValue(rs1.getString("IP_BP0008")),
//									BlackBox.getValue(rs1.getString("IP_SD0008")), rs1.getString("IP0008"));
//						}
//						if (rs1.getString("IP0009") != null && !rs1.getString("IP0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0009",
//									BlackBox.getValue(rs1.getString("IP_BP0009")),
//									BlackBox.getValue(rs1.getString("IP_SD0009")), rs1.getString("IP0009"));
//						}
//						if (rs1.getString("IP0010") != null && !rs1.getString("IP0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0010",
//									BlackBox.getValue(rs1.getString("IP_BP0010")),
//									BlackBox.getValue(rs1.getString("IP_SD0010")), rs1.getString("IP0010"));
//
//						}
//						if (rs1.getString("IP0021") != null && !rs1.getString("IP0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0011",
//									BlackBox.getValue(rs1.getString("IP_BP0021")),
//									BlackBox.getValue(rs1.getString("IP_SD0021")), rs1.getString("IP0021"));
//
//						}
//						if (rs1.getString("IP0022") != null && !rs1.getString("IP0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0022",
//									BlackBox.getValue(rs1.getString("IP_BP0022")),
//									BlackBox.getValue(rs1.getString("IP_SD0022")), rs1.getString("IP0022"));
//
//						}
//						// dp
//						if (rs1.getString("DP0001") != null && !rs1.getString("DP0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0001",
//									BlackBox.getValue(rs1.getString("DP_BP0001")),
//									BlackBox.getValue(rs1.getString("DP_SD0001")), rs1.getString("DP0001"));
//						}
//
//						if (rs1.getString("DP0002") != null && !rs1.getString("DP0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0002",
//									BlackBox.getValue(rs1.getString("DP_BP0002")),
//									BlackBox.getValue(rs1.getString("DP_SD0002")), rs1.getString("DP0002"));
//						}
//						if (rs1.getString("DP0004") != null && !rs1.getString("DP0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0003",
//									BlackBox.getValue(rs1.getString("DP_BP0004")),
//									BlackBox.getValue(rs1.getString("DP_SD0004")), rs1.getString("DP0004"));
//						}
//						if (rs1.getString("DP0006") != null && !rs1.getString("DP0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0004",
//									BlackBox.getValue(rs1.getString("DP_BP0006")),
//									BlackBox.getValue(rs1.getString("DP_SD0006")), rs1.getString("DP0006"));
//						}
//						if (rs1.getString("DP0007") != null && !rs1.getString("DP0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0005",
//									BlackBox.getValue(rs1.getString("DP_BP0007")),
//									BlackBox.getValue(rs1.getString("DP_SD0007")), rs1.getString("DP0007"));
//						}
//						if (rs1.getString("DP0008") != null && !rs1.getString("DP0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0006",
//									BlackBox.getValue(rs1.getString("DP_BP0008")),
//									BlackBox.getValue(rs1.getString("DP_SD0008")), rs1.getString("DP0008"));
//						}
//						if (rs1.getString("DP0009") != null && !rs1.getString("DP0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0007",
//									BlackBox.getValue(rs1.getString("DP_BP0009")),
//									BlackBox.getValue(rs1.getString("DP_SD0009")), rs1.getString("DP0009"));
//						}
//						if (rs1.getString("DP0010") != null && !rs1.getString("DP0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0008",
//									BlackBox.getValue(rs1.getString("DP_BP0010")),
//									BlackBox.getValue(rs1.getString("DP_SD0010")), rs1.getString("DP0010"));
//
//						}
//						if (rs1.getString("DP0011") != null && !rs1.getString("DP0011").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0009",
//									BlackBox.getValue(rs1.getString("DP_BP0011")),
//									BlackBox.getValue(rs1.getString("DP_SD0011")), rs1.getString("DP0011"));
//
//						}
//						if (rs1.getString("DP0012") != null && !rs1.getString("DP0012").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0010",
//									BlackBox.getValue(rs1.getString("DP_BP0012")),
//									BlackBox.getValue(rs1.getString("DP_SD0012")), rs1.getString("DP0012"));
//
//						}
//						if (rs1.getString("DP0021") != null && !rs1.getString("DP0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0011",
//									BlackBox.getValue(rs1.getString("DP_BP0021")),
//									BlackBox.getValue(rs1.getString("DP_SD0021")), rs1.getString("DP0021"));
//
//						}
//						// ps
//						if (rs1.getString("PS0008") != null && !rs1.getString("PS0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0001",
//									BlackBox.getValue(rs1.getString("PS_BP0008")),
//									BlackBox.getValue(rs1.getString("PS_SD0008")), rs1.getString("PS0008"));
//						}
//
//						if (rs1.getString("PS0013") != null && !rs1.getString("PS0013").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0002",
//									BlackBox.getValue(rs1.getString("PS_BP0013")),
//									BlackBox.getValue(rs1.getString("PS_SD0013")), rs1.getString("PS0013"));
//						}
//						if (rs1.getString("PS0014") != null && !rs1.getString("PS0014").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0003",
//									BlackBox.getValue(rs1.getString("PS_BP0014")),
//									BlackBox.getValue(rs1.getString("PS_SD0014")), rs1.getString("PS0014"));
//						}
//						if (rs1.getString("PS0015") != null && !rs1.getString("PS0015").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0004",
//									BlackBox.getValue(rs1.getString("PS_BP0015")),
//									BlackBox.getValue(rs1.getString("PS_SD0015")), rs1.getString("PS0015"));
//						}
//						if (rs1.getString("PS0016") != null && !rs1.getString("PS0016").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0005",
//									BlackBox.getValue(rs1.getString("PS_BP0016")),
//									BlackBox.getValue(rs1.getString("PS_SD0016")), rs1.getString("PS0016"));
//						}
//						if (rs1.getString("PS0017") != null && !rs1.getString("PS0017").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0006",
//									BlackBox.getValue(rs1.getString("PS_BP0017")),
//									BlackBox.getValue(rs1.getString("PS_SD0017")), rs1.getString("PS0017"));
//						}
//						if (rs1.getString("PS0021") != null && !rs1.getString("PS0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0007",
//									BlackBox.getValue(rs1.getString("PS_BP0021")),
//									BlackBox.getValue(rs1.getString("PS_SD0021")), rs1.getString("PS0021"));
//						}
//						if (rs1.getString("PS0022") != null && !rs1.getString("PS0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0008",
//									BlackBox.getValue(rs1.getString("PS_BP0022")),
//									BlackBox.getValue(rs1.getString("PS_SD0022")), rs1.getString("PS0022"));
//
//						}
//						// conn1.close();
//
//					}
//					ps1.close();
//					rs1.close();
//
//					count++;
//					System.out.println(count);
//				}
//
//				ps.close();
//				rs.close();
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				try {
//					if (ps != null) {
//						ps.close();
//					}
//					if (rs != null) {
//						rs.close();
//					}
//					conn.close();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				e.printStackTrace();
//
//			}
//		}

//		if (b > 0) {
//
//
//			Connection conn = null;
//			PreparedStatement ps = null;
//
//			ResultSet rs = null;
//			conn = ConnectionUtils.getMyConnection();
//
//			// BlackBox blackBox = new BlackBox();
//			String vID = "";
//			// vID = setID(conn);
//			String vTRY_KEY = "";
//			try {
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 WHERE TRY_KEY
//				// BETWEEN '202012280025' AND '202012280040' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 ORDER BY
//				// TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202102%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202012%' ORDER BY TRY_KEY";
//
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202012%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202101%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202102%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202103%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202104%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202105%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202106%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202107%' ORDER BY TRY_KEY";
////				String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like  '202108%' ORDER BY TRY_KEY";
////				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202109%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202110%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202111%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202112%' ORDER BY TRY_KEY";
//				 String sql01 = "SELECT TRY_KEY FROM DSPQM02";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202202%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202203%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202204%' ORDER BY TRY_KEY";
//				// WHERE TRY_KEY BETWEEN '202012230000' AND '202012230020' ORDER
//				// BY
//				// TRY_KEY;
//				ps = conn.prepareStatement(sql01);
//				rs = ps.executeQuery();
//				int count = 0;
//				while (rs.next()) {
//					PreparedStatement ps1 = null;
//					ResultSet rs1 = null;
//					String sql02 = "SELECT * FROM DSPQM02 WHERE TRY_KEY = '" + rs.getString("TRY_KEY") + "'";
//					ps1 = conn.prepareStatement(sql02);
//					rs1 = ps1.executeQuery();
//
//					// conn.setAutoCommit(false);
//					// System.out.println("RB0001: "+rs1.getString("RB0001"));
//					if (rs1.next()) {
//						// inSertDSPQM02L(rs1.getString("TRY_KEY"),
//						// rs1.getString("OD_NO") == null ? "" :
//						// rs1.getString("OD_NO"), rs1.getString("FAC_ID"),
//						// rs1.getDate("CHECK_DATE")
//						// , rs1.getString("SH_ARITCLENO"),
//						// rs1.getString("SH_NO"),
//						// rs1.getString("CHECK_USER")== null ? "" :
//						// rs1.getString("CHECK_USER"),
//						// rs1.getString("TRY_REMARK")== null ? "" :
//						// rs1.getString("TRY_REMARK"),
//						// rs1.getString("OD_NO_MEMO") == null ? "" :
//						// rs1.getString("OD_NO_MEMO"),
//						// rs1.getString("UP_USER"),rs1.getString("UP_DATE").substring(0,
//						// 19), rs1.getString("RB_STATUS"),
//						// rs1.getString("PL_STATUS"),
//						// rs1.getString("IP_STATUS"),
//						// rs1.getString("DP_STATUS"),
//						// rs1.getString("PS_STATUS") == null ? "" :
//						// rs1.getString("PS_STATUS"));
//
//						// if(rs1.getString("RB_MAKE_QTY") != null &&
//						// !rs1.getString("RB_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "01",
//						// BlackBox.getValue(rs1.getString("RB_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("RB_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("RB_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("RB_BP")),
//						// BlackBox.getValue(rs1.getString("RB_SD")),
//						// rs1.getString("RB_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("PL_MAKE_QTY") != null &&
//						// !rs1.getString("PL_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "02",
//						// BlackBox.getValue(rs1.getString("PL_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("PL_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("PL_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("PL_BP")),
//						// BlackBox.getValue(rs1.getString("PL_SD")),
//						// rs1.getString("PL_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("IP_MAKE_QTY") != null &&
//						// !rs1.getString("IP_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "03",
//						// BlackBox.getValue(rs1.getString("IP_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("IP_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("IP_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("IP_BP")),
//						// BlackBox.getValue(rs1.getString("IP_SD")),
//						// rs1.getString("IP_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("DP_MAKE_QTY") != null &&
//						// !rs1.getString("DP_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "04",
//						// BlackBox.getValue(rs1.getString("DP_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("DP_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("DP_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("DP_BP")),
//						// BlackBox.getValue(rs1.getString("DP_SD")),
//						// rs1.getString("DP_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("PS_MAKE_QTY") != null &&
//						// !rs1.getString("PS_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "05",
//						// BlackBox.getValue(rs1.getString("PS_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("PS_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("PS_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("PS_BP")),
//						// BlackBox.getValue(rs1.getString("PS_SD")),
//						// rs1.getString("PS_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						//// rb
//						if (rs1.getString("RB0001") != null && !rs1.getString("RB0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0001",
//									BlackBox.getValue(rs1.getString("RB_BP0001")),
//									BlackBox.getValue(rs1.getString("RB_SD0001")), rs1.getString("RB0001"));
//						}
//
//						if (rs1.getString("RB0005") != null && !rs1.getString("RB0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0002",
//									BlackBox.getValue(rs1.getString("RB_BP0005")),
//									BlackBox.getValue(rs1.getString("RB_SD0005")), rs1.getString("RB0005"));
//						}
//						if (rs1.getString("RB0006") != null && !rs1.getString("RB0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0003",
//									BlackBox.getValue(rs1.getString("RB_BP0006")),
//									BlackBox.getValue(rs1.getString("RB_SD0006")), rs1.getString("RB0006"));
//						}
//						if (rs1.getString("RB0018") != null && !rs1.getString("RB0018").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0004",
//									BlackBox.getValue(rs1.getString("RB_BP0018")),
//									BlackBox.getValue(rs1.getString("RB_SD0018")), rs1.getString("RB0018"));
//						}
//						if (rs1.getString("RB0019") != null && !rs1.getString("RB0019").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0005",
//									BlackBox.getValue(rs1.getString("RB_BP0019")),
//									BlackBox.getValue(rs1.getString("RB_SD0019")), rs1.getString("RB0019"));
//						}
//						if (rs1.getString("RB0020") != null && !rs1.getString("RB0020").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0006",
//									BlackBox.getValue(rs1.getString("RB_BP0020")),
//									BlackBox.getValue(rs1.getString("RB_SD0020")), rs1.getString("RB0020"));
//						}
//						if (rs1.getString("RB0021") != null && !rs1.getString("RB0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0007",
//									BlackBox.getValue(rs1.getString("RB_BP0021")),
//									BlackBox.getValue(rs1.getString("RB_SD0021")), rs1.getString("RB0021"));
//						}
//						if (rs1.getString("RB0022") != null && !rs1.getString("RB0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0008",
//									BlackBox.getValue(rs1.getString("RB_BP0022")),
//									BlackBox.getValue(rs1.getString("RB_SD0022")), rs1.getString("RB0022"));
//						}
//						if (rs1.getString("RB0023") != null && !rs1.getString("RB0023").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0009",
//									BlackBox.getValue(rs1.getString("RB_BP0023")),
//									BlackBox.getValue(rs1.getString("RB_SD0023")), rs1.getString("RB0023"));
//						}
//						if (rs1.getString("RB0024") != null && !rs1.getString("RB0024").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0010",
//									BlackBox.getValue(rs1.getString("RB_BP0024")),
//									BlackBox.getValue(rs1.getString("RB_SD0024")), rs1.getString("RB0024"));
//						}
//
//						// pl
//						if (rs1.getString("PL0001") != null && !rs1.getString("PL0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0001",
//									BlackBox.getValue(rs1.getString("PL_BP0001")),
//									BlackBox.getValue(rs1.getString("PL_SD0001")), rs1.getString("PL0001"));
//						}
//
//						if (rs1.getString("PL0002") != null && !rs1.getString("PL0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0002",
//									BlackBox.getValue(rs1.getString("PL_BP0002")),
//									BlackBox.getValue(rs1.getString("PL_SD0002")), rs1.getString("PL0002"));
//						}
//						if (rs1.getString("PL0003") != null && !rs1.getString("PL0003").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0003",
//									BlackBox.getValue(rs1.getString("PL_BP0003")),
//									BlackBox.getValue(rs1.getString("PL_SD0003")), rs1.getString("PL0003"));
//						}
//						if (rs1.getString("PL0004") != null && !rs1.getString("PL0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0004",
//									BlackBox.getValue(rs1.getString("PL_BP0004")),
//									BlackBox.getValue(rs1.getString("PL_SD0004")), rs1.getString("PL0004"));
//						}
//						if (rs1.getString("PL0005") != null && !rs1.getString("PL0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0005",
//									BlackBox.getValue(rs1.getString("PL_BP0005")),
//									BlackBox.getValue(rs1.getString("PL_SD0005")), rs1.getString("PL0005"));
//						}
//						if (rs1.getString("PL0006") != null && !rs1.getString("PL0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0006",
//									BlackBox.getValue(rs1.getString("PL_BP0006")),
//									BlackBox.getValue(rs1.getString("PL_SD0006")), rs1.getString("PL0006"));
//						}
//						if (rs1.getString("PL0007") != null && !rs1.getString("PL0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0007",
//									BlackBox.getValue(rs1.getString("PL_BP0007")),
//									BlackBox.getValue(rs1.getString("PL_SD0007")), rs1.getString("PL0007"));
//						}
//						if (rs1.getString("PL0008") != null && !rs1.getString("PL0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0008",
//									BlackBox.getValue(rs1.getString("PL_BP0008")),
//									BlackBox.getValue(rs1.getString("PL_SD0008")), rs1.getString("PL0008"));
//						}
//						if (rs1.getString("PL0009") != null && !rs1.getString("PL0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0009",
//									BlackBox.getValue(rs1.getString("PL_BP0009")),
//									BlackBox.getValue(rs1.getString("PL_SD0009")), rs1.getString("PL0009"));
//						}
//						if (rs1.getString("PL0010") != null && !rs1.getString("PL0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0010",
//									BlackBox.getValue(rs1.getString("PL_BP0010")),
//									BlackBox.getValue(rs1.getString("PL_SD0010")), rs1.getString("PL0010"));
//
//						}
//						if (rs1.getString("PL0021") != null && !rs1.getString("PL0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0011",
//									BlackBox.getValue(rs1.getString("PL_BP0021")),
//									BlackBox.getValue(rs1.getString("PL_SD0021")), rs1.getString("PL0021"));
//
//						}
//						if (rs1.getString("PL0022") != null && !rs1.getString("PL0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0022",
//									BlackBox.getValue(rs1.getString("PL_BP0022")),
//									BlackBox.getValue(rs1.getString("PL_SD0022")), rs1.getString("PL0022"));
//
//						}
//						if (rs1.getString("PL0023") != null && !rs1.getString("PL0023").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0023",
//									BlackBox.getValue(rs1.getString("PL_BP0023")),
//									BlackBox.getValue(rs1.getString("PL_SD0023")), rs1.getString("PL0023"));
//
//						}
//						if (rs1.getString("PL0024") != null && !rs1.getString("PL0024").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0024",
//									BlackBox.getValue(rs1.getString("PL_BP0024")),
//									BlackBox.getValue(rs1.getString("PL_SD0024")), rs1.getString("PL0024"));
//
//						}
//						// pl
//						if (rs1.getString("IP0001") != null && !rs1.getString("IP0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0001",
//									BlackBox.getValue(rs1.getString("IP_BP0001")),
//									BlackBox.getValue(rs1.getString("IP_SD0001")), rs1.getString("IP0001"));
//						}
//
//						if (rs1.getString("IP0002") != null && !rs1.getString("IP0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0002",
//									BlackBox.getValue(rs1.getString("IP_BP0002")),
//									BlackBox.getValue(rs1.getString("IP_SD0002")), rs1.getString("IP0002"));
//						}
//						if (rs1.getString("IP0003") != null && !rs1.getString("IP0003").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0003",
//									BlackBox.getValue(rs1.getString("IP_BP0003")),
//									BlackBox.getValue(rs1.getString("IP_SD0003")), rs1.getString("IP0003"));
//						}
//						if (rs1.getString("IP0004") != null && !rs1.getString("IP0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0004",
//									BlackBox.getValue(rs1.getString("IP_BP0004")),
//									BlackBox.getValue(rs1.getString("IP_SD0004")), rs1.getString("IP0004"));
//						}
//						if (rs1.getString("IP0005") != null && !rs1.getString("IP0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0005",
//									BlackBox.getValue(rs1.getString("IP_BP0005")),
//									BlackBox.getValue(rs1.getString("IP_SD0005")), rs1.getString("IP0005"));
//						}
//						if (rs1.getString("IP0006") != null && !rs1.getString("IP0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0006",
//									BlackBox.getValue(rs1.getString("IP_BP0006")),
//									BlackBox.getValue(rs1.getString("IP_SD0006")), rs1.getString("IP0006"));
//						}
//						if (rs1.getString("IP0007") != null && !rs1.getString("IP0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0007",
//
//									BlackBox.getValue(rs1.getString("IP_BP0007")),
//									BlackBox.getValue(rs1.getString("IP_SD0007")), rs1.getString("IP0007"));
//						}
//						if (rs1.getString("IP0008") != null && !rs1.getString("IP0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0008",
//									BlackBox.getValue(rs1.getString("IP_BP0008")),
//									BlackBox.getValue(rs1.getString("IP_SD0008")), rs1.getString("IP0008"));
//						}
//						if (rs1.getString("IP0009") != null && !rs1.getString("IP0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0009",
//									BlackBox.getValue(rs1.getString("IP_BP0009")),
//									BlackBox.getValue(rs1.getString("IP_SD0009")), rs1.getString("IP0009"));
//						}
//						if (rs1.getString("IP0010") != null && !rs1.getString("IP0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0010",
//									BlackBox.getValue(rs1.getString("IP_BP0010")),
//									BlackBox.getValue(rs1.getString("IP_SD0010")), rs1.getString("IP0010"));
//
//						}
//						if (rs1.getString("IP0021") != null && !rs1.getString("IP0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0011",
//									BlackBox.getValue(rs1.getString("IP_BP0021")),
//									BlackBox.getValue(rs1.getString("IP_SD0021")), rs1.getString("IP0021"));
//
//						}
//						if (rs1.getString("IP0022") != null && !rs1.getString("IP0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0022",
//									BlackBox.getValue(rs1.getString("IP_BP0022")),
//									BlackBox.getValue(rs1.getString("IP_SD0022")), rs1.getString("IP0022"));
//
//						}
//						// dp
//						if (rs1.getString("DP0001") != null && !rs1.getString("DP0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0001",
//									BlackBox.getValue(rs1.getString("DP_BP0001")),
//									BlackBox.getValue(rs1.getString("DP_SD0001")), rs1.getString("DP0001"));
//						}
//
//						if (rs1.getString("DP0002") != null && !rs1.getString("DP0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0002",
//									BlackBox.getValue(rs1.getString("DP_BP0002")),
//									BlackBox.getValue(rs1.getString("DP_SD0002")), rs1.getString("DP0002"));
//						}
//						if (rs1.getString("DP0004") != null && !rs1.getString("DP0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0003",
//									BlackBox.getValue(rs1.getString("DP_BP0004")),
//									BlackBox.getValue(rs1.getString("DP_SD0004")), rs1.getString("DP0004"));
//						}
//						if (rs1.getString("DP0006") != null && !rs1.getString("DP0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0004",
//									BlackBox.getValue(rs1.getString("DP_BP0006")),
//									BlackBox.getValue(rs1.getString("DP_SD0006")), rs1.getString("DP0006"));
//						}
//						if (rs1.getString("DP0007") != null && !rs1.getString("DP0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0005",
//									BlackBox.getValue(rs1.getString("DP_BP0007")),
//									BlackBox.getValue(rs1.getString("DP_SD0007")), rs1.getString("DP0007"));
//						}
//						if (rs1.getString("DP0008") != null && !rs1.getString("DP0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0006",
//									BlackBox.getValue(rs1.getString("DP_BP0008")),
//									BlackBox.getValue(rs1.getString("DP_SD0008")), rs1.getString("DP0008"));
//						}
//						if (rs1.getString("DP0009") != null && !rs1.getString("DP0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0007",
//									BlackBox.getValue(rs1.getString("DP_BP0009")),
//									BlackBox.getValue(rs1.getString("DP_SD0009")), rs1.getString("DP0009"));
//						}
//						if (rs1.getString("DP0010") != null && !rs1.getString("DP0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0008",
//									BlackBox.getValue(rs1.getString("DP_BP0010")),
//									BlackBox.getValue(rs1.getString("DP_SD0010")), rs1.getString("DP0010"));
//
//						}
//						if (rs1.getString("DP0011") != null && !rs1.getString("DP0011").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0009",
//									BlackBox.getValue(rs1.getString("DP_BP0011")),
//									BlackBox.getValue(rs1.getString("DP_SD0011")), rs1.getString("DP0011"));
//
//						}
//						if (rs1.getString("DP0012") != null && !rs1.getString("DP0012").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0010",
//									BlackBox.getValue(rs1.getString("DP_BP0012")),
//									BlackBox.getValue(rs1.getString("DP_SD0012")), rs1.getString("DP0012"));
//
//						}
//						if (rs1.getString("DP0021") != null && !rs1.getString("DP0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0011",
//									BlackBox.getValue(rs1.getString("DP_BP0021")),
//									BlackBox.getValue(rs1.getString("DP_SD0021")), rs1.getString("DP0021"));
//
//						}
//						// ps
//						if (rs1.getString("PS0008") != null && !rs1.getString("PS0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0001",
//									BlackBox.getValue(rs1.getString("PS_BP0008")),
//									BlackBox.getValue(rs1.getString("PS_SD0008")), rs1.getString("PS0008"));
//						}
//
//						if (rs1.getString("PS0013") != null && !rs1.getString("PS0013").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0002",
//									BlackBox.getValue(rs1.getString("PS_BP0013")),
//									BlackBox.getValue(rs1.getString("PS_SD0013")), rs1.getString("PS0013"));
//						}
//						if (rs1.getString("PS0014") != null && !rs1.getString("PS0014").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0003",
//									BlackBox.getValue(rs1.getString("PS_BP0014")),
//									BlackBox.getValue(rs1.getString("PS_SD0014")), rs1.getString("PS0014"));
//						}
//						if (rs1.getString("PS0015") != null && !rs1.getString("PS0015").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0004",
//									BlackBox.getValue(rs1.getString("PS_BP0015")),
//									BlackBox.getValue(rs1.getString("PS_SD0015")), rs1.getString("PS0015"));
//						}
//						if (rs1.getString("PS0016") != null && !rs1.getString("PS0016").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0005",
//									BlackBox.getValue(rs1.getString("PS_BP0016")),
//									BlackBox.getValue(rs1.getString("PS_SD0016")), rs1.getString("PS0016"));
//						}
//						if (rs1.getString("PS0017") != null && !rs1.getString("PS0017").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0006",
//									BlackBox.getValue(rs1.getString("PS_BP0017")),
//									BlackBox.getValue(rs1.getString("PS_SD0017")), rs1.getString("PS0017"));
//						}
//						if (rs1.getString("PS0021") != null && !rs1.getString("PS0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0007",
//									BlackBox.getValue(rs1.getString("PS_BP0021")),
//									BlackBox.getValue(rs1.getString("PS_SD0021")), rs1.getString("PS0021"));
//						}
//						if (rs1.getString("PS0022") != null && !rs1.getString("PS0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0008",
//									BlackBox.getValue(rs1.getString("PS_BP0022")),
//									BlackBox.getValue(rs1.getString("PS_SD0022")), rs1.getString("PS0022"));
//
//						}
//						// conn1.close();
//
//					}
//					ps1.close();
//					rs1.close();
//
//					count++;
//					System.out.println(count);
//				}
//
//				ps.close();
//				rs.close();
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				try {
//					if (ps != null) {
//						ps.close();
//					}
//					if (rs != null) {
//						rs.close();
//					}
//					conn.close();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				e.printStackTrace();
//
//			}
//		
//		}
//		if (c > 0) {
//
//
//			Connection conn = null;
//			PreparedStatement ps = null;
//
//			ResultSet rs = null;
//			conn = ConnectionUtils.getMyConnection();
//
//			// BlackBox blackBox = new BlackBox();
//			String vID = "";
//			// vID = setID(conn);
//			String vTRY_KEY = "";
//			try {
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 WHERE TRY_KEY
//				// BETWEEN '202012280025' AND '202012280040' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 ORDER BY
//				// TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202102%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202012%' ORDER BY TRY_KEY";
//
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202012%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202101%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202102%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202103%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202104%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202105%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202106%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202107%' ORDER BY TRY_KEY";
////				String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like  '202108%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202109%' ORDER BY TRY_KEY";
////				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202110%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202111%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202112%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202201%' ORDER BY TRY_KEY";
//				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202202%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202203%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202204%' ORDER BY TRY_KEY";
//				// WHERE TRY_KEY BETWEEN '202012230000' AND '202012230020' ORDER
//				// BY
//				// TRY_KEY;
//				ps = conn.prepareStatement(sql01);
//				rs = ps.executeQuery();
//				int count = 0;
//				while (rs.next()) {
//					PreparedStatement ps1 = null;
//					ResultSet rs1 = null;
//					String sql02 = "SELECT * FROM DSPQM02 WHERE TRY_KEY = '" + rs.getString("TRY_KEY") + "'";
//					ps1 = conn.prepareStatement(sql02);
//					rs1 = ps1.executeQuery();
//
//					// conn.setAutoCommit(false);
//					// System.out.println("RB0001: "+rs1.getString("RB0001"));
//					if (rs1.next()) {
//						// inSertDSPQM02L(rs1.getString("TRY_KEY"),
//						// rs1.getString("OD_NO") == null ? "" :
//						// rs1.getString("OD_NO"), rs1.getString("FAC_ID"),
//						// rs1.getDate("CHECK_DATE")
//						// , rs1.getString("SH_ARITCLENO"),
//						// rs1.getString("SH_NO"),
//						// rs1.getString("CHECK_USER")== null ? "" :
//						// rs1.getString("CHECK_USER"),
//						// rs1.getString("TRY_REMARK")== null ? "" :
//						// rs1.getString("TRY_REMARK"),
//						// rs1.getString("OD_NO_MEMO") == null ? "" :
//						// rs1.getString("OD_NO_MEMO"),
//						// rs1.getString("UP_USER"),rs1.getString("UP_DATE").substring(0,
//						// 19), rs1.getString("RB_STATUS"),
//						// rs1.getString("PL_STATUS"),
//						// rs1.getString("IP_STATUS"),
//						// rs1.getString("DP_STATUS"),
//						// rs1.getString("PS_STATUS") == null ? "" :
//						// rs1.getString("PS_STATUS"));
//
//						// if(rs1.getString("RB_MAKE_QTY") != null &&
//						// !rs1.getString("RB_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "01",
//						// BlackBox.getValue(rs1.getString("RB_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("RB_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("RB_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("RB_BP")),
//						// BlackBox.getValue(rs1.getString("RB_SD")),
//						// rs1.getString("RB_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("PL_MAKE_QTY") != null &&
//						// !rs1.getString("PL_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "02",
//						// BlackBox.getValue(rs1.getString("PL_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("PL_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("PL_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("PL_BP")),
//						// BlackBox.getValue(rs1.getString("PL_SD")),
//						// rs1.getString("PL_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("IP_MAKE_QTY") != null &&
//						// !rs1.getString("IP_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "03",
//						// BlackBox.getValue(rs1.getString("IP_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("IP_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("IP_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("IP_BP")),
//						// BlackBox.getValue(rs1.getString("IP_SD")),
//						// rs1.getString("IP_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("DP_MAKE_QTY") != null &&
//						// !rs1.getString("DP_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "04",
//						// BlackBox.getValue(rs1.getString("DP_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("DP_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("DP_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("DP_BP")),
//						// BlackBox.getValue(rs1.getString("DP_SD")),
//						// rs1.getString("DP_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("PS_MAKE_QTY") != null &&
//						// !rs1.getString("PS_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "05",
//						// BlackBox.getValue(rs1.getString("PS_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("PS_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("PS_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("PS_BP")),
//						// BlackBox.getValue(rs1.getString("PS_SD")),
//						// rs1.getString("PS_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						//// rb
//						if (rs1.getString("RB0001") != null && !rs1.getString("RB0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0001",
//									BlackBox.getValue(rs1.getString("RB_BP0001")),
//									BlackBox.getValue(rs1.getString("RB_SD0001")), rs1.getString("RB0001"));
//						}
//
//						if (rs1.getString("RB0005") != null && !rs1.getString("RB0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0002",
//									BlackBox.getValue(rs1.getString("RB_BP0005")),
//									BlackBox.getValue(rs1.getString("RB_SD0005")), rs1.getString("RB0005"));
//						}
//						if (rs1.getString("RB0006") != null && !rs1.getString("RB0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0003",
//									BlackBox.getValue(rs1.getString("RB_BP0006")),
//									BlackBox.getValue(rs1.getString("RB_SD0006")), rs1.getString("RB0006"));
//						}
//						if (rs1.getString("RB0018") != null && !rs1.getString("RB0018").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0004",
//									BlackBox.getValue(rs1.getString("RB_BP0018")),
//									BlackBox.getValue(rs1.getString("RB_SD0018")), rs1.getString("RB0018"));
//						}
//						if (rs1.getString("RB0019") != null && !rs1.getString("RB0019").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0005",
//									BlackBox.getValue(rs1.getString("RB_BP0019")),
//									BlackBox.getValue(rs1.getString("RB_SD0019")), rs1.getString("RB0019"));
//						}
//						if (rs1.getString("RB0020") != null && !rs1.getString("RB0020").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0006",
//									BlackBox.getValue(rs1.getString("RB_BP0020")),
//									BlackBox.getValue(rs1.getString("RB_SD0020")), rs1.getString("RB0020"));
//						}
//						if (rs1.getString("RB0021") != null && !rs1.getString("RB0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0007",
//									BlackBox.getValue(rs1.getString("RB_BP0021")),
//									BlackBox.getValue(rs1.getString("RB_SD0021")), rs1.getString("RB0021"));
//						}
//						if (rs1.getString("RB0022") != null && !rs1.getString("RB0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0008",
//									BlackBox.getValue(rs1.getString("RB_BP0022")),
//									BlackBox.getValue(rs1.getString("RB_SD0022")), rs1.getString("RB0022"));
//						}
//						if (rs1.getString("RB0023") != null && !rs1.getString("RB0023").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0009",
//									BlackBox.getValue(rs1.getString("RB_BP0023")),
//									BlackBox.getValue(rs1.getString("RB_SD0023")), rs1.getString("RB0023"));
//						}
//						if (rs1.getString("RB0024") != null && !rs1.getString("RB0024").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0010",
//									BlackBox.getValue(rs1.getString("RB_BP0024")),
//									BlackBox.getValue(rs1.getString("RB_SD0024")), rs1.getString("RB0024"));
//						}
//
//						// pl
//						if (rs1.getString("PL0001") != null && !rs1.getString("PL0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0001",
//									BlackBox.getValue(rs1.getString("PL_BP0001")),
//									BlackBox.getValue(rs1.getString("PL_SD0001")), rs1.getString("PL0001"));
//						}
//
//						if (rs1.getString("PL0002") != null && !rs1.getString("PL0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0002",
//									BlackBox.getValue(rs1.getString("PL_BP0002")),
//									BlackBox.getValue(rs1.getString("PL_SD0002")), rs1.getString("PL0002"));
//						}
//						if (rs1.getString("PL0003") != null && !rs1.getString("PL0003").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0003",
//									BlackBox.getValue(rs1.getString("PL_BP0003")),
//									BlackBox.getValue(rs1.getString("PL_SD0003")), rs1.getString("PL0003"));
//						}
//						if (rs1.getString("PL0004") != null && !rs1.getString("PL0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0004",
//									BlackBox.getValue(rs1.getString("PL_BP0004")),
//									BlackBox.getValue(rs1.getString("PL_SD0004")), rs1.getString("PL0004"));
//						}
//						if (rs1.getString("PL0005") != null && !rs1.getString("PL0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0005",
//									BlackBox.getValue(rs1.getString("PL_BP0005")),
//									BlackBox.getValue(rs1.getString("PL_SD0005")), rs1.getString("PL0005"));
//						}
//						if (rs1.getString("PL0006") != null && !rs1.getString("PL0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0006",
//									BlackBox.getValue(rs1.getString("PL_BP0006")),
//									BlackBox.getValue(rs1.getString("PL_SD0006")), rs1.getString("PL0006"));
//						}
//						if (rs1.getString("PL0007") != null && !rs1.getString("PL0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0007",
//									BlackBox.getValue(rs1.getString("PL_BP0007")),
//									BlackBox.getValue(rs1.getString("PL_SD0007")), rs1.getString("PL0007"));
//						}
//						if (rs1.getString("PL0008") != null && !rs1.getString("PL0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0008",
//									BlackBox.getValue(rs1.getString("PL_BP0008")),
//									BlackBox.getValue(rs1.getString("PL_SD0008")), rs1.getString("PL0008"));
//						}
//						if (rs1.getString("PL0009") != null && !rs1.getString("PL0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0009",
//									BlackBox.getValue(rs1.getString("PL_BP0009")),
//									BlackBox.getValue(rs1.getString("PL_SD0009")), rs1.getString("PL0009"));
//						}
//						if (rs1.getString("PL0010") != null && !rs1.getString("PL0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0010",
//									BlackBox.getValue(rs1.getString("PL_BP0010")),
//									BlackBox.getValue(rs1.getString("PL_SD0010")), rs1.getString("PL0010"));
//
//						}
//						if (rs1.getString("PL0021") != null && !rs1.getString("PL0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0011",
//									BlackBox.getValue(rs1.getString("PL_BP0021")),
//									BlackBox.getValue(rs1.getString("PL_SD0021")), rs1.getString("PL0021"));
//
//						}
//						if (rs1.getString("PL0022") != null && !rs1.getString("PL0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0022",
//									BlackBox.getValue(rs1.getString("PL_BP0022")),
//									BlackBox.getValue(rs1.getString("PL_SD0022")), rs1.getString("PL0022"));
//
//						}
//						if (rs1.getString("PL0023") != null && !rs1.getString("PL0023").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0023",
//									BlackBox.getValue(rs1.getString("PL_BP0023")),
//									BlackBox.getValue(rs1.getString("PL_SD0023")), rs1.getString("PL0023"));
//
//						}
//						if (rs1.getString("PL0024") != null && !rs1.getString("PL0024").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0024",
//									BlackBox.getValue(rs1.getString("PL_BP0024")),
//									BlackBox.getValue(rs1.getString("PL_SD0024")), rs1.getString("PL0024"));
//
//						}
//						// pl
//						if (rs1.getString("IP0001") != null && !rs1.getString("IP0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0001",
//									BlackBox.getValue(rs1.getString("IP_BP0001")),
//									BlackBox.getValue(rs1.getString("IP_SD0001")), rs1.getString("IP0001"));
//						}
//
//						if (rs1.getString("IP0002") != null && !rs1.getString("IP0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0002",
//									BlackBox.getValue(rs1.getString("IP_BP0002")),
//									BlackBox.getValue(rs1.getString("IP_SD0002")), rs1.getString("IP0002"));
//						}
//						if (rs1.getString("IP0003") != null && !rs1.getString("IP0003").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0003",
//									BlackBox.getValue(rs1.getString("IP_BP0003")),
//									BlackBox.getValue(rs1.getString("IP_SD0003")), rs1.getString("IP0003"));
//						}
//						if (rs1.getString("IP0004") != null && !rs1.getString("IP0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0004",
//									BlackBox.getValue(rs1.getString("IP_BP0004")),
//									BlackBox.getValue(rs1.getString("IP_SD0004")), rs1.getString("IP0004"));
//						}
//						if (rs1.getString("IP0005") != null && !rs1.getString("IP0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0005",
//									BlackBox.getValue(rs1.getString("IP_BP0005")),
//									BlackBox.getValue(rs1.getString("IP_SD0005")), rs1.getString("IP0005"));
//						}
//						if (rs1.getString("IP0006") != null && !rs1.getString("IP0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0006",
//									BlackBox.getValue(rs1.getString("IP_BP0006")),
//									BlackBox.getValue(rs1.getString("IP_SD0006")), rs1.getString("IP0006"));
//						}
//						if (rs1.getString("IP0007") != null && !rs1.getString("IP0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0007",
//
//									BlackBox.getValue(rs1.getString("IP_BP0007")),
//									BlackBox.getValue(rs1.getString("IP_SD0007")), rs1.getString("IP0007"));
//						}
//						if (rs1.getString("IP0008") != null && !rs1.getString("IP0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0008",
//									BlackBox.getValue(rs1.getString("IP_BP0008")),
//									BlackBox.getValue(rs1.getString("IP_SD0008")), rs1.getString("IP0008"));
//						}
//						if (rs1.getString("IP0009") != null && !rs1.getString("IP0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0009",
//									BlackBox.getValue(rs1.getString("IP_BP0009")),
//									BlackBox.getValue(rs1.getString("IP_SD0009")), rs1.getString("IP0009"));
//						}
//						if (rs1.getString("IP0010") != null && !rs1.getString("IP0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0010",
//									BlackBox.getValue(rs1.getString("IP_BP0010")),
//									BlackBox.getValue(rs1.getString("IP_SD0010")), rs1.getString("IP0010"));
//
//						}
//						if (rs1.getString("IP0021") != null && !rs1.getString("IP0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0011",
//									BlackBox.getValue(rs1.getString("IP_BP0021")),
//									BlackBox.getValue(rs1.getString("IP_SD0021")), rs1.getString("IP0021"));
//
//						}
//						if (rs1.getString("IP0022") != null && !rs1.getString("IP0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0022",
//									BlackBox.getValue(rs1.getString("IP_BP0022")),
//									BlackBox.getValue(rs1.getString("IP_SD0022")), rs1.getString("IP0022"));
//
//						}
//						// dp
//						if (rs1.getString("DP0001") != null && !rs1.getString("DP0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0001",
//									BlackBox.getValue(rs1.getString("DP_BP0001")),
//									BlackBox.getValue(rs1.getString("DP_SD0001")), rs1.getString("DP0001"));
//						}
//
//						if (rs1.getString("DP0002") != null && !rs1.getString("DP0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0002",
//									BlackBox.getValue(rs1.getString("DP_BP0002")),
//									BlackBox.getValue(rs1.getString("DP_SD0002")), rs1.getString("DP0002"));
//						}
//						if (rs1.getString("DP0004") != null && !rs1.getString("DP0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0003",
//									BlackBox.getValue(rs1.getString("DP_BP0004")),
//									BlackBox.getValue(rs1.getString("DP_SD0004")), rs1.getString("DP0004"));
//						}
//						if (rs1.getString("DP0006") != null && !rs1.getString("DP0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0004",
//									BlackBox.getValue(rs1.getString("DP_BP0006")),
//									BlackBox.getValue(rs1.getString("DP_SD0006")), rs1.getString("DP0006"));
//						}
//						if (rs1.getString("DP0007") != null && !rs1.getString("DP0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0005",
//									BlackBox.getValue(rs1.getString("DP_BP0007")),
//									BlackBox.getValue(rs1.getString("DP_SD0007")), rs1.getString("DP0007"));
//						}
//						if (rs1.getString("DP0008") != null && !rs1.getString("DP0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0006",
//									BlackBox.getValue(rs1.getString("DP_BP0008")),
//									BlackBox.getValue(rs1.getString("DP_SD0008")), rs1.getString("DP0008"));
//						}
//						if (rs1.getString("DP0009") != null && !rs1.getString("DP0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0007",
//									BlackBox.getValue(rs1.getString("DP_BP0009")),
//									BlackBox.getValue(rs1.getString("DP_SD0009")), rs1.getString("DP0009"));
//						}
//						if (rs1.getString("DP0010") != null && !rs1.getString("DP0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0008",
//									BlackBox.getValue(rs1.getString("DP_BP0010")),
//									BlackBox.getValue(rs1.getString("DP_SD0010")), rs1.getString("DP0010"));
//
//						}
//						if (rs1.getString("DP0011") != null && !rs1.getString("DP0011").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0009",
//									BlackBox.getValue(rs1.getString("DP_BP0011")),
//									BlackBox.getValue(rs1.getString("DP_SD0011")), rs1.getString("DP0011"));
//
//						}
//						if (rs1.getString("DP0012") != null && !rs1.getString("DP0012").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0010",
//									BlackBox.getValue(rs1.getString("DP_BP0012")),
//									BlackBox.getValue(rs1.getString("DP_SD0012")), rs1.getString("DP0012"));
//
//						}
//						if (rs1.getString("DP0021") != null && !rs1.getString("DP0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0011",
//									BlackBox.getValue(rs1.getString("DP_BP0021")),
//									BlackBox.getValue(rs1.getString("DP_SD0021")), rs1.getString("DP0021"));
//
//						}
//						// ps
//						if (rs1.getString("PS0008") != null && !rs1.getString("PS0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0001",
//									BlackBox.getValue(rs1.getString("PS_BP0008")),
//									BlackBox.getValue(rs1.getString("PS_SD0008")), rs1.getString("PS0008"));
//						}
//
//						if (rs1.getString("PS0013") != null && !rs1.getString("PS0013").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0002",
//									BlackBox.getValue(rs1.getString("PS_BP0013")),
//									BlackBox.getValue(rs1.getString("PS_SD0013")), rs1.getString("PS0013"));
//						}
//						if (rs1.getString("PS0014") != null && !rs1.getString("PS0014").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0003",
//									BlackBox.getValue(rs1.getString("PS_BP0014")),
//									BlackBox.getValue(rs1.getString("PS_SD0014")), rs1.getString("PS0014"));
//						}
//						if (rs1.getString("PS0015") != null && !rs1.getString("PS0015").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0004",
//									BlackBox.getValue(rs1.getString("PS_BP0015")),
//									BlackBox.getValue(rs1.getString("PS_SD0015")), rs1.getString("PS0015"));
//						}
//						if (rs1.getString("PS0016") != null && !rs1.getString("PS0016").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0005",
//									BlackBox.getValue(rs1.getString("PS_BP0016")),
//									BlackBox.getValue(rs1.getString("PS_SD0016")), rs1.getString("PS0016"));
//						}
//						if (rs1.getString("PS0017") != null && !rs1.getString("PS0017").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0006",
//									BlackBox.getValue(rs1.getString("PS_BP0017")),
//									BlackBox.getValue(rs1.getString("PS_SD0017")), rs1.getString("PS0017"));
//						}
//						if (rs1.getString("PS0021") != null && !rs1.getString("PS0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0007",
//									BlackBox.getValue(rs1.getString("PS_BP0021")),
//									BlackBox.getValue(rs1.getString("PS_SD0021")), rs1.getString("PS0021"));
//						}
//						if (rs1.getString("PS0022") != null && !rs1.getString("PS0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0008",
//									BlackBox.getValue(rs1.getString("PS_BP0022")),
//									BlackBox.getValue(rs1.getString("PS_SD0022")), rs1.getString("PS0022"));
//
//						}
//						// conn1.close();
//
//					}
//					ps1.close();
//					rs1.close();
//
//					count++;
//					System.out.println(count);
//				}
//
//				ps.close();
//				rs.close();
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				try {
//					if (ps != null) {
//						ps.close();
//					}
//					if (rs != null) {
//						rs.close();
//					}
//					conn.close();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				e.printStackTrace();
//
//			}
//		
//		}
//		if(d >0 ){
//
//
//
//			Connection conn = null;
//			PreparedStatement ps = null;
//
//			ResultSet rs = null;
//			conn = ConnectionUtils.getMyConnection();
//
//			// BlackBox blackBox = new BlackBox();
//			String vID = "";
//			// vID = setID(conn);
//			String vTRY_KEY = "";
//			try {
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 WHERE TRY_KEY
//				// BETWEEN '202012280025' AND '202012280040' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 ORDER BY
//				// TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202102%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202012%' ORDER BY TRY_KEY";
//
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202012%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202101%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202102%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202103%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202104%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202105%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202106%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202107%' ORDER BY TRY_KEY";
////				String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like  '202108%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202109%' ORDER BY TRY_KEY";
////				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202110%' ORDER BY TRY_KEY";
////				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202111%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202112%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202201%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202202%' ORDER BY TRY_KEY";
//				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202203%' ORDER BY TRY_KEY";
//				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
//				// like '202204%' ORDER BY TRY_KEY";
//				// WHERE TRY_KEY BETWEEN '202012230000' AND '202012230020' ORDER
//				// BY
//				// TRY_KEY;
//				ps = conn.prepareStatement(sql01);
//				rs = ps.executeQuery();
//				int count = 0;
//				while (rs.next()) {
//					PreparedStatement ps1 = null;
//					ResultSet rs1 = null;
//					String sql02 = "SELECT * FROM DSPQM02 WHERE TRY_KEY = '" + rs.getString("TRY_KEY") + "'";
//					ps1 = conn.prepareStatement(sql02);
//					rs1 = ps1.executeQuery();
//
//					// conn.setAutoCommit(false);
//					// System.out.println("RB0001: "+rs1.getString("RB0001"));
//					if (rs1.next()) {
//						// inSertDSPQM02L(rs1.getString("TRY_KEY"),
//						// rs1.getString("OD_NO") == null ? "" :
//						// rs1.getString("OD_NO"), rs1.getString("FAC_ID"),
//						// rs1.getDate("CHECK_DATE")
//						// , rs1.getString("SH_ARITCLENO"),
//						// rs1.getString("SH_NO"),
//						// rs1.getString("CHECK_USER")== null ? "" :
//						// rs1.getString("CHECK_USER"),
//						// rs1.getString("TRY_REMARK")== null ? "" :
//						// rs1.getString("TRY_REMARK"),
//						// rs1.getString("OD_NO_MEMO") == null ? "" :
//						// rs1.getString("OD_NO_MEMO"),
//						// rs1.getString("UP_USER"),rs1.getString("UP_DATE").substring(0,
//						// 19), rs1.getString("RB_STATUS"),
//						// rs1.getString("PL_STATUS"),
//						// rs1.getString("IP_STATUS"),
//						// rs1.getString("DP_STATUS"),
//						// rs1.getString("PS_STATUS") == null ? "" :
//						// rs1.getString("PS_STATUS"));
//
//						// if(rs1.getString("RB_MAKE_QTY") != null &&
//						// !rs1.getString("RB_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "01",
//						// BlackBox.getValue(rs1.getString("RB_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("RB_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("RB_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("RB_BP")),
//						// BlackBox.getValue(rs1.getString("RB_SD")),
//						// rs1.getString("RB_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("PL_MAKE_QTY") != null &&
//						// !rs1.getString("PL_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "02",
//						// BlackBox.getValue(rs1.getString("PL_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("PL_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("PL_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("PL_BP")),
//						// BlackBox.getValue(rs1.getString("PL_SD")),
//						// rs1.getString("PL_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("IP_MAKE_QTY") != null &&
//						// !rs1.getString("IP_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "03",
//						// BlackBox.getValue(rs1.getString("IP_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("IP_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("IP_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("IP_BP")),
//						// BlackBox.getValue(rs1.getString("IP_SD")),
//						// rs1.getString("IP_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("DP_MAKE_QTY") != null &&
//						// !rs1.getString("DP_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "04",
//						// BlackBox.getValue(rs1.getString("DP_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("DP_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("DP_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("DP_BP")),
//						// BlackBox.getValue(rs1.getString("DP_SD")),
//						// rs1.getString("DP_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						// if(rs1.getString("PS_MAKE_QTY") != null &&
//						// !rs1.getString("PS_MAKE_QTY").equals("")){
//						// insertDSPQM01(rs1.getString("TRY_KEY"), "05",
//						// BlackBox.getValue(rs1.getString("PS_DEPT_CONFIRM")),
//						// BlackBox.getValue(rs1.getString("PS_MAKE_QTY")),
//						// BlackBox.getValue(rs1.getString("PS_BAD_QTY")),
//						// BlackBox.getValue(rs1.getString("PS_BP")),
//						// BlackBox.getValue(rs1.getString("PS_SD")),
//						// rs1.getString("PS_CU_ID").equals("Fail") ? "002" :
//						// "001", conn);
//						// }
//						//
//						//// rb
//						if (rs1.getString("RB0001") != null && !rs1.getString("RB0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0001",
//									BlackBox.getValue(rs1.getString("RB_BP0001")),
//									BlackBox.getValue(rs1.getString("RB_SD0001")), rs1.getString("RB0001"));
//						}
//
//						if (rs1.getString("RB0005") != null && !rs1.getString("RB0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0002",
//									BlackBox.getValue(rs1.getString("RB_BP0005")),
//									BlackBox.getValue(rs1.getString("RB_SD0005")), rs1.getString("RB0005"));
//						}
//						if (rs1.getString("RB0006") != null && !rs1.getString("RB0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0003",
//									BlackBox.getValue(rs1.getString("RB_BP0006")),
//									BlackBox.getValue(rs1.getString("RB_SD0006")), rs1.getString("RB0006"));
//						}
//						if (rs1.getString("RB0018") != null && !rs1.getString("RB0018").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0004",
//									BlackBox.getValue(rs1.getString("RB_BP0018")),
//									BlackBox.getValue(rs1.getString("RB_SD0018")), rs1.getString("RB0018"));
//						}
//						if (rs1.getString("RB0019") != null && !rs1.getString("RB0019").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0005",
//									BlackBox.getValue(rs1.getString("RB_BP0019")),
//									BlackBox.getValue(rs1.getString("RB_SD0019")), rs1.getString("RB0019"));
//						}
//						if (rs1.getString("RB0020") != null && !rs1.getString("RB0020").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0006",
//									BlackBox.getValue(rs1.getString("RB_BP0020")),
//									BlackBox.getValue(rs1.getString("RB_SD0020")), rs1.getString("RB0020"));
//						}
//						if (rs1.getString("RB0021") != null && !rs1.getString("RB0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0007",
//									BlackBox.getValue(rs1.getString("RB_BP0021")),
//									BlackBox.getValue(rs1.getString("RB_SD0021")), rs1.getString("RB0021"));
//						}
//						if (rs1.getString("RB0022") != null && !rs1.getString("RB0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0008",
//									BlackBox.getValue(rs1.getString("RB_BP0022")),
//									BlackBox.getValue(rs1.getString("RB_SD0022")), rs1.getString("RB0022"));
//						}
//						if (rs1.getString("RB0023") != null && !rs1.getString("RB0023").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0009",
//									BlackBox.getValue(rs1.getString("RB_BP0023")),
//									BlackBox.getValue(rs1.getString("RB_SD0023")), rs1.getString("RB0023"));
//						}
//						if (rs1.getString("RB0024") != null && !rs1.getString("RB0024").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0010",
//									BlackBox.getValue(rs1.getString("RB_BP0024")),
//									BlackBox.getValue(rs1.getString("RB_SD0024")), rs1.getString("RB0024"));
//						}
//
//						// pl
//						if (rs1.getString("PL0001") != null && !rs1.getString("PL0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0001",
//									BlackBox.getValue(rs1.getString("PL_BP0001")),
//									BlackBox.getValue(rs1.getString("PL_SD0001")), rs1.getString("PL0001"));
//						}
//
//						if (rs1.getString("PL0002") != null && !rs1.getString("PL0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0002",
//									BlackBox.getValue(rs1.getString("PL_BP0002")),
//									BlackBox.getValue(rs1.getString("PL_SD0002")), rs1.getString("PL0002"));
//						}
//						if (rs1.getString("PL0003") != null && !rs1.getString("PL0003").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0003",
//									BlackBox.getValue(rs1.getString("PL_BP0003")),
//									BlackBox.getValue(rs1.getString("PL_SD0003")), rs1.getString("PL0003"));
//						}
//						if (rs1.getString("PL0004") != null && !rs1.getString("PL0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0004",
//									BlackBox.getValue(rs1.getString("PL_BP0004")),
//									BlackBox.getValue(rs1.getString("PL_SD0004")), rs1.getString("PL0004"));
//						}
//						if (rs1.getString("PL0005") != null && !rs1.getString("PL0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0005",
//									BlackBox.getValue(rs1.getString("PL_BP0005")),
//									BlackBox.getValue(rs1.getString("PL_SD0005")), rs1.getString("PL0005"));
//						}
//						if (rs1.getString("PL0006") != null && !rs1.getString("PL0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0006",
//									BlackBox.getValue(rs1.getString("PL_BP0006")),
//									BlackBox.getValue(rs1.getString("PL_SD0006")), rs1.getString("PL0006"));
//						}
//						if (rs1.getString("PL0007") != null && !rs1.getString("PL0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0007",
//									BlackBox.getValue(rs1.getString("PL_BP0007")),
//									BlackBox.getValue(rs1.getString("PL_SD0007")), rs1.getString("PL0007"));
//						}
//						if (rs1.getString("PL0008") != null && !rs1.getString("PL0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0008",
//									BlackBox.getValue(rs1.getString("PL_BP0008")),
//									BlackBox.getValue(rs1.getString("PL_SD0008")), rs1.getString("PL0008"));
//						}
//						if (rs1.getString("PL0009") != null && !rs1.getString("PL0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0009",
//									BlackBox.getValue(rs1.getString("PL_BP0009")),
//									BlackBox.getValue(rs1.getString("PL_SD0009")), rs1.getString("PL0009"));
//						}
//						if (rs1.getString("PL0010") != null && !rs1.getString("PL0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0010",
//									BlackBox.getValue(rs1.getString("PL_BP0010")),
//									BlackBox.getValue(rs1.getString("PL_SD0010")), rs1.getString("PL0010"));
//
//						}
//						if (rs1.getString("PL0021") != null && !rs1.getString("PL0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0011",
//									BlackBox.getValue(rs1.getString("PL_BP0021")),
//									BlackBox.getValue(rs1.getString("PL_SD0021")), rs1.getString("PL0021"));
//
//						}
//						if (rs1.getString("PL0022") != null && !rs1.getString("PL0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0022",
//									BlackBox.getValue(rs1.getString("PL_BP0022")),
//									BlackBox.getValue(rs1.getString("PL_SD0022")), rs1.getString("PL0022"));
//
//						}
//						if (rs1.getString("PL0023") != null && !rs1.getString("PL0023").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0023",
//									BlackBox.getValue(rs1.getString("PL_BP0023")),
//									BlackBox.getValue(rs1.getString("PL_SD0023")), rs1.getString("PL0023"));
//
//						}
//						if (rs1.getString("PL0024") != null && !rs1.getString("PL0024").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0024",
//									BlackBox.getValue(rs1.getString("PL_BP0024")),
//									BlackBox.getValue(rs1.getString("PL_SD0024")), rs1.getString("PL0024"));
//
//						}
//						// pl
//						if (rs1.getString("IP0001") != null && !rs1.getString("IP0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0001",
//									BlackBox.getValue(rs1.getString("IP_BP0001")),
//									BlackBox.getValue(rs1.getString("IP_SD0001")), rs1.getString("IP0001"));
//						}
//
//						if (rs1.getString("IP0002") != null && !rs1.getString("IP0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0002",
//									BlackBox.getValue(rs1.getString("IP_BP0002")),
//									BlackBox.getValue(rs1.getString("IP_SD0002")), rs1.getString("IP0002"));
//						}
//						if (rs1.getString("IP0003") != null && !rs1.getString("IP0003").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0003",
//									BlackBox.getValue(rs1.getString("IP_BP0003")),
//									BlackBox.getValue(rs1.getString("IP_SD0003")), rs1.getString("IP0003"));
//						}
//						if (rs1.getString("IP0004") != null && !rs1.getString("IP0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0004",
//									BlackBox.getValue(rs1.getString("IP_BP0004")),
//									BlackBox.getValue(rs1.getString("IP_SD0004")), rs1.getString("IP0004"));
//						}
//						if (rs1.getString("IP0005") != null && !rs1.getString("IP0005").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0005",
//									BlackBox.getValue(rs1.getString("IP_BP0005")),
//									BlackBox.getValue(rs1.getString("IP_SD0005")), rs1.getString("IP0005"));
//						}
//						if (rs1.getString("IP0006") != null && !rs1.getString("IP0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0006",
//									BlackBox.getValue(rs1.getString("IP_BP0006")),
//									BlackBox.getValue(rs1.getString("IP_SD0006")), rs1.getString("IP0006"));
//						}
//						if (rs1.getString("IP0007") != null && !rs1.getString("IP0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0007",
//
//									BlackBox.getValue(rs1.getString("IP_BP0007")),
//									BlackBox.getValue(rs1.getString("IP_SD0007")), rs1.getString("IP0007"));
//						}
//						if (rs1.getString("IP0008") != null && !rs1.getString("IP0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0008",
//									BlackBox.getValue(rs1.getString("IP_BP0008")),
//									BlackBox.getValue(rs1.getString("IP_SD0008")), rs1.getString("IP0008"));
//						}
//						if (rs1.getString("IP0009") != null && !rs1.getString("IP0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0009",
//									BlackBox.getValue(rs1.getString("IP_BP0009")),
//									BlackBox.getValue(rs1.getString("IP_SD0009")), rs1.getString("IP0009"));
//						}
//						if (rs1.getString("IP0010") != null && !rs1.getString("IP0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0010",
//									BlackBox.getValue(rs1.getString("IP_BP0010")),
//									BlackBox.getValue(rs1.getString("IP_SD0010")), rs1.getString("IP0010"));
//
//						}
//						if (rs1.getString("IP0021") != null && !rs1.getString("IP0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0011",
//									BlackBox.getValue(rs1.getString("IP_BP0021")),
//									BlackBox.getValue(rs1.getString("IP_SD0021")), rs1.getString("IP0021"));
//
//						}
//						if (rs1.getString("IP0022") != null && !rs1.getString("IP0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0022",
//									BlackBox.getValue(rs1.getString("IP_BP0022")),
//									BlackBox.getValue(rs1.getString("IP_SD0022")), rs1.getString("IP0022"));
//
//						}
//						// dp
//						if (rs1.getString("DP0001") != null && !rs1.getString("DP0001").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0001",
//									BlackBox.getValue(rs1.getString("DP_BP0001")),
//									BlackBox.getValue(rs1.getString("DP_SD0001")), rs1.getString("DP0001"));
//						}
//
//						if (rs1.getString("DP0002") != null && !rs1.getString("DP0002").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0002",
//									BlackBox.getValue(rs1.getString("DP_BP0002")),
//									BlackBox.getValue(rs1.getString("DP_SD0002")), rs1.getString("DP0002"));
//						}
//						if (rs1.getString("DP0004") != null && !rs1.getString("DP0004").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0003",
//									BlackBox.getValue(rs1.getString("DP_BP0004")),
//									BlackBox.getValue(rs1.getString("DP_SD0004")), rs1.getString("DP0004"));
//						}
//						if (rs1.getString("DP0006") != null && !rs1.getString("DP0006").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0004",
//									BlackBox.getValue(rs1.getString("DP_BP0006")),
//									BlackBox.getValue(rs1.getString("DP_SD0006")), rs1.getString("DP0006"));
//						}
//						if (rs1.getString("DP0007") != null && !rs1.getString("DP0007").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0005",
//									BlackBox.getValue(rs1.getString("DP_BP0007")),
//									BlackBox.getValue(rs1.getString("DP_SD0007")), rs1.getString("DP0007"));
//						}
//						if (rs1.getString("DP0008") != null && !rs1.getString("DP0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0006",
//									BlackBox.getValue(rs1.getString("DP_BP0008")),
//									BlackBox.getValue(rs1.getString("DP_SD0008")), rs1.getString("DP0008"));
//						}
//						if (rs1.getString("DP0009") != null && !rs1.getString("DP0009").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0007",
//									BlackBox.getValue(rs1.getString("DP_BP0009")),
//									BlackBox.getValue(rs1.getString("DP_SD0009")), rs1.getString("DP0009"));
//						}
//						if (rs1.getString("DP0010") != null && !rs1.getString("DP0010").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0008",
//									BlackBox.getValue(rs1.getString("DP_BP0010")),
//									BlackBox.getValue(rs1.getString("DP_SD0010")), rs1.getString("DP0010"));
//
//						}
//						if (rs1.getString("DP0011") != null && !rs1.getString("DP0011").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0009",
//									BlackBox.getValue(rs1.getString("DP_BP0011")),
//									BlackBox.getValue(rs1.getString("DP_SD0011")), rs1.getString("DP0011"));
//
//						}
//						if (rs1.getString("DP0012") != null && !rs1.getString("DP0012").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0010",
//									BlackBox.getValue(rs1.getString("DP_BP0012")),
//									BlackBox.getValue(rs1.getString("DP_SD0012")), rs1.getString("DP0012"));
//
//						}
//						if (rs1.getString("DP0021") != null && !rs1.getString("DP0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0011",
//									BlackBox.getValue(rs1.getString("DP_BP0021")),
//									BlackBox.getValue(rs1.getString("DP_SD0021")), rs1.getString("DP0021"));
//
//						}
//						// ps
//						if (rs1.getString("PS0008") != null && !rs1.getString("PS0008").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0001",
//									BlackBox.getValue(rs1.getString("PS_BP0008")),
//									BlackBox.getValue(rs1.getString("PS_SD0008")), rs1.getString("PS0008"));
//						}
//
//						if (rs1.getString("PS0013") != null && !rs1.getString("PS0013").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0002",
//									BlackBox.getValue(rs1.getString("PS_BP0013")),
//									BlackBox.getValue(rs1.getString("PS_SD0013")), rs1.getString("PS0013"));
//						}
//						if (rs1.getString("PS0014") != null && !rs1.getString("PS0014").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0003",
//									BlackBox.getValue(rs1.getString("PS_BP0014")),
//									BlackBox.getValue(rs1.getString("PS_SD0014")), rs1.getString("PS0014"));
//						}
//						if (rs1.getString("PS0015") != null && !rs1.getString("PS0015").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0004",
//									BlackBox.getValue(rs1.getString("PS_BP0015")),
//									BlackBox.getValue(rs1.getString("PS_SD0015")), rs1.getString("PS0015"));
//						}
//						if (rs1.getString("PS0016") != null && !rs1.getString("PS0016").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0005",
//									BlackBox.getValue(rs1.getString("PS_BP0016")),
//									BlackBox.getValue(rs1.getString("PS_SD0016")), rs1.getString("PS0016"));
//						}
//						if (rs1.getString("PS0017") != null && !rs1.getString("PS0017").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0006",
//									BlackBox.getValue(rs1.getString("PS_BP0017")),
//									BlackBox.getValue(rs1.getString("PS_SD0017")), rs1.getString("PS0017"));
//						}
//						if (rs1.getString("PS0021") != null && !rs1.getString("PS0021").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0007",
//									BlackBox.getValue(rs1.getString("PS_BP0021")),
//									BlackBox.getValue(rs1.getString("PS_SD0021")), rs1.getString("PS0021"));
//						}
//						if (rs1.getString("PS0022") != null && !rs1.getString("PS0022").equals("")) {
//							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0008",
//									BlackBox.getValue(rs1.getString("PS_BP0022")),
//									BlackBox.getValue(rs1.getString("PS_SD0022")), rs1.getString("PS0022"));
//
//						}
//						// conn1.close();
//
//					}
//					ps1.close();
//					rs1.close();
//
//					count++;
//					System.out.println(count);
//				}
//
//				ps.close();
//				rs.close();
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				try {
//					if (ps != null) {
//						ps.close();
//					}
//					if (rs != null) {
//						rs.close();
//					}
//					conn.close();
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				e.printStackTrace();
//
//			}
//		
//		
//		}
		
		if (f > 0){

			conn = ConnectionUtils.getMyConnection();


			
			PreparedStatement ps = null;

			ResultSet rs = null;
			

			// BlackBox blackBox = new BlackBox();
			String vID = "";
			// vID = setID(conn);
			String vTRY_KEY = "";
			try {
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 WHERE TRY_KEY
				// BETWEEN '202012280025' AND '202012280040' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 ORDER BY
				// TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202102%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202012%' ORDER BY TRY_KEY";

				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202012%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202101%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202102%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202103%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202104%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202105%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202106%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202107%' ORDER BY TRY_KEY";
//				String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like  '202108%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202109%' ORDER BY TRY_KEY";
//				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202110%' ORDER BY TRY_KEY";
//				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202111%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202112%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202201%' ORDER BY TRY_KEY";
				// String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key
				// like '202202%' ORDER BY TRY_KEY";
//				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 where try_key like '202203%' ORDER BY TRY_KEY";
				 String sql01 = "SELECT TRY_KEY FROM DSPQM02 ORDER BY TRY_KEY";
				// WHERE TRY_KEY BETWEEN '202012230000' AND '202012230020' ORDER
				// BY
				// TRY_KEY;
				ps = conn.prepareStatement(sql01);
				rs = ps.executeQuery();
				int count = 0;
				while (rs.next()) {
					PreparedStatement ps1 = null;
					ResultSet rs1 = null;
					String sql02 = "SELECT * FROM DSPQM02 WHERE TRY_KEY = '" + rs.getString("TRY_KEY") + "'";
					ps1 = conn.prepareStatement(sql02);
					rs1 = ps1.executeQuery();

					// conn.setAutoCommit(false);
					// System.out.println("RB0001: "+rs1.getString("RB0001"));
					if (rs1.next()) {
						// inSertDSPQM02L(rs1.getString("TRY_KEY"),
						// rs1.getString("OD_NO") == null ? "" :
						// rs1.getString("OD_NO"), rs1.getString("FAC_ID"),
						// rs1.getDate("CHECK_DATE")
						// , rs1.getString("SH_ARITCLENO"),
						// rs1.getString("SH_NO"),
						// rs1.getString("CHECK_USER")== null ? "" :
						// rs1.getString("CHECK_USER"),
						// rs1.getString("TRY_REMARK")== null ? "" :
						// rs1.getString("TRY_REMARK"),
						// rs1.getString("OD_NO_MEMO") == null ? "" :
						// rs1.getString("OD_NO_MEMO"),
						// rs1.getString("UP_USER"),rs1.getString("UP_DATE").substring(0,
						// 19), rs1.getString("RB_STATUS"),
						// rs1.getString("PL_STATUS"),
						// rs1.getString("IP_STATUS"),
						// rs1.getString("DP_STATUS"),
						// rs1.getString("PS_STATUS") == null ? "" :
						// rs1.getString("PS_STATUS"));

						// if(rs1.getString("RB_MAKE_QTY") != null &&
						// !rs1.getString("RB_MAKE_QTY").equals("")){
						// insertDSPQM01(rs1.getString("TRY_KEY"), "01",
						// BlackBox.getValue(rs1.getString("RB_DEPT_CONFIRM")),
						// BlackBox.getValue(rs1.getString("RB_MAKE_QTY")),
						// BlackBox.getValue(rs1.getString("RB_BAD_QTY")),
						// BlackBox.getValue(rs1.getString("RB_BP")),
						// BlackBox.getValue(rs1.getString("RB_SD")),
						// rs1.getString("RB_CU_ID").equals("Fail") ? "002" :
						// "001", conn);
						// }
						//
						// if(rs1.getString("PL_MAKE_QTY") != null &&
						// !rs1.getString("PL_MAKE_QTY").equals("")){
						// insertDSPQM01(rs1.getString("TRY_KEY"), "02",
						// BlackBox.getValue(rs1.getString("PL_DEPT_CONFIRM")),
						// BlackBox.getValue(rs1.getString("PL_MAKE_QTY")),
						// BlackBox.getValue(rs1.getString("PL_BAD_QTY")),
						// BlackBox.getValue(rs1.getString("PL_BP")),
						// BlackBox.getValue(rs1.getString("PL_SD")),
						// rs1.getString("PL_CU_ID").equals("Fail") ? "002" :
						// "001", conn);
						// }
						//
						// if(rs1.getString("IP_MAKE_QTY") != null &&
						// !rs1.getString("IP_MAKE_QTY").equals("")){
						// insertDSPQM01(rs1.getString("TRY_KEY"), "03",
						// BlackBox.getValue(rs1.getString("IP_DEPT_CONFIRM")),
						// BlackBox.getValue(rs1.getString("IP_MAKE_QTY")),
						// BlackBox.getValue(rs1.getString("IP_BAD_QTY")),
						// BlackBox.getValue(rs1.getString("IP_BP")),
						// BlackBox.getValue(rs1.getString("IP_SD")),
						// rs1.getString("IP_CU_ID").equals("Fail") ? "002" :
						// "001", conn);
						// }
						//
						// if(rs1.getString("DP_MAKE_QTY") != null &&
						// !rs1.getString("DP_MAKE_QTY").equals("")){
						// insertDSPQM01(rs1.getString("TRY_KEY"), "04",
						// BlackBox.getValue(rs1.getString("DP_DEPT_CONFIRM")),
						// BlackBox.getValue(rs1.getString("DP_MAKE_QTY")),
						// BlackBox.getValue(rs1.getString("DP_BAD_QTY")),
						// BlackBox.getValue(rs1.getString("DP_BP")),
						// BlackBox.getValue(rs1.getString("DP_SD")),
						// rs1.getString("DP_CU_ID").equals("Fail") ? "002" :
						// "001", conn);
						// }
						//
						// if(rs1.getString("PS_MAKE_QTY") != null &&
						// !rs1.getString("PS_MAKE_QTY").equals("")){
						// insertDSPQM01(rs1.getString("TRY_KEY"), "05",
						// BlackBox.getValue(rs1.getString("PS_DEPT_CONFIRM")),
						// BlackBox.getValue(rs1.getString("PS_MAKE_QTY")),
						// BlackBox.getValue(rs1.getString("PS_BAD_QTY")),
						// BlackBox.getValue(rs1.getString("PS_BP")),
						// BlackBox.getValue(rs1.getString("PS_SD")),
						// rs1.getString("PS_CU_ID").equals("Fail") ? "002" :
						// "001", conn);
						// }
						//
						//// rb
						if (rs1.getString("RB0001") != null && !rs1.getString("RB0001").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0001",
									BlackBox.getValue(rs1.getString("RB_BP0001")),
									BlackBox.getValue(rs1.getString("RB_SD0001")), rs1.getString("RB0001"));
						}

						if (rs1.getString("RB0005") != null && !rs1.getString("RB0005").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0002",
									BlackBox.getValue(rs1.getString("RB_BP0005")),
									BlackBox.getValue(rs1.getString("RB_SD0005")), rs1.getString("RB0005"));
						}
						if (rs1.getString("RB0006") != null && !rs1.getString("RB0006").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0003",
									BlackBox.getValue(rs1.getString("RB_BP0006")),
									BlackBox.getValue(rs1.getString("RB_SD0006")), rs1.getString("RB0006"));
						}
						if (rs1.getString("RB0018") != null && !rs1.getString("RB0018").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0004",
									BlackBox.getValue(rs1.getString("RB_BP0018")),
									BlackBox.getValue(rs1.getString("RB_SD0018")), rs1.getString("RB0018"));
						}
						if (rs1.getString("RB0019") != null && !rs1.getString("RB0019").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0005",
									BlackBox.getValue(rs1.getString("RB_BP0019")),
									BlackBox.getValue(rs1.getString("RB_SD0019")), rs1.getString("RB0019"));
						}
						if (rs1.getString("RB0020") != null && !rs1.getString("RB0020").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0006",
									BlackBox.getValue(rs1.getString("RB_BP0020")),
									BlackBox.getValue(rs1.getString("RB_SD0020")), rs1.getString("RB0020"));
						}
						if (rs1.getString("RB0021") != null && !rs1.getString("RB0021").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0007",
									BlackBox.getValue(rs1.getString("RB_BP0021")),
									BlackBox.getValue(rs1.getString("RB_SD0021")), rs1.getString("RB0021"));
						}
						if (rs1.getString("RB0022") != null && !rs1.getString("RB0022").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0008",
									BlackBox.getValue(rs1.getString("RB_BP0022")),
									BlackBox.getValue(rs1.getString("RB_SD0022")), rs1.getString("RB0022"));
						}
						if (rs1.getString("RB0023") != null && !rs1.getString("RB0023").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0009",
									BlackBox.getValue(rs1.getString("RB_BP0023")),
									BlackBox.getValue(rs1.getString("RB_SD0023")), rs1.getString("RB0023"));
						}
						if (rs1.getString("RB0024") != null && !rs1.getString("RB0024").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "01", "0010",
									BlackBox.getValue(rs1.getString("RB_BP0024")),
									BlackBox.getValue(rs1.getString("RB_SD0024")), rs1.getString("RB0024"));
						}

						// pl
						if (rs1.getString("PL0001") != null && !rs1.getString("PL0001").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0001",
									BlackBox.getValue(rs1.getString("PL_BP0001")),
									BlackBox.getValue(rs1.getString("PL_SD0001")), rs1.getString("PL0001"));
						}

						if (rs1.getString("PL0002") != null && !rs1.getString("PL0002").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0002",
									BlackBox.getValue(rs1.getString("PL_BP0002")),
									BlackBox.getValue(rs1.getString("PL_SD0002")), rs1.getString("PL0002"));
						}
						if (rs1.getString("PL0003") != null && !rs1.getString("PL0003").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0003",
									BlackBox.getValue(rs1.getString("PL_BP0003")),
									BlackBox.getValue(rs1.getString("PL_SD0003")), rs1.getString("PL0003"));
						}
						if (rs1.getString("PL0004") != null && !rs1.getString("PL0004").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0004",
									BlackBox.getValue(rs1.getString("PL_BP0004")),
									BlackBox.getValue(rs1.getString("PL_SD0004")), rs1.getString("PL0004"));
						}
						if (rs1.getString("PL0005") != null && !rs1.getString("PL0005").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0005",
									BlackBox.getValue(rs1.getString("PL_BP0005")),
									BlackBox.getValue(rs1.getString("PL_SD0005")), rs1.getString("PL0005"));
						}
						if (rs1.getString("PL0006") != null && !rs1.getString("PL0006").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0006",
									BlackBox.getValue(rs1.getString("PL_BP0006")),
									BlackBox.getValue(rs1.getString("PL_SD0006")), rs1.getString("PL0006"));
						}
						if (rs1.getString("PL0007") != null && !rs1.getString("PL0007").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0007",
									BlackBox.getValue(rs1.getString("PL_BP0007")),
									BlackBox.getValue(rs1.getString("PL_SD0007")), rs1.getString("PL0007"));
						}
						if (rs1.getString("PL0008") != null && !rs1.getString("PL0008").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0008",
									BlackBox.getValue(rs1.getString("PL_BP0008")),
									BlackBox.getValue(rs1.getString("PL_SD0008")), rs1.getString("PL0008"));
						}
						if (rs1.getString("PL0009") != null && !rs1.getString("PL0009").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0009",
									BlackBox.getValue(rs1.getString("PL_BP0009")),
									BlackBox.getValue(rs1.getString("PL_SD0009")), rs1.getString("PL0009"));
						}
						if (rs1.getString("PL0010") != null && !rs1.getString("PL0010").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0010",
									BlackBox.getValue(rs1.getString("PL_BP0010")),
									BlackBox.getValue(rs1.getString("PL_SD0010")), rs1.getString("PL0010"));

						}
						if (rs1.getString("PL0021") != null && !rs1.getString("PL0021").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0011",
									BlackBox.getValue(rs1.getString("PL_BP0021")),
									BlackBox.getValue(rs1.getString("PL_SD0021")), rs1.getString("PL0021"));

						}
						if (rs1.getString("PL0022") != null && !rs1.getString("PL0022").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0022",
									BlackBox.getValue(rs1.getString("PL_BP0022")),
									BlackBox.getValue(rs1.getString("PL_SD0022")), rs1.getString("PL0022"));

						}
						if (rs1.getString("PL0023") != null && !rs1.getString("PL0023").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0023",
									BlackBox.getValue(rs1.getString("PL_BP0023")),
									BlackBox.getValue(rs1.getString("PL_SD0023")), rs1.getString("PL0023"));

						}
						if (rs1.getString("PL0024") != null && !rs1.getString("PL0024").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "02", "0024",
									BlackBox.getValue(rs1.getString("PL_BP0024")),
									BlackBox.getValue(rs1.getString("PL_SD0024")), rs1.getString("PL0024"));

						}
						// pl
						if (rs1.getString("IP0001") != null && !rs1.getString("IP0001").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0001",
									BlackBox.getValue(rs1.getString("IP_BP0001")),
									BlackBox.getValue(rs1.getString("IP_SD0001")), rs1.getString("IP0001"));
						}

						if (rs1.getString("IP0002") != null && !rs1.getString("IP0002").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0002",
									BlackBox.getValue(rs1.getString("IP_BP0002")),
									BlackBox.getValue(rs1.getString("IP_SD0002")), rs1.getString("IP0002"));
						}
						if (rs1.getString("IP0003") != null && !rs1.getString("IP0003").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0003",
									BlackBox.getValue(rs1.getString("IP_BP0003")),
									BlackBox.getValue(rs1.getString("IP_SD0003")), rs1.getString("IP0003"));
						}
						if (rs1.getString("IP0004") != null && !rs1.getString("IP0004").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0004",
									BlackBox.getValue(rs1.getString("IP_BP0004")),
									BlackBox.getValue(rs1.getString("IP_SD0004")), rs1.getString("IP0004"));
						}
						if (rs1.getString("IP0005") != null && !rs1.getString("IP0005").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0005",
									BlackBox.getValue(rs1.getString("IP_BP0005")),
									BlackBox.getValue(rs1.getString("IP_SD0005")), rs1.getString("IP0005"));
						}
						if (rs1.getString("IP0006") != null && !rs1.getString("IP0006").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0006",
									BlackBox.getValue(rs1.getString("IP_BP0006")),
									BlackBox.getValue(rs1.getString("IP_SD0006")), rs1.getString("IP0006"));
						}
						if (rs1.getString("IP0007") != null && !rs1.getString("IP0007").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0007",

									BlackBox.getValue(rs1.getString("IP_BP0007")),
									BlackBox.getValue(rs1.getString("IP_SD0007")), rs1.getString("IP0007"));
						}
						if (rs1.getString("IP0008") != null && !rs1.getString("IP0008").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0008",
									BlackBox.getValue(rs1.getString("IP_BP0008")),
									BlackBox.getValue(rs1.getString("IP_SD0008")), rs1.getString("IP0008"));
						}
						if (rs1.getString("IP0009") != null && !rs1.getString("IP0009").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0009",
									BlackBox.getValue(rs1.getString("IP_BP0009")),
									BlackBox.getValue(rs1.getString("IP_SD0009")), rs1.getString("IP0009"));
						}
						if (rs1.getString("IP0010") != null && !rs1.getString("IP0010").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0010",
									BlackBox.getValue(rs1.getString("IP_BP0010")),
									BlackBox.getValue(rs1.getString("IP_SD0010")), rs1.getString("IP0010"));

						}
						if (rs1.getString("IP0021") != null && !rs1.getString("IP0021").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0011",
									BlackBox.getValue(rs1.getString("IP_BP0021")),
									BlackBox.getValue(rs1.getString("IP_SD0021")), rs1.getString("IP0021"));

						}
						if (rs1.getString("IP0022") != null && !rs1.getString("IP0022").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "03", "0022",
									BlackBox.getValue(rs1.getString("IP_BP0022")),
									BlackBox.getValue(rs1.getString("IP_SD0022")), rs1.getString("IP0022"));

						}
						// dp
						if (rs1.getString("DP0001") != null && !rs1.getString("DP0001").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0001",
									BlackBox.getValue(rs1.getString("DP_BP0001")),
									BlackBox.getValue(rs1.getString("DP_SD0001")), rs1.getString("DP0001"));
						}

						if (rs1.getString("DP0002") != null && !rs1.getString("DP0002").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0002",
									BlackBox.getValue(rs1.getString("DP_BP0002")),
									BlackBox.getValue(rs1.getString("DP_SD0002")), rs1.getString("DP0002"));
						}
						if (rs1.getString("DP0004") != null && !rs1.getString("DP0004").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0003",
									BlackBox.getValue(rs1.getString("DP_BP0004")),
									BlackBox.getValue(rs1.getString("DP_SD0004")), rs1.getString("DP0004"));
						}
						if (rs1.getString("DP0006") != null && !rs1.getString("DP0006").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0004",
									BlackBox.getValue(rs1.getString("DP_BP0006")),
									BlackBox.getValue(rs1.getString("DP_SD0006")), rs1.getString("DP0006"));
						}
						if (rs1.getString("DP0007") != null && !rs1.getString("DP0007").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0005",
									BlackBox.getValue(rs1.getString("DP_BP0007")),
									BlackBox.getValue(rs1.getString("DP_SD0007")), rs1.getString("DP0007"));
						}
						if (rs1.getString("DP0008") != null && !rs1.getString("DP0008").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0006",
									BlackBox.getValue(rs1.getString("DP_BP0008")),
									BlackBox.getValue(rs1.getString("DP_SD0008")), rs1.getString("DP0008"));
						}
						if (rs1.getString("DP0009") != null && !rs1.getString("DP0009").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0007",
									BlackBox.getValue(rs1.getString("DP_BP0009")),
									BlackBox.getValue(rs1.getString("DP_SD0009")), rs1.getString("DP0009"));
						}
						if (rs1.getString("DP0010") != null && !rs1.getString("DP0010").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0008",
									BlackBox.getValue(rs1.getString("DP_BP0010")),
									BlackBox.getValue(rs1.getString("DP_SD0010")), rs1.getString("DP0010"));

						}
						if (rs1.getString("DP0011") != null && !rs1.getString("DP0011").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0009",
									BlackBox.getValue(rs1.getString("DP_BP0011")),
									BlackBox.getValue(rs1.getString("DP_SD0011")), rs1.getString("DP0011"));

						}
						if (rs1.getString("DP0012") != null && !rs1.getString("DP0012").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0010",
									BlackBox.getValue(rs1.getString("DP_BP0012")),
									BlackBox.getValue(rs1.getString("DP_SD0012")), rs1.getString("DP0012"));

						}
						if (rs1.getString("DP0021") != null && !rs1.getString("DP0021").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "04", "0011",
									BlackBox.getValue(rs1.getString("DP_BP0021")),
									BlackBox.getValue(rs1.getString("DP_SD0021")), rs1.getString("DP0021"));

						}
						// ps
						if (rs1.getString("PS0008") != null && !rs1.getString("PS0008").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0001",
									BlackBox.getValue(rs1.getString("PS_BP0008")),
									BlackBox.getValue(rs1.getString("PS_SD0008")), rs1.getString("PS0008"));
						}

						if (rs1.getString("PS0013") != null && !rs1.getString("PS0013").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0002",
									BlackBox.getValue(rs1.getString("PS_BP0013")),
									BlackBox.getValue(rs1.getString("PS_SD0013")), rs1.getString("PS0013"));
						}
						if (rs1.getString("PS0014") != null && !rs1.getString("PS0014").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0003",
									BlackBox.getValue(rs1.getString("PS_BP0014")),
									BlackBox.getValue(rs1.getString("PS_SD0014")), rs1.getString("PS0014"));
						}
						if (rs1.getString("PS0015") != null && !rs1.getString("PS0015").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0004",
									BlackBox.getValue(rs1.getString("PS_BP0015")),
									BlackBox.getValue(rs1.getString("PS_SD0015")), rs1.getString("PS0015"));
						}
						if (rs1.getString("PS0016") != null && !rs1.getString("PS0016").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0005",
									BlackBox.getValue(rs1.getString("PS_BP0016")),
									BlackBox.getValue(rs1.getString("PS_SD0016")), rs1.getString("PS0016"));
						}
						if (rs1.getString("PS0017") != null && !rs1.getString("PS0017").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0006",
									BlackBox.getValue(rs1.getString("PS_BP0017")),
									BlackBox.getValue(rs1.getString("PS_SD0017")), rs1.getString("PS0017"));
						}
						if (rs1.getString("PS0021") != null && !rs1.getString("PS0021").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0007",
									BlackBox.getValue(rs1.getString("PS_BP0021")),
									BlackBox.getValue(rs1.getString("PS_SD0021")), rs1.getString("PS0021"));
						}
						if (rs1.getString("PS0022") != null && !rs1.getString("PS0022").equals("")) {
							insertDSPQM07(setID(), rs1.getString("TRY_KEY"), "05", "0008",
									BlackBox.getValue(rs1.getString("PS_BP0022")),
									BlackBox.getValue(rs1.getString("PS_SD0022")), rs1.getString("PS0022"));

						}
						// conn1.close();

					}
					ps1.close();
					rs1.close();

					count++;
					System.out.println(count);
				}

//				ps.close();
//				rs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				try {
					if (ps != null) {
						ps.close();
					}
					if (rs != null) {
						rs.close();
					}
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();

			}
		
		
		
		}

	}

	public static String setID() throws ClassNotFoundException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String ID = "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		try {
//			Connection conn = null;
//			conn = ConnectionUtils.getMyConnection();
			// conn1 = ConnectionUtils.getMyConnection();
			String sql = "SELECT TO_NUMBER(ID)+1 AS ID_MAX FROM DSPQM07 WHERE ID LIKE '%" + sdf.format(new Date())
					+ "%' AND ROWNUM = 1 ORDER BY ID DESC";

			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (!rs.next()) {
				ID = sdf.format(new Date()) + "000001";
			} else {
				ID = rs.getString("id_max");
			}
			 ps.close();
			 rs.close();
//			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("ID_MAX: " + ID);
		return ID;
	}
	// public static void inSertDSPQM02L(String TRY_KEY, String OD_NO, String
	// FAC_ID, Date CHECK_DATE,
	// String SH_ARITCLENO, String SH_NO, String CHECK_USER, String TRY_REMARK,
	// String OD_NO_MEMO, String UP_USER,String UP_DATE,
	// String RB_STATUS, String PL_STATUS, String IP_STATUS, String DP_STATUS,
	// String PS_STATUS)
	// throws SQLException, ClassNotFoundException {
	//
	//
	// PreparedStatement ps1 = null;
	// ResultSet rs1 = null;
	// Connection conn = null;
	// conn = ConnectionUtils.getMyConnection();
	// try {
	// String InsertDSPQM02_l = "INSERT INTO DSPQM02_L (TRY_KEY,
	// OD_NO,FAC_ID,CHECK_DATE,SH_ARITCLENO,"
	// + "SH_NO,CHECK_USER,TRY_REMARK,OD_NO_MEMO,"
	// + "UP_USER,UP_DATE,RB_STATUS,PL_STATUS,IP_STATUS,DP_STATUS,PS_STATUS) " +
	// "VALUES ('" + TRY_KEY +"','"
	// + OD_NO + "','" + FAC_ID + "',TO_DATE('" + sdf2.format(CHECK_DATE) +
	// "','MM/DD/YYYY'),'"
	// + SH_ARITCLENO + "','" + SH_NO + "','" + CHECK_USER + "','" + TRY_REMARK
	// + "','" + OD_NO_MEMO
	// + "','" + UP_USER + "',TO_DATE('"+UP_DATE+"','YYYY/MM/DD HH24:MI:SS'),'"
	// + RB_STATUS + "','" + PL_STATUS + "','" + IP_STATUS + "','"
	// + DP_STATUS + "','" + PS_STATUS + "')";
	// System.out.println("INSERT INTO DSPQM002_l: " + InsertDSPQM02_l);
	// ps1 = conn.prepareStatement(InsertDSPQM02_l);
	// rs1 = ps1.executeQuery();
	// ps1.close();
	// rs1.close();
	// conn.close();
	// } catch (Exception e1) {
	//
	// e1.printStackTrace();
	//
	// }
	// }

	// public static void insertDSPQM01(String TRY_KEY, String FA_ID, String
	// FA_DEPT_CONFIRM, String FA_MAKE_QTY,
	// String FA_BAD_QTY, String FA_BP_QTY, String FA_SD_QTY, String FA_CU_ID,
	// Connection conn) {
	//
	// PreparedStatement ps = null;
	// ResultSet rs = null;
	// // Connection conn = null;
	// /// conn = ConnectionUtil.getVMDB01();
	// try {
	// conn.setAutoCommit(false);
	// String sql = "INSERT INTO DSPQM01 (TRY_KEY, FA_ID, FA_DEPT_CONFIRM,
	// FA_MAKE_QTY, FA_BAD_QTY, FA_BP_QTY, FA_SD_QTY, FA_CU_ID) "
	// + "VALUES ('" + TRY_KEY + "', '" + FA_ID + "', '" + FA_DEPT_CONFIRM + "',
	// '" + FA_MAKE_QTY + "', "
	// + "'" + FA_BAD_QTY + "', '" + FA_BP_QTY + "', '" + FA_SD_QTY + "', '" +
	// FA_CU_ID + "')";
	// System.out.println("INSERT INTO DSPQM01: " + sql);
	// ps = conn.prepareStatement(sql);
	// rs = ps.executeQuery();
	// conn.commit();
	// ps.close();
	// rs.close();
	// // conn.close();
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	//
	// System.out.println("error");
	// try {
	// if (ps != null) {
	// ps.close();
	// }
	// if (rs != null) {
	// rs.close();
	// }
	// conn.close();
	// conn.rollback();
	// } catch (SQLException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// }
	// e.printStackTrace();
	// }
	//
	// }

	public static void insertDSPQM07(String ID, String TRY_KEY, String FA_ID, String DE_ID, String BP_QTY,
			String SD_QTY, String BAD_QTY) throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
//			Connection conn = null;
//			conn = ConnectionUtils.getMyConnection();
			conn.setAutoCommit(false);
			String sql = "INSERT INTO DSPQM07 (ID, TRY_KEY, FA_ID, DE_ID,BP_QTY, SD_QTY, BAD_QTY) " + "VALUES ('" + ID
					+ "','" + TRY_KEY + "','" + FA_ID + "','" + DE_ID + "','" + BP_QTY + "','" + SD_QTY + "','"
					+ BAD_QTY + "')";
			System.out.println("INSERT INTO DSPQM07: " + sql);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			conn.commit();
			 ps.close();
			 rs.close();
//			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			System.out.println("error");
			try {
				if (ps != null) {
					ps.close();
				}
				if (rs != null) {
					rs.close();
				}
				// conn.close();
				// conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
// ora@it2013
