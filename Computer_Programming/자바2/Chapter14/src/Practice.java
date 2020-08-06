import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice extends JFrame{
	public Practice(){
	JPanel panel = new JPanel();
	JButton button = new JButton();
	panel.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	button.setMaximumSize(new Dimension(300,200));
	button.setAlignmentX(JComponent.CENTER_ALIGNMENT);
	}
}