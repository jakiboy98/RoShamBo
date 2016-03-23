package roshambo.controller;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class RoShamBoController
{
	public int rock;
	public int paper;
	public int scissors;
	public int random;
	
	Button R;
	Button P;
	Button S;
	
	public void rock()
	{
		int rock = 1;
	}
	
	public void paper()
	{
		int paper = 2;
	}
	
	public void scissors()
	{
		int scissors = 3;
	}
	
	public void start()
	{
		System.out.println("Lets play RoShamBo!");
	}
	
	public void randomPick()
	{
		int random = (int )(Math.random() * 3 +1);
		System.out.println("Choose one of the below. ");
	}
	
	public void compare()
	{
		if ()
	}
}
