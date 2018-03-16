import java.util.Scanner;

public class Accou {

	public static void main(String[] args) {
	
		
			Account obj = new Account();
			Scanner scan = new Scanner(System.in);
			System.out.print("금액 을 입력 하십시오 :");
			obj.setMoney(scan.nextInt());
			System.out.println("통장잔고는" + obj.getMoney() + "입니다.");
		}
	}
