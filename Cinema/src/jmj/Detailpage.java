package jmj;

import java.util.ArrayList;


public class Detailpage {
	//영화 상세페이지
	
	public ArrayList<Movie> detailpager(){
		// TODO Auto-generated method stub
		ArrayList<Movie> mdetail = new ArrayList<>();
		mdetail.add(new Movie("타이타닉 ","재난 ","제임스카메론 ","레오나르도 디카프리오, 케이트 윈슬렛 ",200,"2021-08-25","2021-09-25"," 우연한 기회로 티켓을 구해 타이타닉호에 올라탄 자유로운 영혼을 가진 화가 잭"));
		mdetail.add(new Movie("어벤져스: 엔드게임 ","액션 ","앤서니 루소 ","크리스에반스, 스칼렛 요한슨 ",180,"2021-08-26","2021-10-01"," 인피니티 워 이후 절반만 살아남은 지구마지막 희망"));
		mdetail.add(new Movie("인어공주 ","애니메이션 ","론 클레먼츠 루소 ","조디벤슨, 하워드애시먼 ",250,"2021-08-23","2021-10-23"," 바다에서 가장 아름다운 목소리의 소유자인 에리얼"));
		mdetail.add(new Movie("인질 ","액션 ","필감성","황정민 ",200,"2021-08-01","2021-11-01"," 서울 한복판에서 증거도, 목격자도 없이 대한민국 톱배우 '황정민'이 납치된다."));
		mdetail.add(new Movie("싱크홀 ","드라마 ","김지훈 ","차승원, 김지훈, 이광수 ",240,"2021-08-02","2021-10-24"," 이사 첫날부터 프로 참견러 ‘만수’(차승원)와 사사건건 부딪힌다."));
		mdetail.add(new Movie("모가디슈 ","드라마 ","류승완 ","조인성, 김윤석 ",180,"2021-08-25","2021-11-12"," 지금부터 우리의 목표는 오로지 생존이다!"));
		mdetail.add(new Movie("올드 ","호러 ","나이트샤말란 ","가엘 가르시아 베르날 ",200,"2021-07-15","2021-09-14"," 아침에는 아이, 오후에는 어른, 저녁에는 노인"));
		mdetail.add(new Movie("프리가이 ","액션 ","숀레비 ","라이언 레놀즈, 타이카 와이티티 ",210,"2021-07-20","2021-09-14"," 평범한 직장, 절친 그리고 한 잔의 커피."));
		mdetail.add(new Movie("남색대문 ","로맨스 ","이치엔 ","계륜미, 진백림 ",200,"2021-07-01","2021-09-30"," 여름마다 떠오를 청춘 영화의 클래식"));
		mdetail.add(new Movie("팜 스프링스 ","코미디 ","맥스 바바코우 ","앤디 샘버그, 크리스틴 밀리오티 ",210,"2021-08-07","2021-10-31"," 인생 최고의 날로 기억될 멋진 결혼식이 열리는 팜스프링스의 리조트"));
		
		return mdetail;
	}
	
	

	
}
