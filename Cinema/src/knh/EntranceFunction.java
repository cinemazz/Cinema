package knh;

import java.util.Scanner;

import LJS.Login;
import LJS.SignUp;

public class EntranceFunction {
	
	public static boolean logIn(Scanner sc) {
		
		String input;
		boolean repeatFlag;
		boolean checkLogin = false;
		
		do {
			repeatFlag = true;
			System.out.println("=====================================");
			System.out.println();
			System.out.println("1. �α���   2. ȸ������   3.ID/PW ã��   4. ����");
			System.out.println();
			System.out.println("=====================================");
			System.out.println("����� �޴��� �������ּ���.");
	
			input = sc.nextLine();
			if(input.matches("1")) {
				new Login();
				checkLogin = Login.login();
				if(checkLogin) {
					repeatFlag = false;
				}else {
					System.out.println("�޴� ����â���� ���ƿɴϴ�.");
				}
				//lim.method()
				//return member��ü
				
			}else if(input.matches("2")){
				System.out.println("ȸ������ �޼ҵ�");
				//new ȸ������().�޼ҵ�();
				//�α��� �޼ҵ� ���(lim.method();)
				//ȸ������ ����� ������� �ٽ� �α���â���� ����.
				
			}else if(input.matches("3")) {
				System.out.println("ID/PWã��");
				System.out.println("==================");
				new main().callAccountFind();
				//�α��� �޼ҵ� ���(lim.method();)
				
			}else if(input.matches("4")) {
				System.out.println("��ȭ ���� �ý����� �����մϴ�.");
				repeatFlag = false;
			}else {
				System.out.println("�Է��� �ٽ� Ȯ�����ּ���.");
			}
		}while(repeatFlag);//�Է��� Ʋ������� �ݺ��ϴ� while
		
		return checkLogin;
	}

}
