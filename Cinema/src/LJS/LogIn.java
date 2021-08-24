package LJS;
import java.util.Scanner;

public class LogIn {
	
	private String id;
	private String password;
	private String phone;
	
	
	public Member LogIn (String id, String password, String phone) {
		
		Scanner logIn = new Scanner(System.in);
	
		return new Member(id, password, phone);
	
	}
}
