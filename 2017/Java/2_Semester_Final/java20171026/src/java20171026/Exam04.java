package java20171026;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam04 extends JFrame {
	public Exam04() {
		setTitle("GridLayout");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(3, 2));
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam04();

	}

}
