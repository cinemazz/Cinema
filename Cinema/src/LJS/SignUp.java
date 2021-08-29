package LJS;
import java.util.ArrayList;
import java.util.List;


public class SignUp {

	public static boolean signUp(List<Member> memberList) {					

		boolean SignUpSuccess = false;
		
		SignUpProcess signup = new SignUpProcess();
		Member member = signup.memberInput();
		SignUpSuccess = signup.register(memberList, member);		
		while(!SignUpSuccess) {
			System.out.println("회원가입을 다시 해주세요");
			member = signup.memberInput();
			SignUpSuccess = signup.register(memberList, member);
			if(!SignUpSuccess) {
				System.out.println("회원가입에 실패하였습니다.");
			}
		}
		
		System.out.println("=====================================");
		System.out.println("회원가입 성공");
		Login.memberList.add(member);
						
		return SignUpSuccess;
	}
	
}