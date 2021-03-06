package test;

import java.util.ArrayList;
import java.util.Scanner;
public class SearchMovie {
	//검색 화면
	String resultmovie;
	int number;
	int searchst;
	public ArrayList<Movie> search(String stext) {
		
		Detailpage det = new Detailpage();
		int cnt = 0;//if문 조건에 맞는 개수
		
		ArrayList<Movie> number = new ArrayList<>();
		for (Movie movie : det.detailpager()) {
			//영화 런닝타임
			int houer = movie.getRunningTime() / 60;
			int minute = movie.getRunningTime() % 60;
			
			if(movie.getMovieTitle().contains(stext)) {// 스캐너로 입력한 값이 포함이 movie에 포함이 됬는지 여부문의
				//System.out.println(movie.getMovieTitle()+movie.getGenre()+movie.getDirector()+movie.getActor()+houer+"시"+minute+"분"+" 개봉일 :"+movie.getScreeninGeriod()+movie.getScreeninEndDate());
				number.add(movie);
				cnt++;
				System.out.println(cnt+". 제목 :"+movie.getMovieTitle()+"/ 감독 :"+movie.getDirector());
			}else if(movie.getDirector().contains(stext)) {
				number.add(movie);
				cnt++;
				System.out.println(cnt+". 제목 :"+movie.getMovieTitle()+"/ 감독 :"+movie.getDirector());
			}	
		}
		if(cnt == 0) {
			System.out.println("검색 결과가 없습니다.");
		}else {
		
			//원하는 영화 선택
			Scanner scanner = new Scanner(System.in);
			System.out.println("- 원하시는 영화 선택 해주세요");
			try {
				int searchst = Integer.parseInt(scanner.nextLine())-1;
				//scanner.nextLine();
				System.out.println(
				"제목 :"+number.get(searchst).getMovieTitle()+"\n"+
				"장르 :"+number.get(searchst).getGenre()+"\n"+
				"감독 :"+number.get(searchst).getDirector()+"\n"+
				"배우 :"+number.get(searchst).getActor()+"\n"+
				"러닝타임 :"+number.get(searchst).getRunningTime() / 60+"시"+number.get(searchst).getRunningTime() % 60+"분"+"\n"+
				"개봉일 :"+number.get(searchst).getScreeninGeriod()+"\n"+
				"종료일 :"+number.get(searchst).getScreeninEndDate());
	
			}catch(IndexOutOfBoundsException e) {
				System.out.println("숫자에 해당하는 영화가 없습니다.");
			}catch(NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
			}
		}
		//scanner.close();
		return number;
	}	

	
}
