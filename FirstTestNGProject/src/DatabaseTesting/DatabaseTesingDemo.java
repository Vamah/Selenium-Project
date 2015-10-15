package DatabaseTesting;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

//import org.junit.After;
//
//import org.junit.Before;
//
//import org.junit.Test;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DatabaseTesingDemo {
	// 
//	    private Connection connection;
//	     
//	    public DBConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
//	        Class.forName("com.mysql.jdbc.Driver");
//	        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/users_db", "root", "root");
//	    }
//	     
//	    public Connection getConnection(){
//	        return this.connection;
//	    }
	//}
		public static DatabaseTesingDemo conn = new DatabaseTesingDemo();
//		    public static final String URL = "jdbc:mysql://localhost/jdbcdb";
//		    public static final String USER = "root";
//		    public static final String PASSWORD = "root";
//		    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
//		 
		    //private constructor
		    public DatabaseTesingDemo() {
		        try {
		            // Load MySQL Java driver
		            Class.forName("com.mysql.jdbc.Driver");
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        }
		    }
		 
		    public Connection createConnection() {
		 
		        Connection conn = null;
//		        Statement stmt=null;
		        try {
		            // Establish Java MySQL connection
		        	
		        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/user_db", "root", "root");
		            System.out.println("JDBC Connect sucessfully.... ");
		        } catch (SQLException e) {
		            System.out.println("ERROR: Unable to Connect to Database.");
		        }
		        return conn;
		    }   
		    
		    
		    @BeforeTest
		    public static Connection getConnection() {
		    	
		       return conn.createConnection();
		    }
		

@Test
//
       public void test() {

              try{
            	  Statement stmt=((Connection) conn).createStatement();
            	  
              String query = "select * from users";

              // Get the contents of userinfo table from DB

              ResultSet res = stmt.executeQuery(query);

              // Print the result untill all the records are printed

              // res.next() returns true if there is any next record else returns false

              while (res.next())

              {

                     System.out.print(res.getString(1));

              System.out.print("\t" + res.getString(2));

              System.out.print("\t" + res.getString(3));

              System.out.println("\t" + res.getString(4));

              }

              }

              catch(Exception e)

              {

                     e.printStackTrace();

              }     

} }

//       @AfterTest
//
//       public void tearDown() throws Exception {
//
//              // Close DB connection
//
//              if (conn != null) {
//
//              conn.close();
//
//              }
//
//       }


		

//public class DatabaseTesingDemo {
//
//       // Connection object
//
//       static Connection con = null;
//
//       // Statement object
//
//       private static Statement stmt;
//
//       // Constant for Database URL
//
//       public static String DB_URL = "jdbc:mysql://localhost:3307/user_db";   
//
//       // Constant for Database Username
//
//       public static String DB_USER = "root";
//
//       // Constant for Database Password
//
//       public static String DB_PASSWORD = "root";
//
//       @BeforeTest
//       public void setUp() throws Exception {
//
//              try{
//
//                     // Make the database connection
//
//                     String dbClass = "com.mysql.jdbc.Driver";
//
//                     Class.forName(dbClass).newInstance();
//
//                     // Get connection to DB
//
//                     Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//
//                     // Statement object to send the SQL statement to the Database
//
//                     stmt = con.createStatement();
//
//                     }
//
//                     catch (Exception e)
//
//                     {
//
//                           e.printStackTrace();
//
//                     }
//
//       }
//
//       @Test
//
//       public void test() {
//
//              try{
//
//              String query = "select * from users";
//
//              // Get the contents of userinfo table from DB
//
//              ResultSet res = stmt.executeQuery(query);
//
//              // Print the result untill all the records are printed
//
//              // res.next() returns true if there is any next record else returns false
//
//              while (res.next())
//
//              {
//
//                     System.out.print(res.getString(1));
//
//              System.out.print("\t" + res.getString(2));
//
//              System.out.print("\t" + res.getString(3));
//
//              System.out.println("\t" + res.getString(4));
//
//              }
//
//              }
//
//              catch(Exception e)
//
//              {
//
//                     e.printStackTrace();
//
//              }     
//
//       }
//
//       @AfterTest
//
//       public void tearDown() throws Exception {
//
//              // Close DB connection
//
//              if (con != null) {
//
//              con.close();
//
//              }
//
//       }
//
//}
//
