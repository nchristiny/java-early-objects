/**
 * 	Program to convert characters to numbers
 */

/**
 * @author nyc
 *
 */

public class CharacterConversion 
{
	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{	
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for(int i = 0;i < letters.length();++i )
		{ 
			if(i > 0 && i % 5 == 0) 
				System.out.println((int)letters.charAt(i) + " ");
			else
				System.out.print((int)letters.charAt(i) + " ");
		}
		
	}
}
