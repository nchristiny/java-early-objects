public class Spartans extends Instructors 
{
	public Spartans() { }

	double budget = 7000.00;
	String location = "Brand new building three";
	int level = 3;
	String teachingMaterials = "Virtual Reality Classroom";
	
	// Override parent class method
	public void getInformation() 
	{
		System.out.println("Information on this instructor:");
		System.out.println("");
		System.out.println("Budget: " + String.valueOf(usdCostFormat.format(budget)));
		System.out.println("Location: " + location);
		System.out.println("Teaching level: " + level);
		System.out.println("Class Materials: " + teachingMaterials);
		System.out.println("");
	}
}
