package java20171107;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam04 extends JFrame {
	JPanel p1, p2;

	public Exam04() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);

		p1 = new JPanel();
		p2 = new JPanel(new GridLayout(2, 2));
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		for (int i = 1; i < 5; i++) {
			p1.add(new JButton(Integer.toString(i)));
			p2.add(new JButton(Integer.toString(i + 4)));
		}

		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Exam04();
	}

}
