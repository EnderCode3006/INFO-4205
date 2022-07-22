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

import main.CategoryPage;

public class Herbs extends JPanel{

	public JButton backbutton;
	
	public Herbs(){
		
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
		ImageIcon lemonverbenaicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\LemonVerbena.jpg");
		Image newimg = lemonverbenaicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		lemonverbenaicon = new ImageIcon(newimg);
		
		JButton lemonverbena = new JButton();
		lemonverbena.setBounds(0, 0, 250, 250);
		lemonverbena.setIcon(lemonverbenaicon);
		JLabel lemonverbenatext = new JLabel();
		lemonverbenatext.setText("Lemon Verbena");
		lemonverbenatext.setBounds(20, 120, 50, 50);
		lemonverbenatext.setForeground(Color.black);
		lemonverbenatext.setFont(new Font("Calibri", Font.BOLD, 20));
		lemonverbena.add(lemonverbenatext);
		
		//DILL
		ImageIcon dillicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\Dill.jpg");
		Image newimg1 = dillicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		dillicon = new ImageIcon(newimg1);
		
		JButton dill = new JButton();
		dill.setBounds(250, 0, 250, 250);
		dill.setIcon(dillicon);
		JLabel dilltext = new JLabel();
		dilltext.setText("Dill");
		dilltext.setBounds(20, 120, 50, 50);
		dilltext.setForeground(Color.black);
		dilltext.setFont(new Font("Calibri", Font.BOLD, 20));
		dill.add(dilltext);
		
		//ANGELICA
		ImageIcon angelicaicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\angelica.jpg");
		Image newimg2 = angelicaicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		angelicaicon = new ImageIcon(newimg2);
		
		JButton angelica = new JButton();
		angelica.setBounds(500, 0, 250, 250);
		angelica.setIcon(angelicaicon);
		JLabel angelicatext = new JLabel();
		angelicatext.setText("Angelica");
		angelicatext.setBounds(20, 120, 50, 50);
		angelicatext.setForeground(Color.black);
		angelicatext.setFont(new Font("Calibri", Font.BOLD, 20));
		angelica.add(angelicatext);
		
		//AMERICAN ANGELICA
		ImageIcon aangelicaicon = new ImageIcon("D:\\Eclipse Project\\GardenApp\\src\\american-angelica.jpg");
		Image newimg3 = aangelicaicon.getImage().getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
		aangelicaicon = new ImageIcon(newimg3);
		
		JButton aangelica = new JButton();
		aangelica.setBounds(750, 0, 250, 250);
		aangelica.setIcon(aangelicaicon);
		JLabel aangelicatext = new JLabel();
		aangelicatext.setText("American Angelica");
		aangelicatext.setBounds(20, 120, 50, 50);
		aangelicatext.setForeground(Color.black);
		aangelicatext.setFont(new Font("Calibri", Font.BOLD, 20));
		aangelica.add(aangelicatext);
		
		///////////////////////////////////////
		
		container.add(lemonverbena);
		container.add(backbutton);
		container.add(angelica);
		container.add(aangelica);
		container.add(dill);
		
		JPanel switchpanel = new JPanel();
		switchpanel.setBounds(0, 0, 1000, 900);
		switchpanel.setLayout(null);
		CardLayout cl = new CardLayout();
		switchpanel.setLayout(cl);
		switchpanel.add(container, "1");
		cl.show(switchpanel, "1");
		
		lemonverbena.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				HerbsData herbsdata = HerbsDataFactory.getHerbsData("lemonverbena");
				JPanel lemon = new JPanel();
				lemon.setLayout(null);
				JLabel lemondata = new JLabel();
				JLabel lemondata2 = new JLabel();
				lemondata.setBounds(10, 0, 1000, 300);
				lemondata2.setBounds(10, 200, 1000, 500);
				lemondata.setIcon(herbsdata.planticon);
				lemondata.setText(herbsdata.plantname);
				lemondata.setFont(new Font("Calibri", Font.BOLD, 20));
				lemondata.setHorizontalTextPosition(JLabel.CENTER);
				lemondata.setVerticalTextPosition(JLabel.TOP);
				lemondata2.setText(herbsdata.plantdata);
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
		
		dill.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				HerbsData herbsdata = HerbsDataFactory.getHerbsData("dill");
				JPanel dill = new JPanel();
				dill.setLayout(null);
				JLabel dilldata = new JLabel();
				JLabel dilldata2 = new JLabel();
				dilldata.setBounds(10, 0, 1000, 300);
				dilldata2.setBounds(10, 200, 1000, 500);
				dilldata.setIcon(herbsdata.planticon);
				dilldata.setText(herbsdata.plantname);
				dilldata.setFont(new Font("Calibri", Font.BOLD, 20));
				dilldata.setHorizontalTextPosition(JLabel.CENTER);
				dilldata.setVerticalTextPosition(JLabel.TOP);
				dilldata2.setText(herbsdata.plantdata);
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
		
		angelica.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				HerbsData herbsdata = HerbsDataFactory.getHerbsData("angelica");
				JPanel angelica = new JPanel();
				angelica.setLayout(null);
				JLabel angelicadata = new JLabel();
				JLabel angelicadata2 = new JLabel();
				angelicadata.setBounds(10, 0, 1000, 300);
				angelicadata2.setBounds(10, 200, 1000, 500);
				angelicadata.setIcon(herbsdata.planticon);
				angelicadata.setText(herbsdata.plantname);
				angelicadata.setFont(new Font("Calibri", Font.BOLD, 20));
				angelicadata.setHorizontalTextPosition(JLabel.CENTER);
				angelicadata.setVerticalTextPosition(JLabel.TOP);
				angelicadata2.setText(herbsdata.plantdata);
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
		
		aangelica.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				HerbsData herbsdata = HerbsDataFactory.getHerbsData("aangelica");
				JPanel aangelica = new JPanel();
				aangelica.setLayout(null);
				JLabel aangelicadata = new JLabel();
				JLabel aangelicadata2 = new JLabel();
				aangelicadata.setBounds(10, 0, 1000, 300);
				aangelicadata2.setBounds(10, 200, 1000, 500);
				aangelicadata.setIcon(herbsdata.planticon);
				aangelicadata.setText(herbsdata.plantname);
				aangelicadata.setFont(new Font("Calibri", Font.BOLD, 20));
				aangelicadata.setHorizontalTextPosition(JLabel.CENTER);
				aangelicadata.setVerticalTextPosition(JLabel.TOP);
				aangelicadata2.setText(herbsdata.plantdata);
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
