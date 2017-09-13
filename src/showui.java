import java.io.*;
import java.sql.SQLException;
import java.awt.*;
import javax.swing.*;

import HistogramCompare.ColorTest;
import AssistOperation.*;
import db.*;

import java.awt.event.*;
public class showui {
	JFrame frame=new JFrame("ͼ�����CBIR");
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JLabel label1=new JLabel("ѡ���ļ�");
    JLabel label2=new JLabel("ѡ��Ŀ¼");
    JTextField text1=new JTextField(10);//��ʾ�û�ѡ��ĵ�ַ
    JTextField text2=new JTextField(10);//��ʾ�û�ѡ��ĵ�ַ
    JLabel imagelabel=new JLabel();//��ʾ�û��ύ��ͼƬ
    JButton button1=new JButton("...");//ѡ���ַ��ť
    JButton button4=new JButton("...");//ѡ���ַ��ť
    JButton button2=new JButton("��ɫ");
    JButton button3=new JButton("����");
    JFileChooser chooser=new JFileChooser();//�ļ�ѡ����
    JLabel resimage[] = new JLabel[6];//������ʾ�����ͼƬ
	JLabel res[] = new JLabel[6];//������ʾ��������ƶ�
	
	String path=new String();
    public showui(){
    	chooser.setCurrentDirectory(new File("d:/test/tuku"));//�ļ�ѡ�����ĳ�ʼĿ¼��Ϊd��
        frame.setSize(1300,7000);//�趨���ڴ�С
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);//���ڿɼ�
        //frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ʹ�ܹرմ��ڣ�������xu
         
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
		frame.add(panel2,BorderLayout.WEST);//������ͼƬ��ʾ��
		frame.add(panel1,BorderLayout.NORTH);//�û�������
		frame.add(panel3,BorderLayout.CENTER);//���������ʾ��
	
		button4.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){//�¼�����		   
		        	chooser.setFileSelectionMode(1);//�趨ֻ��ѡ���ļ���
		            int state=chooser.showOpenDialog(null);//�˾��Ǵ��ļ�ѡ��������Ĵ������
		            if(state==1){
		                return;//�����򷵻�
		            }
		            else{
		                path = chooser.getSelectedFile().getPath();
		                text2.setText(path);
						//imagelabel.setIcon(new ImageIcon("d:/test/tuku/springflowers/image01.jpg"));
		                try {
		                	String tpath="D:\\test\\tuku\\result\\Image";
							insert.inserts(path,tpath);
							System.out.println("�Ѳ������ݿ�");
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		            }
		        }
		});
		
		button1.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){//�¼�����		   
		        	chooser.setFileSelectionMode(0);//�趨ֻ��ѡ���ļ�
		            int state=chooser.showOpenDialog(null);//�˾��Ǵ��ļ�ѡ��������Ĵ������
		            if(state==1){
		                return;//�����򷵻�
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
		//��ɫ�����Ƚϰ�ť�����¼�
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
				System.out.println("δ��ȡ��ͼƬ");
			}
		}
		});
		//���������Ƚϰ�ť�����¼�
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
					System.out.println("δ��ȡ��ͼƬ");
				}
		}
		});
    }
    public static void main(String[] args) {
        new showui();
    }
}