package knh;

import java.util.ArrayList;

import LJS.Login;
import LJS.Member;

public class main {
	
	public void callAccountFind() {
		
		AccountFind af = new AccountFind();		
		af.check_PhoneNumber(Login.memberList);
	}
}
