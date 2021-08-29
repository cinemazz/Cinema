package LJS;

import java.util.List;
import java.util.regex.*;
import java.util.Scanner;

public class SignUpProcess {
	
	public Member memberInput() {		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("����� ���̵� �Է��ϼ���.");
		String id2 = sc.next();
		sc.nextLine();
		System.out.println("����� ��й�ȣ�� �Է��ϼ���.");
		String password2 = sc.next();
		sc.nextLine();
		System.out.println("ID/PW ã�⿡ �ʿ��� ��ȭ��ȣ�� �Է��ϼ���.(�Է�����: 010-0000-0000)");
		String phone2 = sc.next();
		sc.nextLine();
		boolean phone2Reg = Pattern.matches("^010-([0-9]{4})-([0-9]{4})", phone2);
		
		while(!phone2Reg) {
			System.out.println("��ȭ��ȣ�� �Է� ���Ŀ� ���� �Է��ϼ���.");
			phone2 = sc.next();
			sc.nextLine();
			phone2Reg = Pattern.matches("^010-([0-9]{4})-([0-9]{4})", phone2); 
		}
	
		return new Member(id2, password2, phone2);
	}
	

	public boolean register(List<Member> memberList, Member input) { 

		for (Member member : memberList) {
			
			if(member.getId().equals(input.getId())) {
				System.out.println("=====================================");
				System.out.println("�ߺ��� ���̵��Դϴ�.");
				return false;
				
			}else if(member.getPhone().equals(input.getPhone())) {
				System.out.println("=====================================");
				System.out.println("�̹� ���Ե� ��ȭ��ȣ�Դϴ�.");
				return false;
			}
		}
		return true;
	}
}