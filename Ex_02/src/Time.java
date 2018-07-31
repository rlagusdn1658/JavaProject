
 class Time {
    private int hour;//시 0~25
    private int minute;//분 0분에서59분
    private int second;//초 0초에서59초
    private int year;
    private String month;
    private int day;
    
    
    public Time(){
    	this(0,0,0);
    	this(1900."1월",1 );
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
        System.out.println("기본생성자 호출 후시간 : " + time.toString());
        Time time2 = new Time(25,60,30);
        System.out.println("두번쨰 생성자 호출 후 시간: " + time2.toString());
        Time time3 = new Time(26,61,61);
        System.out.println("올바르지 않은 시간 설정 후시간 : "+ time3.toString());
       
	}

}
