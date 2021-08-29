package LJS;

import java.util.ArrayList;

import kyc.Ticket;

//ȸ�� Ŭ���� ĸ��ȭ
public class Member {

	// ID, PW, �ڵ�����ȣ
	private String id;
	private String password;
	private String phone;
	private ArrayList<Ticket> ticketList;		
	
	public Member(String id, String password, ArrayList<Ticket> ticketList) {
		super();
		this.id = id;
		this.password = password;		
		this.ticketList = ticketList;
	}

	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public Member(String id, String password, String phone) {
		this.id = id;
		this.password = password;
		this.phone = phone;
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	

	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(ArrayList<Ticket> ticketList) {
		this.ticketList = ticketList;
	}
}