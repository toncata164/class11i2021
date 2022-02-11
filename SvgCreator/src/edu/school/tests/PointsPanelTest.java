package edu.school.tests;

import javax.swing.JFrame;

import edu.school.views.PointsPanel;

public class PointsPanelTest {

	public static void main(String[] args) {
		JFrame window = new JFrame("GUI App");
		window.setBounds(200, 200, 500, 750);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLayout(null);
		
		PointsPanel p = new PointsPanel();
		p.setBounds(10, 10, 200, 200);
		window.add(p);
	}

}
