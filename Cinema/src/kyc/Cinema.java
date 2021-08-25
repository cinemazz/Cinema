package kyc;

import java.util.ArrayList;

public class Cinema {
	private String name;
		
	Cinema(String name){
		this.name = name;
	}
	
	Cinema(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Cinema> cinemaGenerater() {
		ArrayList<Cinema> cinemaList = new ArrayList<>();
		Cinema seoulCinema = new Cinema("서울영화관");
		cinemaList.add(seoulCinema);
		Cinema busanCinema = new Cinema("부산영화관");
		cinemaList.add(busanCinema);
		Cinema suwonCinema = new Cinema("수원영화관");
		cinemaList.add(suwonCinema);
		Cinema gangwonCinema = new Cinema("강원영화관");
		cinemaList.add(gangwonCinema);
		Cinema junjuCinema = new Cinema("전주영화관");
		cinemaList.add(junjuCinema);
		Cinema junnamCinema = new Cinema("전남영화관");
		cinemaList.add(junnamCinema);
		Cinema junbukCinema = new Cinema("전북영화관");
		cinemaList.add(junbukCinema);
		Cinema sokchoCinema = new Cinema("속초영화관");
		cinemaList.add(sokchoCinema);
		Cinema wolsanCinema = new Cinema("울산영화관");
		cinemaList.add(wolsanCinema);
		
		return cinemaList;
	}
	
}
