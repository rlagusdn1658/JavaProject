
 
	 class Library {
        int Book;//첵
        int Employee;//직원
        int Computer;//컴퓨터
        String Usetime;//이용시간 
        
        void Print1(){
        System.out.println("도서관에 책의개수는" + Book + "개이고 직원의수는" + Employee + "명이있고컴퓨터는" + Computer + "개보유하고있으며 이용시간은" + Usetime + "까지입니다");
        }
        
        static void main(String[] args) {
    		// TODO Auto-generated method stub
        	Library l;
        	l = new Library();
        	l.Book = 300;
        	l.Employee = 3;
        	l.Computer = 2;
        	
}

}
class  user{
String name;//사용자이름
int PhoneNumber; //전화번호 
int age;//나이
int memorandum;   //각서
int loanCound;//대출할수있는책의수
void Print2(){
	
}


static void main(String[] args) {
	// TODO Auto-generated method stub
}
}
class book{
	String genre;//장르
	String title;//책이름
    int agelimit;//책의나이제한
    int lendCound;//총빌려간수
	

   

static void main(String[] args) {
	// TODO Auto-generated method stub
}
}
