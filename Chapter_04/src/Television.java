
public class Television {
      private int channel;
      private int volume;
      private boolean onOff;
     
    	
    	  
    	  
      

      
Television (int c, int v,boolean o){//������
	channel = c;
	volume = v;
	onOff = o;
}
	void print(){
		System.out.println("ä���� " + channel + "�̰�����"+ volume + "�Դϴ�");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Television myTv = new Television(7,10,true);
        myTv.print();
        Television yourTv = new Television(10,20,true);
        yourTv.print();
	}

}
