
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
		System.out.println("계열 요소의 최대값은" + max + "입니다");
		System.out.println("계열 요소의 최소값은" + min + "입니다");
	}

}
