package LJS;
import java.util.Scanner;

public class LogInMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���.");
		String id = sc.nextLine();
		
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String password = sc.nextLine();
		
		LogIn logIn = new LogIn();
		Member m1 = logIn.LogIn(id, password);
		
		MemberData data = new MemberData();
		data.login(id, password);
		
		if(m1.getId().equals(data) && m1.getPassword().equals(data)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			// ��ȭ ���� �޴� ����
		}else {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� ��ġ�����ʽ��ϴ�.");
			// �α��� �޴� ����
		}
		
		
		sc.close();
		
		// id �� pw�� Ȯ���ϴ� �޼ҵ� ���� (memberData���� �������) > �α��� ���� ���� ���
		// ���� �� > ��ȭ ���� �޴� (��ȭ ���� �޴� ȣ��)
		// ���� �� > �α��� �޴� (���� ȭ�� ȣ��)
	
	}

}