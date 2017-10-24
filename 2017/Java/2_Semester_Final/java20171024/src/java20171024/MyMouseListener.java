package java20171024;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// 이벤트 소스 객체: getSource()메소드
		JButton button = (JButton) e.getSource();
		// getText(): 컴포넌트 객체의 텍스트 정보를 가져옴
		System.out.println(button.getText());
		// setText(): 컴포넌트 객체의 텍스트를 "s"로 저장
		if(button.getText().equals("안녕하세요"))
			button.setText("반갑습니다");
		else
			button.setText("안녕하세요");

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
