package java02_05;

import java.awt.*;
import javax.swing.*;

class ButtonSwingWin extends JFrame {
	ButtonSwingWin(String title) {
		super(title);
		Container ct = getContentPane();
		JButton b = new JButton("ok");
		ct.add(b);
	}
}

public class MakeButtonWindow2 {

	public static void main(String[] args) {
		ButtonSwingWin win2 = new ButtonSwingWin("내가 만든 새창");
		win2.setSize(300,250);
		win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win2.setVisible(true);
	}

}
