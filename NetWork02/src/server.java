import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
class FrServer extends JFrame{
JTextArea ta;
JTextField tf;


public FrServer(){
	 setSize(600,400);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setTitle("ä�ù漭��");
	 setLayout(new BorderLayout());
	 
	 
	 JLabel label = new JLabel("This is a server !");
	 ta = new JTextArea(25, 40);
	 tf = new JTextField(25);
	 
	 add(label, BorderLayout.NORTH);
	 add(ta, BorderLayout.CENTER);
	 add(tf, BorderLayout.SOUTH);
	 
	}
}



     public class server{
    	 HashMap clients;
    	 
    	 server(){
    		 clients = new HashMap();
    		 Collections.synchronizedMap(clients);
    	 }
    	 
    	 
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrServer f = new FrServer();
		new server().start();

	}
	public void start(){
		ServerSocket serverSocket = null;
		Socket socket = null;
		try{
			serverSocket = new ServerSocket(7777);
			System.out.println("������ ���۵Ǿ����ϴ�");
			
			while(true){
				socket=serverSocket.accept();
				System.out.println("["+socket.getInetAddress()+"]"+"���� �����ϼ̽��ϴ�");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
				
				System.out.println("������ ���� :" + thread.getName());
		}
		
	
     }catch(Exception e){
    	 e.printStackTrace();
     }
}
	
	void sendToAll(String msg){
		Iterator it = clients.keySet().iterator();
		
		while(it.hasNext()){
			try{
				DataOutputStream out =(DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);
			}catch(IOException e){
				System.out.println("sendToall ����� ����");
			}
		}
	}
	
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket){
			this.socket = socket;
			try{
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
				
			}catch(IOException e){
				System.out.println("���� ���ù� ���� IO ����");
			}
		}
		
		public void run(){
			String name="";
			
			try{
				name = in.readUTF();
				sendToAll("#"+name+"���� �����̼��ϴ�");
				clients.put(name, out);
				System.out.println("���� ������ ���� "+clients.size()+"�Դϴ�");
				System.out.println("���� ������ ���:");
				
				while (in!= null){
					sendToAll(in.readUTF());
				}
				
			}catch(IOException e){
				System.out.println("���ù� ���� io����");
			}finally{
				sendToAll("#"+name+"���� �����̽��ϴ�~");
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress()+":"+socket.getPort()+"] ���� ������ �����մϴ�");
				System.out.println("���� ������ ���� "+clients.size()+"�Դϴ�");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		}
		
	}
