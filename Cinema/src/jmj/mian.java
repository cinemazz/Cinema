package jmj;

import java.util.Scanner;

public class mian {
	
	public static void main(String[] args) {
		Detailpage dtpage = new Detailpage();
		dtpage.detailpager();
		
		SearchMovie serchm = new SearchMovie();
		//��ȭ �˻�
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ ���� �Ǵ� �������� �˻� ���ּ���");
		String stext = scanner.next();
		scanner.nextLine();
		serchm.search(stext);
		scanner.close();
		
		
		
			
			
			
		
		
		
				
	}

}
