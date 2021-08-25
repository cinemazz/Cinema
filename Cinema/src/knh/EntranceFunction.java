package knh;

import java.util.Scanner;

import LJS.LogInMain;

public class EntranceFunction {
	
	public void logIn(Scanner sc) {
		
		String input;
		boolean repeatFlag;
		
		do {
			LogInMain lim = new LogInMain(); 
			repeatFlag = false;
			System.out.println("=====================================");
			System.out.println();
			System.out.println("1. 로그인   2. 회원가입   3.ID/PW 찾기   4. 종료");
			System.out.println();
			System.out.println("=====================================");
			System.out.println("사용할 메뉴를 선택해주세요.");
	
			input = sc.nextLine();
			if(input.matches("1")) {
				System.out.println("로그인 객체 생성(확인용)");
				//lim.method()
				//지금은 여기 메인이 들어가있지만 로그인을 하는 행위를
				//메소드로 만들어서 lim.method();형식으로 사용한다.
			}else if(input.matches("2")){
				//new 회원가입().메소드();
				//로그인 메소드 사용(lim.method();)
			}else if(input.matches("3")) {
				System.out.println("ID/PW찾기");
				System.out.println("==================");
				new main().callAccountFind();
				//로그인 메소드 사용(lim.method();)
			}else if(input.matches("4")) {
				System.out.println("영화 예매 시스템을 종료합니다.");
			}else {
				System.out.println("입력을 다시 확인해주세요.");
				repeatFlag = true;
			}
		}while(repeatFlag);//입력이 틀렸을경우 반복하는 while
	}

}
