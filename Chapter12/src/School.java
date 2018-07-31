import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.Selector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;





public class School extends JFrame{
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/test?serverTimezone=UTC";
	
	 String id = "root";   
	 String password = "password";
	protected static Object query;
	private static  Connection con = null;
    private static PreparedStatement pstmt = null;
    
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setLayout(new GridLayout());
		GridLayout p1 = new GridLayout(4, 3);
		f.add(p);
		
		
	         
		JLabel label = new JLabel("이름");
		JLabel label2 = new JLabel("국어점수");
		JLabel label3 = new JLabel("영어점수");
		JLabel label4 = new JLabel("수학점수");
		
		
		JTextField field = new JTextField(5);
		JTextField field2 = new JTextField(5);
		JTextField field3 = new JTextField(5);
		JTextField field4 = new JTextField(5); 
		
		
		JButton btn = new JButton("추가");
	    JButton btn2 = new JButton("제거");
		JButton btn3 = new JButton("수정");
		
		
		
		
		p.setLayout(p1);
		p.add(label);
		p.add(field);
		p.add(btn);
		
		
		p.add(label2);
	    p.add(field2);
	    p.add(btn2);
	    
	    
	    p.add(label3);
	    p.add(field3);
	    p.add(btn3);
	    
	    
	    p.add(label4);
	    p.add(field4);
	    
	    
	    String header[] = {"이름","국어점수","영어점수","수학점수","총점","평균"};
	    String contents[][] = {{"김현우","100","100","100"},
	    		
	    		
	    		
	    		
	    };
	    		
	    
	    
	    
		DefaultTableModel model = new DefaultTableModel(contents,header);
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		f.add(scrollPane);
		f.pack();
		f.setVisible(true);
		f.setSize(800,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btn.addActionListener(new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input[] = new String[4];
				
				input[0] = field.getText();
				input[1] = field2.getText();
				input[2] = field3.getText();
				input[3] = field4.getText();
				model.addRow(input);
				
				field.setText("");
				field2.setText("");
				field3.setText("");
				field4.setText("");
				
				
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(table.getSelectedRow() == -1)
				{
					return;
				}
				else
				{
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		
		
		btn3.addActionListener(new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println(e.getActionCommand());
				
				
				int row = table.getSelectedRow();
				if(row<0) return;
				
//				String query = "UPDATE user_info SET 이름=?",국어점수=?,영어점수=?,수학점수=?;
				
				try{
					Class.forName(DRIVER);
					con = DriverManager.getConnection(URL,"root","root");
					
					pstmt = con.prepareStatement((String) query);
					
					pstmt.setString(1,(String) model.getValueAt(row, 1));
					pstmt.setString(2,(String) model.getValueAt(row, 2));
					pstmt.setString(3,(String) model.getValueAt(row, 3));
					pstmt.setString(4,(String) model.getValueAt(row, 4));
					
					int cnt = pstmt.executeUpdate();

					pstmt.executeUpdate();
					pstmt.executeUpdate();
					
				
				}catch(Exception eeee){
					System.out.println(eeee.getMessage());
				}finally{
					try{
						pstmt.close();
						con.close();
					}catch(Exception e2){}
				}
				
				
				
			}

				
			

		
	
			

			
				
			
		});
		
		
	}


	
	
	}
	



