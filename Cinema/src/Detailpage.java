
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Detailpage {
   //영화 상세페이지
   
   public ArrayList<Movie> detailpager(){
      // TODO Auto-generated method stub
      ArrayList<Movie> mdetail = new ArrayList<>();
      mdetail.add(new Movie("타이타닉 ","재난 ","제임스카메론 ","레오나르도 디카프리오, 케이트 윈슬렛 ",200, 1," 우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
      mdetail.add(new Movie("어벤져스: 엔드게임 ","액션 ","앤서니 루소 ","크리스에반스, 스칼렛 요한슨 ",180,2," 인피니티 워 이후 절반만 살아남은 지구마지막 희망"));
      mdetail.add(new Movie("인어공주 ","애니메이션 ","론 클레먼츠 루소 ","조디벤슨, 하워드애시먼 ",250, 3," 바다에서 가장 아름다운 목소리의 소유자인 에리얼"));
      mdetail.add(new Movie("인질 ","액션 ","필감성","황정민 ",200, 4," 서울 한복판에서 증거도, 목격자도 없이 대한민국 톱배우 '황정민'이 납치된다."));
      mdetail.add(new Movie("싱크홀 ","드라마 ","김지훈 ","차승원, 김지훈, 이광수 ",240, 5," 이사 첫날부터 프로 참견러 ‘만수’(차승원)와 사사건건 부딪힌다."));
      mdetail.add(new Movie("모가디슈 ","드라마 ","류승완 ","조인성, 김윤석 ",180, 6," 지금부터 우리의 목표는 오로지 생존이다!"));
      mdetail.add(new Movie("올드 ","호러 ","나이트샤말란 ","가엘 가르시아 베르날 ",200, 7," 아침에는 아이, 오후에는 어른, 저녁에는 노인"));
      mdetail.add(new Movie("프리가이 ","액션 ","숀레비 ","라이언 레놀즈, 타이카 와이티티 ",210, 8," 평범한 직장, 절친 그리고 한 잔의 커피."));
      mdetail.add(new Movie("남색대문 ","로맨스 ","이치엔 ","계륜미, 진백림 ",200, 9," 여름마다 떠오를 청춘 영화의 클래식"));
      mdetail.add(new Movie("팜 스프링스 ","코미디 ","맥스 바바코우 ","앤디 샘버그, 크리스틴 밀리오티 ",210, 10,"인생 최고의 날로 기억될 멋진 결혼식이 열리는 팜스프링스의 리조트"));
      
      
      for (Movie movied : mdetail) {
         //영화 런닝타임
         int houer = movied.getRunningTime() / 60;
         int minute = movied.getRunningTime() % 60;
         
         //상영기간
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
         Calendar calst = Calendar.getInstance();
         Calendar calend = Calendar.getInstance();
         //개봉일
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
               System.out.println("날일 + 1 : ");
               System.out.println(Calendar.DAY_OF_MONTH+1);
               
            }else if(movied.getScreeninGeriod()==2) {
               calst.add(Calendar.WEEK_OF_MONTH, +1);
               
            }else if(movied.getScreeninGeriod()==3) {
               calst.add(Calendar.WEEK_OF_MONTH, +2);               
            }
         
         //종료일
         for(int i = 1; i<=10; i++) {
            calend.add(Calendar.DAY_OF_MONTH, +2);            
         }
         
         System.out.println(movied.getMovieTitle()+movied.getGenre()+movied.getDirector()+movied.getActor()+houer+"시"+minute+"분"+" 상영기간 :"+simpleDateFormat.format(calst.getTime())+"종료 :"+simpleDateFormat.format(calend.getTime()));             
      }
      return mdetail;
   }
   
   public static void main(String[] args) {
      Detailpage dt = new Detailpage();      
      
      System.out.println(dt.detailpager().get(0).getMovieTitle());
      if("타이타닉" == dt.detailpager().get(0).getMovieTitle()) {
         System.out.println("상세페이지 보기 메소드 호출");
      }
         
   }
}
