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
		Cinema seoulCinema = new Cinema("���￵ȭ��");
		cinemaList.add(seoulCinema);
		Cinema busanCinema = new Cinema("�λ꿵ȭ��");
		cinemaList.add(busanCinema);
		Cinema suwonCinema = new Cinema("������ȭ��");
		cinemaList.add(suwonCinema);
		Cinema gangwonCinema = new Cinema("������ȭ��");
		cinemaList.add(gangwonCinema);
		Cinema junjuCinema = new Cinema("���ֿ�ȭ��");
		cinemaList.add(junjuCinema);
		Cinema junnamCinema = new Cinema("������ȭ��");
		cinemaList.add(junnamCinema);
		Cinema junbukCinema = new Cinema("���Ͽ�ȭ��");
		cinemaList.add(junbukCinema);
		Cinema sokchoCinema = new Cinema("���ʿ�ȭ��");
		cinemaList.add(sokchoCinema);
		Cinema wolsanCinema = new Cinema("��꿵ȭ��");
		cinemaList.add(wolsanCinema);
		
		return cinemaList;
	}
	
}
