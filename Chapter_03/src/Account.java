import java.util.Scanner;

public class Account {
 private int regNumber;
 private String name;
 private int balance;
 
 public String getName(){return name;}
 public void setName(String name){  this.name = name;}
 public int getBalance(){  return balance;}
 public void setbalance(int balance){   this.balance = balance;}
 
 public void setBalnce(int balace)
 {
	 if(0 >= balance){
		 System.out.println("�߸����Է� ");
	 }else{
		 this.balance = balance;
		 
	 }
		 
 }



 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s;
		 Scanner scan = new Scanner(System.in);
        scan.nextInt();
        obj.setName("Tom");
        obj.setbalance();
        obj.setbalance(100000);
        System.out.println("�̸���" + obj.getName() + "�����ܰ��"+ obj.getBalance() + "�Դϴ�.");
	}
}
	


