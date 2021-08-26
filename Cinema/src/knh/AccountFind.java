package knh;

import LJS.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountFind {
	
	final String EXIT = "EXIT";
	
	public void check_PhoneNumber(ArrayList<Member> memberList) {//매개변수로 회원정보 받기, 회원정보를 이용해 검사
		String phonePattern = "\\d{3}-\\d{4}-\\d{4}";
		Scanner sc = new Scanner(System.in);
		boolean repeatFlag;
		boolean findAccount = false;
		String input;
		
		do {
			System.out.println("핸드폰 번호를 입력하세요. (입력형식 : 000-0000-0000) (나가려면 'exit'를 입력하세요.)");
			input = sc.nextLine();
			repeatFlag = input.matches(phonePattern);
			
			if(EXIT.matches(input.toUpperCase())) {//중간에 그만두기
				System.out.println("ID/PW 찾기를 그만둡니다.");
				break;
			}else if(!repeatFlag) {//유효값 검사
				System.out.println("실패사유 : 핸드폰번호 형식이 맞지 않습니다.");
				continue;
			}
		
			for (Member member : memberList) {
				if(member.getPhone().equals(input)) {
					System.out.println(input +" 번호로 아이디와 비밀번호를 전송합니다.");
					System.out.println("아이디   : "+member.getId());
					System.out.println("비밀번호: "+member.getPassword());
					findAccount = true;
				}
			}
			
			if(findAccount) {
				break;
			}else{
				System.out.println("해당 번호로 가입된 정보가 없습니다.");
				repeatFlag = false;
			}
		
		}while(!repeatFlag);
		
		//sc.close();
	}
}
