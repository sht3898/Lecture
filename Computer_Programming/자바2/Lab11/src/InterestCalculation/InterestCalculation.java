package InterestCalculation;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterestCalculation extends JFrame{
	JButton button;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	private JPanel panel, panel1, panel2, panel3, panel4;
	
	public InterestCalculation(){
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� ����");
		panel = new JPanel(new FlowLayout());
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		JLabel label1 = new JLabel("������ �Է��Ͻÿ�");
		t1 = new JTextField(5);//5ĭ�� ������ �ִ� �ؽ�Ʈ �ʵ� ����
		panel1.add(label1);
		panel1.add(t1);
		JLabel label2 = new JLabel("������ �Է��Ͻÿ�");
		t2 = new JTextField(5);
		panel2.add(label2);
		panel2.add(t2);
		button = new JButton("��ȯ");
		panel3.add(button);
		
		t3 = new JTextField(20);
		panel4.add(t3);
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		this.add(panel);
		
		setVisible(true);
		
	}
}
