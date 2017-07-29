/**
 * Inheritance and classes
 */

/**
 * @author Nick Christiny
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try 
		{
			Instructors instruct = new Instructors();
			Spartans sparta = new Spartans();
			Athenians athens = new Athenians();
			
			System.out.println("The budget for regular instructors is");
			System.out.println(instruct.budget);
			
			System.out.println("The budget for Athenian instructors is");
			System.out.println(athens.budget);

			System.out.println("The budget for Spartan instructors is");
			System.out.println(sparta.budget);
			
		}
		catch (Exception e) 
		{         
			e.getMessage();
		}
	}

}
