package controller;

import model.MarshmallowMonster;

public class MonsterController
{
	//Data member section or declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Big Smoke", .5, 2, false, 1);
	}
	
	public void start()
	{
		System.out.println(myMonster);
		
	}
}
