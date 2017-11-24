import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BalloonGame extends JFrame {	
	class MyPanel extends JPanel { 
		public MyPanel() { 
			new Thread (new Runnable() { // �����带 �͸�Ŭ������ ����
				public void run() { // ����
						try { 
							while(true) { 
								repaint(); 
								Thread.sleep(100); // 100ms �������� ����
							} 
						} catch(Exception e) { 
							return;
						} 
				} 
			}).start(); 
      } 
	
      public void paint (Graphics g) {
    	  ImageIcon img = new ImageIcon("images/balloon.png"); // ���� �̹��� ������ ����
		   
	      this.addMouseListener(new MouseAdapter() { 	// ���콺 Ŭ��
	    	  public void mousePressed(MouseEvent e) { 
	    		 
	    	  }    
      }); 	
      } 
   }

	public BalloonGame() { 
		final MyPanel panel = new MyPanel(); 
		panel.setFocusable(true); 
		setContentPane(panel); 
	  
		setTitle("Balloon Game"); // â �̸�  
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300); 
		setVisible(true); 
	} 
   
	public static void main(String[] args) { 
		new BalloonGame(); 
   } 
} 