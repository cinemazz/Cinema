package LJS;

import java.util.List;
import java.util.Scanner;

public class LoginProcess {
	
	public Member memberInput() {

		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("���̵� �Է��ϼ���.");
		String id = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String password = sc.nextLine();
	
		return new Member(id, password);	
		//����ڰ� �Է��� ���̵� �н����� ������ ���� ��ü
		
	}
	
	
	public boolean doLogin(List<Member> memberList, Member input) {
		
		for(Member member : memberList) {
			
			//���̵� �ִ°��
			if(member.getId().equals(input.getId())){
				
				//��й�ȣ�� ��ġ�ϴ� ���
				if(member.getPassword().equals(input.getPassword())){
					
					return true;
				}
				
			}
		}
		return false;
	}
	
}
