package jmj;

public class SearchMovie {
	//�˻� ȭ��
	Movie movie;
	String searchtext;
	
	
	public String search(String stext) {
		
		Detailpage det = new Detailpage();
		
		for (Movie movie : det.detailpager()) {
			//��ȭ ����Ÿ��
			int houer = movie.getRunningTime() / 60;
			int minute = movie.getRunningTime() % 60;
			
			if(movie.getMovieTitle().contains(stext)) {
				System.out.println(movie.getMovieTitle()+movie.getGenre()+movie.getDirector()+movie.getActor()+houer+"��"+minute+"��"+" ������ :"+movie.getScreeninGeriod()+movie.getScreeninEndDate());
				
			}else {
				System.out.println("�˻� ����� �����ϴ�.");
			}
			
			
		}
		return searchtext;
		
	}
	
}
