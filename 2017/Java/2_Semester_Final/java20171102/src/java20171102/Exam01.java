package java20171102;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exam01 extends JFrame {
	public Exam01(String title) {
		setTitle(title);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Container c = getContentPane();
//		c.setBackground(Color.blue);
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("안녕하세요"));
		panel.setBackground(Color.pink);
		add(panel);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam01("웹운영과 ㅇㅅㅇ");
	}
}
