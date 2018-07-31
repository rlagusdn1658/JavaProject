import java.util.Scanner;

public class HandPhonetest extends HandPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner sc = new Scanner(System.in);
	       String select = "";
	       System.out.println("\n### 친구 연락처 관리 ###\n");
	       System.out.println("연락처 출력");
	       System.out.println("연락처 등록");
	       System.out.println("연락처 삭제");
	       System.out.println("끝내기");
	       
	       
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
	    		   System.out.println("이름을 입력해주세요");
	    		   name = sc.nextLine();
	    		   
	    		   break;
	    	   case"3":
	    		   delete_juso();
	    		   
	    		   break;
	    	   case"4":
	    		   return;
	    		   default:
	    			   System.out.println("\n질못입력했어 다시 ㄱㄱ"\n);
	    	   }
	       

	  
	    	   
	    	   
	       }
	}
}