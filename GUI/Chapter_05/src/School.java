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

 		
 		
  
 
 	
 		 
 		 
		Button btn =new Button("이름"); 
	 
		JTextField field = new JTextField(5); 
	JButton button = new JButton("추가"); 
 		 
		 
 		Button btn2 =new Button("영어점수"); 
 		
 		JTextField field2 = new JTextField(5); 
 		JButton button2 = new JButton("제거"); 
 		 
 		 
 		Button btn3 =new Button("국어점수"); 
 		
 		JTextField field3 = new JTextField(5); 
 		JButton button3 = new JButton("수정");  		 
 		 
        Button btn4 =new Button("수학점수"); 
 		
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
 	 
		String header[] = {"이름","영어점수","국어점수","수학점수","총점","평균"};
 		String contents[][]= {};
 	
 		
 		
 		JTable table = new JTable(contents,header);
 		JScrollPane scrollPane = new JScrollPane(table);
 		f.add(scrollPane);
 		f.pack();
 		f.setVisible(true);
 		
 
 
 		
 }
 }

 

