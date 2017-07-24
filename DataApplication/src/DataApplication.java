/**
 * Database Style Application
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nick Christiny
 *
 */
public class DataApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try 
		{
			File fin = new File("data.txt");
			Scanner scan = new Scanner(fin);
			ArrayList<String> theData = new ArrayList<String>();

			// read the column headings from the flat text file
			String line = scan.nextLine();
			while(scan.hasNextLine())
			{
				line = scan.nextLine();
				String[] list = line.split(",");
				int key = Integer.parseInt(list[0]);
				String name = list[1];
				int fee = Integer.parseInt(list[2]);
				String specialty = list[3];

				theData.add(String.valueOf(key)); 
				theData.add(name);
				theData.add(String.valueOf(fee)); 
				theData.add(specialty);
			}
			int count = 1;
			for (int i = 0; i < theData.size(); i++) 
			{
				System.out.print(theData.get(i) + "\t\t");
				if(count % 4 == 0 )
					System.out.println(" ");
				count++;
			}
			scan.close();
		}
		catch (FileNotFoundException e) 
		{         
			e.printStackTrace();
		}
	}
}
