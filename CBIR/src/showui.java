import java.io.*;
import java.sql.SQLException;
import java.awt.*;
import javax.swing.*;

import HistogramCompare.ColorTest;
import AssistOperation.*;
import db.*;

import java.awt.event.*;
public class showui {
	JFrame frame=new JFrame("图像检索CBIR");
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JLabel label1=new JLabel("选择文件");
    JLabel label2=new JLabel("选择目录");
    JTextField text1=new JTextField(10);//显示用户选择的地址
    JTextField text2=new JTextField(10);//显示用户选择的地址
    JLabel imagelabel=new JLabel();//显示用户提交的图片
    JButton button1=new JButton("...");//选择地址按钮
    JButton button4=new JButton("...");//选择地址按钮
    JButton button2=new JButton("颜色");
    JButton button3=new JButton("纹理");
    JFileChooser chooser=new JFileChooser();//文件选择器
    JLabel resimage[] = new JLabel[6];//用来显示结果的图片
	JLabel res[] = new JLabel[6];//用来显示结果的相似度
	
	String path=new String();
    public showui(){
    	chooser.setCurrentDirectory(new File("d:/test/tuku"));//文件选择器的初始目录定为d盘
        frame.setSize(1300,7000);//设定窗口大小
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//窗口可见
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//使能关闭窗口，结束程xu
         
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
        panel1.add(label2);
        panel1.add(text2);
        panel1.add(button4);
        panel1.add(label1);
        panel1.add(text1);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);

        panel2.setLayout(new BorderLayout());
        panel2.add(imagelabel,BorderLayout.WEST);
        
        panel3.setLayout(new GridLayout(4,3));
        for(int i=0;i<6;i++){
			resimage[i] = new JLabel();
			res[i] = new JLabel();
		}
		for(int i=0;i<2;i++){
			panel3.add(resimage[i*3]);
			panel3.add(resimage[i*3+1]);
			panel3.add(resimage[i*3+2]);
			panel3.add(res[i*3]);
			panel3.add(res[i*3+1]);
			panel3.add(res[i*3+2]);
		}
		
		frame.setLayout(new BorderLayout(10,5));
		frame.add(panel2,BorderLayout.WEST);//待检索图片显示区
		frame.add(panel1,BorderLayout.NORTH);//用户操作区
		frame.add(panel3,BorderLayout.CENTER);//检索结果显示区
	
		button4.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){//事件处理		   
		        	chooser.setFileSelectionMode(1);//设定只能选择到文件夹
		            int state=chooser.showOpenDialog(null);//此句是打开文件选择器界面的触发语句
		            if(state==1){
		                return;//撤销则返回
		            }
		            else{
		                path = chooser.getSelectedFile().getPath();
		                text2.setText(path);
						//imagelabel.setIcon(new ImageIcon("d:/test/tuku/springflowers/image01.jpg"));
		                try {
		                	String tpath="D:\\test\\tuku\\result\\Image";
							insert.inserts(path,tpath);
							System.out.println("已插入数据库");
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		            }
		        }
		});
		
		button1.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){//事件处理		   
		        	chooser.setFileSelectionMode(0);//设定只能选择到文件
		            int state=chooser.showOpenDialog(null);//此句是打开文件选择器界面的触发语句
		            if(state==1){
		                return;//撤销则返回
		            }
		            else{
		                path = chooser.getSelectedFile().getPath();
		                text1.setText(path);
						//imagelabel.setIcon(new ImageIcon("d:/test/tuku/springflowers/image01.jpg"));
		                imagelabel.setIcon(new ImageIcon(path));
		            }
		        }
		});
		//ImageIcon imgicon;
		//Image img;
		//颜色特征比较按钮触发事件
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			if(path!=null){
				try {
					Element[] el = SearchImage.searchImage(1,path);
					for(int i=0;i<6;i++){
						resimage[i].setIcon(new ImageIcon(el[i].epath));
						//image getscaledinstance(int width,int height,int hints)
						//imgicon=new ImageIcon(el[i].epath);
						//img=imgicon.getImage();
						
						res[i].setText(Double.toString(el[i].similar));
					}
				} catch (SQLException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else{
				System.out.println("未读取到图片");
			}
		}
		});
		//纹理特征比较按钮触发事件
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(path!=null){
					try {
						Element[] el = SearchImage.searchImage(2,path);
						for(int i=0;i<6;i++){
							resimage[i].setIcon(new ImageIcon(el[i].epath));
							res[i].setText(Double.toString(el[i].similar));
						}
					} catch (SQLException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else{
					System.out.println("未读取到图片");
				}
		}
		});
    }
    public static void main(String[] args) {
        new showui();
    }
}