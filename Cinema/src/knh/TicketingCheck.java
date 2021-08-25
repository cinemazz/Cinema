package knh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TicketingCheck {
	//�Ű������� ���� ����
	String title = "����";
	Date screenDate = new Date();//��¥����
	SimpleDateFormat date = new SimpleDateFormat("MM.dd");
	int numberOfPeople = 3;
	String[] seat = {"a 3", "a 4", "a 5"};
	int showTime = 132;
	int payment = 30000;
	
	
	public void showInfo() {//��ȭ �������� �Ű������� �޾Ƽ� ����
		System.out.println("ȸ������ ������ �����Դϴ�.");
		//��¹�
		//���� - ������
		System.out.println("���� - "+title);
		//��¥ - 08.30
		System.out.println("��¥ - "+date.format(screenDate));
		//�����ο� - ����
		System.out.println("���� �ο� - "+numberOfPeople);
		//�¼�	a3 a4 a5
		System.out.print("�¼� - ");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+" ");
		}
		System.out.println();
		//�󿵽ð� - 00:00
		System.out.println("�󿵽ð� - "+String.format("%02d:%02d",showTime/60,showTime%60));
		//�����ݾ� : 0000�� ���η��� ����� �����ݾ�
		System.out.println("�����ݾ� : "+payment+"��");
	}
}
