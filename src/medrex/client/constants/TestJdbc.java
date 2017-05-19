package medrex.client.constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TestJdbc {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception ex) {
			System.out.println("Error loading driver");
		}
		try {
			String AcademicsURLs = "jdbc:mysql://localhost:3306/medrex";
			Connection con = DriverManager.getConnection(AcademicsURLs, "root",
					"medrex");
			Statement stmt = con.createStatement();
			String sqlQuery = "Select * from residentcontactphone";
			ResultSet rs = stmt.executeQuery(sqlQuery);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numColumns = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= numColumns; i++)
					System.out.println(rs.getString(i) + " ");
				System.out.println(" ");
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
