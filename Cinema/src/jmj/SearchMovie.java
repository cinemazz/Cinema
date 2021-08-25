package jmj;

public class SearchMovie {
	//검색 화면
	Movie movie;
	String searchtext;
	
	
	public String search(String stext) {
		
		Detailpage det = new Detailpage();
		
		for (Movie movie : det.detailpager()) {
			//영화 런닝타임
			int houer = movie.getRunningTime() / 60;
			int minute = movie.getRunningTime() % 60;
			
			if(movie.getMovieTitle().contains(stext)) {
				System.out.println(movie.getMovieTitle()+movie.getGenre()+movie.getDirector()+movie.getActor()+houer+"시"+minute+"분"+" 개봉일 :"+movie.getScreeninGeriod()+movie.getScreeninEndDate());
				
			}else {
				System.out.println("검색 결과가 없습니다.");
			}
			
			
		}
		return searchtext;
		
	}
	
}
