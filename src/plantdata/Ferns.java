package plantdata;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Ferns extends JPanel{

	public JButton backbutton;
	
	public Ferns() {
		this.setBounds(0, 100, 1000, 900);
		this.setLayout(null);
		
		ImageIcon backicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\left.png");
		Image newimg = backicon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		backicon = new ImageIcon(newimg);
		
		backbutton = new JButton();
		backbutton.setBounds(475, 815, 50, 50);
		backbutton.setFocusable(false);
		backbutton.setIcon(backicon);
		
		this.add(backbutton);
	}
}
