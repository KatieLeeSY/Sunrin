package java20171024;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		System.out.println(button.getText());
		if(button.getText().equals("æ»≥Á«œººø‰"))
			button.setText("π›∞©Ω¿¥œ¥Ÿ");
		else
			button.setText("æ»≥Á«œººø‰");
	}

}
