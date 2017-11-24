import java.awt.*;
import java.awt.event.*;
import java.util.Random; 
import javax.swing.*;

public class CirclePannelEx extends JFrame {	
	class MyPanel extends JPanel { 
		public MyPanel() { 
			new Thread (new Runnable() { // �����带 �͸�Ŭ������ ����
				public void run() { // ����
						try { 
							while( true ) { 
								repaint(); 
								Thread.sleep(400); // 400ms �������� ����
							} 
						} catch(Exception e) { 
							return;
						} 
				} 
			}).start(); 
      } 
	
      public void paintComponent(Graphics g) { 
    	  Random r = new Random(); 	// ���� ����
    	  int x = r.nextInt(getWidth()-50); // ������ ��ġ x��ǥ
    	  int y = r.nextInt(getHeight()-50); // ������ ��ġ y��ǥ
    	  g.clearRect(0, 0, getWidth(), getHeight()); // ���ο� �� ������ ���� clear
    	  g.drawOval(x, y, 50, 50); // ������ 50�ȼ��� �� �׸�
      } 
   }

	public CirclePannelEx() { 
		final MyPanel panel = new MyPanel(); 
		panel.setFocusable(true); 
		setContentPane(panel); 
	  
		setTitle("Circle Make"); // â �̸�  
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300); 
		setVisible(true); 
	} 
   
	public static void main(String[] args) { 
		new CirclePannelEx(); 
   } 
} 