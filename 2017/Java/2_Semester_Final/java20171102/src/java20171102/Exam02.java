package java20171102;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam02 extends JFrame {
	public Exam02(String title) {
		setTitle(title);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Container c = getContentPane();
		// c.setBackground(Color.blue);

		JPanel panel = new JPanel();
		// panel.add(new JLabel("�ȳ��ϼ���"));
		panel.setBackground(Color.pink);
		add(panel); // getContentPane().add(panel);
		JButton PrintButton = new JButton("���");
		panel.add(PrintButton);
		JButton ExitButton = new JButton("����");
		panel.add(ExitButton);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam02("20506 ������");
	}
}
