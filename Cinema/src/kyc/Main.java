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
		
		System.out.println("��¥�� �Է��ϼ���");
		System.out.println("��ȭ ����Ʈ�Դϴ�.");
		System.out.println("===============");
		
		index = 0;
		for (Movie movie : mdetail) {
			System.out.println((index++)+". "+movie.getMovieTitle());
		}
		System.out.println("===============");
		System.out.println("��ȭ�� �������ּ���");
		System.out.println("��ȭ�� ����Ʈ�Դϴ�.");
		System.out.println("===============");
		System.out.println("��ȭ���� �������ּ���");
		
		index = 0;
		cinemaList = cinema.cinemaGenerater();
		for (Cinema cinemaItem : cinemaList) {			
			System.out.println((index++)+". "+cinemaItem.getName());
		}		
		
		System.out.println("�ð��븦 �������ּ���");
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
