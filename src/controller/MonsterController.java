package controller;

import model.MarshmallowMonster;

public class MonsterController
{
	//Data member section or declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("derpy");
	}
	
	public void start()
	{
		System.out.println(myMonster);
		
	}
}
