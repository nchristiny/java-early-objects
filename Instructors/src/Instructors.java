import java.text.NumberFormat;

public class Instructors 
{	
	public Instructors() { }
	
	NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance();

	double budget = 3000.00;
	String location = "Old building one";
	int level = 1;
	String teachingMaterials = "Blackboard";
	
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
