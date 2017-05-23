package swingTest;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class LayeredPanTest extends JFrame{
	
	public LayeredPanTest() {
		setTitle("test");
		setLayout(null);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLayeredPane jp = new JLayeredPane();
		jp.setLayout(null);
		jp.setBounds(0, 0, 100, 100);
		jp.setBackground(Color.pink);
		jp.setOpaque(true);
		jp.setVisible(true);
		
		JPanel myPanel = new JPanel();
		myPanel.setLayout(null);
		myPanel.setBounds(5, 5, 50, 50);
		myPanel.setBackground(Color.DARK_GRAY);
		
		JPanel myPanel2 = new JPanel();
		myPanel2.setLayout(null);
		myPanel2.setBounds(30, 30, 50, 50);
		myPanel2.setBackground(Color.green);
		
		jp.add(myPanel, new Integer(0));
		jp.add(myPanel2, new Integer(1));
		
		add(jp);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new LayeredPanTest();		
	}

}
