package jmj;

import java.util.Scanner;

public class mian {
	
	public static void main(String[] args) {
		Detailpage dtpage = new Detailpage();
		dtpage.detailpager();
		
		SearchMovie serchm = new SearchMovie();
		
		Scanner scanner = new Scanner(System.in);
		//��ȭ �˻�
		System.out.println("��ȭ ���� �Ǵ� �������� �˻� ���ּ���");
		String stext = scanner.nextLine();
		//scanner.nextLine();
		serchm.search(stext);
		
		//������
		Servicelist center= new Servicelist();
		System.out.println("=======================");
		System.out.println("����ã�� ���� ��ȣ�� �������ּ���");
		System.out.println("0.���̵�/��й�ȣã��  1.��������  2.ȯ�����");	
		int servicenumber = scanner.nextInt();
		center.servicelistitems(servicenumber);
		
		scanner.close();	
	}

}
