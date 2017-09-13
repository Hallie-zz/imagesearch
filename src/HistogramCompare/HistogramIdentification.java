package HistogramCompare;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HistogramIdentification{
	// ��ʾR��G��B��λ��
	public static final int GRAYBIT = 4;
	
	//private BufferedImage img = null;
	public HistogramIdentification() {
		
	}
	/**
	 * ��һά�ĻҶ�ֱ��ͼ
	 * @param img
	 * @return
	 */
	public double[] getHistogram(BufferedImage img) {
		int w = img.getWidth();
		int h = img.getHeight();
		int series = (int) Math.pow(2, GRAYBIT);	//GRAYBIT=4;��12λ��int��ʾ�Ҷ�ֵ��ǰ4λ��ʾred,�м�4�Ǳ�ʾgreen,����4λ��ʾblue
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
	 * ����һά�Ҷ�ֱ��ͼ������ͼ��ƥ�䣨����ϵ����
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
		//�õ�txt�ļ�
		content+=srcPath+":	";
		OperateTxt.contentToTxt("d:/test/tuku/result/colorData.txt",content);
		float sum=0;
		for(int i=0;i<hist.length;i++){
			sum+=hist[i];
		}
		sum/=hist.length;
		OperateTxt.contentToTxt("d:/test/tuku/result/colorData.txt",String.valueOf(sum)+"\r\n");
		//System.out.println(hist.length);
		//�����ݿ��д洢txt�ļ��ĵ�ַ
		return hist;
	}*/
}
