package LJS;

import java.util.List;
import java.util.regex.*;
import java.util.Scanner;

public class SignUpProcess {
	
	public Member memberInput() {		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("사용할 아이디를 입력하세요.");
		String id2 = sc.next();
		sc.nextLine();
		System.out.println("사용할 비밀번호를 입력하세요.");
		String password2 = sc.next();
		sc.nextLine();
		System.out.println("ID/PW 찾기에 필요한 전화번호를 입력하세요.(입력형식: 010-0000-0000)");
		String phone2 = sc.next();
		sc.nextLine();
		boolean phone2Reg = Pattern.matches("^010-([0-9]{4})-([0-9]{4})", phone2);
		
		while(!phone2Reg) {
			System.out.println("전화번호를 입력 형식에 맞춰 입력하세요.");
			phone2 = sc.next();
			sc.nextLine();
			phone2Reg = Pattern.matches("^010-([0-9]{4})-([0-9]{4})", phone2); 
		}
	
		return new Member(id2, password2, phone2);
	}
	

	public boolean register(List<Member> memberList, Member input) { 

		for (Member member : memberList) {
			
			if(member.getId().equals(input.getId())) {
				System.out.println("=====================================");
				System.out.println("중복된 아이디입니다.");
				return false;
				
			}else if(member.getPhone().equals(input.getPhone())) {
				System.out.println("=====================================");
				System.out.println("이미 가입된 전화번호입니다.");
				return false;
			}
		}
		return true;
	}
}