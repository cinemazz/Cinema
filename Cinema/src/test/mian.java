package test;

import java.util.Scanner;

public class mian {
	
	public void search(Scanner sc) {
		//Detailpage dtpage = new Detailpage();
		//dtpage.detailpager();
		
		SearchMovie serchm = new SearchMovie();
		
		//Scanner scanner = new Scanner(System.in);
		//��ȭ �˻�
		System.out.println("��ȭ ���� �Ǵ� �������� �˻� ���ּ���");
		String stext = sc.nextLine();
		serchm.search(stext);
	}
	public void service(Scanner sc) {
		//������
		Servicelist center= new Servicelist();
		System.out.println("=======================");
		System.out.println("����ã�� ���� ��ȣ�� �������ּ���");
		System.out.println("1.���̵�/��й�ȣã��  2.��������  3.ȯ�����");	
		int servicenumber = Integer.parseInt(sc.nextLine());
		center.servicelistitems(servicenumber);
		
		//scanner.close();
	}

}
