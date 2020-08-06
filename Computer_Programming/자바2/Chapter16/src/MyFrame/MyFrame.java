package MyFrame;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(){
		add(new MyPanel());
		setSize(300,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();

	}

}
