package knh;

import java.util.Scanner;

public class MovieTicketing {

	public void screenMain(Scanner sc) {
		String input;
		boolean repeatFlag;
		
		do {
			repeatFlag = true;
			System.out.println("==========================================");
			System.out.println();
			System.out.println("1. ��ȭ ����   2. ��ȭ �˻�   3.������ ���� ����   4. ����");
			System.out.println();
			System.out.println("==========================================");
			System.out.println("����� �޴��� �������ּ���.");
	
			input = sc.nextLine();
			if(input.matches("1")) {
				System.out.println("��ȭ���� �޼ҵ� ȣ��");
			}else if(input.matches("2")){
				System.out.println("��ȭ�˻� �޼ҵ� ȣ��");
			}else if(input.matches("3")) {
				new TicketingCheck().showInfo();
			}else if(input.matches("4")) {
				System.out.println("��ȭ ���� �ý����� �����մϴ�.");
				repeatFlag = false;
			}else {
				System.out.println("�Է��� �ٽ� Ȯ�����ּ���.");
			}
		}while(repeatFlag);//�Է��� Ʋ������� �ݺ��ϴ� while
	}
}
