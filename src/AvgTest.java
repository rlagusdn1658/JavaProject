
public class AvgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avg student1 = new Avg();
		Avg student2 = new Avg();
		student1.name = "김현우:";
		student2.name = "임찬미:";
		String st1_avg = student1.average(100, 77, 95);
		String st2_avg = student2.average(100, 100,100);
		System.out.println(st1_avg);
		System.out.println(st2_avg);

	}

}
