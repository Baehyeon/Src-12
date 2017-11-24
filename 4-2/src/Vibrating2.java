import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vibrating2 extends JFrame implements Runnable{
	Thread th;
	JLabel label = new JLabel("진동 레이블"); // 레이블 생성
	
	public void run() {
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout()); 
		
		c.add(label); // 레이블 추가
		
		while(true) {
			try{
				Thread.sleep(10); // 0.01초의 간격
			} catch(InterruptedException e) {
				return; // 예외 발생 종료
			}
			
			int rx = (int)(Math.random()*10); // 움직일 랜덤값 얻어옴 
			int ry = (int)(Math.random()*10);
			c.setLocation(rx, ry);
		}
}
	
	public Vibrating2() {
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocation(300, 300); 
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			public void mousePressed(MouseEvent e) {
				if(!th.isAlive()) 
					return;
				else
					th.interrupt(); 
			}
		});
		
		Thread th = new Thread(this); // 스레드 객체 생성 
	    th.start(); 
}

	public static void main(String[] args) {
		new Vibrating2();
	}
}