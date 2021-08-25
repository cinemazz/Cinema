package LJS;
import java.util.Scanner;

public class LogInMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();
		
		System.out.println("비밀번호를 입력하세요.");
		String password = sc.nextLine();
		
		LogIn logIn = new LogIn();
		Member m1 = logIn.LogIn(id, password);
		
		MemberData data = new MemberData();
		data.login(id, password);
		
		if(m1.getId().equals(data) && m1.getPassword().equals(data)) {
			System.out.println("로그인 되었습니다.");
			// 영화 예매 메뉴 ㄱㄱ
		}else {
			System.out.println("아이디 혹은 비밀번호가 일치하지않습니다.");
			// 로그인 메뉴 ㄱㄱ
		}
		
		
		sc.close();
		
		// id 와 pw를 확인하는 메소드 삽입 (memberData에서 끌어오기) > 로그인 성공 여부 출력
		// 성공 시 > 영화 예매 메뉴 (영화 예매 메뉴 호출)
		// 실패 시 > 로그인 메뉴 (메인 화면 호출)
	
	}

}