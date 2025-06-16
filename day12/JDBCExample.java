package day12;
import java.sql.*;
public class JDBCExample {

	public static void main(String[] args) {
		 String url = "jdbc:mysql.cj.jdbc.Driver";//load jbdc driver
		 connection conn = DriverManager.getConnection(url,user,password);//connect to DB
		 String sql = "INSERT INTO students(id,name,grade)VALUES(?,?,?)";//create an insert query
		 PreparedStatement stmt = conn.prepareStatement(sql);
		 stmt.setInt(1,1);
		 stmt.setString(2,"Alice");
		 stmt.setString(3,"A");
	}

}
