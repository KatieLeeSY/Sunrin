package java20171024;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// �̺�Ʈ �ҽ� ��ü: getSource()�޼ҵ�
		JButton button = (JButton) e.getSource();
		// getText(): ������Ʈ ��ü�� �ؽ�Ʈ ������ ������
		System.out.println(button.getText());
		// setText(): ������Ʈ ��ü�� �ؽ�Ʈ�� "s"�� ����
		if(button.getText().equals("�ȳ��ϼ���"))
			button.setText("�ݰ����ϴ�");
		else
			button.setText("�ȳ��ϼ���");

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
