package LJS;
import java.util.Scanner;

public class LogInMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���!");
		String id = sc.nextLine();
		
		System.out.println("��й�ȣ�� �Է��ϼ���!");
		String password = sc.nextLine();
		
		System.out.println("��ȭ��ȣ�� �Է��ϼ���!");
		String phone = sc.nextLine();
		
		LogIn logIn = new LogIn();
		Member m1 = logIn.LogIn(id, password, phone);
		
		sc.close();
		
		// id �� pw�� Ȯ���ϴ� �޼ҵ� ���� (memberData���� �������) > �α��� ���� ���� ���
		// ���� �� > ��ȭ ���� �޴� (��ȭ ���� �޴� ȣ��)
		// ���� �� > �α��� �޴� (���� ȭ�� ȣ��)
	
	}

}