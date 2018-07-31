

	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class Calculator extends JFrame {
		
		private JPanel panel;
		private JTextField tField;
		private JButton[] button;
		private String[] labels = {
				      "backspace","","","CE","C",
				      "7", "8", "9", "/", "sqrt",
				      "4", "5", "6", "x", "%",
				      "1", "2", "3", "-", "1/x",
				      "0", "+/-", ".", "+", "=", 
		
			
			
	};
		
		public void Calculator(){
			tField = new JTextField(35);
			panel = new JPanel();
			tField.setText("0.");
			tField.setEnabled(false);
			
			
			panel.setLayout(new GridLayout(0, 5,3,3));
			button = new JButton[25];
			int index = 0;
			for(int rows = 0; rows < 5; rows++){
				for(int cols = 0; cols < 5; cols++){
					button[index] = new JButton(labels[index]);
					if(cols >= 3)
						button[index].setForeground(Color.red);
					else
						button[index].setForeground(Color.blue);
					button[index].setBackground(Color.YELLOW);
					panel.add(button[index]);
					index++;
					add(tField, BorderLayout.NORTH);
					 add(panel, BorderLayout.CENTER);
					 setVisible(true);
					 pack(); 
				}
			}
		}
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator s = new Calculator();

	}

}
