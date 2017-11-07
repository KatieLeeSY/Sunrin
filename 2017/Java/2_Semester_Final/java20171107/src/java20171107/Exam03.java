package java20171107;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam03 extends JFrame implements ActionListener {
	JPanel p;

	public Exam03() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		JButton b = new JButton("누르세요");
		b.addActionListener(this);

		p.add(b);
		this.add(p);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam03();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// setBackground( Color객체(r,g,b) ); //r,g,b: int 0~255
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		Color c = new Color(r, g, b);
		p.setBackground(c);
	}

}
