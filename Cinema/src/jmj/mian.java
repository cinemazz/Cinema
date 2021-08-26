package jmj;

import java.util.Scanner;

public class mian {
	
	public static void main(String[] args) {
		Detailpage dtpage = new Detailpage();
		dtpage.detailpager();
		
		SearchMovie serchm = new SearchMovie();
		//영화 검색
		Scanner scanner = new Scanner(System.in);
		System.out.println("영화 제목 또는 감독으로 검색 해주세요");
		String stext = scanner.next();
		scanner.nextLine();
		serchm.search(stext);
		scanner.close();
		
		
		
			
			
			
		
		
		
				
	}

}
