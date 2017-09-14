package HistogramCompare;
import java.io.IOException;
import AssistOperation.*; 

public class ColorTest {
	public static Element[] ColorCompare(String spath,String[] dpath,int n) throws IOException{
		HistogramIdentification ident1 = new HistogramIdentification();
		//获得用户提交的图片的特征值
		double[] charact1 = ident1.getCharacteristic(spath);
		double[] charact2=new double[dpath.length];
		Element[] element = new Element[dpath.length];
		for(int j=0; j<n; j++) {
			float f = 0f;
			charact2 = ident1.getCharacteristic(dpath[j]);
			f += HistogramIdentification.identification(charact1, charact2);
			element[j] = new Element((j+1), f, dpath[j]);
		}
		return element;

	}
}
