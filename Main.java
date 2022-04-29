package ketnoidata;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
//import java.util.Date;
public class Main {
	static SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
	static SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		// Connection();
		//
		// }
		// public static void Connection() throws SQLException,
		// ClassNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = ConnectionUtils.getMyConnection();
		List<String> list = new ArrayList<String>();
		try {
			// String sql = "select * from dspqm02";
			String sql = "select * from dspqm02 where try_key BETWEEN  '202012280025' AND '202012280040'";
			// String sql = "select * from dspqm03_l";

			// String sql = "insert into dspqm03_l (DE_ID, DE_NAME, UP_USER,
			// UP_DATE, FA_ID, DE_REMARK) values ('0002', '雙邊，爆邊，凹陷', 'DSGIT',
			// to_date('23-09-2020 15:59:24', 'dd-mm-yyyy hh24:mi:ss'), '02',
			// '')";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			// ################################################################################insert01
			// System.out.println("---------------------");
			// String a = "";
			// while (rs.next()) {
			// a = rs.getString("DE_NAME");
			// System.out.println(" ket noi ok:" + a);
			// a = rs.getString("TRY_KEY");
			// System.out.println(" ket noi ok:" + a);
			// // System.out.println(" ket noi ok:" + rs.getString("FA_ID"));
			// System.out.println(" ket noi ok:" +
			// rs.getString("RB_DEPT_CONFIRM"));
			// System.out.println(" ket noi ok:" + rs.getString("RB_MAKE_QTY"));
			// System.out.println(" ket noi ok:" + rs.getString("RB_BAD_QTY")==
			// null ? "0" : rs.getString("RB_BAD_QTY"));
			// System.out.println(" ket noi ok:" + rs.getString("RB_BP") == null
			// ? "0" : rs.getString("RB_BP"));
			// System.out.println(" ket noi ok:" + rs.getString("RB_SD") == null
			// ? "0" : rs.getString("RB_SD"));
			// System.out.println(" ket noi ok:" + rs.getString("RB_CU_ID") );
			// if (rs.getString("TRY_KEY") != null) {
			// //rb
			// if(!rs.getString("RB_MAKE_QTY").equals("") ||
			// rs.getString("RB_MAKE_QTY")!=null){
			// inSertDSPQM01(rs.getString("TRY_KEY"), "01" ,
			// rs.getString("RB_DEPT_CONFIRM"),
			// rs.getString("RB_MAKE_QTY"),rs.getString("RB_BAD_QTY")== null ?
			// "0" : rs.getString("RB_BAD_QTY"), rs.getString("RB_BP") == null ?
			// "0" : rs.getString("RB_BP"),
			// rs.getString("RB_SD") == null ? "0" : rs.getString("RB_SD"),
			// rs.getString("RB_CU_ID").toString().equals("Fail") ? "002" :
			// "001");
			// }
			// //pl
			// if(!rs.getString("PL_MAKE_QTY").equals("") ||
			// rs.getString("PL_MAKE_QTY")!=null){
			// inSertDSPQM01(rs.getString("TRY_KEY"), "02" ,
			// rs.getString("PL_DEPT_CONFIRM"),
			// rs.getString("PL_MAKE_QTY"),rs.getString("PL_BAD_QTY")== null ?
			// "0" : rs.getString("PL_BAD_QTY"), rs.getString("PL_BP") == null ?
			// "0" : rs.getString("PL_BP"),
			// rs.getString("PL_SD") == null ? "0" : rs.getString("PL_SD"),
			// rs.getString("PL_CU_ID").toString().equals("Fail") ? "002" :
			// "001");
			// }
			// //ip
			// if(!rs.getString("IP_MAKE_QTY").equals("") ||
			// rs.getString("IP_MAKE_QTY")!=null){
			// inSertDSPQM01(rs.getString("TRY_KEY"), "03" ,
			// rs.getString("IP_DEPT_CONFIRM"),
			// rs.getString("IP_MAKE_QTY"),rs.getString("IP_BAD_QTY")== null ?
			// "0" : rs.getString("IP_BAD_QTY"), rs.getString("IP_BP") == null ?
			// "0" : rs.getString("IP_BP"),
			// rs.getString("IP_SD") == null ? "0" : rs.getString("IP_SD"),
			// rs.getString("IP_CU_ID").toString().equals("Fail") ? "002" :
			// "001");
			// }
			// //dp
			// if(!rs.getString("DP_MAKE_QTY").equals("") ||
			// rs.getString("DP_MAKE_QTY")!=null){
			// inSertDSPQM01(rs.getString("TRY_KEY"), "04" ,
			// rs.getString("DP_DEPT_CONFIRM"),
			// rs.getString("DP_MAKE_QTY"),rs.getString("DP_BAD_QTY")== null ?
			// "0" : rs.getString("DP_BAD_QTY"), rs.getString("DP_BP") == null ?
			// "0" : rs.getString("DP_BP"),
			// rs.getString("DP_SD") == null ? "0" : rs.getString("DP_SD"),
			// rs.getString("DP_CU_ID").toString().equals("Fail") ? "002" :
			// "001");
			// }
			// //ps
			// if(!rs.getString("PS_MAKE_QTY").equals("") ||
			// rs.getString("PS_MAKE_QTY")!=null){
			// inSertDSPQM01(rs.getString("TRY_KEY"), "05" ,
			// rs.getString("PS_DEPT_CONFIRM"),
			// rs.getString("PS_MAKE_QTY"),rs.getString("PS_BAD_QTY")== null ?
			// "0" : rs.getString("PS_BAD_QTY"), rs.getString("PS_BP") == null ?
			// "0" : rs.getString("PS_BP"),
			// rs.getString("PS_SD") == null ? "0" : rs.getString("PS_SD"),
			// rs.getString("PS_CU_ID").toString().equals("Fail") ? "002" :
			// "001");
			// }
			//
			// System.out.println("insert thanh cong");
			// } else {
			// System.out.println("that bai");
			// }
			// inSertDSPQM07(a, a, a, a, null, null, null);

			// }

			// conn.commit();
			// System.out.println(" ket noi ok:" + a);
			// ###############################################################end
			// insert01

			// ######################################################insert 02
			while (rs.next()) {
				if (rs.getString("TRY_KEY") != null) {

//					System.out.println(" ket noi ok:" + rs.getString("TRY_KEY"));
//					System.out.println(" ket noi ok:" + rs.getString("OD_NO"));
//					System.out.println(" ket noi ok:" + rs.getString("FAC_ID"));
//					System.out.println(" ket noi ok:" + sdf2.format(rs.getDate("CHECK_DATE")));
//					System.out.println(" ket noi ok:" + rs.getString("SH_ARITCLENO")== null ? " " : rs.getString("SH_ARITCLENO"));
//					System.out.println(" ket noi ok:" + rs.getString("SH_NO")== null ? " " : rs.getString("SH_NO"));
//					System.out.println(" ket noi ok:" + rs.getString("CHECK_USER")== null ? " " : rs.getString("CHECK_USER"));
//					System.out.println(" ket noi ok:" + rs.getString("TRY_REMARK")== null ? " " : rs.getString("TRY_REMARK"));
//					System.out.println(" ket noi ok:" + rs.getString("OD_NO_MEMO") == null  ? " " : rs.getString("OD_NO_MEMO"));
//					System.out.println(" ket noi ok:" + rs.getString("UP_USER") == null ? " " : rs.getString("UP_USER"));
					System.out.println(" ket noi ok:" + rs.getDate("UP_DATE"));
					System.out.println(" ket noi ok:" + rs.getString("UP_DATE").substring(0, 19));
//					System.out.println(" ket noi ok:" + rs.getString("PL_STATUS") == null ? " " : rs.getString("PL_STATUS"));
//					System.out.println(" ket noi ok:" + rs.getString("IP_STATUS") == null ? " " : rs.getString("IP_STATUS"));
//					System.out.println(" ket noi ok:" + rs.getString("DP_STATUS") == null ? " " : rs.getString("DP_STATUS"));
//					System.out.println(" ket noi ok:" + rs.getString("PS_STATUS") == null ? " " : rs.getString("PS_STATUS"));
//					System.out.println(" ket noi ok:" + rs.getString("") == null ? "0" : rs.getString(""));
//					System.out.println(" ket noi ok:" + rs.getString("") == null ? "0" : rs.getString(""));
//					System.out.println(" ket noi ok:" + rs.getString("") == null ? "0" : rs.getString(""));

					inSertDSPQM02L(rs.getString("TRY_KEY"), rs.getString("OD_NO") == null ? "" : rs.getString("OD_NO"), rs.getString("FAC_ID"),
							rs.getDate("CHECK_DATE")
							, rs.getString("SH_ARITCLENO"), rs.getString("SH_NO"),
							rs.getString("CHECK_USER")== null ? "" : rs.getString("CHECK_USER"), rs.getString("TRY_REMARK")== null ? "" : rs.getString("TRY_REMARK"), rs.getString("OD_NO_MEMO") == null ? "" : rs.getString("OD_NO_MEMO"),
							rs.getString("UP_USER"),rs.getString("UP_DATE").substring(0, 19), rs.getString("RB_STATUS"), rs.getString("PL_STATUS"),
							rs.getString("IP_STATUS"), rs.getString("DP_STATUS"), rs.getString("PS_STATUS") == null ? "" : rs.getString("PS_STATUS"));

				}
			}
			// ######################################################end insert
			// 02

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			conn.close();
		} finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();

		}
		// System.out.println("ket noi thanh cong");
		// for (String string : list) {
		// System.out.println(string);
		// }

	}

	///

	////
	public static void inSertDSPQM02L(String TRY_KEY, String OD_NO, String FAC_ID, Date CHECK_DATE,
			String SH_ARITCLENO, String SH_NO, String CHECK_USER, String TRY_REMARK, String OD_NO_MEMO, String UP_USER,String UP_DATE,
			String RB_STATUS, String PL_STATUS, String IP_STATUS, String DP_STATUS, String PS_STATUS)
			throws SQLException, ClassNotFoundException {
	

		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		Connection conn = null;
		conn = ConnectionUtils.getMyConnection();
		try {
			String InsertDSPQM02_l = "INSERT INTO DSPQM02_L (TRY_KEY, OD_NO,FAC_ID,CHECK_DATE,SH_ARITCLENO,"
					+ "SH_NO,CHECK_USER,TRY_REMARK,OD_NO_MEMO,"
					+ "UP_USER,UP_DATE,RB_STATUS,PL_STATUS,IP_STATUS,DP_STATUS,PS_STATUS) " + "VALUES ('" + TRY_KEY  +"','"
					+ OD_NO + "','" + FAC_ID + "',TO_DATE('" + sdf2.format(CHECK_DATE) + "','MM/DD/YYYY'),'"
					+ SH_ARITCLENO + "','" + SH_NO + "','" + CHECK_USER + "','" + TRY_REMARK + "','" + OD_NO_MEMO
					+ "','" + UP_USER + "',TO_DATE('"+UP_DATE+"','YYYY/MM/DD HH24:MI:SS'),'" + RB_STATUS + "','" + PL_STATUS + "','" + IP_STATUS + "','"
					+ DP_STATUS + "','" + PS_STATUS + "')";
			ps1 = conn.prepareStatement(InsertDSPQM02_l);
			rs1 = ps1.executeQuery();
		} catch (Exception e1) {

			e1.printStackTrace();

		}
	}

	public static void inSertDSPQM01(String TRY_KEY, String FA_ID, String FA_DEPT_CONFIRM, String FA_MAKE_QTY,
			String FA_BAD_QTY, String FA_BP_QTY, String FA_SD_QTY, String FA_CU_ID)
			throws SQLException, ClassNotFoundException {
		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		Connection conn = null;
		conn = ConnectionUtils.getMyConnection();
		try {
			// conn.setAutoCommit(false);
			String sqlInsertDSPQM01 = "INSERT INTO DSPQM01_LV (TRY_KEY,FA_ID,FA_DEPT_CONFIRM,FA_MAKE_QTY,"
					+ "FA_BAD_QTY,FA_BP_QTY,FA_SD_QTY,FA_CU_ID)" + "VALUES ('" + TRY_KEY + "','" + FA_ID + "','"
					+ FA_DEPT_CONFIRM + "','" + FA_MAKE_QTY + "','" + FA_BAD_QTY + "','" + FA_BP_QTY + "','" + FA_SD_QTY
					+ "','" + FA_CU_ID + "')";

			// System.out.println("AAAAAA: " + sqlInsertDSPQM01);
			ps1 = conn.prepareStatement(sqlInsertDSPQM01);
			rs1 = ps1.executeQuery();
		} catch (Exception e1) {

			e1.printStackTrace();

		}
		// conn1.commit();
		// Messagebox.show(Labels.getLabel("PUBLIC.MSG0081"), "Information01",
		// Messagebox.OK, Messagebox.ON_OK);
	}

	public static void inSertDSPQM07(String ID, String TRY_KEY, String FA_ID, String DE_ID, Double BP_QTY,
			Double SD_QTY, Double BAD_QTY) throws SQLException, ClassNotFoundException {
		// serialNumber1();
		// String cb = cboDE_ID.getSelectedItem().getValue();
		// String db1 = BlackBox.getValue(a.getValue()), db2 =
		// BlackBox.getValue(b.getValue()),
		// db3 = BlackBox.getValue(c.getValue());
		// if (cb != null) {
		// if (!db1.equals("") || !db2.equals("")) {
		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		Connection conn = null;
		conn = ConnectionUtils.getMyConnection();
		try {
			// String ID = "";
			// ID = serialNumber1();
			// conn.setAutoCommit(false);
			String sqlInsertDSPQM07 = "INSERT INTO DSPQM07_L (ID,TRY_KEY,FA_ID,DE_ID,BP_QTY,SD_QTY,BAD_QTY)"
					+ "VALUES ('" + ID + "','" + TRY_KEY + "','" + FA_ID + "','" + DE_ID + "','" + BP_QTY + "','"
					+ SD_QTY + "','" + BAD_QTY + "')";
			// System.out.println("AAAAAA: " + sqlInsertDSPQM07);
			ps1 = conn.prepareStatement(sqlInsertDSPQM07);
			rs1 = ps1.executeQuery();
		} catch (Exception e1) {
			e1.printStackTrace();
			// BlackBox.connectionRollback(conn);
			// Messagebox.show("ADD Error ", "Error", Messagebox.OK,
			// Messagebox.ERROR);
		}
		// conn1.commit();

	}
}
