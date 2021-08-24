package jmj;

public class Movie {
	//영화 정보
	//검색하면 검색 결과가 여기 정보를 사용
	private String movieTitle; //영화 제목 리스트형식
	private String genre; //장르 리스트형식
	private String director; //감독 리스트형식
	private String actor; //배우  리스트형식
	private int runningTime; //러닝타임
	private int screeninGeriod; //상영기간 date 형식 개봉일 끝나는일 두개
	public String summary; //줄거리

	Movie(String movieTitle, String genre, String director, String actor, int runningTime, int screeninGeriod, String summary){
		this.movieTitle = movieTitle;
		this.genre = genre;
		this.director = director;
		this.actor = actor;
		this.runningTime = runningTime;
		this.screeninGeriod = screeninGeriod;
		this.summary = summary;
	}	
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public int getScreeninGeriod() {
		return screeninGeriod;
	}
	public void setScreeninGeriod(int screeninGeriod) {
		this.screeninGeriod = screeninGeriod;
	}
	
}
