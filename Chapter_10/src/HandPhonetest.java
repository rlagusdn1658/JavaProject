import java.util.Scanner;

public class HandPhonetest extends HandPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner sc = new Scanner(System.in);
	       String select = "";
	       System.out.println("\n### ģ�� ����ó ���� ###\n");
	       System.out.println("����ó ���");
	       System.out.println("����ó ���");
	       System.out.println("����ó ����");
	       System.out.println("������");
	       
	       
	       while (select !="4"){
	    	   print_menu();
	    	   select = sc.next();
	    	   
	    	   
	    	   switch (select){
	    	   case "1":
	    	   view_juso();
	    	   System.out.println("name" + name);
	    	   System.out.println("age" + age);
	    	   System.out.println("phone" + phone);
	    	   break;
	    	   case"2":
	    		   add_juso();
	    		   System.out.println("�̸��� �Է����ּ���");
	    		   name = sc.nextLine();
	    		   
	    		   break;
	    	   case"3":
	    		   delete_juso();
	    		   
	    		   break;
	    	   case"4":
	    		   return;
	    		   default:
	    			   System.out.println("\n�����Է��߾� �ٽ� ����"\n);
	    	   }
	       

	  
	    	   
	    	   
	       }
	}
}