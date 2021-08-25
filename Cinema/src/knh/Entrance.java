package knh;

import java.util.Scanner;

public class Entrance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EntranceFunction ef = new EntranceFunction();
		int i = Integer.parseInt("08");
		
		
		ef.logIn(sc);
		//로그인 성공했으면 return으로 객체를 받자 
		//if문을 이용해 회원정보를 받아왔으면 아래 실행
		System.out.println("로그인 되었습니다."+i);
		
		MovieTicketing mt = new MovieTicketing();
		mt.screenMain(sc);
		
		//다음화면이든 종료를하든 이후에 작성
		
		sc.close();
	}

}
