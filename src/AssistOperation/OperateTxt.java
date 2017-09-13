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
   
	 //创建文件 
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
   
	 // 读TXT文件内容 
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
	 System.out.println("读取出来的文件内容是："+"\r\n"+result);  
	 return result;  
	 }  
  
  
	  //在txt文续写内容
	public static void contentToTxt(String path,int[] arr,int n) throws NumberFormatException, IOException {  
		File file = new File(path);  //存放数组数据的文件 
		if(!file.exists()) {
			FileWriter out = new FileWriter(file);  //文件写入流
			//将数组中的数据写入到文件中。每行各数据之间TAB间隔
			for(int i=0;i<n;i++){
				out.write(arr[i]+"\t");
			}
			out.write("\r\n");
			out.close();
		  }  
	}
}