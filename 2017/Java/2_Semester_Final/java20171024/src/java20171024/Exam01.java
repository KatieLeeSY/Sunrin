package java20171024;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam01 {

	public static void main(String[] args) {
		// �����̳� ��ü ����
		JFrame frame = new JFrame();
		// �����̳� ��ü ����� ����: setSize(x��ǥ, y��ǥ)
		frame.setSize(300, 300);
		// �����̳� â�� X��ư�� ������, ���α׷��� ������� ������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �����̳� â�� Ÿ��Ʋ ����
		frame.setTitle("hello");
		// �����̳� â�� ��ġ�� ����
		frame.setLocation(100, 100);
		// �����̳� ��ü�� ���̵��� ����: setVisible(�Ҹ���Ÿ��)
		frame.setVisible(true);

		JFrame frame2 = new JFrame();
		frame2.setSize(300, 300);
		JLabel label = new JLabel("���̺�");
		frame2.add(label);
		frame2.setVisible(true);

		// ��ư ��ü�� �����ϰ� + �����̳ʿ� �߰��������
		JButton button = new JButton("�ȳ��ϼ���");
		button.addActionListener(new MyListener());
		frame.add(button);
		// �����̳� ��ü�� ���̵��� ����: setVisible(�Ҹ���Ÿ��)
		frame.setVisible(true);
	}

}
