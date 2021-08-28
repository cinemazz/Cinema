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
			System.out.println("1. 로그인   2. 회원가입   3.ID/PW 찾기   4. 종료");
			System.out.println();
			System.out.println("=====================================");
			System.out.println("사용할 메뉴를 선택해주세요.");
	
			input = sc.nextLine();
			if(input.matches("1")) {
				new Login();
				checkLogin = Login.login();
				if(checkLogin) {
					repeatFlag = false;
				}else {
					System.out.println("메뉴 선택창으로 돌아옵니다.");
				}
				//lim.method()
				//return member객체
				
			}else if(input.matches("2")){
				System.out.println("회원가입 메소드");
				//new 회원가입().메소드();
				//로그인 메소드 사용(lim.method();)
				//회원가입 결과에 상관없이 다시 로그인창으로 간다.
				
			}else if(input.matches("3")) {
				System.out.println("ID/PW찾기");
				System.out.println("==================");
				new main().callAccountFind();
				//로그인 메소드 사용(lim.method();)
				
			}else if(input.matches("4")) {
				System.out.println("영화 예매 시스템을 종료합니다.");
				repeatFlag = false;
			}else {
				System.out.println("입력을 다시 확인해주세요.");
			}
		}while(repeatFlag);//입력이 틀렸을경우 반복하는 while
		
		return checkLogin;
	}

}
