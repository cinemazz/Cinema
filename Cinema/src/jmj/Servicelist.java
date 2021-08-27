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
		"아이디/비밀번호 찾기"+"\n"+
		"핸드폰 번호을 입력 하시면 입력하신 번호로"+"\n"+
		"아이디와 비밀번호를 전송 해 드립니다."
		);
	}
	public void cardbenefits() {
		System.out.println(
		"카드 별 할인 혜택 입니다."+"\n"+
		"1. 삼성 (5% DC)"+"\n"+
		"2.	신한 (3% DC)"+"\n"+
		"3.	국민 (10% DC)"
		);
	}
	public void cancle() {
		System.out.println(
		"영화 환불/취소 입니다."+"\n"+
		"로그인 하신 후 환불/취소가 가능합니다"
		);
	}

}
