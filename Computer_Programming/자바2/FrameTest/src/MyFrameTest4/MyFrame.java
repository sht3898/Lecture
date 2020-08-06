package MyFrameTest4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	public MyFrame(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton();
		b1.setText("왼쪽 버튼");
		JButton b2 = new JButton("중앙 버튼");
		JButton b3 = new JButton("오른쪽 버튼");
		b3.setEnabled(false);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		add(panel);
		setVisible(true);
	}
}
