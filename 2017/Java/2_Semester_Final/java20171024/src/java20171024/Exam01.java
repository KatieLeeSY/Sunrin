package java20171024;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam01 {

	public static void main(String[] args) {
		// 컨테이너 객체 생성
		JFrame frame = new JFrame();
		// 컨테이너 객체 사이즈를 설정: setSize(x좌표, y좌표)
		frame.setSize(300, 300);
		// 컨테이너 창의 X버튼을 누르면, 프로그램을 종료토록 설정함
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 컨테이너 창의 타이틀 설정
		frame.setTitle("hello");
		// 컨테이너 창의 위치를 설정
		frame.setLocation(100, 100);
		// 컨테이너 객체를 보이도록 설정: setVisible(불리언타입)
		frame.setVisible(true);

		JFrame frame2 = new JFrame();
		frame2.setSize(300, 300);
		JLabel label = new JLabel("레이블");
		frame2.add(label);
		frame2.setVisible(true);

		// 버튼 객체를 생성하고 + 컨테이너에 추가해줘야함
		JButton button = new JButton("안녕하세요");
		button.addActionListener(new MyListener());
		frame.add(button);
		// 컨테이너 객체를 보이도록 설정: setVisible(불리언타입)
		frame.setVisible(true);
	}

}
