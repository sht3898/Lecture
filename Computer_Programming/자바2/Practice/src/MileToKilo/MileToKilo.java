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

// JFrame을 상속받는 MyFrame 클래스 선언
public class MileToKilo extends JFrame implements ActionListener{

	// 필드선언
	private JButton button;
	private JLabel label;
	private JTextField textInput,textResult;
	private JPanel panel,panel1,panel2,panel3; 
	
	// 생성자 선언
	public MileToKilo()
	{
		setSize(360,200); // 프레임의 크기 설정 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 종료버튼을 눌렀을때 프레임이 닫히도록 설정
		setTitle("마일을 킬로미터로 변환"); // 프레임의 제목 설정
		panel = new JPanel(); // panel에 패널 객체 생성
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		panel1 = new JPanel(); // panel에 패널 객체 생성
		panel2 = new JPanel(); // panel에 패널 객체 생성
		panel3 = new JPanel(); // panel에 패널 객체 생성
		
		label= new JLabel("거리를 마일 단위로 입력하세요"); // label에 레이블 객체 생성
		textInput = new JTextField(10);	// textInput에 텍스트 필드 객체 생성
		panel1.add(label); // 패널에 레이블 추가
		panel1.add(textInput); // 패널에 텍스트 필드 추가
		
		button = new JButton("변환"); // button에 버튼 객체 생성
		button.addActionListener(this);
		panel2.add(button); // 패널에 버튼 추가
		
		textResult = new JTextField(30); // textResult에 크기가 30인 텍스트 필드 객체 생성
		panel3.add(textResult); // 패널에 텍스트 필드 추가
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		add(panel); // 프레임에 패널 추가
		setVisible(true); // 프레임 출력 메소드
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String mile = textInput.getText();
		if( mile.trim().equals("") ) {
			JOptionPane.showMessageDialog(null, "입력해 주시기 바랍니다.");
		} else{
			double inputMile = Double.parseDouble(mile);
			double returndata = inputMile*1.6;
			textResult.setText(String.valueOf(returndata) + "Km");
		}
	}
}
