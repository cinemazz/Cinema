package knh;

import java.util.Scanner;

public class Entrance {
	
	static boolean checkLogin;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		new EntranceFunction();
		
		checkLogin = EntranceFunction.logIn(sc);
		
		if(checkLogin) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			
			MovieTicketing mt = new MovieTicketing();
			mt.screenMain(sc);
			
			//����ȭ���̵� ���Ḧ�ϵ� ���Ŀ� �ۼ�
		}
		sc.close();
	}

}
