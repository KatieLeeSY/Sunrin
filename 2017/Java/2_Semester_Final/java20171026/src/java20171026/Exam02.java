package java20171026;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam02 extends JFrame {
	public Exam02() {
		setTitle("flowLayout");
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // ������ ������ ���� �Ұ�
		setLayout(new FlowLayout()); // ��ġ������ ����
		this.add(new JButton("��ư1"));
		add(new JButton("��ư2"));
		add(new JButton("��ư3"));
		add(new JButton("��ư4"));
		add(new JButton("��ư5"));
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam02(); // ��ü ���� = ������ ����

	}

}
