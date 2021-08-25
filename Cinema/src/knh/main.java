package knh;

import java.util.ArrayList;

import LJS.Member;

public class main {
	
	public void callAccountFind() {
		
		AccountFind af = new AccountFind();
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		Member mb1 = new Member("kangnh","nh123","010-1234-5678");
		memberList.add(mb1);		
		Member mb2 = new Member("kimyc","yc456","010-2345-6789");
		memberList.add(mb2);		
		Member mb3 = new Member("leejs","js789","010-3456-7890");
		memberList.add(mb3);	
		Member mb4 = new Member("jeongmj","mj987","010-4567-8901");
		memberList.add(mb4);
		
		af.check_PhoneNumber(memberList);
	}
}
