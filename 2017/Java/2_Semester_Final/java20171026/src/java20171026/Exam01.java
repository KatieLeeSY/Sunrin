package java20171026;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam01 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new Exam01(); // JFrame ��ü ����
	}

	public Exam01() { // ������ - GUI ���α׷���
		setSize(200, 200); // ������ ũ�� ����
		setTitle("hello"); // ������ Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200); // ������(â) ��ġ ����

		Container contentPane = getContentPane();

		this.setLayout(new FlowLayout());

		JLabel label = new JLabel("���̺��Դϴ�");
		contentPane.add(label); // ���̺��� ���� -> ����Ʈ��

		JButton button = new JButton("�����ư");
		contentPane.add(button); // ��ư�� ���� -> ����Ʈ��
		button.addActionListener(this);
		// this.add(button);

		setVisible(true); // �������� ȭ�鿡 ���̰� ����

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);

	}

}
