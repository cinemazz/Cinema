package knh;

import java.util.Scanner;

public class Entrance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EntranceFunction ef = new EntranceFunction();
		int i = Integer.parseInt("08");
		
		
		ef.logIn(sc);
		//�α��� ���������� return���� ��ü�� ���� 
		//if���� �̿��� ȸ�������� �޾ƿ����� �Ʒ� ����
		System.out.println("�α��� �Ǿ����ϴ�."+i);
		
		MovieTicketing mt = new MovieTicketing();
		mt.screenMain(sc);
		
		//����ȭ���̵� ���Ḧ�ϵ� ���Ŀ� �ۼ�
		
		sc.close();
	}

}
