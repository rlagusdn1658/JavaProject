
public class ArrayOneDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {88,98,66,77,55,100};
		int max = score[0];
		int min = score[0];
		for(int i=1; i < score.length; i=i+1)
		{
			if(score[i] > max)
				max = score[i];
			if(score[i] < min)
				min = score[i];
                			
			
			
				
			
		}
		System.out.println("�迭 ����� �ִ밪��" + max + "�Դϴ�");
		System.out.println("�迭 ����� �ּҰ���" + min + "�Դϴ�");
	}

}
