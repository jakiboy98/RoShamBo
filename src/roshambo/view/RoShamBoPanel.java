package roshambo.view;

import javax.swing.*;

import roshambo.controller.RoShamBoController;

import java.awt.Color;
import java.awt.event.*;

public class RoShamBoPanel extends JPanel
{
	private RoShamBoController baseController;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;
	private SpringLayout baseLayout;
	
	public RoShamBoPanel(RoShamBoController baseController)
	{
		baseLayout = new SpringLayout();
		rockButton = new JButton("Rock");
		paperButton = new JButton("Paper");
		scissorsButton = new JButton("Scissors");
		this.baseController = baseController;
		
		setupRoShamBoPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupRoShamBoPane()
	{
		;
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, rockButton, 11, SpringLayout.EAST, rockButton);
		baseLayout.putConstraint(SpringLayout.NORTH, paperButton, 0, SpringLayout.NORTH, paperButton);
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 6, SpringLayout.EAST, scissorsButton);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(rockButton);
		this.add(paperButton);
		this.add(scissorsButton);
	}
	
	private void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.compare();
			}
		});
		paperButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.compare();
			}
		});
		scissorsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.compare();
			}
		});
	}
}
