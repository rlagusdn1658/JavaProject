import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s;
        String s1;
        String id="rlagusdn1658";
        String password="qwer1658";
        Scanner scan = new Scanner(System.in);
        System.out.println("���̵� �Է� �ϼ��� :");
        s = scan.next();
        System.out.println("��й�ȣ���Է��Ͻÿ�: ");
        s1 = scan.next();
        
      
        if(s.equalsIgnoreCase(id)){
        	if(s1.equalsIgnoreCase(password))
        		
        System.out.println("�α��ο� ���� �Ͽ����ϴ�.");
        else
        	System.out.println("�α��ο� �����Ͽ����ϴ�.");
	}

}
}
