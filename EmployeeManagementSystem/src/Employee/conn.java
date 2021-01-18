package Employee;
import java.sql.*;
public class conn {
     
	  public Connection c;  //connection established
	  public Statement s;   //mqsql queries will be executed

		
		public conn()
		{
			  // mySql drivers are registered
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			 c= DriverManager.getConnection("jdbc:mysql:///project12","root","");
			 s= c.createStatement();
			 
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			conn cr = new conn();
		}
     
		
	

}
