package LJS;

import java.util.List;
import java.util.Scanner;

public class SignUpProcess {
	
	public Member memberInput() {

		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("����� ���̵� �Է��ϼ���.");
		String id2 = sc.nextLine();
		System.out.println("����� ��й�ȣ�� �Է��ϼ���.");
		String password2 = sc.nextLine();
		System.out.println("ID/PW ã�⿡ �ʿ��� ��ȭ��ȣ�� �Է��ϼ���.");
		String phone2 = sc.nextLine();
	
		return new Member(id2, password2, phone2);	
		
	}
	

	public boolean register(List<Member> memberList, Member input) { 

		for (Member member : memberList) {
			
			if(member.getId().equals(input.getId())) {
				System.out.println("=====================================");
				System.out.println("�ߺ��� ���̵��Դϴ�.");
				return true;
				
			}else if(member.getPhone().equals(input.getPhone())) {
				System.out.println("=====================================");
				System.out.println("�̹� ���Ե� ��ȭ��ȣ�Դϴ�.");
				return true;
			}
		}
		return false;
	}
}