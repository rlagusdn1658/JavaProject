import java.util.Scanner;

public class Accou {

	public static void main(String[] args) {
	
		
			Account obj = new Account();
			Scanner scan = new Scanner(System.in);
			System.out.print("�ݾ� �� �Է� �Ͻʽÿ� :");
			obj.setMoney(scan.nextInt());
			System.out.println("�����ܰ��" + obj.getMoney() + "�Դϴ�.");
		}
	}
