package Abstraction;

public abstract class ParentAircraft {
	//non abstract method
	public void engine()
	{
		System.out.println("follow enginee guidelines");
	}

	
	//non abstarct method
	public void safetyGuidelines()
	{
		System.out.println("follow safety Guidelines");
	}
	
	//abstract method
	public abstract void bodyColour();
	
}
