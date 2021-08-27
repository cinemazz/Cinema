package LJS;

import java.util.Scanner;

public class SignUp {
	
	public Member memberInput() {

		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("아이디를 입력하세요.");
		String id2 = sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String password2 = sc.nextLine();
	
		return new Member(id2, password2);	
		//사용자가 입력한 아이디 패스워드 정보를 담은 객체
		
	}
	

	/*
	public static boolean register(List<Member> memberList, Member input) { 
		
		for (Member member : memberList) {
			
			if(member.getId().equals(input.getId())) {
				System.out.println("중복된 아이디입니다.");
			
			}else if(member.getId().equals(input.getId())) {
				System.out.println("사용하실 수 있는 아이디입니다.");
				return true;
			
			}if(member.getPassword().equals(input.getPassword())){
				//sysout
			}
		return false;
			
	}
}
}

	*/
}