package knh;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import kyc.Payment;
import kyc.Ticket;

public class TicketingCheck {
	//매개변수로 받을 값들
	String title = "괴물";
	Date screenDate = new Date();//날짜정보
	SimpleDateFormat date = new SimpleDateFormat("MM.dd");
	int numberOfPeople = 3;
	String[] seat = {"a 3", "a 4", "a 5"};
	int showTime = 132;
	int payment = 30000;	
	
	public void showInfo(ArrayList<Ticket> TicketStorage) {//영화 예매정보 매개변수로 받아서 쓰기
		for (Ticket ticket : TicketStorage) {
			System.out.println("회원님이 예매한 정보입니다.");
			//출력문
			//제목 - ㅁㅁㅁ
			System.out.println("제목 - " + ticket.getMovieSelect().getMovieTitle());
			//날짜 - 08.30
			System.out.println("날짜 - "+ ticket.getFromDate());
			//예매인원 - ㅇ명
			System.out.println("예매 인원 - "+ticket.getNumberOfReservations());
			//좌석	a3 a4 a5
			System.out.print("좌석 - "+ticket.getSeatInfo());
//			for (int i = 0; i < seat.length; i++) {
//				System.out.print(seat[i]+" ");
//			}
			System.out.println();
			//상영시간 - 00:00
			System.out.println("상영시간 - "+ticket.getShowTimeSelect().time.getTime().getHours() + " : " + ticket.getShowTimeSelect().time.getTime().getMinutes());
//			System.out.println("상영시간 - "+String.format("%02d:%02d",showTime/60,showTime%60));
			//결제금액 : 0000원 할인률이 적용된 결제금액
			System.out.println("결제금액 : "+ticket.getPay()+"원");
			System.out.println("=======================================");
		}
		
	}
}
