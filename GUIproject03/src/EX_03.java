import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

import org.w3c.dom.css.CSSStyleDeclaration;

public class EX_03 extends JFrame{
	
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
	    String contents[][] = {};
		
		JTable table = new JTable( contents,header);
		JScrollPane scrollPane = new JScrollPane(table);
		f.add(scrollPane);
		f.pack();
		f.setVisible(true);
		f.setSize(800,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(new AbstractAction);
		
		
		

	}

}
