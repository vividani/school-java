package java02_10;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame{
	
	String[] fruits = {"apple", "banana", "kiwi", "mango", 
			"pear", "peach", "berry", "strawberry", "blackberry"};
	
	ImageIcon[] images = {
			new ImageIcon(),
			new ImageIcon(),
			new ImageIcon(),
			new ImageIcon()
	};
	
	ListEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		JList strList = new JList(fruits);
		ct.add(strList);
		
		JList imageList = new JList();
		ct.add(imageList);
		
		JList scrollList = new JList(fruits);
		JScrollPane sp = new JScrollPane(scrollList);
		ct.add(sp);
	}

	public static void main(String[] args) {
		
	}

}
