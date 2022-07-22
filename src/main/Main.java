package main;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main{

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Planter");
		window.setLayout(null);
		
		Category category = new Category();
		Project project = new Project();
		CategoryPage categorypage = new CategoryPage();
		
		JPanel projectpage = new JPanel();
		projectpage.setBounds(0, 100, 1000, 900);
		projectpage.setLayout(null);
		
		JButton button = new JButton();
		button.setBounds(420, 780, 100, 50);
		button.setText("Save");
		button.setFocusable(false);
		
		JTextArea textarea = new JTextArea();
		textarea.setBounds(40, 40, 900, 720);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
				
				String text = textarea.getText();
				
				try {
					FileOutputStream fos = new FileOutputStream("save.txt");
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
					
					bw.write(text);
					
					bw.close();
					fos.close();
					
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		projectpage.add(textarea);
		projectpage.add(button);
		
		JPanel container = new JPanel();
		container.setBounds(0, 100, 1000, 900);
		CardLayout cl = new CardLayout();
		container.setLayout(cl);
		container.add(categorypage, "1");
		container.add(projectpage, "2");
		cl.show(container, "1");		
		
		category.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl.show(container, "1");
		    } 
		});
		
		project.addActionListener(new ActionListener() {
			
			@Override
		    public void actionPerformed (ActionEvent e) {
		        cl.show(container, "2"); 
		        try {
		        	
		        	FileInputStream fis = new FileInputStream("save.txt");
		        	BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		        	
		        	StringBuilder sb = new StringBuilder();
		            String line = br.readLine();

		            while (line != null) {
		                sb.append(line);
		                sb.append(System.lineSeparator());
		                line = br.readLine();
		            }
		        	
		            textarea.setText(sb.toString());
		            
		        	br.close();
		        	fis.close();
		        	
		        }catch(IOException e1) {
		        	e1.printStackTrace();
		        }
		    } 
		});
		
		window.add(category);
		window.add(project);
		window.add(container);
		
		window.setVisible(true);
		window.setResizable(false);
	}
}
