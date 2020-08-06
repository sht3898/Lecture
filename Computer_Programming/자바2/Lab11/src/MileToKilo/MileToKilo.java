package MileToKilo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// JFrame�� ��ӹ޴� MyFrame Ŭ���� ����
public class MileToKilo extends JFrame implements ActionListener{

	// �ʵ弱��
	private JButton button;
	private JLabel label;
	private JTextField textInput,textResult;
	private JPanel panel,panel1,panel2,panel3; 
	
	// ������ ����
	public MileToKilo()
	{
		setSize(360,200); // �������� ũ�� ���� 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �����ư�� �������� �������� �������� ����
		setTitle("������ ų�ι��ͷ� ��ȯ"); // �������� ���� ����
		panel = new JPanel(); // panel�� �г� ��ü ����
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		panel1 = new JPanel(); // panel�� �г� ��ü ����
		panel2 = new JPanel(); // panel�� �г� ��ü ����
		panel3 = new JPanel(); // panel�� �г� ��ü ����
		
		label= new JLabel("�Ÿ��� ���� ������ �Է��ϼ���"); // label�� ���̺� ��ü ����
		textInput = new JTextField(10);	// textInput�� �ؽ�Ʈ �ʵ� ��ü ����
		panel1.add(label); // �гο� ���̺� �߰�
		panel1.add(textInput); // �гο� �ؽ�Ʈ �ʵ� �߰�
		
		button = new JButton("��ȯ"); // button�� ��ư ��ü ����
		button.addActionListener(this);
		panel2.add(button); // �гο� ��ư �߰�
		
		textResult = new JTextField(30); // textResult�� ũ�Ⱑ 30�� �ؽ�Ʈ �ʵ� ��ü ����
		panel3.add(textResult); // �гο� �ؽ�Ʈ �ʵ� �߰�
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		add(panel); // �����ӿ� �г� �߰�
		setVisible(true); // ������ ��� �޼ҵ�
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String mile = textInput.getText();
		if( mile.trim().equals("") ) {
			JOptionPane.showMessageDialog(null, "�Է��� �ֽñ� �ٶ��ϴ�.");
		} else{
			double inputMile = Double.parseDouble(mile);
			double returndata = inputMile*1.6;
			textResult.setText(String.valueOf(returndata) + "Km");
		}
	}
}
