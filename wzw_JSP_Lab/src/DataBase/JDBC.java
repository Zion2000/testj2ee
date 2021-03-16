package DataBase;

import java.sql.*;

import java.util.logging.*;

public class JDBC {

	String uri = "jdbc:sqlserver://localhost:1433;databaseName=test";// 地址+端口号，数据库名字
	String user = "sa";// 登录名
	String password = "123";// 登陆密码
	Connection con;
	Statement sql;
	ResultSet rs;

	public void connect() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// 加载驱动
			System.out.println("驱动成功！");
			// Connection connection = DriverManager.getConnection(url);

			con = DriverManager.getConnection(uri, user, password);
			System.out.println("连接数据库成功！");

		} catch (SQLException e) {
			System.out.println("SQL Server连接失败！");
		} catch (ClassNotFoundException e1) {
			System.out.println("SQL Server连接失败！");
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
