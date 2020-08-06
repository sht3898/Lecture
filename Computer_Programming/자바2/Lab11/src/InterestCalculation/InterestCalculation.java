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
		setTitle("이자 계산기");
		panel = new JPanel(new FlowLayout());
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		JLabel label1 = new JLabel("원금을 입력하시오");
		t1 = new JTextField(5);//5칸을 가지고 있는 텍스트 필드 생성
		panel1.add(label1);
		panel1.add(t1);
		JLabel label2 = new JLabel("이율을 입력하시오");
		t2 = new JTextField(5);
		panel2.add(label2);
		panel2.add(t2);
		button = new JButton("변환");
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
