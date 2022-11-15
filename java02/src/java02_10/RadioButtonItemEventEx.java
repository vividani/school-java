package java02_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonItemEventEx extends JFrame implements ItemListener {
	
	Container ct;
	JRadioButton[] fruits = new JRadioButton[3];
	String[] names = {"사과" , "배", "체리"};
	ImageIcon[] image = { new ImageIcon("images/apple.jpg"), new ImageIcon("images/pear.jpg"), new ImageIcon("images/cherry.jpg")};
	
	JLabel imageLabel = new JLabel(); //화면 아래부분에 이미지 출력용 레이블
	
	RadioButtonItemEventEx() {
		ct = getContentPane();
		ct.setLayout(new BorderLayout()); //동,서,남,북,가운데 방향에 배치
		JPanel radioPanel = new JPanel(); //3개 라디오버튼이 출력될 패널
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JRadioButton(names[i]);
			fruits[i].addItemListener(this); //라디오버튼에 Item 이벤트 연결
			g.add(fruits[i]); //버튼 그룹에 라디오버튼 추가
			radioPanel.add(fruits[i]); //패널에 라디오버튼 추가
		}
		
		fruits[2].setSelected(true); //체리 라디오버튼을 초기 선택상태로 설정
		ct.add(radioPanel, BorderLayout.NORTH);
		ct.add(imageLabel, BorderLayout.CENTER); //가운데에 크게 표시
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		//이미지 레이블 내에서 출력할 떄 가운데 정렬로
		
	}//생성자
	
	public void itemStateChanged(ItemEvent e) {
		if(fruits[0].isSelected()) { //사과 라디오버튼이 선택된 경우 true 리턴
			imageLabel.setIcon(image[0]);
		}
		else if(fruits[1].isSelected()) { //배 라디오버튼
			imageLabel.setIcon(image[1]);
		}
		else if(fruits[2].isSelected()) { //체리 라디오버튼
			imageLabel.setIcon(image[2]);
		}
	}//이벤트 처리 메소드
	

	public static void main(String[] args) {
		
		RadioButtonItemEventEx win = new RadioButtonItemEventEx();
		win.setTitle("라디오버튼 Item Event 예제");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setSize(250, 200);
		win.setVisible(true);

	}//main

}//RadioButtonItemEventEx class
