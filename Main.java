package ketnoidata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection();
		
		
	}
	public static void Connection() throws SQLException, ClassNotFoundException {
		Connection conn  = null;
		PreparedStatement ps = null;
		ResultSet rs =  null;
		conn =ConnectionUtils.getMyConnection();
		List<String> list = new ArrayList<String>();
		try {
			String sql = "select * from rest";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()){
				list.add(rs.getString("EMPNO"));
				list.add(rs.getString("EMPNAME"));
				list.add(rs.getString("POSITION"));

				
			}
			conn.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			ps.close();
			rs.close();
			conn.close();
		}
		finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();

		}
		System.out.println("ket noi thanh cong");
		for (String string : list) {
			System.out.println(string);
		}
		

	}
}
