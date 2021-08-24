package knh;

import java.util.Scanner;

public class AccountFind {
	
	final String EXIT = "EXIT";
	
	public static void main(String[] args) {//확인용 메인-> 나중에 없앤다.
		AccountFind mf = new AccountFind();
		mf.check_PhoneNumber();
	}
	
	public void check_PhoneNumber() {//매개변수로 회원정보 받기, 회원정보를 이용해 검사
		String phonePattern = "\\d{3}-\\d{4}-\\d{4}";
		Scanner sc = new Scanner(System.in);
		boolean flag;
		String input;
		
		do {
			System.out.println("핸드폰 번호를 입력하세요. (입력형식 : 000-0000-0000) (나가려면 'exit'를 입력하세요.)");
			input = sc.nextLine();
			flag = input.matches(phonePattern);
			
			if(EXIT.matches(input.toUpperCase())) {//중간에 그만두기
				System.out.println("ID/PW 찾기를 그만둡니다.");
				break;
			}else if(!flag) {//유효값 검사
				System.out.println("실패사유 : 핸드폰번호 형식이 맞지 않습니다.");
				continue;
			}
		
		//if(해당되는 번호찾기 -> 있다)
		System.out.println(input +" 번호로 아이디와 비밀번호를 전송합니다.");
		System.out.println("아이디   : ");
		System.out.println("비밀번호: ");
		//else 번호가 없다  //정보가 없다는 출력문 후 다시 반복. flag값을 변경해서 다시 반복하도록 만듬
		System.out.println("해당 번호로 가입된 정보가 없습니다.");
		//flag = false;
		
		}while(!flag);
		
		sc.close();
	}
}
