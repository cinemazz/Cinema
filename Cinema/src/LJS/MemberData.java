package LJS;

public class MemberData {
	
	Member[] members = new Member[100];    					
	
	void register(String id, String password, String phone) {
		
		int index = 0;  
		
		Member member = new Member(id, password, phone );      
		members[index++] = member;          

		
		for(int i = 0; i < index; i++) {
			System.out.println(members[i].toString());
		}
	}

	public void login(String id, String password) {
		
		
	}

}

/*                                                          members 에 들어가야할 멤버 정보
public class MemberData {

public static void main(String[] args) {
	
	ArrayList<Member> memberList = new ArrayList<Member>();
	Member mb1 = new Member("kangnh","nh123","010-1234-5678");
	memberList.add(mb1);		
	Member mb2 = new Member("kimyc","yc456","010-2345-6789");
	memberList.add(mb2);		
	Member mb3 = new Member("leejs","js789","010-3456-7890");
	memberList.add(mb3);	
	Member mb4 = new Member("jeongmj","mj987","010-4567-8901");
	memberList.add(mb4);		
*/

