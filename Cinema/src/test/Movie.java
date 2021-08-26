package test;

import java.util.Date;

public class Movie {
	//��ȭ ����
	//�˻��ϸ� �˻� ����� ���� ������ ���
	private String movieTitle; //��ȭ ���� ����Ʈ����
	private String genre; //�帣 ����Ʈ����
	private String director; //���� ����Ʈ����
	private String actor; //���  ����Ʈ����
	private int runningTime; //����Ÿ��
	private String screeninGeriod; //�󿵱Ⱓ date ���� ������ �������� �ΰ�
	private String screeninEndDate;
	public String summary; //�ٰŸ�

	Movie(String movieTitle, String genre, String director, String actor, int runningTime, String screeninGeriod, String screeninEndDate, String summary){
		this.movieTitle = movieTitle;
		this.genre = genre;
		this.director = director;
		this.actor = actor;
		this.runningTime = runningTime;
		this.screeninGeriod = screeninGeriod;
		this.screeninEndDate = screeninEndDate;
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
	public String getScreeninGeriod() {
		return screeninGeriod;
	}
	public void setScreeninGeriod(String screeninGeriod) {
		this.screeninGeriod = screeninGeriod;
	}

	public String getScreeninEndDate() {
		return screeninEndDate;
	}

	public void setScreeninEndDate(String screeninEndDate) {
		this.screeninEndDate = screeninEndDate;
	}
	

}
