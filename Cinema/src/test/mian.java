package test;

import java.util.Scanner;

public class mian {
	
	public void search() {
		//Detailpage dtpage = new Detailpage();
		//dtpage.detailpager();
		
		SearchMovie serchm = new SearchMovie();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ ���� �Ǵ� �������� �˻� ���ּ���");
		String stext = scanner.nextLine();
		serchm.search(stext);
		//scanner.close();
		
			
		
		
		
				
	}

}
