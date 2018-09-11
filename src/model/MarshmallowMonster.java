package model;

public class MarshmallowMonster
{
	//-------Declaration Section-----------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	public MarshmallowMonster()
	{
		//Default constructor 
		//boring and not as helpful
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
		//Assigns name to this name which talks to the current object 
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		//have to assign the variables
	}
	
	
	public String toString()
	{
		String description = "";
		
		return description;
	}
	
}
