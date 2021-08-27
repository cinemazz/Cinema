package jmj;

import java.util.Scanner;

public class mian {
	
	public static void main(String[] args) {
		Detailpage dtpage = new Detailpage();
		dtpage.detailpager();
		
		SearchMovie serchm = new SearchMovie();
		
		Scanner scanner = new Scanner(System.in);
		//영화 검색
		System.out.println("영화 제목 또는 감독으로 검색 해주세요");
		String stext = scanner.nextLine();
		//scanner.nextLine();
		serchm.search(stext);
		
		//고객센터
		Servicelist center= new Servicelist();
		System.out.println("=======================");
		System.out.println("자주찾는 서비스 번호를 선택해주세요");
		System.out.println("0.아이디/비밀번호찾기  1.할인혜택  2.환불취소");	
		int servicenumber = scanner.nextInt();
		center.servicelistitems(servicenumber);
		
		scanner.close();	
	}

}
