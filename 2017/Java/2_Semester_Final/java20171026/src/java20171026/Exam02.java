package java20171026;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam02 extends JFrame {
	public Exam02() {
		setTitle("flowLayout");
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 변경 불가
		setLayout(new FlowLayout()); // 배치관리자 변경
		this.add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exam02(); // 객체 생성 = 프레임 생성

	}

}
