package LJS;
import java.util.ArrayList;
import java.util.List;


public class Login {


	public static boolean login() {
		
		
		// ȸ������ �� �����ʹ� �Ʒ� memberList�� ����.. �α��� �׽�Ʈ�� ���� ������
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
				System.out.println("�α��� ����");
				return loginSuccess;
			}else{
				chance++;
				if(chance>=5) {
					System.out.println("==========================================");
					System.out.println("�α��� �õ� Ƚ���� 5���� �ʰ��߽��ϴ�.");
					System.out.println("==========================================");
					break;
				}
				else {
					System.out.println("==========================================");
					System.out.println("���̵� Ȥ�� ��й�ȣ�� ���� �ʽ��ϴ�.\n�ٽ� �α��� �� �ּ���. (���� �õ� Ƚ�� : "+ (5-chance)+")");
					System.out.println("==========================================");	
				}
			}
			
		}
		return loginSuccess;
	}
	
}