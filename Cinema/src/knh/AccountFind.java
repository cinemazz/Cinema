package knh;

import LJS.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountFind {
	
	final String EXIT = "EXIT";
	
	public void check_PhoneNumber(ArrayList<Member> memberList) {//�Ű������� ȸ������ �ޱ�, ȸ�������� �̿��� �˻�
		String phonePattern = "\\d{3}-\\d{4}-\\d{4}";
		Scanner sc = new Scanner(System.in);
		boolean repeatFlag;
		boolean findAccount = false;
		String input;
		
		do {
			System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���. (�Է����� : 000-0000-0000) (�������� 'exit'�� �Է��ϼ���.)");
			input = sc.nextLine();
			repeatFlag = input.matches(phonePattern);
			
			if(EXIT.matches(input.toUpperCase())) {//�߰��� �׸��α�
				System.out.println("ID/PW ã�⸦ �׸��Ӵϴ�.");
				break;
			}else if(!repeatFlag) {//��ȿ�� �˻�
				System.out.println("���л��� : �ڵ�����ȣ ������ ���� �ʽ��ϴ�.");
				continue;
			}
		
			for (Member member : memberList) {
				if(member.getPhone().equals(input)) {
					System.out.println(input +" ��ȣ�� ���̵�� ��й�ȣ�� �����մϴ�.");
					System.out.println("���̵�   : "+member.getId());
					System.out.println("��й�ȣ: "+member.getPassword());
					findAccount = true;
				}
			}
			
			if(findAccount) {
				break;
			}else{
				System.out.println("�ش� ��ȣ�� ���Ե� ������ �����ϴ�.");
				repeatFlag = false;
			}
		
		}while(!repeatFlag);
		
		//sc.close();
	}
}
