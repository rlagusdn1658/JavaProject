import java.awt.BorderLayout; 
 import java.awt.Button; 
 import java.awt.Dimension; 
 import java.awt.FlowLayout; 
 import java.awt.GridLayout; 
 import java.awt.Panel; 
 
 
 import javax.swing.BoxLayout; 
 import javax.swing.JButton; 
 import javax.swing.JFrame; 
 import javax.swing.JLabel; 
 import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea; 
 import javax.swing.JTextField; 
 
 
 public class School extends JFrame { 
 
  	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 		JFrame f = new JFrame(); 
 		JPanel panel = new JPanel();
 		f.add(panel); 
		f.setLayout(new GridLayout()); 

 		
 		
  
 
 	
 		 
 		 
		Button btn =new Button("�̸�"); 
	 
		JTextField field = new JTextField(5); 
	JButton button = new JButton("�߰�"); 
 		 
		 
 		Button btn2 =new Button("��������"); 
 		
 		JTextField field2 = new JTextField(5); 
 		JButton button2 = new JButton("����"); 
 		 
 		 
 		Button btn3 =new Button("��������"); 
 		
 		JTextField field3 = new JTextField(5); 
 		JButton button3 = new JButton("����");  		 
 		 
        Button btn4 =new Button("��������"); 
 		
 		JTextField field4 = new JTextField(5);
 		 
         
 		 
 		 
 		 
 		 
 		  		 
 		 
 		panel.add(btn); 
 		panel.add(field); 
 		panel.add(button); 
 		panel.add(btn2); 
 		panel.add(field2); 
 		panel.add(button2); 
 		panel.add(btn3); 
 		panel.add(field3); 
		panel.add(button3); 
		panel.add(btn4); 
 		panel.add(field4); 
 	 
		String header[] = {"�̸�","��������","��������","��������","����","���"};
 		String contents[][]= {};
 	
 		
 		
 		JTable table = new JTable(contents,header);
 		JScrollPane scrollPane = new JScrollPane(table);
 		f.add(scrollPane);
 		f.pack();
 		f.setVisible(true);
 		
 
 
 		
 }
 }

 

