package knh;

import java.util.Scanner;

import LJS.LoginProcess;
import kyc.*;
import test.mian;

public class MovieTicketing {

	public void screenMain(Scanner sc) {
		String input;
		boolean repeatFlag;
		mian menu = new mian();
		Ticketing ticketing = new Ticketing();		
		
		do {
			repeatFlag = true;
			System.out.println("===================================================");
			System.out.println();
			System.out.println("1. 영화 예매   2. 영화 검색   3.예매한 정보 보기   4. 고객센터   5. 종료");
			System.out.println();
			System.out.println("===================================================");
			System.out.println("사용할 메뉴를 선택해주세요.");
	
			input = sc.nextLine();
			if(input.matches("1")) {
				System.out.println("영화예매 메소드 호출");
				ticketing.ticketing();
			}else if(input.matches("2")){
				menu.search(sc);
				//SearchMovie.method()
			}else if(input.matches("3")) {
				new TicketingCheck().showInfo(LoginProcess.nowMember.getTicketList());				
				//매개변수로 로그인된 맴버와 영화를 넘겨준다
				//그러기위해선 여기 클래스에 매개변수로 맴버객체를 받고
				//영화객체를 생성해 놓아야한다.
			}else if (input.matches("4")) {
				System.out.println("고객센터입니다.");
				menu.service(sc);
			}else if(input.matches("5")) {
				System.out.println("영화 예매 시스템을 종료합니다.");
				repeatFlag = false;
			}else {
				System.out.println("입력을 다시 확인해주세요.");
			}
		}while(repeatFlag);//종료전까지 반복한다.
	}
}
