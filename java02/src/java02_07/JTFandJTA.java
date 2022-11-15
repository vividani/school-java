package java02_07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTFandJTA extends JFrame implements ActionListener {
	
	private JTextField jtf; //텍스트 입력받음
	private JTextArea jta; //텍스트 출력함
	/*나중에 이벤트 처리할 때도 쓸 것이기 때문에 전역변수로 생성함!*/
	
	public JTFandJTA() { //입력, 출력하는 창의 생성자
		jtf = new JTextField(20); //크기 20인 빈 입력칸 생성(입력 문자 수 X)
		jta = new JTextArea(7,20); //크기가 7줄, 20열인 빈 텍스트 에어리어 생성
		jtf.addActionListener(this); //this:액션이벤트를 처리하는 메소드가 이 클래스 안에 있다!
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jtf);
		ct.add(jta);
	}
	
	public void actionPerformed(ActionEvent ae) { //엔터를 입력하면 ActionEvent가 일어나는 메소드
		//꼭 !!!!actionPerformed!!!!라는 이름으로 써야함
		
		jta.append(ae.getActionCommand()+"\n"); //액션이벤트 발생 시 지우지 않고 바로 다음에 추가하는 메소드
		jtf.setText(""); //내용을 ""로 바꾸기 (=비우기)
	}

	public static void main(String[] args) {
		JTFandJTA jj = new JTFandJTA();
		jj.setTitle("JTextField,JTextArea Test");
		jj.setSize(500,200);
		jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jj.setVisible(true);
	}

}
