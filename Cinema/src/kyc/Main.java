package kyc;
import jmj.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static String date;
	static ArrayList<Movie> mdetail;
	Cinema cinema;
	static ShowTime showTime;
	static Detailpage dp;
	
	public static void main(String[] args) {
		dp = new Detailpage();
		mdetail = dp.detailpager();
		Scanner sc = new Scanner(System.in);
		Cinema cinema = new Cinema();
		showTime = new ShowTime();
		ArrayList<Cinema> cinemaList;
		ArrayList<ShowTime> showTimeList;		
		int index = 0;
		
		System.out.println("날짜를 입력하세요");
		System.out.println("영화 리스트입니다.");
		System.out.println("===============");
		
		index = 0;
		for (Movie movie : mdetail) {
			System.out.println((index++)+". "+movie.getMovieTitle());
		}
		System.out.println("===============");
		System.out.println("영화를 선택해주세요");
		System.out.println("영화관 리스트입니다.");
		System.out.println("===============");
		System.out.println("영화관을 선택해주세요");
		
		index = 0;
		cinemaList = cinema.cinemaGenerater();
		for (Cinema cinemaItem : cinemaList) {			
			System.out.println((index++)+". "+cinemaItem.getName());
		}		
		
		System.out.println("시간대를 선택해주세요");
		System.out.println("===============");
		showTimeList = showTime.showTimeGenerater();
		
		index = 0;
		for (ShowTime showTime : showTimeList) {
			System.out.println((index++)+". "+showTime.time.getTime().getHours() +" : "+showTime.time.getTime().getMinutes());
		}
		System.out.println("===============");
		
		Seat seat = new Seat();
		seat.seatShow();
	}
}
