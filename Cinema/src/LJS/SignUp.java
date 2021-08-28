package LJS;
import java.util.ArrayList;
import java.util.List;


public class SignUp {

	public static boolean signUp() {	

		
		List<Member> memberList = new ArrayList<>();
		memberList.add(new Member("kangnh","nh123","010-1234-5678"));
		memberList.add(new Member("kimyc","yc456","010-2345-6789"));
		memberList.add(new Member("leejs","js789","010-3456-7890"));
		memberList.add(new Member("jeongmj","mj987","010-4567-8901"));
		
		boolean SignUpSuccess = false;
		
		while(!SignUpSuccess) {
			
			SignUpProcess signup = new SignUpProcess();
			Member member = signup.memberInput();
			
			SignUpSuccess = signup.register(memberList, member);
			
			if(SignUpSuccess) {
				System.out.println("회원가입에 실패하였습니다.");
			}else {
				System.out.println("=====================================");
				System.out.println("회원가입 성공");
			}
			
		}
		return SignUpSuccess;

	}
	
}