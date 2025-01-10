package com.utlity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utility {
	//Class.forName("com.mysql.cj.jdbc.Driver");
public static void LoadDriver(String Address) throws ClassNotFoundException {
	Class.forName(Address);
}
//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/RPBank","root","root");
public static Connection connection(String url,String username,String password) throws SQLException {
	Connection connection=DriverManager.getConnection(url,username,password);
	return connection;
}
//String sql = "select * from BankEmployees";
public static String SqlQuery(String Query) {
	return Query;
}
//PreparedStatement pstmt = connection.prepareStatement(sql);
public static PreparedStatement CreatePreStmt(String sql,Connection connection) throws SQLException {
	PreparedStatement pstmt = connection.prepareStatement(sql);
	return pstmt;
}
//ResultSet rs = pstmt.executeQuery();
public static ResultSet CreateResultset(PreparedStatement pstmt) throws SQLException {
	ResultSet rs = pstmt.executeQuery();
	return rs;
}

}
