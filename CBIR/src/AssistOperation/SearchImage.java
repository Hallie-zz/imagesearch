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
 * ����ͼƬ����ͼƬ�����ƶ�
 * @param n ͼƬ������
 * @param str1 ԭͼƬ�ĵ�ַ
 * @param str2 Ҫ�Ƚ�ͼƬ�ĵ�ַ
 * @param ident1 Identification�ӿڵ�ʵ�������񣬿��Դ���������
 * @throws IOException 
 * @return Element[] �Ѿ��������ƶ�����
 */
public class SearchImage {
	public static Element[] searchImage(int type,String spath) throws IOException, SQLException {
		String dpath[] = new String[48];//�������ݿ���ͼƬ��·��
 	   	//String dname[]= new String[48];//�������ݿ���ͼƬ������
 	   	int n=0;
 	   	Element [] element=null;
		Connection connect=db.connect();
		System.out.println("�������ݿ�");
		if(connect!=null){
			//����statement���������ִ��SQL��䣡��
			Statement statement = connect.createStatement();
	     	//Ҫִ�е�SQL���
	     	String sql = "select * from test4";//test
	     	//ResultSet�࣬������Ż�ȡ�Ľ��������
	     	ResultSet rs = statement.executeQuery(sql);
	     	while(rs.next()){
	     		n = rs.getInt("id");
	     		dpath[n-1] = rs.getString("path");
	     	 	//dname[n-1] = rs.getString("name");
	     	}	     	
		}
		else{
			System.out.println("�������ݿ�ʧ��");
		}
		if(type==1){
			//��ɫ��������
			element=ColorTest.ColorCompare(spath,dpath,n);
		}
		else if(type==2){
			element=TextureTest.TextureCompare(spath,dpath,n);
		}
		//ð������Ӵ�С
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
			//�ڴ�����������ƶ������ͼƬ
			//ImageDigital.writeImg(img, "jpg", "d:/test/tuku/result/" + "H" + element[i].similar + "_" + element[i].index +".jpg");
		//}
		return element;
	}
}
