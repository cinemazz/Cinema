package jmj;

import java.util.ArrayList;


public class Detailpage {
	//��ȭ ��������
	
	public ArrayList<Movie> detailpager(){
		// TODO Auto-generated method stub
		ArrayList<Movie> mdetail = new ArrayList<>();
		mdetail.add(new Movie("Ÿ��Ÿ�� ","�糭 ","���ӽ�ī�޷� ","���������� ��ī������, ����Ʈ ������ ",200,"08-25","09-25"," �쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("�����: ������� ","�׼� ","�ؼ��� ��� ","ũ�������ݽ�, ��Į�� ���ѽ� ",180,"08-26","10-01"," ���Ǵ�Ƽ �� ���� ���ݸ� ��Ƴ��� ���������� ���"));
		mdetail.add(new Movie("�ξ���� ","�ִϸ��̼� ","�� Ŭ������ ��� ","���𺥽�, �Ͽ���ֽø� ",250,"08-23","10-23"," �ٴٿ��� ���� �Ƹ��ٿ� ��Ҹ��� �������� ������"));
		mdetail.add(new Movie("���� ","�׼� ","�ʰ���","Ȳ���� ",200,"08-01","11-01"," ���� �Ѻ��ǿ��� ���ŵ�, ����ڵ� ���� ���ѹα� ���� 'Ȳ����'�� ��ġ�ȴ�."));
		mdetail.add(new Movie("��ũȦ ","��� ","������ ","���¿�, ������, �̱��� ",240,"08-02","10-24"," �̻� ù������ ���� ���߷� ��������(���¿�)�� ���ǰ� �ε�����."));
		mdetail.add(new Movie("�𰡵� ","��� ","���¿� ","���μ�, ������ ",180,"08-25","11-12"," ���ݺ��� �츮�� ��ǥ�� ������ �����̴�!"));
		mdetail.add(new Movie("�õ� ","ȣ�� ","����Ʈ������ ","���� �����þ� ������ ",200,"07-15","09-14"," ��ħ���� ����, ���Ŀ��� �, ���ῡ�� ����"));
		mdetail.add(new Movie("�������� ","�׼� ","�𷹺� ","���̾� ������, Ÿ��ī ����ƼƼ ",210,"07-20","09-14"," ����� ����, ��ģ �׸��� �� ���� Ŀ��."));
		mdetail.add(new Movie("�����빮 ","�θǽ� ","��ġ�� ","�����, ���鸲 ",200,"07-01","09-30"," �������� ������ û�� ��ȭ�� Ŭ����"));
		mdetail.add(new Movie("�� �������� ","�ڹ̵� ","�ƽ� �ٹ��ڿ� ","�ص� ������, ũ����ƾ �и���Ƽ ",210,"08-07","10-31"," �λ� �ְ��� ���� ���� ���� ��ȥ���� ������ �ʽ��������� ����Ʈ"));
		for (Movie movied : mdetail) {
			//��ȭ ����Ÿ��
			int houer = movied.getRunningTime() / 60;
			int minute = movied.getRunningTime() % 60;	
			System.out.println(movied.getMovieTitle()+movied.getGenre()+movied.getDirector()+movied.getActor()+houer+"��"+minute+"��"+" ������ :"+movied.getScreeninGeriod()+movied.getScreeninEndDate());
		}
		return mdetail;
	}
	
	

	
}