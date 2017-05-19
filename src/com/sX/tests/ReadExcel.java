package com.sX.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadExcel {
	public static final String DRIVER_NAME = "sun.jdbc.odbc.JdbcOdbcDriver";
	public static final String DATABASE_URL = "jdbc:odbc:residentinfo";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName(DRIVER_NAME);
		Connection con = null;
		try {
			con = DriverManager.getConnection(DATABASE_URL);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select LAST_NAME, FIRST_NAME from [Sheet1$]");
			while (rs.next()) {
				String lname = rs.getString(1);
				String fname = rs.getString(2);
				// int id = rs.getInt(3);

				System.err.println(fname + ", " + lname);
			}
			rs.close();
			stmt.close();
		} finally {
			if (con != null)
				con.close();
		}
	}
}
