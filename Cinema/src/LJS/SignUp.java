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
			System.out.println("ȸ�������� �ٽ� ���ּ���");
			member = signup.memberInput();
			SignUpSuccess = signup.register(memberList, member);
			if(!SignUpSuccess) {
				System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
			}
		}
		
		System.out.println("=====================================");
		System.out.println("ȸ������ ����");
		Login.memberList.add(member);
						
		return SignUpSuccess;
	}
	
}