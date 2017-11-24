import java.awt.*;
import java.awt.event.*;
import java.util.Random; 
import javax.swing.*;

public class CirclePannelEx extends JFrame {	
	class MyPanel extends JPanel { 
		public MyPanel() { 
			new Thread (new Runnable() { // 스레드를 익명클래스로 선언
				public void run() { // 실행
						try { 
							while( true ) { 
								repaint(); 
								Thread.sleep(400); // 400ms 간격으로 생성
							} 
						} catch(Exception e) { 
							return;
						} 
				} 
			}).start(); 
      } 
	
      public void paintComponent(Graphics g) { 
    	  Random r = new Random(); 	// 랜덤 생성
    	  int x = r.nextInt(getWidth()-50); // 랜덤한 위치 x좌표
    	  int y = r.nextInt(getHeight()-50); // 랜덤한 위치 y좌표
    	  g.clearRect(0, 0, getWidth(), getHeight()); // 새로운 원 생성을 위한 clear
    	  g.drawOval(x, y, 50, 50); // 지름이 50픽셀인 원 그림
      } 
   }

	public CirclePannelEx() { 
		final MyPanel panel = new MyPanel(); 
		panel.setFocusable(true); 
		setContentPane(panel); 
	  
		setTitle("Circle Make"); // 창 이름  
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300); 
		setVisible(true); 
	} 
   
	public static void main(String[] args) { 
		new CirclePannelEx(); 
   } 
} 