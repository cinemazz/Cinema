package jmj;
import java.util.ArrayList;

public class Detailpage {
	//영화 상세페이지
	
	public ArrayList<Movie> detailpager(){
		// TODO Auto-generated method stub
		ArrayList<Movie> mdetail = new ArrayList<>();
		mdetail.add(new Movie("타이타닉", "재난", "제임스카메론", "레오나르도 디카프리오, 케이트 윈슬렛", 200, 1, "우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("어벤져스: 엔드게임", "액션", "앤서니 루소", "크리스에반스, 스칼렛 요한슨", 180, 1,"우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("인어공주", "애니메이션", "론 클레먼츠 루소", "조디벤슨, 하워드애시먼", 180, 1, "우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("인질", "액션", "필감성", "황정민", 180, 1, "우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("싱크홀", "드라마", "김지훈", "차승원, 김지훈, 이광수", 180, 1, "우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("모가디슈", "드라마", "류승완", "조인성, 김윤석", 180, 1, "우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("올드","호러","나이트샤말란","가엘 가르시아 베르날", 180, 1, "우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("프리가이", "액션", "숀레비", "라이언 레놀즈, 타이카 와이티티", 180, 1, "우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("남색대문", "로맨스", "이치엔", "계륜미, 진백림", 180, 1, "우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("팜 스프링스", "코미디", "맥스 바바코우", "앤디 샘버그, 크리스틴 밀리오티", 180, 1,"우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
				
		for (Movie movied : mdetail) {
			int a = movied.getRunningTime() / 60;
			int b = movied.getRunningTime() % 60;					
//			System.out.println(movied.getMovieTitle()+movied.getGenre()+movied.getDirector()+movied.getActor()+a+b);
		}
		return mdetail;
	}
	
	public static void main(String[] args) {
		Detailpage dt = new Detailpage();
		
		System.out.println(dt.detailpager().get(0).getMovieTitle());
		if("타이타닉" == dt.detailpager().get(0).getMovieTitle()) {
			System.out.println("상세페이지 보기 메소드 호출");
		}
			
	}
}
