package jmj;

public class Servicelist {
	public void servicelistitems(int servicenumber){
		if(servicenumber ==0) {
			fidpw();
		}else if(servicenumber ==1) {
			cardbenefits();
		}else {
			cancle();
		}
	}
	public void fidpw() {
		System.out.println(
		"���̵�/��й�ȣ ã��"+"\n"+
		"�ڵ��� ��ȣ�� �Է� �Ͻø� �Է��Ͻ� ��ȣ��"+"\n"+
		"���̵�� ��й�ȣ�� ���� �� �帳�ϴ�."
		);
	}
	public void cardbenefits() {
		System.out.println(
		"ī�� �� ���� ���� �Դϴ�."+"\n"+
		"1. �Ｚ (5% DC)"+"\n"+
		"2.	���� (3% DC)"+"\n"+
		"3.	���� (10% DC)"
		);
	}
	public void cancle() {
		System.out.println(
		"��ȭ ȯ��/��� �Դϴ�."+"\n"+
		"�α��� �Ͻ� �� ȯ��/��Ұ� �����մϴ�"
		);
	}

}
