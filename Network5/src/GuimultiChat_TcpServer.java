import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuimultiChat_TcpServer {
static String nick = null;
static JTextArea ta;
static JTextField tf;

static DataOutputStream out;

public static void main(String args[]){
	nick = JOptionPane.showInputDialog("당신의 대화명은?");
	FrClient f = new FrClient(nick);
	Socket socket;
	try{
		String serverIp = "127.0.0.1";
		socket = new Socket(serverIp, 7777 );
		System.out.println("서버에 연결돠었습니다");
		
	Thread receiver = new ClientReceiver(socket);
	receiver.start();
	Thread sender = new ClientSender(socket, nick);
	sender.start();
				
		
	}catch(ConnectException e){
		e.printStackTrace();
		System.out.println("접속 에러");
	}catch(Exception e){
		System.out.println("에러는애러");
	}
class ClientSender extends Thread{
	Socket socket;
	
	String name;
	
	ClientSender(Socket socket, String name){
		this.socket = socket;
		try{
			out = new DataOutputStream(socket.getOutputStream());
			this.name = name;
		}catch(Exception e){
			System.out.println("클라이언트 생성자 중 에러");
		}
	}
	public void run(){
		Scanner scanner = new Scanner(System.in);
		try{
			if(out!=null){
				out.writeUTF(name);
			}
			while(out!=null){
				out.writeUTF("["+ name +"]"+scanner.nextLine());
			}
		}catch(IOException e){
			System.out.println("클라이언트 센터 실행중 io 에러");
			
		}
	}
 }

class ClientReceiver extends Thread{
	Socket socket;
    DataInputStream in;
    
    ClientReceiver(Socket socket) {
    	this.socket = socket;
    	
    	try{
    		in = new DataInputStream(socket.getInputStream());
    		
    	}catch(IOException e){
    		System.out.println("클라이언트 리시버 실행중 입출력 에러");
    		
    	
    	}
    }
		public void run(){
			while(in!=null){
				try{
					String s = in.readUTF();
					System.out.println(s);
					ta.append(s+"\n");
				}catch(IOException e){
					System.out.println("클라이언트 리시버 메소즈 실행중 입출력 에러");
				}
			}
		}
	}


@SuppressWarnings("serial")
static class FrClient extends JFrame implements ActionListener{
	public FrClient(String nick){
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(nick+"의 채팅방 클라이언트!");
		setLayout(new BorderLayout());
		
		
		JLabel label = new JLabel("This is a server!");
		ta = new JTextArea(25,40);
		tf = new JTextField(25);
		tf.addActionListener(this);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		JLabel label2 = new JLabel(nick + "닉");
		panel.add(label2, BorderLayout.WEST);
		panel.add(tf,BorderLayout.CENTER);
		
		add(label, BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionListener e){
		if(e.getSource()==tf){
			try{
				out.writeUTF("["+ nick +"]"+ tf.getText());
				tf.setText("");
				
			}catch (IOException e1){
				System.out.println("gui 창에서 메시지 보내는게 에러");
				
			}
			
		}
	}
}
}
   }
			
			
			
			
			
			
			
			
			
			
			
			

