package LBPCompare;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import AssistOperation.*;

/**
* 均匀LBP纹理特征1 
*
*/
public class LBP {

	/*public static void main(String[] args) throws IOException {
		int[] vector = getFeatureVector("C:/Users/lenovo/Desktop/image/person1.jpg");
		int[] vector1 = getFeatureVector("C:/Users/lenovo/Desktop/image/image01.jpg");
		System.out.println(calculateSimilarity(vector, vector1));
	}*/	
	public static int[] getFeatureVector(String imagePath) throws IOException{
		// 获取灰度矩阵
		int[][] grayMatrix = getGrayPixel(imagePath,100,100);//756*504
		
		// 为特征值(0-255)分组(降维)
		int[] groupNums ;
		
		// 遍历像素点，计算其特征值，并确定其分组，并进行分组统计
		int[] vector = new int[59];
		for(int i = 1; i < grayMatrix.length - 1; i++){
			for(int j = 1; j < grayMatrix[0].length - 1; j++){
				int center = grayMatrix[i][j];
				int feature = 0;
				feature = grayMatrix[i - 1][j - 1]>=center ? (feature<<1)+1 : (feature<<1);
				feature = grayMatrix[i][j - 1]>=center ? (feature<<1)+1 : (feature<<1);
				feature = grayMatrix[i + 1][j - 1]>=center ? (feature<<1)+1 : (feature<<1);
				feature = grayMatrix[i + 1][j]>=center ? (feature<<1)+1 : (feature<<1);
				feature = grayMatrix[i + 1][j + 1]>=center ? (feature<<1)+1 : (feature<<1);
				feature = grayMatrix[i][j + 1]>=center ? (feature<<1)+1 : (feature<<1);
				feature = grayMatrix[i - 1][j + 1]>=center ? (feature<<1)+1 : (feature<<1);
				feature = grayMatrix[i - 1][j]>=center ? (feature<<1)+1 : (feature<<1);
				//旋转不变
				feature = getMinFeature(feature);
				groupNums = groupFeatureValue();
				vector[groupNums[feature]]++;
			}
		}
		return vector;
	}
	
	
	
	/**
	 * 对256个特征值进行分组
	 * groupNums的下标为特征值，value为组号
	 * @return
	 */
	private static int[] groupFeatureValue(){
		int[] groupNums = new int[256];
		int num = 1;
		for(int i = 0; i <= 255; i++){
			if(getHopCount(i) <= 2){
				groupNums[i] = num;
				num++;
			}
		}
		return groupNums;
	}
	
	/**
	 * 计算跳变次数
	 * @param i
	 * @return
	 */
	private static int getHopCount(int i)  
	{  
	    int[] a = new int[8];
	    int cnt = 0;  
	    int k = 7;  
	    while(i > 0)  
	    {  
	        a[k] = i & 1;  
	        i = i >> 1;  
	        --k;  
	    }  
	    for(k = 0; k < 7; k++)  
	    {  
	        if(a[k] != a[k+1])  
	        {  
	            ++cnt;  
	        }  
	    }  
	    if(a[0] != a[7])  
	    {  
	        ++cnt;  
	    }  
	    return cnt;  
	}  
	
	/**
	 * 旋转不变性
	 * 此处的feature的二进制位数固定为8
	 * @param feature
	 * @return
	 */
	private static int getMinFeature(int feature){
		int minFeature = feature;
		for(int i = 0; i < 7; i++){
			// 循环右移一位
			feature = (feature>>1 | feature<<7) & 0xff;
			if(feature < minFeature) minFeature = feature;
		}
		
		return minFeature;
	}
	//计算相似度
   public static double calculateSimilarity(int[] vector, int[] vector1) {
	   double len = 0, len1 = 0, numerator = 0;
		for (int i = 0; i < vector.length; i++) {
			len += Math.pow(vector[i], 2);
			len1 += Math.pow(vector1[i], 2);
			numerator += vector[i] * vector1[i];	
		}
		len = Math.sqrt(len);
		len1 = Math.sqrt(len1);
		//System.out.println(len1);
		
		return numerator / (len * len1);
	}
   //图像灰度化
   public static int[][] getGrayPixel(String imagePath, int width, int height) throws IOException {
	   /*BufferedImage bi = null;
		try {
		//将图片大小转换成相同的
			bi = resizeImage(imagePath, width, height, BufferedImage.TYPE_INT_RGB);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}*/
		File srcFile = new File(imagePath);
		BufferedImage srcImg = ImageIO.read(srcFile);
		int minx = srcImg.getMinX();
		int miny = srcImg.getMinY();
		int[][] matrix = new int[width - minx][height - miny];
		for (int i = minx; i < width; i++) {
			for (int j = miny; j < height; j++) {
				int pixel = srcImg.getRGB(i, j);
				int red = (pixel & 0xff0000) >> 16;
				int green = (pixel & 0xff00) >> 8;
				int blue = (pixel & 0xff);
				int gray = (int) (red * 0.3 + green * 0.59 + blue * 0.11);
				matrix[i][j] = gray;
			}
		}
		return matrix;
	}

	/*public static BufferedImage resizeImage(String srcImgPath, int width, int height, int imageType)
			throws IOException {
		File srcFile = new File(srcImgPath);
		BufferedImage srcImg = ImageIO.read(srcFile);
		BufferedImage buffImg = null;
		buffImg = new BufferedImage(width, height, imageType);
		buffImg.getGraphics().drawImage(srcImg.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
		return buffImg;
	}*/
}