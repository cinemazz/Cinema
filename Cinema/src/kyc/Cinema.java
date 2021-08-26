package kyc;

import java.util.ArrayList;

import jmj.Movie;
import jmj.Detailpage;

public class Cinema {
	private String name;
	static ArrayList<Movie> cinemaInMovieList;
		
	Cinema(String name, ArrayList<Movie> cinemaInMovieList){
		this.name = name;
		this.cinemaInMovieList = cinemaInMovieList;
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
		Detailpage detailpage = new Detailpage();
		ArrayList<Movie> movie = detailpage.detailpager();
		ArrayList<Movie> seoulCinemaMovieList = new ArrayList<Movie>();
		seoulCinemaMovieList.add(movie.get(0));
		seoulCinemaMovieList.add(movie.get(1));
		seoulCinemaMovieList.add(movie.get(2));
		seoulCinemaMovieList.add(movie.get(3));
		seoulCinemaMovieList.add(movie.get(4));		
		Cinema seoulCinema = new Cinema("���￵ȭ��", seoulCinemaMovieList);
		cinemaList.add(seoulCinema);
		
		ArrayList<Movie> busanCinemaMovieList1 = new ArrayList<Movie>();
		busanCinemaMovieList1.add(movie.get(5));
		busanCinemaMovieList1.add(movie.get(6));
		busanCinemaMovieList1.add(movie.get(7));
		busanCinemaMovieList1.add(movie.get(8));
		busanCinemaMovieList1.add(movie.get(9));
		Cinema busanCinema = new Cinema("�λ꿵ȭ��", busanCinemaMovieList1);
		cinemaList.add(busanCinema);
		
		ArrayList<Movie> suwonCinemaMovieList = new ArrayList<Movie>();
		suwonCinemaMovieList.add(movie.get(10));
		suwonCinemaMovieList.add(movie.get(1));
		suwonCinemaMovieList.add(movie.get(2));
		suwonCinemaMovieList.add(movie.get(3));
		suwonCinemaMovieList.add(movie.get(4));
		Cinema suwonCinema = new Cinema("������ȭ��", suwonCinemaMovieList);
		cinemaList.add(suwonCinema);
				
		ArrayList<Movie> gangwonCinemaMovieList = new ArrayList<Movie>();
		gangwonCinemaMovieList.add(movie.get(10));
		gangwonCinemaMovieList.add(movie.get(5));
		gangwonCinemaMovieList.add(movie.get(7));
		gangwonCinemaMovieList.add(movie.get(8));
		gangwonCinemaMovieList.add(movie.get(9));
		Cinema gangwonCinema = new Cinema("������ȭ��", gangwonCinemaMovieList);
		cinemaList.add(gangwonCinema);

		ArrayList<Movie> junjuCinemaMovieList = new ArrayList<Movie>();
		junjuCinemaMovieList.add(movie.get(1));
		junjuCinemaMovieList.add(movie.get(3));
		junjuCinemaMovieList.add(movie.get(5));
		junjuCinemaMovieList.add(movie.get(7));
		junjuCinemaMovieList.add(movie.get(8));
		Cinema junjuCinema = new Cinema("���ֿ�ȭ��", junjuCinemaMovieList);
		cinemaList.add(junjuCinema);
		
		ArrayList<Movie> junnamCinemaMovieList = new ArrayList<Movie>();
		junnamCinemaMovieList.add(movie.get(1));
		junnamCinemaMovieList.add(movie.get(2));
		junnamCinemaMovieList.add(movie.get(5));
		junnamCinemaMovieList.add(movie.get(6));
		junnamCinemaMovieList.add(movie.get(10));
		Cinema junnamCinema = new Cinema("������ȭ��", junnamCinemaMovieList);
		cinemaList.add(junnamCinema);
		
		ArrayList<Movie> junbukCinemaMovieList = new ArrayList<Movie>();
		junbukCinemaMovieList.add(movie.get(1));
		junbukCinemaMovieList.add(movie.get(4));
		junbukCinemaMovieList.add(movie.get(5));
		junbukCinemaMovieList.add(movie.get(10));
		junbukCinemaMovieList.add(movie.get(9));
		Cinema junbukCinema = new Cinema("���Ͽ�ȭ��", junbukCinemaMovieList);
		cinemaList.add(junbukCinema);
		
		ArrayList<Movie> sokchoCinemaMovieList = new ArrayList<Movie>();
		sokchoCinemaMovieList.add(movie.get(5));
		sokchoCinemaMovieList.add(movie.get(6));
		sokchoCinemaMovieList.add(movie.get(1));
		sokchoCinemaMovieList.add(movie.get(8));
		sokchoCinemaMovieList.add(movie.get(9));
		Cinema sokchoCinema = new Cinema("���ʿ�ȭ��", sokchoCinemaMovieList);
		cinemaList.add(sokchoCinema);
		
		ArrayList<Movie> wolsanCinemaMovieList = new ArrayList<Movie>();
		wolsanCinemaMovieList.add(movie.get(5));
		wolsanCinemaMovieList.add(movie.get(6));
		wolsanCinemaMovieList.add(movie.get(3));
		wolsanCinemaMovieList.add(movie.get(8));
		wolsanCinemaMovieList.add(movie.get(7));
		Cinema wolsanCinema = new Cinema("��꿵ȭ��", wolsanCinemaMovieList);
		cinemaList.add(wolsanCinema);
		
		return cinemaList;
	}
	
}
