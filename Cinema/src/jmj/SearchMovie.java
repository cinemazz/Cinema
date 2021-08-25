package jmj;

import java.util.ArrayList;
import java.util.Scanner;
public class SearchMovie {
	//검색 화면
	Movie movie;
	String searchresult;
	
	
	Scanner scanner = new Scanner(System.in);
	public String search(Detailpage dtpage) {
		
		System.out.println("영화 제목 또는 감독으로 검색 해주세요");
		this.searchresult = scanner.nextLine();
		
		dtpage.detailpager();
		
		if(searchresult == detailpager().) {
			
			System.out.println(movied.getMovieTitle()+movied.getGenre()+movied.getDirector()+movied.getActor()+houer+"시"+minute+"분"+" 개봉일 :"+movied.getScreeninGeriod()+movied.getScreeninEndDate());
			break;
		}
		
		return searchresult;
	}
	
	void snclose() {
		scanner.close();
	}
		
}
