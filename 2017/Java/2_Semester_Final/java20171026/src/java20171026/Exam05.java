package java20171026;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam05 extends JFrame {
	public Exam05() {
		super("Null Layout");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		JButton b1 = new JButton("5");
		b1.setBounds(10, 10, 100, 50);
		add(b1);
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Exam05();

	}

}
