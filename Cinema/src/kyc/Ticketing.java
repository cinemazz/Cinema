package kyc;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;

import jmj.Detailpage;
import jmj.Movie;

public class Ticketing {
	static ArrayList<Movie> mdetail;
	static ArrayList<Cinema> cinemaList;
	static ArrayList<ShowTime> showTimeList;
	static Detailpage detailPage;
	static ShowTime showTime;
	
	public boolean dateInput(String str) {
		return Pattern.matches("^2021-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])", str);
	}
	
	public ArrayList<Movie> movieListShow(String fromDate){
		int index = 0;
		GetValidDate getValidDate = new GetValidDate();
		ArrayList<Movie> movieOfDateResult = new ArrayList<>(); 
		for (Movie movie : mdetail) {
			if(getValidDate.getValidDate(movie.getScreeninGeriod(), movie.getScreeninEndDate(), fromDate)) {
				index++;
				movieOfDateResult.add(movie);
				System.out.println((index)+". "+movie.getMovieTitle());
			}
		}
		
		return movieOfDateResult;
	}
	
	public Ticket ticketing() {
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
		
		//셀렉트 패턴
				
		//날짜 입력
		System.out.println("날짜를 입력해주세요 (입력 형식 예:08-26)");
		String fromDate = "2021-"+sc.next();
		// 유효성 검사
		dateInput(fromDate);
		
		while(!dateInput(fromDate)) {
			System.out.println("날짜 입력형식을 맞춰 다시입력해주세요");
			fromDate = "2021-"+sc.next();
			dateInput(fromDate);			
		}		

		//영화 선택
		System.out.println("영화 리스트입니다.");
		System.out.println("===============");
		index = 0;
		
		//영화리스트 
		ArrayList<Movie> movieOfDateResult = movieListShow(fromDate);
		
		//입력 날짜에 영화가 없을경우 날짜 재입력
		while(movieOfDateResult.isEmpty()) {
			System.out.println("11월 11일까지만 입력해주세요 (입력 형식 예:08-26)");
			fromDate = "2021-"+sc.next();
			// 유효성 검사
			dateInput(fromDate);
			
			while(!dateInput(fromDate)) {
				System.out.println("날짜 입력형식을 맞춰 다시입력해주세요");
				fromDate = "2021-"+sc.next();
				dateInput(fromDate);			
			}
			movieOfDateResult = movieListShow(fromDate);
		}
		
		System.out.println("===============");
		System.out.println("영화를 번호로 선택해주세요");
		String movieSelectNum = sc.next();
		boolean SelectPattern = Pattern.matches("^([1-9])", movieSelectNum);
				
		while(!SelectPattern) {
			System.out.println("숫자로만 입력해주세요");
			movieSelectNum = sc.next();
			SelectPattern = Pattern.matches("^([1-9])", movieSelectNum);			
		}
		
		int movieSelectToIntNum = Integer.parseInt(movieSelectNum);
		movieSelectToIntNum--;
		Movie movieSelect = movieOfDateResult.get(movieSelectToIntNum);		

		//영화관 선택
		System.out.println("영화관 리스트입니다.");
		System.out.println("===============");
		index = 0;

		ArrayList<Cinema> cinemaInMovieResult = new ArrayList<>();
		for (Cinema cinemaItem : cinemaList) {
			for (Movie movieItem : cinemaItem.getCinemaInMovieList()) {
				if(movieItem.getMovieTitle() == movieSelect.getMovieTitle()) {
					index++;
					cinemaInMovieResult.add(cinemaItem);
					System.out.println(index+". "+cinemaItem.getName());			
				}
			}			
		}			
		System.out.println("=================");
		System.out.println("영화관을 번호로 선택해주세요");
		
		//영화관 입력
		String cinemaSelectNum = sc.next();
		SelectPattern = Pattern.matches("^([1-9])", cinemaSelectNum);
		
		while(!SelectPattern) {
			System.out.println("숫자로만 입력해주세요");
			cinemaSelectNum = sc.next();
			SelectPattern = Pattern.matches("^([1-9])", cinemaSelectNum);	
		}
		
		int cinemaSelectToIntNum = Integer.parseInt(cinemaSelectNum);
		cinemaSelectToIntNum--;
		Cinema cinemaSelect = cinemaInMovieResult.get(cinemaSelectToIntNum);
		

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
		
		
		String showTimeSelectNum = sc.next();
		SelectPattern = Pattern.matches("^([1-9])", showTimeSelectNum);
		
		while(!SelectPattern) {
			System.out.println("숫자로만 입력해주세요");
			showTimeSelectNum = sc.next();
			SelectPattern = Pattern.matches("^([1-9])", cinemaSelectNum);
		}
		
		int showTimeSelecToInttNum = Integer.parseInt(showTimeSelectNum);
		showTimeSelecToInttNum--;
		ShowTime showTimeSelect = showTimeList.get(showTimeSelecToInttNum);
		//		System.out.println(showTimeSlect.time.getTime().getHours() +" : "+ showTimeSlect.time.getTime().getMinutes());

		//좌석 선택
		System.out.println("좌석 화면입니다.");
		System.out.println("===============");
		seat.seatShow();
		System.out.println("===============");
		System.out.println("예매하실 인원을 입력해주세요");
		//예매 인원 입력
		int numberOfReservations = sc.nextInt();
		sc.nextLine();

		String seatInfo = "";
		System.out.println("예매하실 좌석을 입력해주세요 (예 : A1 A2 A3 )");
		String seatSelect = sc.nextLine();
		String[] seatSelectSplit = seatSelect.split(" ");
		System.out.println();		 
		
		if(seatSelectSplit.length > numberOfReservations) {
			System.out.println("예매 인원에 맞는 좌석을 선택해주세요");
			seatInfo = "";
			System.out.println("예매하실 좌석을 입력해주세요 (예 : A1 A2 A3 )");
			seatSelect = sc.nextLine();
			seatSelectSplit = seatSelect.split(" ");
			System.out.println();
			for (String string : seatSelectSplit) {
				if(string.contains("A")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatA.get(seatNumToInt).equals("O")) {
						seat.seatA.set(seatNumToInt, "X");
						seatInfo += " A"+(seatNumToInt+1);						
					}else {
						System.out.println("예매 불가한 좌석이 포함되어있습니다. : "+ seatInfo);
					}
				}else if(string.contains("B")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatB.get(seatNumToInt).equals("O")) {
						seat.seatB.set(seatNumToInt, "X");
						seatInfo += " B"+(seatNumToInt+1);
					}else {
						System.out.println("예매 불가한 좌석이 포함되어있습니다.");
					}

				}else if(string.contains("C")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatC.get(seatNumToInt).equals("O")) {
						seat.seatC.set(seatNumToInt, "X");
						seatInfo += " C"+(seatNumToInt+1);
					}else {
						System.out.println("예매 불가한 좌석이 포함되어있습니다.");
					}
				}else if(string.contains("D")){
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatD.get(seatNumToInt).equals("O")) {
						seat.seatD.set(seatNumToInt, "X");
						seatInfo += " D"+(seatNumToInt+1);
					}else {
						System.out.println("예매 불가한 좌석이 포함되어있습니다.");
					}
				}else {
					System.out.println("올바른 좌석을 입력해주세요");
				}
			}	
			
		}else {
			for (String string : seatSelectSplit) {
				if(string.contains("A")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatA.get(seatNumToInt).equals("O")) {
						seat.seatA.set(seatNumToInt, "X");
						seatInfo += " A"+(seatNumToInt+1);						
					}else {
						System.out.println("예매 불가한 좌석이 포함되어있습니다. : "+ seatInfo);
					}
				}else if(string.contains("B")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatB.get(seatNumToInt).equals("O")) {
						seat.seatB.set(seatNumToInt, "X");
						seatInfo += " B"+(seatNumToInt+1);
					}else {
						System.out.println("예매 불가한 좌석이 포함되어있습니다.");
					}

				}else if(string.contains("C")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatC.get(seatNumToInt).equals("O")) {
						seat.seatC.set(seatNumToInt, "X");
						seatInfo += " C"+(seatNumToInt+1);
					}else {
						System.out.println("예매 불가한 좌석이 포함되어있습니다.");
					}
				}else if(string.contains("D")){
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatD.get(seatNumToInt).equals("O")) {
						seat.seatD.set(seatNumToInt, "X");
						seatInfo += " D"+(seatNumToInt+1);
					}else {
						System.out.println("예매 불가한 좌석이 포함되어있습니다.");
					}
				}else {
					System.out.println("올바른 좌석을 입력해주세요");
				}
			}	
		}
		
		Ticket ticket = new Ticket(fromDate, movieSelect, cinemaSelect, showTimeSelect, numberOfReservations, seatInfo);
		ticket.setFromDate(fromDate);
		ticket.setMovieSelect(movieSelect);
		ticket.setCinemaSelect(cinemaSelect);
		ticket.setShowTimeSelect(showTimeSelect);
		ticket.setNumberOfReservations(numberOfReservations);
		ticket.setSeatSelectSplit(seatSelectSplit);
		ticket.setSeatInfo(seatInfo);
		
		System.out.println(
				"영화 제목 - " + ticket.getMovieSelect().getMovieTitle()+"\n"+
				"날짜 - " + ticket.getFromDate()+"\n"+
				"상영 시간 - " + ticket.getShowTimeSelect().time.getTime().getHours()+" : " +ticket.getShowTimeSelect().time.getTime().getMinutes()+"\n"+
				"예매 인원 - " + ticket.getNumberOfReservations()+"\n"+
				"영화 관 - " + ticket.getCinemaSelect().getName()+"\n"+
				"좌석 정보 - " + ticket.getSeatInfo()+"\n"+
				"결제 금액 - " + ticket.getNumberOfReservations()*10000+"\n"
		);
		
		Payment payment = new Payment();
		payment.payment(ticket);
		
		
		return ticket;		
	}
}
