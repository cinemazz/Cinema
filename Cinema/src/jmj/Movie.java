package jmj;

public class Movie {
	//��ȭ ����
	//�˻��ϸ� �˻� ����� ���� ������ ���
	private String movieTitle; //��ȭ ���� ����Ʈ����
	private String genre; //�帣 ����Ʈ����
	private String director; //���� ����Ʈ����
	private String actor; //���  ����Ʈ����
	private int runningTime; //����Ÿ��
	private int screeninGeriod; //�󿵱Ⱓ date ���� ������ �������� �ΰ�
	public String summary; //�ٰŸ�

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
