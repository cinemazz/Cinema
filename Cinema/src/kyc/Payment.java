package kyc;

import java.util.Scanner;

public class Payment {
	Ticketing ticketing = new Ticketing();
//	public static int cash;
	public int payment(Ticket ticket) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("결제 하시겠습니까?");
		System.out.println("===============");
		System.out.println("1. Yes 2. No");
		System.out.println("===============");
		int yesOrNo = sc.nextInt();
		if(yesOrNo == 1) {
			System.out.println("결제 화면입니다.");
			System.out.println("()안은 할인 정보입니다.");
			System.out.println("========================");
			System.out.println("1.	삼성 (5% DC)");
			System.out.println("2.	신한 (3% DC)");
			System.out.println("3.	국민 (10% DC)");
			System.out.println("========================");
			System.out.println("결제하실 카드를 선택해 주세요");
			int payment = sc.nextInt();
			int cash = 0;
			if(6 <= ticket.getShowTimeSelect().time.getTime().getHours() 
					|| ticket.getShowTimeSelect().time.getTime().getHours() >= 9) {
				int payment1 = 10000*ticket.getNumberOfReservations();
				if(payment == 1) {
					cash = (int) (payment1 - ((payment1*0.3)+(payment1*0.05)));
				}else if (payment == 2) {
					cash = (int) (payment1 - ((payment1*0.3)+(payment1*0.03)));
				}else if (payment == 3) {
					cash = (int) (payment1 - ((payment1*0.3)+(payment1*0.1)));
				}
			}else {
				int payment1 = 10000*ticket.getNumberOfReservations();
				if(payment == 1) {
					cash = (int) (payment1 - (payment1*0.05));
				}else if (payment == 2) {
					cash = (int) (payment1 - (payment1*0.03));
				}else if (payment == 3) {
					cash = (int) (payment1 - (payment1*0.1));
				}
			}
			System.out.println("결제금액은 "+cash+"원 입니다.");
			System.out.println("결제가 완료되었습니다.");
			return cash;
		}else {
			ticketing.ticketing();
			return 0;
		}
	}
}
