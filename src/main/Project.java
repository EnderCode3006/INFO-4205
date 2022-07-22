package main;

import java.awt.Color;

import javax.swing.JButton;

public class Project extends JButton{

	public Project() {
		this.setText("Memo");
		this.setBounds(500, 0, 500, 100);
		this.setBackground(Color.green);
		this.setFocusable(false);
	}
}
