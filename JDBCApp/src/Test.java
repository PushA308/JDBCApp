import java.sql.*;


public class Test {
	public static void main(String s[]) throws Exception {
		
				
		String query = "select sname from student where sid = 1";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testautoReconnect=true&useSSL=false", "root", "push");
		
		Statement st= con.createStatement();
		
		System.out.println("it worked..!");
		
		
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		
		String name = rs.getString("sname");
		
		System.out.println(name);
		
		st.close();
		con.close();
				
	}
}
