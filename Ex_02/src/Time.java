
 class Time {
    private int hour;//�� 0~25
    private int minute;//�� 0�п���59��
    private int second;//�� 0�ʿ���59��
    private int year;
    private String month;
    private int day;
    
    
    public Time(){
    	this(0,0,0);
    	this(1900."1��",1 );
    }
    
    public Time(int h,int m, int s, int y,String m2,int d){
    	hour = ((h >= 0 && h < 25) ? h : 0);
    	minute = ((m >= 0 && m < 60) ? m : 0);
    	second =  ((s >= 0 && s < 60) ? s : 0);
    	this.day = day;
    	this.month = month;
    	this.year = year;
    }
    @Override
    public String toString(){
     String.format("%02d: %02d: %02d",hour,minute,second );
    	return"Date[year=" + year + ", month=" + month + ", day="+ day +"]";
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Time time = new Time();
        System.out.println("�⺻������ ȣ�� �Ľð� : " + time.toString());
        Time time2 = new Time(25,60,30);
        System.out.println("�ι��� ������ ȣ�� �� �ð�: " + time2.toString());
        Time time3 = new Time(26,61,61);
        System.out.println("�ùٸ��� ���� �ð� ���� �Ľð� : "+ time3.toString());
       
	}

}
