public class Athenians extends Instructors
{
	public Athenians() { }
	
	double budget = 5000.00;
	String location = "Fairly new building two";
	int level = 2;
	String teachingMaterials = "Whiteboard";
	
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
