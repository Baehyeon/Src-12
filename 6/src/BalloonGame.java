import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BalloonGame extends JFrame {	
	class MyPanel extends JPanel { 
		public MyPanel() { 
			new Thread (new Runnable() { // 스레드를 익명클래스로 선언
				public void run() { // 실행
						try { 
							while(true) { 
								repaint(); 
								Thread.sleep(100); // 100ms 간격으로 생성
							} 
						} catch(Exception e) { 
							return;
						} 
				} 
			}).start(); 
      } 
	
      public void paint (Graphics g) {
    	  ImageIcon img = new ImageIcon("images/balloon.png"); // 사진 이미지 아이콘 생성
		   
	      this.addMouseListener(new MouseAdapter() { 	// 마우스 클릭
	    	  public void mousePressed(MouseEvent e) { 
	    		 
	    	  }    
      }); 	
      } 
   }

	public BalloonGame() { 
		final MyPanel panel = new MyPanel(); 
		panel.setFocusable(true); 
		setContentPane(panel); 
	  
		setTitle("Balloon Game"); // 창 이름  
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300); 
		setVisible(true); 
	} 
   
	public static void main(String[] args) { 
		new BalloonGame(); 
   } 
} 