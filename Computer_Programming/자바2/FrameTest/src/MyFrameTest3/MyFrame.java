package MyFrameTest3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	public MyFrame(){
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요?");
		JButton button = new JButton("버튼");
		panel.add(label);//패널에 레이블 추가
		panel.add(button);//패널에 버튼 추가
		add(panel);//프레임에 패널 추가
		setVisible(true);
	}
}
