import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

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

	@SuppressWarnings("null")
	public static void main(String[] args ){
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JPanel panel = new JPanel(); 
		 Vector <Vector<String>> rowData = null;
		f.add(panel);
		f.setLayout(new GridLayout());
		
		GridLayout penel = new GridLayout(4, 3);

		Button btn = new Button("이름");

		JTextField field = new JTextField(5);
		JButton button = new JButton("추가");

		Button btn2 = new Button("영어점수");

		JTextField field2 = new JTextField(5);
		JButton button2 = new JButton("제거");
		

		Button btn3 = new Button("국어점수");

		JTextField field3 = new JTextField(5);
		JButton button3 = new JButton("수정");

		Button btn4 = new Button("수학점수");

		JTextField field4 = new JTextField(5);

		panel.setLayout(penel);
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

		String a [] = { "이름", "영어점수", "국어점수", "수학점수", "총점", "평균" };
		String b[][] = {};

		JTable table = new JTable(b, a);
		JScrollPane scrollPane = new JScrollPane(table);
		f.add(scrollPane);
		f.pack();
		f.setVisible(true);
		f.setSize(700,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = field.getText();
				String eng = field2.getText();
				String kor = field3.getText();
				String math = field4.getText();
				
				
				
				 Vector<String> v =new Vector<String>();
				    v.add(name);
				    v.add(kor);
				    v.add(eng);
				    v.add(math);
				   
				   rowData.addElement(v);
				    table.updateUI();
				    
				    field.setText("");
				    field2.setText("");
				    field3.setText("");
				    field4.setText("");
				    
			}
		});
		button3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = field.getText();
				String eng = field2.getText();
				String kor = field3.getText();
				String math = field4.getText();
				
				int total = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
				int average = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math)/3;
				
				int selection=table.getSelectedRow();
				 Vector<String> v =new Vector<String>();
				    v.add(name);
				    v.add(kor);
				    v.add(eng);
				    v.add(math);
				    v.add(total+"");
				    v.add(average+"");
				    
				    rowData.setElementAt(v, selection);
				   rowData.addElement(v);
				    table.updateUI();
				    
				    field.setText("");
				    field2.setText("");
				    field3.setText("");
				    field4.setText("");
				    
					
			}
		});
				    button2.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							 int selection=table.getSelectedRow();
						  rowData.remove(selection);
					    table.updateUI();
			
						   } 
						   
				    });
				    
				    
				    table.addMouseListener(new MouseListener() {
						
						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
				    
				    	   



				    	  
				    	  
				    	  
				    	  
				    	  }
				    	 
				    	 
				    	
				    	 {
				    	   new School();
				    	 }

				    	} 
		
	







