package main;

import java.awt.Color;

import javax.swing.JButton;

public class Category extends JButton{

	public Category() {
		this.setText("Category");
		this.setBounds(0, 0, 500, 100);
		this.setBackground(Color.green);
		this.setFocusable(false);
	}
}
