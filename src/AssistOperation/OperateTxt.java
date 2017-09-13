package AssistOperation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;  
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;  
  
public class OperateTxt {  
   
	 //�����ļ� 
	 public static boolean createFile(File fileName)throws Exception{  
	  //boolean flag=false;  
		 try{  
			 if(!fileName.exists()){  
				 fileName.createNewFile();  
				 //flag=true;  
			 }	  
		 }catch(Exception e){  
			 e.printStackTrace();  
		 }  
	 return true;  
 }   
   
	 // ��TXT�ļ����� 
	 public static String readTxtFile(File fileName)throws Exception{  
	 	String result=null;  
	 	FileReader fileReader=null;  
	 	BufferedReader bufferedReader=null;  
	 	try{  
	 		fileReader=new FileReader(fileName);  
	 		bufferedReader=new BufferedReader(fileReader);  
	 		try{  
	 			String read=null;  
	 			while((read=bufferedReader.readLine())!=null){  
	 				result=result+read+"\r\n";  
	 			}  
	 		}catch(Exception e){  
	 			e.printStackTrace();  
	 		}  
	  }catch(Exception e){  
		  e.printStackTrace();  
	  }finally{  
		  if(bufferedReader!=null){  
			  bufferedReader.close();  
		  }  
		  if(fileReader!=null){  
			  fileReader.close();  
		  }  
	 }  
	 System.out.println("��ȡ�������ļ������ǣ�"+"\r\n"+result);  
	 return result;  
	 }  
  
  
	  //��txt����д����
	public static void contentToTxt(String path,int[] arr,int n) throws NumberFormatException, IOException {  
		File file = new File(path);  //����������ݵ��ļ� 
		if(!file.exists()) {
			FileWriter out = new FileWriter(file);  //�ļ�д����
			//�������е�����д�뵽�ļ��С�ÿ�и�����֮��TAB���
			for(int i=0;i<n;i++){
				out.write(arr[i]+"\t");
			}
			out.write("\r\n");
			out.close();
		  }  
	}
}