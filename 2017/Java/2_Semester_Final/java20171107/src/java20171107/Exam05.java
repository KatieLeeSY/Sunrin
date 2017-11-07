package java20171107;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener {
	int r = 10;
	JButton b1, b2;

	public MyPanel() {
		b1 = new JButton("확대");
		b2 = new JButton("축소");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) { // 확대
			r += 10;
			repaint();
		} else {
			r -= 10;
			repaint();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawOval(getWidth() / 2 - r, getHeight() / 2 - r, r * 2, r * 2);
	}

}

public class Exam05 extends JFrame {
	public Exam05() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam05();
	}

}
