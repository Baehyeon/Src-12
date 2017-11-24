import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vibrating1 extends JFrame implements Runnable{
	Thread th;
	
	public void run() {
		while(true) {
			try{
				Thread.sleep(10); // 0.01���� ����
			} catch(InterruptedException e) {
				return; // ���� �߻� ����
			}
			
			int rx = (int)(Math.random()*10); // ������ ������ ���� 
			int ry = (int)(Math.random()*10);
			setLocation(rx, ry);
		}
}
	
	public Vibrating1() {
		setTitle("�����ϴ� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocation(300, 300); 
		setVisible(true);
		
		getContentPane().addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			public void mousePressed(MouseEvent e) {
				if(!th.isAlive()) 
					return;
				else
					th.interrupt(); 
			}
		});
		
		Thread th = new Thread(this); // ������ ��ü ���� 
	    th.start(); 
}

	public static void main(String[] args) {
		new Vibrating1();
	}
}