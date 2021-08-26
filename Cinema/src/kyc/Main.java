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
		
		System.out.println("��¥�� �Է����ּ��� (�Է� ���� ��:2021-08-26)");
		//��¥ �Է�
		String fromDate = sc.next();
		SimpleDateFormat transFormat = new SimpleDateFormat("MM-dd");
		try {
			Date date = transFormat.parse(fromDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//��ȭ ����
		System.out.println("��ȭ ����Ʈ�Դϴ�.");
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
		System.out.println("��ȭ�� ��ȣ�� �������ּ���");
		int movieSelect = sc.nextInt();
		movieSelect--;
		Movie dateMovie = movieOfDateResult.get(movieSelect);
		System.out.println(movieOfDateResult.get(movieSelect).getMovieTitle());
		
		//��ȭ�� ����
		System.out.println("��ȭ�� ����Ʈ�Դϴ�.");
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
		System.out.println("��ȭ���� �������ּ���");
		//��ȭ�� �Է�
		
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
		
		//�¼� ����
		System.out.println("�¼� ȭ���Դϴ�.");
		System.out.println("===============");
		seat.seatShow();
		System.out.println("===============");
		System.out.println("�����Ͻ� �ο��� �Է����ּ���");
		//���� �ο� �Է�
		
		//���� �� �ο� ��ŭ �¼� �ޱ�
		//A4 A5 A6
		sc.close();
		
	}
}
