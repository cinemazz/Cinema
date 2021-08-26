package jmj;

public class SearchMovie {
	//검색 화면
	String searchtext;
	
	
	public String search(String stext) {
		
		Detailpage det = new Detailpage();
		int cnt = 0;
		for (Movie movie : det.detailpager()) {
			//영화 런닝타임
			int houer = movie.getRunningTime() / 60;
			int minute = movie.getRunningTime() % 60;
			
			if(movie.getMovieTitle().contains(stext)) {// 스캐너로 입력한 값이 포함이 movie에 포함이 됬는지 여부문의
				System.out.println(movie.getMovieTitle()+movie.getGenre()+movie.getDirector()+movie.getActor()+houer+"시"+minute+"분"+" 개봉일 :"+movie.getScreeninGeriod()+movie.getScreeninEndDate());
				
				cnt++;
				System.out.println(cnt);
				
			}else if(movie.getDirector().contains(stext)) {
				System.out.println(movie.getMovieTitle()+movie.getGenre()+movie.getDirector()+movie.getActor()+houer+"시"+minute+"분"+" 개봉일 :"+movie.getScreeninGeriod()+movie.getScreeninEndDate());
				cnt++;
			}
			
		}
		if(cnt == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
		return searchtext;
		
		
	}
	
}
