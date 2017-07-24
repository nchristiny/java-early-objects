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
			searchData(theData);
			overTwoThousand(theData);
			mediaCount(theData);
			scan.close();
		}
		catch (FileNotFoundException e) 
		{         
			e.printStackTrace();
		}
	}

	public static void searchData(ArrayList<String> vals)
	{
		System.out.print("enter a name: ");
		Scanner sc = new Scanner(System.in);
		String strName = sc.nextLine().trim(); 
		boolean found = false;

		for (int i = 0; i < vals.size(); i++) 
		{
			if(vals.get(i).equals(strName.trim()))
			{
				found = true;
				break;
			}
		}

		if(found == true)
			System.out.println(" data found ");
		else
			System.out.println(" data not found ");

		sc.close();
	}

	public static void overTwoThousand(ArrayList<String> vals)
	{
		System.out.print("These consultants charge fees over $2000:\n");
		for (int i = 0; i < vals.size(); i++) 
		{
			// 2, 6, 10
			// TODO fix this hard-coded conditional
			if ( i == 2 || i == 6 || i == 10 || i == 14 || i == 18)
			{
				int fee = Integer.parseInt(vals.get(i));
				if(fee > 2000)
				{
					System.out.println(vals.get(i - 1));
					System.out.println("...");
				}
			}
		}
	}

	public static void mediaCount(ArrayList<String> vals)
	{
		System.out.print("Number of consultants providing media services:\n");
		int count = 0;
		for (int i = 0; i < vals.size(); i++) 
		{
			if(vals.get(i).equals("Media"))
			{
				++count;
			}
		}
		System.out.println(count);
	}

}
