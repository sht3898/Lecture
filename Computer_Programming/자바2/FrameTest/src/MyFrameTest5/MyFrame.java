package MyFrameTest5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame(){
	setSize(300,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("�׽�Ʈ ������");
	
	JPanel panel = new JPanel();
	JTextField t1 = new JTextField(15);
	JTextField t2 = new JTextField(10);
	t2.setEditable(false);
	
	panel.add(t1);	//�гο� �ؽ�Ʈ �ʵ带 �߰�
	panel.add(t2);
	
	add(panel);
	setVisible(true);
	}
}