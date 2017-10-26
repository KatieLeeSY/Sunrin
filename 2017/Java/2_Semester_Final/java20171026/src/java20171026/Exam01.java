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
		new Exam01(); // JFrame 객체 생성
	}

	public Exam01() { // 생성자 - GUI 프로그래밍
		setSize(200, 200); // 프레임 크기 설정
		setTitle("hello"); // 프레임 타이틀 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200); // 프레임(창) 위치 설정

		Container contentPane = getContentPane();

		this.setLayout(new FlowLayout());

		JLabel label = new JLabel("레이블입니다");
		contentPane.add(label); // 레이블을 부착 -> 컨텐트팬

		JButton button = new JButton("종료버튼");
		contentPane.add(button); // 버튼을 부착 -> 컨텐트팬
		button.addActionListener(this);
		// this.add(button);

		setVisible(true); // 프레임을 화면에 보이게 설정

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);

	}

}
