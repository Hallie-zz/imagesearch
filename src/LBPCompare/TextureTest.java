package LBPCompare;

import java.io.IOException;
import java.sql.SQLException;

import AssistOperation.Element;
import AssistOperation.OperateTxt;

public class TextureTest {
	public static Element[] TextureCompare(String spath,String[] dpath,int n) throws IOException, SQLException{

		//获得用户提交的图片的特征值
		int[] charact1 = LBP.getFeatureVector(spath);
		int[] charact2=new int[n];
		Element[] element = new Element[dpath.length];
		String path= "";
		for(int j=0; j<n; j++) {
			double f = 0;
			charact2 = LBP.getFeatureVector(dpath[j]);
			
			f = LBP.calculateSimilarity(charact1, charact2);
			element[j] = new Element((j+1), f, dpath[j]);
			
			path="D:/test/tuku/result/Image"+(j+1) +".txt";
			OperateTxt.contentToTxt(path,charact2,charact2.length);
		}
		return element;

	}
}
