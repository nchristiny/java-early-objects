import java.util.Scanner;
// Nicholas Christiny, Programmer

public class Maze {
	static Scanner sc = new Scanner(System.in);
	// maze movements
	static char myMove = '\0';
	// cell position
	static int currentCell = 0;
	static int score = 12;
	static boolean advance = true;
	static boolean checkThis = false, win = false;

	public static void main(String args[])
	{
		displayMenu();  

		while(score > 0) 
		{
			displayMovement();
			makeYourMove();
			checkThis = checkYourMove();
			mazeStatus();
			// Check for win
			if (win == true)
				break;

			// Decrement score
			--score;
			if (score > 0)
				System.out.println("Moves left: " + score);
			else 
				System.out.println("No moves left!");
		}
		System.out.println("Thanks for playing.");

		// TODO resolve bug where program forgets where it is after incorrect direction,
		// like walking into wall or out the entrance - refactor displayMovement()
		// DONE TODO win condition tweak to end game when exiting maze
		// DONE TODO allow play until you run out of moves, instead of asking every turn
		// DONE TODO make directions input not case-sensitive 
		// DONE TODO move score keeping and win condition check before move again question, see continuous play option
		// TODO Use arrow keys as well as current WASD
		// RE: above https://www.darkcoding.net/software/non-blocking-console-io-is-not-possible/

		// Add score 
		if (score == 0 && win == false){
			System.out.println("You starve looking for the exit to the maze.");
			System.out.println("Sorry!");
		} else if (win == true) {
			System.out.println("You managed to escape the accursed maze. You scored " + score);
			System.out.println("Congratulations!");
		} else // does this ever get run?
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
		myMove = sc.next().toUpperCase().charAt(0);

		if (myMove == 'W' || myMove == 'A' || myMove == 'S' || myMove == 'D')
		{
			switch(myMove)
			{
			case 'W': { MoveUp(); break; }
			case 'A': { MoveLeft(); break; }
			case 'S': { MoveDown(); break; }
			case 'D': { MoveRight(); break; }
			}
		}
		else
			System.out.println("Do you wanna die in this maze?!\nEnter either W, A, S or D");
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
		if (win != true)
			System.out.println("current position: cell " + currentCell);	
	}//end method

}// end class
