package jmj;
import java.util.ArrayList;

public class Detailpage {
	//��ȭ ��������
	
	public ArrayList<Movie> detailpager(){
		// TODO Auto-generated method stub
		ArrayList<Movie> mdetail = new ArrayList<>();
		mdetail.add(new Movie("Ÿ��Ÿ��", "�糭", "���ӽ�ī�޷�", "���������� ��ī������, ����Ʈ ������", 200, 1, "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("�����: �������", "�׼�", "�ؼ��� ���", "ũ�������ݽ�, ��Į�� ���ѽ�", 180, 1,"�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("�ξ����", "�ִϸ��̼�", "�� Ŭ������ ���", "���𺥽�, �Ͽ���ֽø�", 180, 1, "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("����", "�׼�", "�ʰ���", "Ȳ����", 180, 1, "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("��ũȦ", "���", "������", "���¿�, ������, �̱���", 180, 1, "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("�𰡵�", "���", "���¿�", "���μ�, ������", 180, 1, "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("�õ�","ȣ��","����Ʈ������","���� �����þ� ������", 180, 1, "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("��������", "�׼�", "�𷹺�", "���̾� ������, Ÿ��ī ����ƼƼ", 180, 1, "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("�����빮", "�θǽ�", "��ġ��", "�����, ���鸲", 180, 1, "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
		mdetail.add(new Movie("�� ��������", "�ڹ̵�", "�ƽ� �ٹ��ڿ�", "�ص� ������, ũ����ƾ �и���Ƽ", 180, 1,"�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
				
		for (Movie movied : mdetail) {
			int a = movied.getRunningTime() / 60;
			int b = movied.getRunningTime() % 60;					
//			System.out.println(movied.getMovieTitle()+movied.getGenre()+movied.getDirector()+movied.getActor()+a+b);
		}
		return mdetail;
	}
	
	public static void main(String[] args) {
		Detailpage dt = new Detailpage();
		
		System.out.println(dt.detailpager().get(0).getMovieTitle());
		if("Ÿ��Ÿ��" == dt.detailpager().get(0).getMovieTitle()) {
			System.out.println("�������� ���� �޼ҵ� ȣ��");
		}
			
	}
}
