package LJS;

import java.util.List;
import java.util.Scanner;

public class SignUpProcess {
	
	public Member memberInput() {

		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("사용할 아이디를 입력하세요.");
		String id2 = sc.nextLine();
		System.out.println("사용할 비밀번호를 입력하세요.");
		String password2 = sc.nextLine();
		System.out.println("ID/PW 찾기에 필요한 전화번호를 입력하세요.");
		String phone2 = sc.nextLine();
	
		return new Member(id2, password2, phone2);	
		
	}
	

	public boolean register(List<Member> memberList, Member input) { 

		for (Member member : memberList) {
			
			if(member.getId().equals(input.getId())) {
				System.out.println("=====================================");
				System.out.println("중복된 아이디입니다.");
				return true;
				
			}else if(member.getPhone().equals(input.getPhone())) {
				System.out.println("=====================================");
				System.out.println("이미 가입된 전화번호입니다.");
				return true;
			}
		}
		return false;
	}
}