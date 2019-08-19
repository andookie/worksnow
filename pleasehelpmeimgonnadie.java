package JFrames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class pleasehelpmeimgonnadie {
	private JFrame ourFrame = new JFrame("Password Manager"); 
	
	pleasehelpmeimgonnadie(){
		ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds(200, 100, 400, 300);
		
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		
		JLabel logo = new JLabel("Enter Email and Password into Boxes");
		logo.setBounds(110,5,250,30);
		
		
		JLabel email_label = new JLabel("Email :");
		email_label.setBounds(40,30,250,30);
		JLabel password_label = new JLabel("Password :");
		password_label.setBounds(20,60,250,30);
		
		
		JTextField emailText = new JTextField(30);
		emailText.setBounds(90,30,250,30);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        emailText.setBorder(border);

		JPasswordField passwordText = new JPasswordField(30);
		passwordText.setBounds(90, 61, 250, 30);
		 Border border1 = BorderFactory.createLineBorder(Color.BLACK);
	        passwordText.setBorder(border);

		JLabel savedPasswordHeading = new JLabel("Saved Passwords ");
		savedPasswordHeading.setBounds(140, 140, 250, 30);
		JLabel savedEmail = new JLabel("Emails :");
		savedEmail.setBounds(60, 180, 250, 30);
		JLabel savedPasswords = new JLabel("Passwords :");
		savedPasswords.setBounds(250, 180, 250, 30);
		
		JButton savePassword = new JButton("Save Password");
		savePassword.setBounds(110, 93, 190, 30);
		savePassword.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String string = emailText.getText();
		char[] passwordGetPassword = passwordText.getPassword();
		String fileName = "emailsAndPasswords.txt";
		
		PrintWriter writer = null; 
		try {
		FileWriter w = new FileWriter(fileName);
		writer = new PrintWriter(w);
		writer.write(string);
		writer.close();
		
		} catch (FileNotFoundException elol) {
			elol.printStackTrace();
		} catch (IOException elol) {
			elol.printStackTrace();

		}



		System.out.println("Done!");
		  Component parentComponent = null;
		JOptionPane.showMessageDialog(parentComponent, "Password Saved!");
			}});
		
		  
		
	
		ourFrame.setVisible(true); 
		container.add(savedPasswordHeading);
		container.add(savedEmail);
		container.add(savedPasswords);
		container.add(logo);
		container.add(password_label);
		container.add(email_label);
		container.add(passwordText);
		container.add(emailText);
		container.add(savePassword); 

	}
	
		
			

}
	
	

	
		
		
		
		
		
	   
		
		 
