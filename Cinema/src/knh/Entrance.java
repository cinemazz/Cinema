package knh;

import java.util.Scanner;

public class Entrance {
	
	static boolean checkLogin;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		new EntranceFunction();
		
		checkLogin = EntranceFunction.logIn(sc);
		
		if(checkLogin) {
			System.out.println("로그인 되었습니다.");
			
			MovieTicketing mt = new MovieTicketing();
			mt.screenMain(sc);
			
			//다음화면이든 종료를하든 이후에 작성
		}
		sc.close();
	}

}
