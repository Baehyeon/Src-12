import java.util.Scanner;

class ImThread implements Runnable {  // Runnable 인터페이스를 implements
	public void run() { 
		System.out.println("스레드 실행 시작");		
		for(int i=1; i<=10; i++)		// 1부터 10까지 출력
			System.out.print(i + " ");
		System.out.println();
		System.out.println("스레드 종료");
	}
}

public class ConsoleEx {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무 키나 입력 >> ");
		
		scanner.nextLine(); // 어떤 키를 입력하고 <Enter>를 침
		scanner.close();
		
		Thread th = new Thread(new ImThread()); // 스레드 객체를 생성
		th.start(); // 스레드 실행
		
	}
}