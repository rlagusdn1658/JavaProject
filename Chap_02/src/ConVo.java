import java.util.Scanner;

public class ConVo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s;
        char s2;
        int s3;
        
        int count1 = 0, count2 = 0, conut3 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열 을 입력 하십시오 :");
        s = scan.next();
        for(int i = 0; i <s.length(); i++){
        	s2 = s.charAt(i);
        	
        	if((s2 >= 'A' && s2 <= 'Z')) {
        			if(s2 >= 'a'&& s2 <='z'){
        				if(s2 >='0' && s2<='9'){
        					
        				
        				
        			
        
        			
        		
        			
        		
        			
        				
        	}
        }
        System.out.println("자음의개수 : " + count2);
        System.out.println("모음의개수 : " + count1);
        System.out.println("숫자의개수 : " + conut3);
        	}
        }
	}


