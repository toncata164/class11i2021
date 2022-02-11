package edu.school.tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUITest {
	public static void main(String args[])
	{
		JFrame window = new JFrame("GUI App");
		window.setBounds(200, 200, 500, 750);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLayout(null);
		
		JTextField txtFirstNumber = new JTextField();
		txtFirstNumber.setBounds(30, 30, 50, 30);
		window.add(txtFirstNumber);
		
		JTextField txtSecondNumber = new JTextField();
		txtSecondNumber.setBounds(90, 30, 50, 30);
		window.add(txtSecondNumber);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(30, 70, 100, 30);
		window.add(btnCalculate);
		
		JLabel lblResult = new JLabel();
		lblResult.setBounds(140, 70, 50, 30);
		window.add(lblResult);
		
		btnCalculate.addActionListener(e->{
			int first = Integer.parseInt(txtFirstNumber.getText());
			int second = Integer.parseInt(txtSecondNumber.getText());
			int result = first + second;
			lblResult.setText(""+result);
		});
	
		
		JButton btnExit = new JButton();
		btnExit.setText("Exit");
		btnExit.setBounds(100, 100, 120, 30);
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}	
		});
		
		window.add(btnExit);
	}
}
