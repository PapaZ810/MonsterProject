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
	
	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	
	
	public String toString()
	{
		String description = "This monster is named " + name + " and it has " + legCount + " legs and has  " + eyeCount + " eyes and a " + hasNoses + " nose and " + armCount + " arms. His favorite thing to say is: beans";
		
		return description;
	}
	
}
