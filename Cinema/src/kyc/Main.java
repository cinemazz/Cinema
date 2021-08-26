package kyc;
import jmj.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static ArrayList<Movie> mdetail;
	static ArrayList<Cinema> cinemaList;
	static ArrayList<ShowTime> showTimeList;
	static Detailpage detailPage;
	static ShowTime showTime;
	
	
	public static void main(String[] args) {
		//영화 상세페이지 영화 리스트
		detailPage = new Detailpage();
		mdetail = detailPage.detailpager();
		
		//영화관 리스트
		Cinema cinema = new Cinema();
		cinemaList = cinema.cinemaGenerater();
		
		//상영시간 리스트
		showTime = new ShowTime();
		showTimeList = showTime.showTimeGenerater();
		
		//좌석 정보
		Seat seat = new Seat();
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		//리스트 인덱스
		int index = 0;
		
		System.out.println("날짜를 입력해주세요 (입력 형식 예:2021-08-26)");
		//날짜 입력
		String fromDate = sc.next();
		SimpleDateFormat transFormat = new SimpleDateFormat("MM-dd");
		try {
			Date date = transFormat.parse(fromDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//영화 선택
		System.out.println("영화 리스트입니다.");
		System.out.println("===============");
		index = 0;
		
		GetValidDate getValidDate = new GetValidDate();
		ArrayList<Movie> movieOfDateResult = new ArrayList<>(); 
		for (Movie movie : mdetail) {
			if(getValidDate.getValidDate(movie.getScreeninGeriod(), movie.getScreeninEndDate(), fromDate)) {
				index++;
				movieOfDateResult.add(movie);
				System.out.println((index)+". "+movie.getMovieTitle());
			}
		}
		System.out.println("===============");
		System.out.println("영화를 번호로 선택해주세요");
		int movieSelect = sc.nextInt();
		movieSelect--;
		Movie dateMovie = movieOfDateResult.get(movieSelect);
		System.out.println(movieOfDateResult.get(movieSelect).getMovieTitle());
		
		//영화관 선택
		System.out.println("영화관 리스트입니다.");
		System.out.println("===============");
		index = 0;
		cinemaList = cinema.cinemaGenerater();
		for (Cinema cinemaItem : cinemaList) {
			for (Movie movie : cinemaItem.cinemaInMovieList) {
				if(dateMovie == movie) {
					System.out.println((index)+". "+cinemaItem.getName());
				}
			}
			
		}
		System.out.println("=================");
		System.out.println("영화관을 선택해주세요");
		//영화관 입력
		
		//상영 선택
		System.out.println("상영 시간 리스트입니다.");
		System.out.println("06 ~ 09시 사이의 영화는 조조할인이 적용됩니다. (조조 할인30%)");
		System.out.println("===============");
		showTimeList = showTime.showTimeGenerater();
		index = 0;
		for (ShowTime showTime : showTimeList) {
			index++;
			System.out.println((index)+". "+showTime.time.getTime().getHours() +" : "+showTime.time.getTime().getMinutes());
		}
		System.out.println("상영시간을 선택해주세요");
		//상영시간 선택
		
		//좌석 선택
		System.out.println("좌석 화면입니다.");
		System.out.println("===============");
		seat.seatShow();
		System.out.println("===============");
		System.out.println("예매하실 인원을 입력해주세요");
		//예매 인원 입력
		
		//예매 한 인원 만큼 좌석 받기
		//A4 A5 A6
		sc.close();
		
	}
}
