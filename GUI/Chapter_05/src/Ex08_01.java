import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        double height,weight,stweight;
        System.out.printf("Ű�� �Է��ϼ���");
        height = s.nextDouble();
        System.out.printf("�����Ը� �Է��Ͻÿ�");
        weight = s.nextDouble();
        
        stweight = (height-100)*0.9;
        
        if(weight<stweight)
        	System.out.printf("��ü��");
        else if(weight==stweight)
        	System.out.printf("����");
        else 
        	System.out.printf("��ü��");
        
        
	}
}
