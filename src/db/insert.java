package db;

import java.sql.SQLException;
import java.sql.Statement;

public class insert {
	public static void inserts(String fpath,String tpath) throws SQLException{
		if(db.connect()!=null){
			Statement statement = (db.connect()).createStatement();
			String sql=" ";
			String temppath;
			String ttpath;
			for(int i=1;i<=9;i++){
				temppath=fpath+"\\Image0"+i+".jpg";
				temppath=temppath.replaceAll("\\\\","\\\\\\\\"); 
				ttpath=tpath+i+".txt";
				ttpath=ttpath.replaceAll("\\\\","\\\\\\\\");
				sql = "insert into test2(id,path,texturepath)VALUES('"+i+"','"+temppath+"','"+ttpath+"')";
				statement.executeUpdate(sql);
			}
			for(int i=10;i<=48;i++){
				temppath=fpath+"\\Image"+i+".jpg";
				temppath=temppath.replaceAll("\\\\","\\\\\\\\"); 
				ttpath=tpath+i+".txt";
				ttpath=ttpath.replaceAll("\\\\","\\\\\\\\");
				sql = "insert into test2(id,path,texturepath)VALUES('"+i+"','"+temppath+"','"+ttpath+"')";
				statement.executeUpdate(sql);
			}
		}
		else{
			System.out.println("数据库连接失败");
		}
	}
	
	/*public static void inserttxts(String path) throws SQLException{
		if(db.connect()!=null){
			Statement statement = (db.connect()).createStatement();
			String sql=" ";
			for(int i=1;i<=48;i++){
				path=path.replaceAll("\\\\","\\\\\\\\"); 
				sql = "insert into test(text)VALUES('"+path+"')";
				//System.out.println();
				statement.executeUpdate(sql);
			}
		}
		else{
			System.out.println("数据库连接失败");
		}
	}*/
}
