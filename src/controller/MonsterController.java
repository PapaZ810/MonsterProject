package controller;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MonsterController
{
	//Data member section or declaration section
	//private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	
	//Constructors initialize data members
	public MonsterController()
	{
		//myMonster = new MarshmallowMonster("Big Smoke", .5, 2, false, 1, "Shure Microphones");
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		//JOptionPane.showMessageDialog(null,myMonster);
		
		//System.out.println(myMonster);
		
		//System.out.println("How many legs do you want your monster to have?");
		//JOptionPane.showMessageDialog(null, "How many \nlegs do you want your monster to have?");
		String userInput = JOptionPane.showInputDialog(null, "How many legs do you want your monster to have?");
		double legCount = -99;
		if (validDouble(userInput))
		{
			legCount = Double.parseDouble(userInput);
		}
		//double legCount = inputScanner.nextDouble();
		userMonster.setLegCount(legCount);
		
		//System.out.println("How many arms do you want your monster to have?");
		//JOptionPane.showMessageDialog(null, "How many arms do you want your monster to have?");
		userInput = JOptionPane.showInputDialog(null, "How many arms do you want your monster to have?");
		int armCount = -99;
		if (validInt(userInput))
		{
			armCount = Integer.parseInt(userInput);
		}
		//int armCount = inputScanner.nextInt();
		userMonster.setArmCount(armCount);
		
		//System.out.println("Do you want your monster to have a nose? True or false only please!");
		//JOptionPane.showMessageDialog(null, "Do you want you monster to have a nose?");
		userInput = JOptionPane.showInputDialog(null, "Do you want your monster to have a nose?");
		boolean answer = Boolean.parseBoolean(userInput);
		//boolean hasNoses = inputScanner.nextBoolean();
		userMonster.setHasNoses(answer);
		
		//System.out.println("How many eyes do you want your monster to have?");
		userInput = JOptionPane.showInputDialog(null, "How many eyes do you want your monster to have?");
		int eyeCount = -99;
		if (validInt(userInput));
		{
			eyeCount = Integer.parseInt(userInput);
		}
		//int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyeCount);
		
		//inputScanner.nextLine();
		
		//System.out.println("What is your monster's name?");
		//JOptionPane.showMessageDialog(null, "What is your monster's name?");
		userInput = JOptionPane.showInputDialog(null, "What is you monster's name?");
		//String name = inputScanner.nextLine();
		userMonster.setName(userInput);
		
		//System.out.println("What do you want your monster to say?");
		userInput = JOptionPane.showInputDialog(null, "What do you want your monster to say?");
		//String said = inputScanner.nextLine();
		userMonster.setSaid(userInput);
		
		//System.out.println("Your monster has " + userMonster.getLegCount() + " legs and " + userMonster.getArmCount() +  " arms! Your monster has a " + userMonster.getHasNoses() + " nose and " + userMonster.getEyeCount() + " eyes! Your monster's name is " + userMonster.getName() + " and he says " + userMonster.getSaid() + "! Isn't that just so precious!");
		
		JOptionPane.showMessageDialog(null, "Your monster has " + userMonster.getLegCount() + " legs and " + userMonster.getArmCount() +  " arms! \nYour monster has a " + userMonster.getHasNoses() + " nose and " + userMonster.getEyeCount() + " eyes! \nYour monster's name is " + userMonster.getName() + " and he says " + userMonster.getSaid() + "! \nIsn't that just so precious!");
		
		inputScanner.close();
	}
		
			public boolean validInt(String maybeInt)
			{
				boolean isValid = false;
				
				try
				{
					Integer.parseInt(maybeInt);
					isValid = true;
				}
				catch (NumberFormatException error)
				{
					JOptionPane.showMessageDialog(null, "You need to type in a whole number!");
				}
				return isValid;
			}
			
			public boolean validDouble(String mightBeDouble)
			{
				boolean isValid = false;
				
				try
				{
					Double.parseDouble(mightBeDouble);
					isValid = true;
				}
				catch (NumberFormatException error)
				{
					JOptionPane.showMessageDialog(null,	"You need to type in a rational number");
				}
				return isValid;
			}
			
			
}
