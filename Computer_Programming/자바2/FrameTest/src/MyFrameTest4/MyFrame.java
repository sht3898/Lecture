package MyFrameTest4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	public MyFrame(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׽�Ʈ ������");
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton();
		b1.setText("���� ��ư");
		JButton b2 = new JButton("�߾� ��ư");
		JButton b3 = new JButton("������ ��ư");
		b3.setEnabled(false);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		add(panel);
		setVisible(true);
	}
}
