package LJS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kyc.Ticket;

public class LoginProcess {
	public static Member nowMember;
	
	public Member memberInput() {		
		Scanner sc = new Scanner(System.in);
		ArrayList<Ticket> ticketList = new ArrayList<>();
	
		System.out.println("아이디를 입력하세요.");
		String id = sc.next();
		sc.nextLine();
		System.out.println(id);
		System.out.println("비밀번호를 입력하세요.");
		String password = sc.next();
		sc.nextLine();
		System.out.println(password);
		nowMember = new Member(id, password, ticketList);
		return nowMember;	
		//사용자가 입력한 아이디 패스워드 정보를 담은 객체		
	}
	
	
	public boolean doLogin(List<Member> memberList, Member input) {
		
		for(Member member : memberList) {
			
			//아이디가 있는경우
			if(member.getId().equals(input.getId())){
				
				//비밀번호가 일치하는 경우
				if(member.getPassword().equals(input.getPassword())){
					
					return true;
				}
				
			}
		}
		return false;
	}
	
}
