package kyc;

import java.util.ArrayList;

public class Seat {
	ArrayList<ArrayList<String>> seats = new ArrayList<ArrayList<String>>();
	ArrayList<String> seatA = seating();
	ArrayList<String> seatB = seating();
	ArrayList<String> seatC = seating();
	public ArrayList<ArrayList<String>> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<ArrayList<String>> seats) {
		this.seats = seats;
	}

	public ArrayList<String> getSeatA() {
		return seatA;
	}

	public void setSeatA(ArrayList<String> seatA) {
		this.seatA = seatA;
	}

	public ArrayList<String> getSeatB() {
		return seatB;
	}

	public void setSeatB(ArrayList<String> seatB) {
		this.seatB = seatB;
	}

	public ArrayList<String> getSeatC() {
		return seatC;
	}

	public void setSeatC(ArrayList<String> seatC) {
		this.seatC = seatC;
	}

	public ArrayList<String> getSeatD() {
		return seatD;
	}

	public void setSeatD(ArrayList<String> seatD) {
		this.seatD = seatD;
	}

	ArrayList<String> seatD = seating();	

	public ArrayList<String> seating() {
		ArrayList<String> seat = new ArrayList<>();
		int seated = 0;
		for(int i = 0; i < 10; i++) {
			seated = (int)(Math.random()*10)/5;
			if(seated == 0) {
				seat.add("O");
			}else {
				seat.add("X");
			}
		}
		seats.add(seat);
		return seat;
	}
	//좌석 정보는 seats로 참조하면됩니다.
	
	public void seatShow() {
		Seat seating = new Seat();
		
		System.out.println("     1 2 3 4 5 6 7 8 9 10");
				
		System.out.print("A : ");
		for (String string : seatA) {
			System.out.print(" "+string);
		}
		System.out.println();
		
		System.out.print("B : ");
		for (String string : seatB) {
			System.out.print(" "+string);
		}
		System.out.println();

		System.out.print("C : ");
		for (String string : seatC) {
			System.out.print(" "+string);
		}
		System.out.println();
		
		System.out.print("D : ");
		for (String string : seatD) {
			System.out.print(" "+string);
		}
		System.out.println();
	}
	
}
