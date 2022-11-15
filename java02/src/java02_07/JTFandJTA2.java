package java02_07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//JButton은 다른 일을 하기 때문에 다른 클래스에 생성함

public class JTFandJTA2 extends JFrame{
	
	public JTFandJTA2() {
		JTextField jtf = new JTextField(20);
		JTextArea jta = new JTextArea(7,20);
		JScrollPane jsp = new JScrollPane(jta); //만들어두기만 하면 사용됨(밑줄무시)
		JButton b = new JButton("취소");
		
		EnterActionListener enter = new EnterActionListener(jtf,jta);
		jtf.addActionListener(enter);
		CancleActionListener cancle = new CancleActionListener(jtf);
		b.addActionListener(cancle);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jtf); ct.add(jsp); ct.add(b);
	}

	public static void main(String[] args) {
		JTFandJTA2 jtb = new JTFandJTA2();
		jtb.setTitle("JTextComponent와 JButton 이벤트 예제");
		jtb.setSize(500,220);
		jtb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtb.setVisible(true);
	}

}

class EnterActionListener implements ActionListener{
	JTextField jtf; JTextArea jta;
	
	EnterActionListener(JTextField tf, JTextArea ta) { jtf = tf; jta = ta; }
	
	public void actionPerformed(ActionEvent ae) {
		jta.append(ae.getActionCommand()+"\n");
		jtf.setText("");
	}
}

class CancleActionListener implements ActionListener {
    JTextField jtf; JTextArea jta;
	
	CancleActionListener(JTextField tf) { jtf = tf; }
	
	public void actionPerformed(ActionEvent ae) {
		jtf.setText("");
	}
}

