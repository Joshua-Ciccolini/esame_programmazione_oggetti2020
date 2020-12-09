import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Grafica{	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ingresso");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 200);
		frame.setVisible(true);
		
		JPanel panel= new JPanel();
		panel.setLayout(null);
		
		frame.add(panel);
		
		JLabel Userlabel = new JLabel("Utente");
		JLabel PasswordLabel = new JLabel("Password");
		
		Userlabel.setBounds(10, 20, 80, 25);
		PasswordLabel.setBounds(10, 50, 80, 25);
		
		panel.add(Userlabel);
		panel.add(PasswordLabel);
		
		JTextField textuser = new JTextField(20);
		textuser.setBounds(100, 20, 165, 25);
		panel.add(textuser);
		
		JPasswordField textpassword = new JPasswordField(20);
		textpassword.setBounds(100, 50, 165, 25);
		panel.add(textpassword);
		
		JButton button = new JButton("Login");
		button.setBounds(20, 80, 40, 20);
		button.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JLabel label2= new JLabel("Ingresso Consentito");
			label2.setBounds(10, 100, 200, 25);
			panel.add(label2);
			}
		});
		panel.add(button);
}
}
