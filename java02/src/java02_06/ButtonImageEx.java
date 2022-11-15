package java02_06;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	
	Container cp;
	ButtonImageEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp = getContentPane();
		cp.setLayout(new FlowLayout());
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		JButton btn = new JButton("call :)",normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		cp.add(btn);
	}

	public static void main(String[] args) {

		ButtonImageEx win = new ButtonImageEx();
		win.setSize(250,200);
		win.setVisible(true);
	}

}
