import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        double height,weight,stweight;
        System.out.printf("키를 입력하세요");
        height = s.nextDouble();
        System.out.printf("몸무게를 입력하시오");
        weight = s.nextDouble();
        
        stweight = (height-100)*0.9;
        
        if(weight<stweight)
        	System.out.printf("저체중");
        else if(weight==stweight)
        	System.out.printf("정상");
        else 
        	System.out.printf("과체중");
        
        
	}
}
