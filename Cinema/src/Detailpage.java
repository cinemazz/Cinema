
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Detailpage {
   //��ȭ ��������
   
   public ArrayList<Movie> detailpager(){
      // TODO Auto-generated method stub
      ArrayList<Movie> mdetail = new ArrayList<>();
      mdetail.add(new Movie("Ÿ��Ÿ�� ","�糭 ","���ӽ�ī�޷� ","���������� ��ī������, ����Ʈ ������ ",200, 1," �쿬�� ��ȸ�� Ƽ���� ���� Ÿ��Ÿ��ȣ�� �ö�ź �����ο� ��ȥ�� ���� ȭ�� ��"));
      mdetail.add(new Movie("�����: ������� ","�׼� ","�ؼ��� ��� ","ũ�������ݽ�, ��Į�� ���ѽ� ",180,2," ���Ǵ�Ƽ �� ���� ���ݸ� ��Ƴ��� ���������� ���"));
      mdetail.add(new Movie("�ξ���� ","�ִϸ��̼� ","�� Ŭ������ ��� ","���𺥽�, �Ͽ���ֽø� ",250, 3," �ٴٿ��� ���� �Ƹ��ٿ� ��Ҹ��� �������� ������"));
      mdetail.add(new Movie("���� ","�׼� ","�ʰ���","Ȳ���� ",200, 4," ���� �Ѻ��ǿ��� ���ŵ�, ����ڵ� ���� ���ѹα� ���� 'Ȳ����'�� ��ġ�ȴ�."));
      mdetail.add(new Movie("��ũȦ ","��� ","������ ","���¿�, ������, �̱��� ",240, 5," �̻� ù������ ���� ���߷� ��������(���¿�)�� ���ǰ� �ε�����."));
      mdetail.add(new Movie("�𰡵� ","��� ","���¿� ","���μ�, ������ ",180, 6," ���ݺ��� �츮�� ��ǥ�� ������ �����̴�!"));
      mdetail.add(new Movie("�õ� ","ȣ�� ","����Ʈ������ ","���� �����þ� ������ ",200, 7," ��ħ���� ����, ���Ŀ��� �, ���ῡ�� ����"));
      mdetail.add(new Movie("�������� ","�׼� ","�𷹺� ","���̾� ������, Ÿ��ī ����ƼƼ ",210, 8," ����� ����, ��ģ �׸��� �� ���� Ŀ��."));
      mdetail.add(new Movie("�����빮 ","�θǽ� ","��ġ�� ","�����, ���鸲 ",200, 9," �������� ������ û�� ��ȭ�� Ŭ����"));
      mdetail.add(new Movie("�� �������� ","�ڹ̵� ","�ƽ� �ٹ��ڿ� ","�ص� ������, ũ����ƾ �и���Ƽ ",210, 10,"�λ� �ְ��� ���� ���� ���� ��ȥ���� ������ �ʽ��������� ����Ʈ"));
      
      
      for (Movie movied : mdetail) {
         //��ȭ ����Ÿ��
         int houer = movied.getRunningTime() / 60;
         int minute = movied.getRunningTime() % 60;
         
         //�󿵱Ⱓ
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
         Calendar calst = Calendar.getInstance();
         Calendar calend = Calendar.getInstance();
         //������
//         for(int i = 0; i<=mdetail.size(); i++) {
//            if(mdetail.get(i)==0  ) {
//               calst.add(Calendar.DAY_OF_MONTH, +0);
//               System.out.println();
//            }else if(i==2) {
//               calst.add(Calendar.WEEK_OF_MONTH, +1);
//            }
//         }
         
            if(movied.getScreeninGeriod() == 1) {
               calst.add(Calendar.DAY_OF_MONTH, +1);
               System.out.println("���� + 1 : ");
               System.out.println(Calendar.DAY_OF_MONTH+1);
               
            }else if(movied.getScreeninGeriod()==2) {
               calst.add(Calendar.WEEK_OF_MONTH, +1);
               
            }else if(movied.getScreeninGeriod()==3) {
               calst.add(Calendar.WEEK_OF_MONTH, +2);               
            }
         
         //������
         for(int i = 1; i<=10; i++) {
            calend.add(Calendar.DAY_OF_MONTH, +2);            
         }
         
         System.out.println(movied.getMovieTitle()+movied.getGenre()+movied.getDirector()+movied.getActor()+houer+"��"+minute+"��"+" �󿵱Ⱓ :"+simpleDateFormat.format(calst.getTime())+"���� :"+simpleDateFormat.format(calend.getTime()));             
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
