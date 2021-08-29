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
		//��ȭ �������� ��ȭ ����Ʈ
		detailPage = new Detailpage();
		mdetail = detailPage.detailpager();

		//��ȭ�� ����Ʈ
		Cinema cinema = new Cinema();
		cinemaList = cinema.cinemaGenerater();

		//�󿵽ð� ����Ʈ
		showTime = new ShowTime();
		showTimeList = showTime.showTimeGenerater();

		//�¼� ����
		Seat seat = new Seat();

		//��ĳ��
		Scanner sc = new Scanner(System.in);
		
		//����Ʈ �ε���
		int index = 0;
		
		//����Ʈ ����
				
		//��¥ �Է�
		System.out.println("��¥�� �Է����ּ��� (�Է� ���� ��:08-26)");
		String fromDate = "2021-"+sc.next();
		// ��ȿ�� �˻�
		dateInput(fromDate);
		
		while(!dateInput(fromDate)) {
			System.out.println("��¥ �Է������� ���� �ٽ��Է����ּ���");
			fromDate = "2021-"+sc.next();
			dateInput(fromDate);			
		}		

		//��ȭ ����
		System.out.println("��ȭ ����Ʈ�Դϴ�.");
		System.out.println("===============");
		index = 0;
		
		//��ȭ����Ʈ 
		ArrayList<Movie> movieOfDateResult = movieListShow(fromDate);
		
		//�Է� ��¥�� ��ȭ�� ������� ��¥ ���Է�
		while(movieOfDateResult.isEmpty()) {
			System.out.println("11�� 11�ϱ����� �Է����ּ��� (�Է� ���� ��:08-26)");
			fromDate = "2021-"+sc.next();
			// ��ȿ�� �˻�
			dateInput(fromDate);
			
			while(!dateInput(fromDate)) {
				System.out.println("��¥ �Է������� ���� �ٽ��Է����ּ���");
				fromDate = "2021-"+sc.next();
				dateInput(fromDate);			
			}
			movieOfDateResult = movieListShow(fromDate);
		}
		
		System.out.println("===============");
		System.out.println("��ȭ�� ��ȣ�� �������ּ���");
		String movieSelectNum = sc.next();
		boolean SelectPattern = Pattern.matches("^([1-9])", movieSelectNum);
				
		while(!SelectPattern) {
			System.out.println("���ڷθ� �Է����ּ���");
			movieSelectNum = sc.next();
			SelectPattern = Pattern.matches("^([1-9])", movieSelectNum);			
		}
		
		int movieSelectToIntNum = Integer.parseInt(movieSelectNum);
		movieSelectToIntNum--;
		Movie movieSelect = movieOfDateResult.get(movieSelectToIntNum);		

		//��ȭ�� ����
		System.out.println("��ȭ�� ����Ʈ�Դϴ�.");
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
		System.out.println("��ȭ���� ��ȣ�� �������ּ���");
		
		//��ȭ�� �Է�
		String cinemaSelectNum = sc.next();
		SelectPattern = Pattern.matches("^([1-9])", cinemaSelectNum);
		
		while(!SelectPattern) {
			System.out.println("���ڷθ� �Է����ּ���");
			cinemaSelectNum = sc.next();
			SelectPattern = Pattern.matches("^([1-9])", cinemaSelectNum);	
		}
		
		int cinemaSelectToIntNum = Integer.parseInt(cinemaSelectNum);
		cinemaSelectToIntNum--;
		Cinema cinemaSelect = cinemaInMovieResult.get(cinemaSelectToIntNum);
		

		//�� ����
		System.out.println("�� �ð� ����Ʈ�Դϴ�.");
		System.out.println("06 ~ 09�� ������ ��ȭ�� ���������� ����˴ϴ�. (���� ����30%)");
		System.out.println("===============");
		showTimeList = showTime.showTimeGenerater();
		index = 0;
		for (ShowTime showTime : showTimeList) {
			index++;
			System.out.println((index)+". "+showTime.time.getTime().getHours() +" : "+showTime.time.getTime().getMinutes());
		}
		System.out.println("�󿵽ð��� �������ּ���");
		//�󿵽ð� ����
		
		
		String showTimeSelectNum = sc.next();
		SelectPattern = Pattern.matches("^([1-9])", showTimeSelectNum);
		
		while(!SelectPattern) {
			System.out.println("���ڷθ� �Է����ּ���");
			showTimeSelectNum = sc.next();
			SelectPattern = Pattern.matches("^([1-9])", cinemaSelectNum);
		}
		
		int showTimeSelecToInttNum = Integer.parseInt(showTimeSelectNum);
		showTimeSelecToInttNum--;
		ShowTime showTimeSelect = showTimeList.get(showTimeSelecToInttNum);
		//		System.out.println(showTimeSlect.time.getTime().getHours() +" : "+ showTimeSlect.time.getTime().getMinutes());

		//�¼� ����
		System.out.println("�¼� ȭ���Դϴ�.");
		System.out.println("===============");
		seat.seatShow();
		System.out.println("===============");
		System.out.println("�����Ͻ� �ο��� �Է����ּ���");
		//���� �ο� �Է�
		int numberOfReservations = sc.nextInt();
		sc.nextLine();

		String seatInfo = "";
		System.out.println("�����Ͻ� �¼��� �Է����ּ��� (�� : A1 A2 A3 )");
		String seatSelect = sc.nextLine();
		String[] seatSelectSplit = seatSelect.split(" ");
		System.out.println();		 
		
		if(seatSelectSplit.length > numberOfReservations) {
			System.out.println("���� �ο��� �´� �¼��� �������ּ���");
			seatInfo = "";
			System.out.println("�����Ͻ� �¼��� �Է����ּ��� (�� : A1 A2 A3 )");
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
						System.out.println("���� �Ұ��� �¼��� ���ԵǾ��ֽ��ϴ�. : "+ seatInfo);
					}
				}else if(string.contains("B")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatB.get(seatNumToInt).equals("O")) {
						seat.seatB.set(seatNumToInt, "X");
						seatInfo += " B"+(seatNumToInt+1);
					}else {
						System.out.println("���� �Ұ��� �¼��� ���ԵǾ��ֽ��ϴ�.");
					}

				}else if(string.contains("C")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatC.get(seatNumToInt).equals("O")) {
						seat.seatC.set(seatNumToInt, "X");
						seatInfo += " C"+(seatNumToInt+1);
					}else {
						System.out.println("���� �Ұ��� �¼��� ���ԵǾ��ֽ��ϴ�.");
					}
				}else if(string.contains("D")){
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatD.get(seatNumToInt).equals("O")) {
						seat.seatD.set(seatNumToInt, "X");
						seatInfo += " D"+(seatNumToInt+1);
					}else {
						System.out.println("���� �Ұ��� �¼��� ���ԵǾ��ֽ��ϴ�.");
					}
				}else {
					System.out.println("�ùٸ� �¼��� �Է����ּ���");
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
						System.out.println("���� �Ұ��� �¼��� ���ԵǾ��ֽ��ϴ�. : "+ seatInfo);
					}
				}else if(string.contains("B")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatB.get(seatNumToInt).equals("O")) {
						seat.seatB.set(seatNumToInt, "X");
						seatInfo += " B"+(seatNumToInt+1);
					}else {
						System.out.println("���� �Ұ��� �¼��� ���ԵǾ��ֽ��ϴ�.");
					}

				}else if(string.contains("C")) {
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatC.get(seatNumToInt).equals("O")) {
						seat.seatC.set(seatNumToInt, "X");
						seatInfo += " C"+(seatNumToInt+1);
					}else {
						System.out.println("���� �Ұ��� �¼��� ���ԵǾ��ֽ��ϴ�.");
					}
				}else if(string.contains("D")){
					String seatNum = string.split("")[1];
					int seatNumToInt = Integer.parseInt(seatNum)-1;
					if (seat.seatD.get(seatNumToInt).equals("O")) {
						seat.seatD.set(seatNumToInt, "X");
						seatInfo += " D"+(seatNumToInt+1);
					}else {
						System.out.println("���� �Ұ��� �¼��� ���ԵǾ��ֽ��ϴ�.");
					}
				}else {
					System.out.println("�ùٸ� �¼��� �Է����ּ���");
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
				"��ȭ ���� - " + ticket.getMovieSelect().getMovieTitle()+"\n"+
				"��¥ - " + ticket.getFromDate()+"\n"+
				"�� �ð� - " + ticket.getShowTimeSelect().time.getTime().getHours()+" : " +ticket.getShowTimeSelect().time.getTime().getMinutes()+"\n"+
				"���� �ο� - " + ticket.getNumberOfReservations()+"\n"+
				"��ȭ �� - " + ticket.getCinemaSelect().getName()+"\n"+
				"�¼� ���� - " + ticket.getSeatInfo()+"\n"+
				"���� �ݾ� - " + ticket.getNumberOfReservations()*10000+"\n"
		);
		
		Payment payment = new Payment();
		payment.payment(ticket);
		
		
		return ticket;		
	}
}
