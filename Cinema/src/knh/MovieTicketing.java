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
			System.out.println("1. 영화 예매   2. 영화 검색   3.예매한 정보 보기   4. 종료");
			System.out.println();
			System.out.println("==========================================");
			System.out.println("사용할 메뉴를 선택해주세요.");
	
			input = sc.nextLine();
			if(input.matches("1")) {
				System.out.println("영화예매 메소드 호출");
			}else if(input.matches("2")){
				System.out.println("영화검색 메소드 호출");
			}else if(input.matches("3")) {
				new TicketingCheck().showInfo();
			}else if(input.matches("4")) {
				System.out.println("영화 예매 시스템을 종료합니다.");
				repeatFlag = false;
			}else {
				System.out.println("입력을 다시 확인해주세요.");
			}
		}while(repeatFlag);//입력이 틀렸을경우 반복하는 while
	}
}
