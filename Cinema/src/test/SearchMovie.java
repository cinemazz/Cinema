package test;

import java.util.ArrayList;
import java.util.Scanner;
public class SearchMovie {
	//�˻� ȭ��
	String resultmovie;
	int number;
	int searchst;
	public ArrayList<Movie> search(String stext) {
		
		Detailpage det = new Detailpage();
		int cnt = 0;//if�� ���ǿ� �´� ����
		
		ArrayList<Movie> number = new ArrayList<>();
		for (Movie movie : det.detailpager()) {
			//��ȭ ����Ÿ��
			int houer = movie.getRunningTime() / 60;
			int minute = movie.getRunningTime() % 60;
			
			if(movie.getMovieTitle().contains(stext)) {// ��ĳ�ʷ� �Է��� ���� ������ movie�� ������ ����� ���ι���
				//System.out.println(movie.getMovieTitle()+movie.getGenre()+movie.getDirector()+movie.getActor()+houer+"��"+minute+"��"+" ������ :"+movie.getScreeninGeriod()+movie.getScreeninEndDate());
				number.add(movie);
				cnt++;
				System.out.println(cnt+". ���� :"+movie.getMovieTitle()+"/ ���� :"+movie.getDirector());
			}else if(movie.getDirector().contains(stext)) {
				number.add(movie);
				cnt++;
				System.out.println(cnt+". ���� :"+movie.getMovieTitle()+"/ ���� :"+movie.getDirector());
			}	
		}
		if(cnt == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		}	
	
		//���ϴ� ��ȭ ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("- ���Ͻô� ��ȭ ���� ���ּ���");
		try {
			int searchst = Integer.parseInt(scanner.nextLine())-1;
			//scanner.nextLine();
			System.out.println(
			"���� :"+number.get(searchst).getMovieTitle()+"\n"+
			"�帣 :"+number.get(searchst).getGenre()+"\n"+
			"���� :"+number.get(searchst).getDirector()+"\n"+
			"��� :"+number.get(searchst).getActor()+"\n"+
			"����Ÿ�� :"+number.get(searchst).getRunningTime() / 60+"��"+number.get(searchst).getRunningTime() % 60+"��"+"\n"+
			"������ :"+number.get(searchst).getScreeninGeriod()+"\n"+
			"������ :"+number.get(searchst).getScreeninEndDate());

		}catch(IndexOutOfBoundsException e) {
			System.out.println("���ڿ� �ش��ϴ� ��ȭ�� �����ϴ�.");
		}catch(NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
		}
		
		//scanner.close();
		return number;
	}	

	
}