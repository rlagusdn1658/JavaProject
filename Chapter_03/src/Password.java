import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s;
        String s1;
        String id="rlagusdn1658";
        String password="qwer1658";
        Scanner scan = new Scanner(System.in);
        System.out.println("아이디를 입력 하세요 :");
        s = scan.next();
        System.out.println("비밀번호를입력하시오: ");
        s1 = scan.next();
        
      
        if(s.equalsIgnoreCase(id)){
        	if(s1.equalsIgnoreCase(password))
        		
        System.out.println("로그인에 성공 하였습니다.");
        else
        	System.out.println("로그인에 실패하였습니다.");
	}

}
}
