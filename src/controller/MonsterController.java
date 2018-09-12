package controller;

import model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	//Data member section or declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	
	//Constructors initialize data members
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Big Smoke", .5, 2, false, 1, "Shure Microphones");
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println(myMonster);
		
		System.out.println("How many legs do you want your monster to have?");
		double legCount = inputScanner.nextDouble();
		userMonster.setLegCount(legCount);
		
		System.out.println("How many arms do you want your monster to have?");
		int armCount = inputScanner.nextInt();
		userMonster.setArmCount(armCount);
		
		System.out.println("Do you want your monster to have a nose? True or false only please!");
		boolean hasNoses = inputScanner.nextBoolean();
		userMonster.setHasNoses(hasNoses);
		
		System.out.println("How many eyes do you want your monster to have?");
		int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyeCount);
		
		inputScanner.nextLine();
		
		System.out.println("What is your monster's name?");
		String name = inputScanner.nextLine();
		userMonster.setName(name);
		
		System.out.println("What do you want your monster to say?");
		String said = inputScanner.nextLine();
		userMonster.setSaid(said);
		
		System.out.println("Your monster has " + userMonster.getLegCount() + " legs and " + userMonster.getArmCount() +  " arms! Your monster has a " + userMonster.getHasNoses() + " nose and " + userMonster.getEyeCount() + " eyes! Your monster's name is " + userMonster.getName() + " and he says " + userMonster.getSaid() + "! Isn't that just so precious!");
		
		inputScanner.close();
	}
}
