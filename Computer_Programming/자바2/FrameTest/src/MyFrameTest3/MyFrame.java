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
		JLabel label = new JLabel("�ȳ��ϼ���?");
		JButton button = new JButton("��ư");
		panel.add(label);//�гο� ���̺� �߰�
		panel.add(button);//�гο� ��ư �߰�
		add(panel);//�����ӿ� �г� �߰�
		setVisible(true);
	}
}
