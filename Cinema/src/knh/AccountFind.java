package knh;

import java.util.Scanner;

public class AccountFind {
	
	final String EXIT = "EXIT";
	
	public static void main(String[] args) {//Ȯ�ο� ����-> ���߿� ���ش�.
		AccountFind mf = new AccountFind();
		mf.check_PhoneNumber();
	}
	
	public void check_PhoneNumber() {//�Ű������� ȸ������ �ޱ�, ȸ�������� �̿��� �˻�
		String phonePattern = "\\d{3}-\\d{4}-\\d{4}";
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String input;
		
		do {
			System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���. (�Է����� : 000-0000-0000) (�������� 'exit'�� �Է��ϼ���.)");
			input = sc.nextLine();
			flag = input.matches(phonePattern);
			
			if(EXIT.matches(input.toUpperCase())) {//�߰��� �׸��α�
				System.out.println("ID/PW ã�⸦ �׸��Ӵϴ�.");
				break;
			}else if(!flag) {//��ȿ�� �˻�
				System.out.println("���л��� : �ڵ�����ȣ ������ ���� �ʽ��ϴ�.");
				continue;
			}
		
		//if(�ش�Ǵ� ��ȣã�� -> �ִ�)
		System.out.println(input +" ��ȣ�� ���̵�� ��й�ȣ�� �����մϴ�.");
		System.out.println("���̵�   : ");
		System.out.println("��й�ȣ: ");
		//else ��ȣ�� ����  //������ ���ٴ� ��¹� �� �ٽ� �ݺ�. flag���� �����ؼ� �ٽ� �ݺ��ϵ��� ����
		System.out.println("�ش� ��ȣ�� ���Ե� ������ �����ϴ�.");
		//flag = false;
		
		}while(!flag);
		
		sc.close();
	}
}
