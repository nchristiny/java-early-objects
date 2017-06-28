import java.util.Scanner;
// Nicholas Christiny, Programmer

public class Maze {
	static Scanner sc = new Scanner(System.in);
	// maze movements
	static char myMove = '\0';
	// cell position
	static int currentCell = 0;
	static int score = 0;
	static boolean advance = true;
	static boolean checkThis = false, win = false;
	
	public static void main(String args[])
	{
		// the local variables declared and initialized
		char answer = 'Y';

		displayMenu();  

		while(answer == 'Y' || answer == 'y') 
		{
			displayMovement();
			makeYourMove();
			checkThis = checkYourMove();
			mazeStatus();

			System.out.println("move again(Y or N)?");
			answer = sc.next().charAt(0);

		}
		System.out.println("Thanks for playing.");
		// Add success and failure messages for game exit
		if (win == true) 
			System.out.println("Congratulations on making it through!");
		else
			System.out.println("You have failed miserably to beat the maze.");
		System.out.println("Goodbye.");
		System.out.println("***************************");
	}// end main() method

	static void displayMenu()
	{
		System.out.println("");
		System.out.println("***************************");
		System.out.println("----The Maze Strategy---");
		System.out.println("");
	}// end method
	
	static void displayMovement()
	{
		if(currentCell == 0)
		{
			System.out.println("You have entered the maze!!");
			System.out.println("There is no turning back!!");
			currentCell = 1;
			mazeStatus();
			advance = true;
		}
		System.out.println("make your move (W, A, S, D)");
		System.out.println("W = up, A = left, S = down, D = right)");
	}// end method

	static void makeYourMove()
	{
		myMove = sc.next().charAt(0);

		switch(myMove)
		{
		case 'W': { MoveUp(); break; }
		case 'A': { MoveLeft(); break; }
		case 'S': { MoveDown(); break; }
		case 'D': { MoveRight(); break; }
		}
		// end program menu
	}// end method
	
	static boolean checkYourMove()
	{
		if(currentCell == 1 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'A')
			{
				advance = false;
				System.out.println("SORRY, you can't get out the way you came in");
				return advance;
			}
			if (myMove == 'D')
			{
				currentCell = 2;
				advance = true;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'S')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
		}
		
		if(currentCell == 2 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'A')
			{
				currentCell = 1;
				advance = true;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'D')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'S')
			{
				currentCell = 5;
				advance = true;
				System.out.println("continue through the maze");
				return advance;
			}
		}
		
		if(currentCell == 3 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'A')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'D')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'S')
			{
				currentCell = 6;
				advance = true;
				System.out.println("continue through the maze");
				return advance;
			}
		}
		
		if(currentCell == 4 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'A')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'D')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'S')
			{
				currentCell = 7;
				advance = true;
				System.out.println("continue through the maze");
				return advance;
			}
		}
		
		if(currentCell == 5 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = true;
				currentCell = 2;
				System.out.println("continue through the maze");
				return advance;			
			}
			if (myMove == 'A')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'D')
			{
				advance = true;
				currentCell = 6;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'S')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
		}
		
		if(currentCell == 6 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = true;
				currentCell = 3;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'A')
			{
				advance = true;
				currentCell = 5;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'D')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'S')
			{
				advance = true;
				currentCell = 9;
				System.out.println("continue through the maze");
				return advance;
			}
		}
		
		if(currentCell == 7 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = true;
				currentCell = 4;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'A')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'D')
			{
				advance = true;
				currentCell = 8;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'S')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
		}
		
		if(currentCell == 8 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'A')
			{
				advance = true;
				currentCell = 7;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'D')
			{
				advance = true;
				currentCell = 9;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'S')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
		}
		
		if(currentCell == 9 && advance == true)
		{
			if (myMove == 'W')
			{
				advance = true;
				currentCell = 6;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'A')
			{
				advance = true;
				currentCell = 8;
				System.out.println("continue through the maze");
				return advance;
			}
			if (myMove == 'D')
			{
				advance = false;
				System.out.println("There is a wall in the way");
				return advance;
			}
			if (myMove == 'S')
			{
				advance = true;
				System.out.println("You have exited the maze. Amazing!");
				win = true;
				return advance;
			}
		}
		
		return advance;
		// end program menu
	}// end method
	
	static void MoveLeft()
	{
		System.out.println("you moved to the left");

	}//end method
	static void MoveRight()
	{
		System.out.println("you moved to the right");

	}//end method
	static void MoveUp()
	{
		System.out.println("you moved up (forward)");

	}//end method
	static void MoveDown()
	{
		System.out.println("you moved down (downward)");

	}//end method
	
	static void mazeStatus()
	{
		System.out.println("current position: cell " + currentCell);
	}//end method
	
}// end class
