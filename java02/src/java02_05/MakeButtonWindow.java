package java02_05;

import java.awt.*;

class ButtonWindow extends Frame {
	ButtonWindow(String title) {
		super(title);
		Button b = new Button("ok");
		add(b);
	}
}

public class MakeButtonWindow {

	public static void main(String[] args) {
		ButtonWindow win = new ButtonWindow("내가 만든 새 창");
		win.setSize(300,250);
		win.setVisible(true);

	}

}
