package jmj;

public class SearchMovie {
	//�˻� ȭ��
	String searchtext;
	
	
	public String search(String stext) {
		
		Detailpage det = new Detailpage();
		int cnt = 0;
		for (Movie movie : det.detailpager()) {
			//��ȭ ����Ÿ��
			int houer = movie.getRunningTime() / 60;
			int minute = movie.getRunningTime() % 60;
			
			if(movie.getMovieTitle().contains(stext)) {// ��ĳ�ʷ� �Է��� ���� ������ movie�� ������ ����� ���ι���
				System.out.println(movie.getMovieTitle()+movie.getGenre()+movie.getDirector()+movie.getActor()+houer+"��"+minute+"��"+" ������ :"+movie.getScreeninGeriod()+movie.getScreeninEndDate());
				
				cnt++;
				System.out.println(cnt);
				
			}else if(movie.getDirector().contains(stext)) {
				System.out.println(movie.getMovieTitle()+movie.getGenre()+movie.getDirector()+movie.getActor()+houer+"��"+minute+"��"+" ������ :"+movie.getScreeninGeriod()+movie.getScreeninEndDate());
				cnt++;
			}
			
		}
		if(cnt == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
		return searchtext;
		
		
	}
	
}
