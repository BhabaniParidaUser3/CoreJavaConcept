package Abstraction;

public class ChildAircraft extends ParentAircraft{

	public static void main(String[] args) {
		
		ChildAircraft CA=new ChildAircraft();
		CA.engine();
		CA.safetyGuidelines();
		CA.bodyColour();
		
		/*
		 * we can not create Parent class object instantiate bcz parent class abstarct
		 * modifier used
		 */
		//ParentAircraft PA=new ParentAircraft();
		

	}

	@Override
	public void bodyColour() {
System.out.println("red color on the body");		
	}

}
