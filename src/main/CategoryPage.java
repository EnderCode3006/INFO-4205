package main;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import plantdata.Ferns;
import plantdata.Fruits;
import plantdata.Herbs;
import plantdata.Shrubs;

public class CategoryPage extends JPanel{

	public CategoryPage(){
		this.setBounds(0, 100, 1000, 900);
		this.setLayout(null);

		Herbs herbsdata = new Herbs();
		Ferns fernsdata = new Ferns();
		Fruits fruitsdata = new Fruits();
		Shrubs shrubsdata = new Shrubs();
		
		PageOne pageone = new PageOne();
		PageTwo pagetwo = new PageTwo();
		
		ImageIcon lefticon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\left.png");
		Image newimg = lefticon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		lefticon = new ImageIcon(newimg);
		ImageIcon righticon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\right.png");
		Image newimg2 = righticon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		righticon = new ImageIcon(newimg2);
		
		JButton leftbutton = new JButton();
		leftbutton.setBounds(0, 400, 50, 50);
		leftbutton.setIcon(lefticon);
		leftbutton.setVisible(false);
		JButton rightbutton = new JButton();
		rightbutton.setBounds(935, 400, 50, 50);
		rightbutton.setIcon(righticon);
		
		JPanel choose = new JPanel();
		choose.setBounds(100, 0, 800, 800);
		
		CardLayout cl = new CardLayout();
		choose.setLayout(cl);
		choose.add(pageone, "1");
		choose.add(pagetwo, "2");
		cl.show(choose, "1");
		
		leftbutton.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed (ActionEvent e) {
		        cl.show(choose, "1");
		        leftbutton.setVisible(false);
		        rightbutton.setVisible(true);
		    }       
		});
		
		rightbutton.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed (ActionEvent e) {
		        cl.show(choose, "2");
		        rightbutton.setVisible(false);
		        leftbutton.setVisible(true);
		    }       
		});
		
		JPanel plantcontent = new JPanel();
		plantcontent.setLayout(null);
		plantcontent.setBounds(0, 0, 1000, 900);
		
		JPanel container = new JPanel();
		container.setLayout(null);
		container.add(choose);
		container.add(leftbutton);
		container.add(rightbutton);
		
		CardLayout cl2 = new CardLayout();
		plantcontent.setLayout(cl2);
		plantcontent.add(herbsdata, "1");
		plantcontent.add(fernsdata, "2");
		plantcontent.add(fruitsdata, "3");
		plantcontent.add(shrubsdata, "4");
		plantcontent.add(container, "5");
		cl2.show(plantcontent, "5");
		
		pageone.herbs.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl2.show(plantcontent, "1");
		    } 
		});
		pageone.ferns.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl2.show(plantcontent, "2");
		    } 
		});
		pageone.fruits.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl2.show(plantcontent, "3");
		    } 
		});
		pageone.shrubs.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl2.show(plantcontent, "4");
		    } 
		});
		herbsdata.backbutton.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl2.show(plantcontent, "5");
		    } 
		});
		fernsdata.backbutton.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl2.show(plantcontent, "5");
		    } 
		});
		fruitsdata.backbutton.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl2.show(plantcontent, "5");
		    } 
		});
		shrubsdata.backbutton.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl2.show(plantcontent, "5");
		    } 
		});
		this.add(plantcontent);
	}
}
