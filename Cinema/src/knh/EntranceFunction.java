package knh;

import java.util.Scanner;

import LJS.Login;

public class EntranceFunction {
	
	public void logIn(Scanner sc) {
		
		String input;
		boolean repeatFlag;
		Login lim = new Login(); 
		
		do {
			repeatFlag = false;
			System.out.println("=====================================");
			System.out.println();
			System.out.println("1. �α���   2. ȸ������   3.ID/PW ã��   4. ����");
			System.out.println();
			System.out.println("=====================================");
			System.out.println("����� �޴��� �������ּ���.");
	
			input = sc.nextLine();
			if(input.matches("1")) {
				System.out.println("�α��� ��ü ����(Ȯ�ο�)");
				//lim.method()
				//return member��ü
				
			}else if(input.matches("2")){
				System.out.println("ȸ������ �޼ҵ�");
				//new ȸ������().�޼ҵ�();
				//�α��� �޼ҵ� ���(lim.method();)
				repeatFlag = true;
				//ȸ������ ����� ������� �ٽ� �α���â���� ����.
				
			}else if(input.matches("3")) {
				System.out.println("ID/PWã��");
				System.out.println("==================");
				new main().callAccountFind();
				//�α��� �޼ҵ� ���(lim.method();)
				
			}else if(input.matches("4")) {
				System.out.println("��ȭ ���� �ý����� �����մϴ�.");
				System.exit(0);
			}else {
				System.out.println("�Է��� �ٽ� Ȯ�����ּ���.");
				repeatFlag = true;
			}
		}while(repeatFlag);//�Է��� Ʋ������� �ݺ��ϴ� while
	}

}
