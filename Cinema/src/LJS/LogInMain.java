package LJS;
import java.util.Scanner;

public class LogInMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요!");
		String id = sc.nextLine();
		
		System.out.println("비밀번호를 입력하세요!");
		String password = sc.nextLine();
		
		System.out.println("전화번호를 입력하세요!");
		String phone = sc.nextLine();
		
		LogIn logIn = new LogIn();
		Member m1 = logIn.LogIn(id, password, phone);
		
		sc.close();
		
		// id 와 pw를 확인하는 메소드 삽입 (memberData에서 끌어오기) > 로그인 성공 여부 출력
		// 성공 시 > 영화 예매 메뉴 (영화 예매 메뉴 호출)
		// 실패 시 > 로그인 메뉴 (메인 화면 호출)
	
	}

}