package plantdata;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fruits extends JPanel{

	public JButton backbutton;
	
	public Fruits() {
		this.setBounds(0, 100, 1000, 900);
		this.setLayout(null);

		JPanel container = new JPanel();
		container.setBounds(0, 0, 1000, 900);
		container.setLayout(null);
		
		ImageIcon backicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\left.png");
		Image newimg0 = backicon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		backicon = new ImageIcon(newimg0);
		
		backbutton = new JButton();
		backbutton.setBounds(475, 815, 50, 50);
		backbutton.setFocusable(false);
		backbutton.setIcon(backicon);
		
		JButton back = new JButton();
		back.setBounds(475, 815, 50, 50);
		back.setFocusable(false);
		back.setVisible(false);
		
		// LEMON VERBENA
		ImageIcon pineappleguavaicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\pinappleguava.jpg");
		Image newimg = pineappleguavaicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		pineappleguavaicon = new ImageIcon(newimg);
		
		JButton pineappleguava = new JButton();
		pineappleguava.setBounds(0, 0, 250, 250);
		pineappleguava.setIcon(pineappleguavaicon);
		JLabel pineappleguavatext = new JLabel();
		pineappleguavatext.setText("PineApple Guava");
		pineappleguavatext.setBounds(20, 120, 50, 50);
		pineappleguavatext.setForeground(Color.black);
		pineappleguavatext.setFont(new Font("Calibri", Font.BOLD, 20));
		pineappleguava.add(pineappleguavatext);
		
		//DILL
		ImageIcon kiwivineicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\kiwivine.jpg");
		Image newimg1 = kiwivineicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		kiwivineicon = new ImageIcon(newimg1);
		
		JButton kiwivine = new JButton();
		kiwivine.setBounds(250, 0, 250, 250);
		kiwivine.setIcon(kiwivineicon);
		JLabel kiwivinetext = new JLabel();
		kiwivinetext.setText("Hardy Kiwi Vine");
		kiwivinetext.setBounds(20, 120, 50, 50);
		kiwivinetext.setForeground(Color.black);
		kiwivinetext.setFont(new Font("Calibri", Font.BOLD, 20));
		kiwivine.add(kiwivinetext);
		
		//ANGELICA
		ImageIcon kiwifruiticon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\kiwifruit.jpg");
		Image newimg2 = kiwifruiticon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		kiwifruiticon = new ImageIcon(newimg2);
		
		JButton kiwifruit = new JButton();
		kiwifruit.setBounds(500, 0, 250, 250);
		kiwifruit.setIcon(kiwifruiticon);
		JLabel kiwifruittext = new JLabel();
		kiwifruittext.setText("Kiwi Fruit");
		kiwifruittext.setBounds(20, 120, 50, 50);
		kiwifruittext.setForeground(Color.black);
		kiwifruittext.setFont(new Font("Calibri", Font.BOLD, 20));
		kiwifruit.add(kiwifruittext);
		
		//AMERICAN ANGELICA
		ImageIcon clementineicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\clementine.jpg");
		Image newimg3 = clementineicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		clementineicon = new ImageIcon(newimg3);
		
		JButton clementine = new JButton();
		clementine.setBounds(750, 0, 250, 250);
		clementine.setIcon(clementineicon);
		JLabel clementinetext = new JLabel();
		clementinetext.setText("American Angelica");
		clementinetext.setBounds(20, 120, 50, 50);
		clementinetext.setForeground(Color.black);
		clementinetext.setFont(new Font("Calibri", Font.BOLD, 20));
		clementine.add(clementinetext);
		
		///////////////////////////////////////
		
		container.add(pineappleguava);
		container.add(backbutton);
		container.add(kiwifruit);
		container.add(clementine);
		container.add(kiwivine);
		
		JPanel switchpanel = new JPanel();
		switchpanel.setBounds(0, 0, 1000, 900);
		switchpanel.setLayout(null);
		CardLayout cl = new CardLayout();
		switchpanel.setLayout(cl);
		switchpanel.add(container, "1");
		cl.show(switchpanel, "1");
		
		pineappleguava.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				FruitsData fruitsdata = FruitsDataFactory.getFruitsData("pineappleguava");
				JPanel lemon = new JPanel();
				lemon.setLayout(null);
				JLabel lemondata = new JLabel();
				JLabel lemondata2 = new JLabel();
				lemondata.setBounds(10, 0, 1000, 300);
				lemondata2.setBounds(10, 200, 1000, 500);
				lemondata.setIcon(fruitsdata.planticon);
				lemondata.setText(fruitsdata.plantname);
				lemondata.setFont(new Font("Calibri", Font.BOLD, 20));
				lemondata.setHorizontalTextPosition(JLabel.CENTER);
				lemondata.setVerticalTextPosition(JLabel.TOP);
				lemondata2.setText(fruitsdata.plantdata);
				ImageIcon backicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\left.png");
				Image newimg = backicon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
				backicon = new ImageIcon(newimg);
				JButton back = new JButton();
				back.setIcon(backicon);
				back.setBounds(475, 815, 50, 50);
				back.addActionListener(new ActionListener() {
					@Override
				    public void actionPerformed (ActionEvent e) {
						cl.show(switchpanel, "1");
					}
				});
				lemon.add(lemondata);
				lemon.add(lemondata2);
				lemon.add(back);
				switchpanel.add(lemon, "2");
				cl.show(switchpanel, "2");
		    } 
		});
		
		kiwivine.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				FruitsData fruitsdata = FruitsDataFactory.getFruitsData("kiwivine");
				JPanel dill = new JPanel();
				dill.setLayout(null);
				JLabel dilldata = new JLabel();
				JLabel dilldata2 = new JLabel();
				dilldata.setBounds(10, 0, 1000, 300);
				dilldata2.setBounds(10, 200, 1000, 500);
				dilldata.setIcon(fruitsdata.planticon);
				dilldata.setText(fruitsdata.plantname);
				dilldata.setFont(new Font("Calibri", Font.BOLD, 20));
				dilldata.setHorizontalTextPosition(JLabel.CENTER);
				dilldata.setVerticalTextPosition(JLabel.TOP);
				dilldata2.setText(fruitsdata.plantdata);
				ImageIcon backicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\left.png");
				Image newimg = backicon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
				backicon = new ImageIcon(newimg);
				JButton back = new JButton();
				back.setIcon(backicon);
				back.setBounds(475, 815, 50, 50);
				back.addActionListener(new ActionListener() {
					@Override
				    public void actionPerformed (ActionEvent e) {
						cl.show(switchpanel, "1");
					}
				});
				dill.add(dilldata);
				dill.add(dilldata2);
				dill.add(back);
				switchpanel.add(dill, "3");
				cl.show(switchpanel, "3");
		    } 
		});
		
		kiwifruit.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				FruitsData fruitsdata = FruitsDataFactory.getFruitsData("kiwifruit");
				JPanel angelica = new JPanel();
				angelica.setLayout(null);
				JLabel angelicadata = new JLabel();
				JLabel angelicadata2 = new JLabel();
				angelicadata.setBounds(10, 0, 1000, 300);
				angelicadata2.setBounds(10, 200, 1000, 500);
				angelicadata.setIcon(fruitsdata.planticon);
				angelicadata.setText(fruitsdata.plantname);
				angelicadata.setFont(new Font("Calibri", Font.BOLD, 20));
				angelicadata.setHorizontalTextPosition(JLabel.CENTER);
				angelicadata.setVerticalTextPosition(JLabel.TOP);
				angelicadata2.setText(fruitsdata.plantdata);
				ImageIcon backicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\left.png");
				Image newimg = backicon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
				backicon = new ImageIcon(newimg);
				JButton back = new JButton();
				back.setIcon(backicon);
				back.setBounds(475, 815, 50, 50);
				back.addActionListener(new ActionListener() {
					@Override
				    public void actionPerformed (ActionEvent e) {
						cl.show(switchpanel, "1");
					}
				});
				angelica.add(angelicadata);
				angelica.add(angelicadata2);
				angelica.add(back);
				switchpanel.add(angelica, "4");
				cl.show(switchpanel, "4");
		    } 
		});
		
		clementine.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				FruitsData fruitsdata = FruitsDataFactory.getFruitsData("clementine");
				JPanel aangelica = new JPanel();
				aangelica.setLayout(null);
				JLabel aangelicadata = new JLabel();
				JLabel aangelicadata2 = new JLabel();
				aangelicadata.setBounds(10, 0, 1000, 300);
				aangelicadata2.setBounds(10, 200, 1000, 500);
				aangelicadata.setIcon(fruitsdata.planticon);
				aangelicadata.setText(fruitsdata.plantname);
				aangelicadata.setFont(new Font("Calibri", Font.BOLD, 20));
				aangelicadata.setHorizontalTextPosition(JLabel.CENTER);
				aangelicadata.setVerticalTextPosition(JLabel.TOP);
				aangelicadata2.setText(fruitsdata.plantdata);
				ImageIcon backicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\left.png");
				Image newimg = backicon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
				backicon = new ImageIcon(newimg);
				JButton back = new JButton();
				back.setIcon(backicon);
				back.setBounds(475, 815, 50, 50);
				back.addActionListener(new ActionListener() {
					@Override
				    public void actionPerformed (ActionEvent e) {
						cl.show(switchpanel, "1");
					}
				});
				aangelica.add(aangelicadata);
				aangelica.add(aangelicadata2);
				aangelica.add(back);
				switchpanel.add(aangelica, "5");
				cl.show(switchpanel, "5");
		    } 
		});
		
		this.add(switchpanel);
	}
}
