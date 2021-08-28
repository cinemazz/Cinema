package LJS;
import java.util.ArrayList;
import java.util.List;


public class Login {


	public static boolean login() {
		
		
		// 회원가입 된 데이터는 아래 memberList에 저장.. 로그인 테스트를 위한 데이터
		List<Member> memberList = new ArrayList<>();
		memberList.add(new Member("kangnh","nh123","010-1234-5678"));
		memberList.add(new Member("kimyc","yc456","010-2345-6789"));
		memberList.add(new Member("leejs","js789","010-3456-7890"));
		memberList.add(new Member("jeongmj","mj987","010-4567-8901"));

		
		boolean loginSuccess = false;
		int chance = 0;
		
		while(!loginSuccess) {
			
			LoginProcess login = new LoginProcess();
			Member member = login.memberInput();
			
			loginSuccess = login.doLogin(memberList, member);
			
			if(loginSuccess) {
				System.out.println("==========================================");
				System.out.println("로그인 성공");
				return loginSuccess;
			}else{
				chance++;
				if(chance>=5) {
					System.out.println("==========================================");
					System.out.println("로그인 시도 횟수가 5번을 초과했습니다.");
					System.out.println("==========================================");
					break;
				}
				else {
					System.out.println("==========================================");
					System.out.println("아이디 혹은 비밀번호가 맞지 않습니다.\n다시 로그인 해 주세요. (남은 시도 횟수 : "+ (5-chance)+")");
					System.out.println("==========================================");	
				}
			}
			
		}
		return loginSuccess;
	}
	
}