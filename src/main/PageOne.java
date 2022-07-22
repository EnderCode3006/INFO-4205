package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PageOne extends JPanel{

	JButton herbs;
	JButton fruits;
	JButton ferns;
	JButton shrubs;
	
	public PageOne() {
		this.setBackground(Color.red);
		this.setBounds(100, 0, 800, 800);
		this.setLayout(null);
		
		ImageIcon herbsicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\herbs.jpg");
		ImageIcon fernsicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\ferns.jpg");
		ImageIcon fruitsicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\fruits.jpg");
		ImageIcon shrubsicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\shrubs.jpg");
		
		herbs = new JButton();
		herbs.setBounds(0, 0, 400, 400);
		herbs.setFocusable(false);
		herbs.setIcon(herbsicon);
		herbs.setLayout(null);
		JLabel herbstext = new JLabel();
		herbstext.setText("Herbs");
		herbstext.setBounds(180, 320, 100, 50);
		herbstext.setForeground(Color.black);
		herbstext.setFont(new Font("Calibri", Font.BOLD, 20));
		herbs.add(herbstext);
		
		fruits = new JButton();
		fruits.setBounds(0, 400, 400, 400);
		fruits.setFocusable(false);
		fruits.setIcon(fruitsicon);
		fruits.setLayout(null);
		JLabel fruitstext = new JLabel();
		fruitstext.setText("Fruits");
		fruitstext.setBounds(180, 320, 100, 50);
		fruitstext.setForeground(Color.black);
		fruitstext.setFont(new Font("Calibri", Font.BOLD, 20));
		fruits.add(fruitstext);
		
		ferns = new JButton();
		ferns.setBounds(400, 0, 400, 400);
		ferns.setFocusable(false);
		ferns.setIcon(fernsicon);
		ferns.setLayout(null);
		JLabel fernstext = new JLabel();
		fernstext.setText("Ferns");
		fernstext.setBounds(180, 320, 100, 50);
		fernstext.setForeground(Color.black);
		fernstext.setFont(new Font("Calibri", Font.BOLD, 20));
		ferns.add(fernstext);
		
		shrubs = new JButton();
		shrubs.setBounds(400, 400, 400, 400);
		shrubs.setFocusable(false);
		shrubs.setIcon(shrubsicon);
		shrubs.setLayout(null);
		JLabel shrubstext = new JLabel();
		shrubstext.setText("Shrubs");
		shrubstext.setBounds(140, 320, 100, 50);
		shrubstext.setForeground(Color.black);
		shrubstext.setFont(new Font("Calibri", Font.BOLD, 20));
		shrubs.add(shrubstext);
		
		this.add(herbs);
		this.add(ferns);
		this.add(fruits);
		this.add(shrubs);
	}
}
