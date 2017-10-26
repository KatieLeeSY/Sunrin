package java20171026;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam03 extends JFrame{
	public Exam03() {
		setTitle("BorderLayout");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("South"), BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam03();

	}

}
