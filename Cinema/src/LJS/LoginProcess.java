package LJS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kyc.Ticket;

public class LoginProcess {
	public static Member nowMember;
	
	public Member memberInput() {		
		Scanner sc = new Scanner(System.in);
		ArrayList<Ticket> ticketList = new ArrayList<>();
	
		System.out.println("���̵� �Է��ϼ���.");
		String id = sc.next();
		sc.nextLine();
		System.out.println(id);
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String password = sc.next();
		sc.nextLine();
		System.out.println(password);
		nowMember = new Member(id, password, ticketList);
		return nowMember;	
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
