import java.util.ArrayList;

public class Detailpage {
	//��ȭ ��������
	
	Detailpage(int a){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie("summary");
		movie.summary = "�쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��";
		
		ArrayList<Movie> mdetail = new ArrayList<>();
		mdetail.add(new Movie("Ÿ��Ÿ��","�糭","���ӽ�ī�޷�","���������� ��ī������, ����Ʈ ������",200,1));
		mdetail.add(new Movie("�����: �������","�׼�","�ؼ��� ���","ũ�������ݽ�, ��Į�� ���ѽ�",3,1));
		mdetail.add(new Movie("�ξ����","�ִϸ��̼�","�� Ŭ������ ���","���𺥽�, �Ͽ���ֽø�",3,1));
		mdetail.add(new Movie("����","�׼�","�ʰ���","Ȳ����",3,1));
		mdetail.add(new Movie("��ũȦ","���","������","���¿�, ������, �̱���",3,1));
		mdetail.add(new Movie("�𰡵�","���","���¿�","���μ�, ������",3,1));
		mdetail.add(new Movie("�õ�","ȣ��","����Ʈ������","���� �����þ� ������",3,1));
		mdetail.add(new Movie("��������","�׼�","�𷹺�","���̾� ������, Ÿ��ī ����ƼƼ",3,1));
		mdetail.add(new Movie("�����빮","�θǽ�","��ġ��","�����, ���鸲",3,1));
		mdetail.add(new Movie("�� ��������","�ڹ̵�","�ƽ� �ٹ��ڿ�","�ص� ������, ũ����ƾ �и���Ƽ",3,1));
		
		
		for (Movie movied : mdetail) {
			int a = movied.getRunningTime() / 60;
			int b = movied.getRunningTime() % 60;
			
			
			System.out.println(movied.getMovieTitle()+movied.getGenre()+movied.getDirector()+movied.getActor()+a+b);
		}
		
	}
}
