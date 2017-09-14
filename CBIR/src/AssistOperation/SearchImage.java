package AssistOperation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import HistogramCompare.*;
import LBPCompare.*;
import db.db;
/**
 * 搜索图片，求图片的相似度
 * @param n 图片的数量
 * @param str1 原图片的地址
 * @param str2 要比较图片的地址
 * @param ident1 Identification接口的实例化对像，可以传入多个对像
 * @throws IOException 
 * @return Element[] 已经按照相似度排序；
 */
public class SearchImage {
	public static Element[] searchImage(int type,String spath) throws IOException, SQLException {
		String dpath[] = new String[48];//保存数据库中图片的路径
 	   	//String dname[]= new String[48];//保存数据库中图片的名字
 	   	int n=0;
 	   	Element [] element=null;
		Connection connect=db.connect();
		System.out.println("连接数据库");
		if(connect!=null){
			//创建statement类对象，用来执行SQL语句！！
			Statement statement = connect.createStatement();
	     	//要执行的SQL语句
	     	String sql = "select * from test4";//test
	     	//ResultSet类，用来存放获取的结果集！！
	     	ResultSet rs = statement.executeQuery(sql);
	     	while(rs.next()){
	     		n = rs.getInt("id");
	     		dpath[n-1] = rs.getString("path");
	     	 	//dname[n-1] = rs.getString("name");
	     	}	     	
		}
		else{
			System.out.println("连接数据库失败");
		}
		if(type==1){
			//颜色特征检索
			element=ColorTest.ColorCompare(spath,dpath,n);
		}
		else if(type==2){
			element=TextureTest.TextureCompare(spath,dpath,n);
		}
		//冒泡排序从大到小
		Element temp;
		for (int i = 0;i < n;i++){
			for(int j = i+1;j < n;j++){
				if (element[i].similar< element[j].similar){
					temp = element[i];
					element[i] =element[j];
					element[j] = temp;
				}
			}
		}
		//BufferedImage img = null;
		//for(int i=0; i<n; i++) {
			//img= ImageIO.read(new File(element[i].epath));
			//在磁盘中输出相似度排序后图片
			//ImageDigital.writeImg(img, "jpg", "d:/test/tuku/result/" + "H" + element[i].similar + "_" + element[i].index +".jpg");
		//}
		return element;
	}
}
