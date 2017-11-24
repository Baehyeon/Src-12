import java.util.Scanner;

class ImThread implements Runnable {  // Runnable �������̽��� implements
	public void run() { 
		System.out.println("������ ���� ����");		
		for(int i=1; i<=10; i++)		// 1���� 10���� ���
			System.out.print(i + " ");
		System.out.println();
		System.out.println("������ ����");
	}
}

public class ConsoleEx {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ƹ� Ű�� �Է� >> ");
		
		scanner.nextLine(); // � Ű�� �Է��ϰ� <Enter>�� ħ
		scanner.close();
		
		Thread th = new Thread(new ImThread()); // ������ ��ü�� ����
		th.start(); // ������ ����
		
	}
}