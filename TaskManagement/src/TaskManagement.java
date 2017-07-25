/**
 * Task Management Application
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Nick Christiny
 *
 */
public class TaskManagement 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try 
		{
			Scanner scan = new Scanner(System.in);

			// define the tasks
			ArrayList<String> theTasks = new ArrayList<String>
			(Arrays.asList("Task 1", "Task 2", "Task 3", "Task 4", "Task 5"));

			// define the task durations
			ArrayList<Integer> theDurations = new ArrayList<Integer>
			(Arrays.asList(20, 25, 18, 9, 13));

			// define the task status
			ArrayList<String> theStatus = new ArrayList<String>
			(Arrays.asList("Open", "Open", "Open", "Open", "Open"));

			int processor1 = 0;
			int processor2 = 0;
			int processor3 = 0;
			int processor4 = 0;
			int processor5 = 0;
			int TRT = 0;

			// display initial data
			listTasks(theTasks);
			listDurations(theDurations);
			listStatus(theStatus);      

			// commence the processing
			// assign the duration of tasks to processors
			processor1 += theDurations.get(0);
			processor2 += theDurations.get(1);
			processor3 += theDurations.get(2);
			processor4 += theDurations.get(3);
			processor5 += theDurations.get(4);

			// Update status and the total running time of the complete process
			for(int i = 0;i <= 4; i++)
			{
				theStatus.set(i, "In Use"); 
				TRT += theDurations.get(i);
			}
			System.out.println(""); 			
			System.out.println("Total initial running time is " + TRT); 			

			// show current process 
			showProgress(1, processor1, theStatus.get(0), TRT);
			showProgress(2, processor2, theStatus.get(1), TRT);
			showProgress(3, processor3, theStatus.get(2), TRT);
			showProgress(4, processor4, theStatus.get(3), TRT);
			showProgress(5, processor5, theStatus.get(4), TRT);

			boolean stillWorking = true;

			while(stillWorking) {
				processTasks(theTasks, theDurations, theStatus);
				
				listTasks(theTasks);
				listDurations(theDurations);
				listStatus(theStatus);  
				
				if (theStatus.contains("In Use"))
					stillWorking = true;
				else
					stillWorking = false;
			}
			System.out.println("All done");

			scan.close();
		}
		catch (Exception e) 
		{         
			e.getMessage();
		}
	}

	public static void listTasks(ArrayList<String> tasks)
	{
		System.out.println(" ");
		for (int i = 0; i < tasks.size(); i++) 
		{
			System.out.print(tasks.get(i) + "\t");
		}
		System.out.println(" ");
	}

	public static void listDurations(ArrayList<Integer> durations)
	{
		System.out.println(" ");
		for (int i = 0; i < durations.size(); i++) 
		{
			System.out.print(durations.get(i) + "\t"); 			
		}
		System.out.println(" ");
	}

	public static void listStatus(ArrayList<String> status)
	{
		System.out.println(" ");
		for (int i = 0; i < status.size(); i++) 
		{
			System.out.print(status.get(i) + "\t");
		}
		System.out.println(" ");
	}

	public static void showProgress(int n, int processor, String s, int total)
	{
		System.out.println(" ");
		System.out.println("Task number" + "\t" + n );
		System.out.println("task time" + "\t" + processor );
		System.out.println("task status" + "\t" + s );
		System.out.println("total time" + "\t" + total );
		System.out.println(" ");
	}

	public static void processTasks(ArrayList<String> tasks, ArrayList<Integer> durations, ArrayList<String> status)
	{
		System.out.println("\nProcessing...");
		for (int i = 0; i < tasks.size(); i++) 
		{
			// Process five units of time 
			if (durations.get(i) > 0) {
				durations.set( i, durations.get(i) - 5);
				if (durations.get(i) <= 0)
				{
					System.out.println("Job done on " + tasks.get(i));
					durations.set(i, 0);
					status.set(i, "Closed");
				}
			}
		}
		System.out.println(" ");
	}
}

