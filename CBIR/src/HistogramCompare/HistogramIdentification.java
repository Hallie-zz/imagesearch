package HistogramCompare;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HistogramIdentification{
	// 表示R、G、B的位数
	public static final int GRAYBIT = 4;
	
	//private BufferedImage img = null;
	public HistogramIdentification() {
		
	}
	/**
	 * 求一维的灰度直方图
	 * @param img
	 * @return
	 */
	public double[] getHistogram(BufferedImage img) {
		int w = img.getWidth();
		int h = img.getHeight();
		int series = (int) Math.pow(2, GRAYBIT);	//GRAYBIT=4;用12位的int表示灰度值，前4位表示red,中间4们表示green,后面4位表示blue
		int greyScope = 256/series;
		double[] hist = new double[series*series*series]; 
		int r, g, b, index;
		int pix[] = new int[w*h]; 
		pix = img.getRGB(0, 0, w, h, pix, 0, w);
		for(int i=0; i<w*h; i++) {
			r = pix[i]>>16 & 0xff;
			r = r/greyScope;
			g = pix[i]>>8 & 0xff;
			g = g/greyScope;
			b = pix[i] & 0xff;
			b = b/greyScope;
			index = r<<(2*GRAYBIT) | g<<GRAYBIT | b; 
			hist[index]++;
		}
		for(int i=0; i<hist.length; i++) {
			hist[i] = hist[i]/(w*h);
			//hist[i] = (float)Math.round(hist[i]*1000)/1000;
		}
		return hist;
	}
	/**
	 * 基于一维灰度直方图特征的图像匹配（巴氏系数）
	 * @param histR
	 * @param histD
	 * @return
	 */
	public static double identification(double[] histR, double[] histD) {
		double p = (double) 0.0;
		for(int i=0; i<histR.length; i++) {
			p += Math.sqrt(histR[i]*histD[i]);
		}
		p = (double)Math.round(p*1000)/1000;
		return p;
	}
	public double[] getCharacteristic(String srcPath) throws IOException {
		//System.out.println("hhh"+srcPath);
		BufferedImage img
		  = ImageIO.read(new File(srcPath));
		return getHistogram(img);
	}
	/*public float[] getCharacteristic2(String srcPath) throws IOException{
		//BufferedImage img = ImageDigital.readImg(srcPath);
		BufferedImage img
		  = ImageIO.read(new File(srcPath));
		float[] hist = getHistogram(img);
		String content=new String();
		//得到txt文件
		content+=srcPath+":	";
		OperateTxt.contentToTxt("d:/test/tuku/result/colorData.txt",content);
		float sum=0;
		for(int i=0;i<hist.length;i++){
			sum+=hist[i];
		}
		sum/=hist.length;
		OperateTxt.contentToTxt("d:/test/tuku/result/colorData.txt",String.valueOf(sum)+"\r\n");
		//System.out.println(hist.length);
		//向数据库中存储txt文件的地址
		return hist;
	}*/
}
