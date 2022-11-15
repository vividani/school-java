package java02_09;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {
	
	Container ct;
	JCheckBox fruits[] = new JCheckBox[3];
	/*사과,배,체리 체크박스 객체배열*/
	String names[] = {"사과", "배", "체리"};
	JLabel sumLabel;//가격의 합 출력할 레이블
	int sum = 0;//가격의 합
	
	
	CheckBoxItemEventEx() {
		
		ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		/*1회성으로 사용할 때는 이렇게 객체 생성 없이 바로 추가하면 된다.*/
		
		for(int i=0; i<fruits.length; i++) {
			
			fruits[i] = new JCheckBox(names[i]);//체크박스 객체생성
			fruits[i].setBorderPainted(true);//체크박스 테두리 보이게
			fruits[i].addItemListener(this);//체크박스에 아이템 이벤트 연결
			ct.add(fruits[i]);//처크박스 컴포넌트 화면에 출력
			
		}
		
		sumLabel = new JLabel("현재 0원 입니다.");
		ct.add(sumLabel);
		
	}//생성자
	
	
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == 2) {
			
			if(e.getItem() == fruits[0]) { sum -= 100; }
			else if(e.getItem() == fruits[1]) { sum -= 500; }
			else { sum -= 20000; }
			
		}
		else{
			
			if(e.getItem() == fruits[0]) { sum += 100; }
			else if(e.getItem() == fruits[1]) { sum += 500; }
			else { sum += 20000; }
			
		}
		sumLabel.setText("현재 "+sum+"원 입니다.");
		
		/*교수님 방법
		 * 
		 * int selected = 1;
		 * 
		 * if(e.getStateChange() == ItemEvent.DESELECTED) selected = -1;
		 * 
		 * if(e.getItem() == fruits[0]
		 * 	sum = sum + selected*100;
		 * else if(e.getItem() == fruits[1]
		 *  sum = sum + selected*500;
		 * else
		 *  sum = sum + selected*20000;
		 * 
		 **/
		
	}//아이템 이벤트 처리 메소드
	
	

	public static void main(String[] args) {
		
		CheckBoxItemEventEx win = new CheckBoxItemEventEx();
		win.setTitle("체크박스와 ItemEvent 예제");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setSize(250,200);
		win.setVisible(true);
		
	}//main
	

}//CheckBoxItemEventEx class
