package test;

import java.util.Scanner;

public class mian {
	
	public void search(Scanner sc) {
		//Detailpage dtpage = new Detailpage();
		//dtpage.detailpager();
		
		SearchMovie serchm = new SearchMovie();
		
		//Scanner scanner = new Scanner(System.in);
		//영화 검색
		System.out.println("영화 제목 또는 감독으로 검색 해주세요");
		String stext = sc.nextLine();
		serchm.search(stext);
	}
	public void service(Scanner sc) {
		//고객센터
		Servicelist center= new Servicelist();
		System.out.println("=======================");
		System.out.println("자주찾는 서비스 번호를 선택해주세요");
		System.out.println("1.아이디/비밀번호찾기  2.할인혜택  3.환불취소");	
		int servicenumber = Integer.parseInt(sc.nextLine());
		center.servicelistitems(servicenumber);
		
		//scanner.close();
	}

}
