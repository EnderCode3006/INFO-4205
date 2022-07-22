package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ProjectPage extends JPanel{

	String title;
	
	public ProjectPage(){
		this.setBounds(0, 100, 1000, 900);
		this.setLayout(null);
		
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
		
		this.add(textarea);
		this.add(button);
	}
}
