package kyc;

import jmj.Movie;

public class Ticket {
	private String fromDate;
	private Movie movieSelect;
	private Cinema cinemaSelect;
	private ShowTime showTimeSelect;
	private int numberOfReservations;
	private String seatInfo;
	
	public String getSeatInfo() {
		return seatInfo;
	}

	public void setSeatInfo(String seatInfo) {
		this.seatInfo = seatInfo;
	}	
	
	public Ticket(String fromDate2, Movie movieSelect2, Cinema cinemaSelect2, ShowTime showTimeSelect2,
			int numberOfReservations2, String seatInfo) {
		// TODO Auto-generated constructor stub
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public Movie getMovieSelect() {
		return movieSelect;
	}

	public void setMovieSelect(Movie movieSelect) {
		this.movieSelect = movieSelect;
	}

	public Cinema getCinemaSelect() {
		return cinemaSelect;
	}

	public void setCinemaSelect(Cinema cinemaSelect) {
		this.cinemaSelect = cinemaSelect;
	}

	public ShowTime getShowTimeSelect() {
		return showTimeSelect;
	}

	public void setShowTimeSelect(ShowTime showTimeSelect) {
		this.showTimeSelect = showTimeSelect;
	}

	public int getNumberOfReservations() {
		return numberOfReservations;
	}

	public void setNumberOfReservations(int numberOfReservations) {
		this.numberOfReservations = numberOfReservations;
	}

	public String[] getSeatSelectSplit() {
		return seatSelectSplit;
	}

	public void setSeatSelectSplit(String[] seatSelectSplit) {
		this.seatSelectSplit = seatSelectSplit;
	}

	String[] seatSelectSplit;

}
