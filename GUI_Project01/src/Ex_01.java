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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex_01 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		f.setLayout(new GridLayout());
		
		
		
		Button btn =new Button("이름");
		btn.setBounds(10, 250, 150, 100);
		JTextField field = new JTextField(5);
		JButton button = new JButton("추가");
		
		
		Button btn2 =new Button("영어점수");
		btn2.setSize(50, 50);
		JTextField field2 = new JTextField(5);
		JButton button2 = new JButton("제거");
		
		
		Button btn3 =new Button("국어점수");
		btn3.setSize(50, 50);
		JTextField field3 = new JTextField(5);
		JButton button3 = new JButton("수정");
		
		
		
		
       
		
		
		
		
		
		
		
		panel.add(btn);
		panel.add(field);
		panel.add(button);
		panel.add(btn2);
		panel.add(field2);
		panel.add(button2);
		panel.add(btn3);
		panel.add(field3);
		panel.add(button3);
		
	
	

		f.setSize(230, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
