package db;
import java.sql.Connection;
import java.sql.DriverManager;

public class db {
	public static Connection connect=null;
	public static Connection connect() { 
	try { 
    	Class.forName("com.mysql.jdbc.Driver");   //����MYSQL JDBC��������  
    	 //Class.forName("org.gjt.mm.mysql.Driver"); 
    	System.out.println("Success loading Mysql Driver!"); 
    } catch (Exception e) { 
    	  System.out.print("Error loading Mysql Driver!"); 
    	  e.printStackTrace(); 
    } 
    try { 
    	connect = DriverManager.getConnection( 
    	     "jdbc:mysql://localhost:3306/images","root",""); 
    	      //����URLΪ  jdbc:mysql//��������ַ/���ݿ��� �������2�������ֱ��ǵ�½�û��������� 
    	if(!connect.isClosed())
    		System.out.println("Success connect Mysql server!");	   
    	   }catch (Exception e) { 
    	System.out.print("get data error!"); 
    	e.printStackTrace(); 
    	} 
    return connect;
    }
}
