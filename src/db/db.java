package db;
import java.sql.Connection;
import java.sql.DriverManager;

public class db {
	public static Connection connect=null;
	public static Connection connect() { 
	try { 
    	Class.forName("com.mysql.jdbc.Driver");   //加载MYSQL JDBC驱动程序  
    	 //Class.forName("org.gjt.mm.mysql.Driver"); 
    	System.out.println("Success loading Mysql Driver!"); 
    } catch (Exception e) { 
    	  System.out.print("Error loading Mysql Driver!"); 
    	  e.printStackTrace(); 
    } 
    try { 
    	connect = DriverManager.getConnection( 
    	     "jdbc:mysql://localhost:3306/images","root",""); 
    	      //连接URL为  jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码 
    	if(!connect.isClosed())
    		System.out.println("Success connect Mysql server!");	   
    	   }catch (Exception e) { 
    	System.out.print("get data error!"); 
    	e.printStackTrace(); 
    	} 
    return connect;
    }
}
