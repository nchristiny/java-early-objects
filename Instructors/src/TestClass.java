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
			
			instruct.getInformation();
			athens.getInformation();
			sparta.getInformation();
			
		}
		catch (Exception e) 
		{         
			e.getMessage();
		}
	}

}
