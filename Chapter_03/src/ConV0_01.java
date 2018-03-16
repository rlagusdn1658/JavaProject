
import java.util.Scanner;

public class ConV0_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s;
        char s2;
        
        
        int count1 = 0, count2 = 0, count3 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열 을 입력 하십시오 :");
        s = scan.next();
        for(int i = 0; i <s.length(); i++){
        	s2 = s.charAt(i);
        	
        	if(s2 >= 'A' && s2 <= 'Z' ){ 
        		count1++;}//행동
        			if(s2 >= 'a'&& s2 <='z'){count2++;}
        				
        				if(s2 >='0' && s2<='9'){count3++;
        					
        				
        			
        						
        				
        				}
        					
        			
        }
        System.out.println("대문자의개수 : " + count1);
        System.out.println("소문자의개수 : " + count2);
        System.out.println("숫자의개수 : " + count3);
        	}
        
}



	


