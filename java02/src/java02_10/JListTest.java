package java02_10;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListTest extends JFrame implements ListSelectionListener {

	Container ct;
	String[] fruitlist = {"감", "바나나", "사과", "포도", "앵두", "배"};
	JList jlst = new JList(fruitlist); //과일이름 객체 배열로 리스트 데이터 제공
	
	ImageIcon[] fruiticons = {			
			new ImageIcon("images/감.jpg"),
			new ImageIcon("images/바나나.jpg"),
			new ImageIcon("images/사과.jpg"),
			new ImageIcon("images/포도.jpg"),
			new ImageIcon("images/앵두.jpg"),
			new ImageIcon("images/배.jpg")
	};
	
	JLabel[] jlicon = new JLabel[6];
	//과일 이미지를 출력할 6개의 레이블 객체들을 원소로 갖는 JLabel 배열 객체 생성
	
	public JListTest() {
		ct = getContentPane();
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3,2,5,5));
		//판넬 p에 3행2열로 그림 배치
		
		for(int i=0; i<6; i++) {
			p.add(jlicon[i] = new JLabel());
			//TODO(이해하기)
		}//6개의 JLabel 객체들을 빈칸으로 초기화하고 판넬 p에 추가
		
		ct.add(p, BorderLayout.CENTER);
		//판넬 p는 창의 가운데 배치
		ct.add(jlst, BorderLayout.WEST);
		//JList객체(jlst)는 창의 왼쪽(서쪽)에 배치
		jlst.addListSelectionListener(this);
		
	}//생성자
	
	public void valueChanged(ListSelectionEvent lse) {
		int[] indices = jlst.getSelectedIndices();
		//indices == index의 복수형, 첨자들
		
		int i;
		for(i=0; i<indices.length; i++) {
			jlicon[i].setIcon/*== setText*/(fruiticons[indices[i]]);
			/*TODO(이해하기) : 과일아이콘의 indices의 i번째 배열을 jlicon[i]에 저장. 이미지 출력용!! 
			 *TODO(해보기) : 두 줄로 작성하면?
			 *j = indices[i];
			 *jlicon[i].setIcon(fruiticons[j]);*/
		}
		
		for(; i<6; i++) {
			/*TODO(고민하기) : setText는 ""(공백)이용했는데, setIcon은??*/
			jlicon[i].setIcon(null);
		}//클릭했다가 취소한 경우에 그림 없애는 for문
		
	}//event method
	
	public static void main(String[] args) {
		JListTest jcbt = new JListTest();
		jcbt.setTitle("JList Test");
		jcbt.setSize(400,400);
		jcbt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jcbt.setVisible(true);
	}//main method

}//JListTest class
