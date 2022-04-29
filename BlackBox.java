package ketnoidata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

public class BlackBox {
	public static String ClobToString(Clob sc) throws SQLException, IOException {
		String reString = "";
		Reader is = sc.getCharacterStream();
		BufferedReader br = new BufferedReader(is);
		String s = br.readLine();
		StringBuffer sb = new StringBuffer();

		// 執行迴圈將字串全部取出付值給StringBuffer由StringBuffer轉成STRING
		while (s != null) {
			sb.append(s);
			s = br.readLine();
		}
		reString = sb.toString();
		return reString;
	}
	
	public static String getValue(Object o) {
		if (o == null)
			return "";
		if (o instanceof String) {
			return (String) o;
		} else if (o instanceof Clob) {
			try {
				return ClobToString((Clob) o);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return o.toString();
	}

}
