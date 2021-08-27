package kyc;

import java.util.ArrayList;

import jmj.Movie;
import jmj.Detailpage;

public class Cinema {
	private String name;
	private ArrayList<Movie> cinemaInMovieList;
			
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
	
	public ArrayList<Movie> getCinemaInMovieList() {
		return cinemaInMovieList;
	}	

	public ArrayList<Cinema> cinemaGenerater() {
		ArrayList<Cinema> cinemaList = new ArrayList<>();
		Detailpage detailpage = new Detailpage();
		ArrayList<Movie> movieList = detailpage.detailpager();
		
		ArrayList<Movie> seoulCinemaMovieList = new ArrayList<Movie>();
		seoulCinemaMovieList.add(movieList.get(1));
		seoulCinemaMovieList.add(movieList.get(5));
		seoulCinemaMovieList.add(movieList.get(2));
		seoulCinemaMovieList.add(movieList.get(3));
		seoulCinemaMovieList.add(movieList.get(4));		
		Cinema seoulCinema = new Cinema("서울영화관", seoulCinemaMovieList);
		cinemaList.add(seoulCinema);
		
		ArrayList<Movie> busanCinemaMovieList = new ArrayList<Movie>();
		busanCinemaMovieList.add(movieList.get(5));
		busanCinemaMovieList.add(movieList.get(6));
		busanCinemaMovieList.add(movieList.get(7));
		busanCinemaMovieList.add(movieList.get(8));
		busanCinemaMovieList.add(movieList.get(9));
		Cinema busanCinema = new Cinema("부산영화관", busanCinemaMovieList);
		cinemaList.add(busanCinema);
		
		ArrayList<Movie> suwonCinemaMovieList = new ArrayList<Movie>();
		suwonCinemaMovieList.add(movieList.get(0));
		suwonCinemaMovieList.add(movieList.get(1));
		suwonCinemaMovieList.add(movieList.get(2));
		suwonCinemaMovieList.add(movieList.get(3));
		suwonCinemaMovieList.add(movieList.get(4));
		Cinema suwonCinema = new Cinema("수원영화관", suwonCinemaMovieList);
		cinemaList.add(suwonCinema);
				
		ArrayList<Movie> gangwonCinemaMovieList = new ArrayList<Movie>();
		gangwonCinemaMovieList.add(movieList.get(1));
		gangwonCinemaMovieList.add(movieList.get(5));
		gangwonCinemaMovieList.add(movieList.get(7));
		gangwonCinemaMovieList.add(movieList.get(8));
		gangwonCinemaMovieList.add(movieList.get(9));
		Cinema gangwonCinema = new Cinema("강원영화관", gangwonCinemaMovieList);
		cinemaList.add(gangwonCinema);

		ArrayList<Movie> junjuCinemaMovieList = new ArrayList<Movie>();
		junjuCinemaMovieList.add(movieList.get(1));
		junjuCinemaMovieList.add(movieList.get(3));
		junjuCinemaMovieList.add(movieList.get(5));
		junjuCinemaMovieList.add(movieList.get(7));
		junjuCinemaMovieList.add(movieList.get(8));
		Cinema junjuCinema = new Cinema("전주영화관", junjuCinemaMovieList);
		cinemaList.add(junjuCinema);
		
		ArrayList<Movie> junnamCinemaMovieList = new ArrayList<Movie>();
		junnamCinemaMovieList.add(movieList.get(1));
		junnamCinemaMovieList.add(movieList.get(2));
		junnamCinemaMovieList.add(movieList.get(5));
		junnamCinemaMovieList.add(movieList.get(6));
		junnamCinemaMovieList.add(movieList.get(3));
		Cinema junnamCinema = new Cinema("전남영화관", junnamCinemaMovieList);
		cinemaList.add(junnamCinema);
		
		ArrayList<Movie> junbukCinemaMovieList = new ArrayList<Movie>();
		junbukCinemaMovieList.add(movieList.get(1));
		junbukCinemaMovieList.add(movieList.get(4));
		junbukCinemaMovieList.add(movieList.get(5));
		junbukCinemaMovieList.add(movieList.get(3));
		junbukCinemaMovieList.add(movieList.get(9));
		Cinema junbukCinema = new Cinema("전북영화관", junbukCinemaMovieList);
		cinemaList.add(junbukCinema);
		
		ArrayList<Movie> sokchoCinemaMovieList = new ArrayList<Movie>();
		sokchoCinemaMovieList.add(movieList.get(5));
		sokchoCinemaMovieList.add(movieList.get(6));
		sokchoCinemaMovieList.add(movieList.get(1));
		sokchoCinemaMovieList.add(movieList.get(8));
		sokchoCinemaMovieList.add(movieList.get(9));
		Cinema sokchoCinema = new Cinema("속초영화관", sokchoCinemaMovieList);
		cinemaList.add(sokchoCinema);
		
		ArrayList<Movie> wolsanCinemaMovieList = new ArrayList<Movie>();
		wolsanCinemaMovieList.add(movieList.get(5));
		wolsanCinemaMovieList.add(movieList.get(6));
		wolsanCinemaMovieList.add(movieList.get(3));
		wolsanCinemaMovieList.add(movieList.get(8));
		wolsanCinemaMovieList.add(movieList.get(7));
		Cinema wolsanCinema = new Cinema("울산영화관", wolsanCinemaMovieList);
		cinemaList.add(wolsanCinema);
		
		return cinemaList;
	}
	
}
