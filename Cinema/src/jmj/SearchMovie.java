package jmj;

import java.util.ArrayList;
import java.util.Scanner;
public class SearchMovie {
	//�˻� ȭ��
	Movie movie;
	String searchresult;
	
	
	Scanner scanner = new Scanner(System.in);
	public String search(Detailpage dtpage) {
		
		System.out.println("��ȭ ���� �Ǵ� �������� �˻� ���ּ���");
		this.searchresult = scanner.nextLine();
		
		dtpage.detailpager();
		
		if(searchresult == detailpager().) {
			
			System.out.println(movied.getMovieTitle()+movied.getGenre()+movied.getDirector()+movied.getActor()+houer+"��"+minute+"��"+" ������ :"+movied.getScreeninGeriod()+movied.getScreeninEndDate());
			break;
		}
		
		return searchresult;
	}
	
	void snclose() {
		scanner.close();
	}
		
}
