package DataBase;

import java.sql.*;

import java.util.logging.*;

public class JDBC {

	String uri = "jdbc:sqlserver://localhost:1433;databaseName=test";// ��ַ+�˿ںţ����ݿ�����
	String user = "sa";// ��¼��
	String password = "123";// ��½����
	Connection con;
	Statement sql;
	ResultSet rs;

	public void connect() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// ��������
			System.out.println("�����ɹ���");
			// Connection connection = DriverManager.getConnection(url);

			con = DriverManager.getConnection(uri, user, password);
			System.out.println("�������ݿ�ɹ���");

		} catch (SQLException e) {
			System.out.println("SQL Server����ʧ�ܣ�");
		} catch (ClassNotFoundException e1) {
			System.out.println("SQL Server����ʧ�ܣ�");
		}

	}

	public static void close(Statement stmt, Connection conn, ResultSet rs) {
		if (stmt != null) {

			try {
				stmt.close();
			} catch (SQLException ex) {
				Logger.getLogger(JDBC.class.getName()).log(
						Level.SEVERE, null, ex);
			}

		}
		if (conn != null) {

			try {
				conn.close();
			} catch (SQLException ex) {
				Logger.getLogger(JDBC.class.getName()).log(
						Level.SEVERE, null, ex);
			}

		}
		if (rs != null) {

			try {
				rs.close();
			} catch (SQLException ex) {
				Logger.getLogger(JDBC.class.getName()).log(
						Level.SEVERE, null, ex);
			}

		}
	}

}
