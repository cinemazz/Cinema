package LJS;

import java.util.Scanner;

public class SignUp {
	
	public Member memberInput() {

		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("���̵� �Է��ϼ���.");
		String id2 = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String password2 = sc.nextLine();
	
		return new Member(id2, password2);	
		//����ڰ� �Է��� ���̵� �н����� ������ ���� ��ü
		
	}
	

	/*
	public static boolean register(List<Member> memberList, Member input) { 
		
		for (Member member : memberList) {
			
			if(member.getId().equals(input.getId())) {
				System.out.println("�ߺ��� ���̵��Դϴ�.");
			
			}else if(member.getId().equals(input.getId())) {
				System.out.println("����Ͻ� �� �ִ� ���̵��Դϴ�.");
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