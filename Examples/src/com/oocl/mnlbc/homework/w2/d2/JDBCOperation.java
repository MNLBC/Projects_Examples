package com.oocl.mnlbc.homework.w2.d2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCOperation {
	public static Connection getConn() {
		// String driver = "com.mysql.jdbc.Driver";
		// String url = "jdbc:mysql://localhost:3306/samp_db";
		// String username = "root";
		// String password = "";
		Connection conn = null;
		try {
			// Class.forName(driver); //classLoader,加载对应驱动
			// conn = (Connection) DriverManager.getConnection(url, username,
			// password);

			// Oracle
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mnl123");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static int insert(Student student) {
		Connection conn = getConn();
		int i = 0;
		String sql = "insert into students (ID, Name,Sex,Age) values(?, ?,?,?)";
		String sql2 = "insert into students (ID, Name,Sex,Age) values('001', 'John','male','25')";
		PreparedStatement pstmt = null;
		Statement stmt;
		try {
			// stmt = conn.createStatement();
			// stmt.executeQuery(sql2);
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			pstmt.setString(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getSex());
			pstmt.setString(4, student.getAge());
			i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {

				try {
					pstmt.close();
				} catch (Exception e) {
					// log
				}
			}
			if (conn != null) {

				try {
					conn.close();
				} catch (Exception e) {
					// log
				}
			}
		}
		return i;
	}

	public static int update(Student student) {
		Connection conn = getConn();
		int i = 0;
		String sql = "update students set Age='" + student.getAge() + "' where Name='" + student.getName() + "'";
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			i = pstmt.executeUpdate();
			System.out.println("resutl: " + i);
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {

				try {
					pstmt.close();
				} catch (Exception e) {
					// log
				}
			}
			if (conn != null) {

				try {
					conn.close();
				} catch (Exception e) {
					// log
				}
			}
		}
		return i;
	}

	public static int delete(String name) {
		Connection conn = getConn();
		int i = 0;
		String sql = "delete from students where Name='" + name + "'";
		// String sql = "delete from students where Name=' '" + "or 1=1";
		// String sql = "select * from students where Name=' '" + "or 1=1";
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			i = pstmt.executeUpdate();
			System.out.println("resutl: " + i);
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {

				try {
					pstmt.close();
				} catch (Exception e) {
					// log
				}
			}
			if (conn != null) {

				try {
					conn.close();
				} catch (Exception e) {
					// log
				}
			}
		}
		return i;
	}

	public static int deleteAll() {
		Connection conn = getConn();
		int i = 0;
		String sql = "delete from students";
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			i = pstmt.executeUpdate();
			System.out.println("resutl: " + i);
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// log
				}
			}
			if (conn != null) {

				try {
					conn.close();
				} catch (Exception e) {
					// log
				}
			}
		}
		return i;
	}

	public static Integer getAll() {
		Connection conn = getConn();
		String sql = "select * from students";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			System.out.println("============================");
			while (rs.next()) {
				for (int i = 1; i <= col; i++) {
					System.out.print(rs.getString(i) + "\t");
					if ((i == 2) && (rs.getString(i).length() < 8)) {
						System.out.print("\t");
					}
				}
				System.out.println("");
			}
			System.out.println("============================");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					// log
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					// log
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					// log
				}
			}
		}
		return null;
	}
}
