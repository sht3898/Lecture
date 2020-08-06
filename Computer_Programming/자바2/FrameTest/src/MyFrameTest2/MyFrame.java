package MyFrameTest2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(){
	Toolkit kit = Toolkit.getDefaultToolkit();	//현재화면의 크기
	Dimension screenSize = kit.getScreenSize();
	setSize(300,200);
	setLocation(screenSize.width/2, screenSize.height/2);//프레임의 위치를 현재 화면의 중앙으로
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("MyFrame");
	Image img = kit.getImage("icon.gif");//아이콘을 icon.gif로 변경
	setIconImage(img);
	setLayout(new FlowLayout());
	JButton button = new JButton("버튼");
	this.add(button);
	setVisible(true);
	}
}
