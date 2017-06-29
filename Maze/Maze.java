import java.util.Scanner;
// Nicholas Christiny, Programmer

public class Maze {
	static Scanner sc = new Scanner(System.in);
	// maze movements
	static char myMove = '\0';
	static int moveResult = 0;
	
	// cell position
	static int currentCell = 0;
	static int score = 12;
	static boolean advance = true;
	static boolean checkThis = false, win = false;
	
	// cell exits
	static String exits = "";
	
	public static void main(String args[])
	{
		displayMenu();  

		while(score > 0) 
		{
			displayMovement();
			makeYourMove();
			checkThis = checkYourMove(); 
			
			// Check for win
			if (win == true)
				break;
			
			// Decrement score
			// TODO DONE only decrement score if advance is true
			if (checkThis == true)
					--score;

			if (score > 0 && win != true)
				System.out.println("Moves left: " + score);
			else 
			{
				System.out.println("\nNo moves left!");
			}
			mazeStatus();
		}
		
		// Implement score keeping/time limit 
		if (score == 0 && win == false){
			System.out.println("You have failed miserably to beat the maze.");
			System.out.println("Sorry!");
		} else 
		{
			System.out.println("You scored " + score);
			// Add congrats if maze minimal success traversal pattern used
			if (score == 8)
				System.out.println("Congratulations! You have taken the minimal success traversal pattern for the maze.");
		}
		System.out.println("Goodbye.");
		System.out.println("***************************");
	}

	static void displayMenu()
	{
		System.out.println("");
		System.out.println("***************************");
		System.out.println("----The Maze Strategy---");
		System.out.println("");
	}

	static void displayMovement()
	{
		if(currentCell == 0) // First time run only
		{
			System.out.println("You have entered the maze!!");
			System.out.println("There is no turning back!!");
			currentCell = 1;
			mazeStatus();
			advance = true;
		}
		else {
			advance = true;
		}
		System.out.println("make your move (W = up, A = left, S = down, D = right)");
	}

	static void makeYourMove()
	{
		myMove = sc.next().toUpperCase().charAt(0);

		if (myMove == 'W' || myMove == 'A' || myMove == 'S' || myMove == 'D' || myMove == 'H' || myMove == 'J' || myMove == 'K' || myMove == 'L')
		{
			switch(myMove)
			{
			case 'W': { MoveUp(); break; }
			case 'A': { MoveLeft(); break; }
			case 'S': { MoveDown(); break; }
			case 'D': { MoveRight(); break; }
			case 'H': { MoveLeft(); break; }
			case 'J': { MoveDown(); break; } 
			case 'K': { MoveUp(); break; }
			case 'L': { MoveRight(); break; }
			default : 
				System.out.println("Something went wrong...");
			}
		}
		else
			System.out.println("Do you wanna die in this maze?!\nEnter either W, A, S or D! (or h,j,k,l for fancy Vim-like movement)\n");
		
	}

	static boolean checkYourMove()
	{
		if(currentCell == 1 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'A' || myMove == 'H')
			{
				advance = false;
				moveResult = 3;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				currentCell = 2;
				advance = true;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
		}

		if(currentCell == 2 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'A' || myMove == 'H')
			{
				currentCell = 1;
				advance = true;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')

			{
				currentCell = 5;
				advance = true;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
		}

		if(currentCell == 3 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'A' || myMove == 'H')

			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')

			{
				currentCell = 6;
				advance = true;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
		}

		if(currentCell == 4 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'A' || myMove == 'H')

			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')

			{
				currentCell = 7;
				advance = true;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
		}

		if(currentCell == 5 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = true;
				currentCell = 2;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;			
			}
			if (myMove == 'A' || myMove == 'H')

			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				advance = true;
				currentCell = 6;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')

			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
		}

		if(currentCell == 6 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = true;
				currentCell = 3;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'A' || myMove == 'H')

			{
				advance = true;
				currentCell = 5;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')

			{
				advance = true;
				currentCell = 9;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
		}

		if(currentCell == 7 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = true;
				currentCell = 4;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'A' || myMove == 'H')

			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				advance = true;
				currentCell = 8;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')

			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
		}

		if(currentCell == 8 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'A' || myMove == 'H')

			{
				advance = true;
				currentCell = 7;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				advance = true;
				currentCell = 9;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')

			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
		}

		if(currentCell == 9 && advance == true)
		{
			if (myMove == 'W' || myMove == 'K')
			{
				advance = true;
				currentCell = 6;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'A' || myMove == 'H')

			{
				advance = true;
				currentCell = 8;
				moveResult = 2;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'D' || myMove == 'L')
			{
				advance = false;
				moveResult = 1;
				moveMessage(moveResult);
				return advance;
			}
			if (myMove == 'S' || myMove == 'J')

			{
				advance = true;
				moveResult = 4;
				moveMessage(moveResult);
				win = true;
				return advance;
			}
		}
		return advance;
	}
	
	static void moveMessage(int move)
	{   
		// Refactor repetitive code 
		switch(move)
		{
		case 1: { System.out.println("D'oh, there is a wall in the way.\n"); break; }
		case 2: { System.out.println("You continue through the maze ...\n");; break; }
		case 3: { System.out.println("SORRY, you can't get out the way you came in\n"); break; }
		case 4: { System.out.println("You managed to escape the accursed maze. Amazing!\n"); break; }
		default : 
			System.out.println("Something went wrong...\n");
		}
	}

	static void MoveLeft()
	{
		System.out.println("you moved to the left\n");
	}
	
	static void MoveRight()
	{
		System.out.println("you moved to the right\n");
	}
	
	static void MoveUp()
	{
		System.out.println("you moved up (forward)\n");
	}
	
	static void MoveDown()
	{
		System.out.println("you moved down (downward)\n");
	}

	static void mazeStatus()
	{	
		if (win != true && score > 0) 
		{
			System.out.println("current position: cell " + currentCell);
			System.out.print("This room has the following exits: ");
			switch(currentCell)
			{
				case 1: { System.out.println("Only right, (you came in from the left!)"); break; }
				case 2: { System.out.println("Left and down"); break; }
				case 3: { System.out.println("Only down"); break; }
				case 4: { System.out.println("Only down"); break; }
				case 5: { System.out.println("Up and right"); break; }
				case 6: { System.out.println("Up, left and down"); break; }
				case 7: { System.out.println("Up and right"); break; }
				case 8: { System.out.println("Left and right"); break; }
				case 9: { System.out.println("Up, left and down"); break; }
				default: 
					System.out.println("Something went wrong...\n");
			}
		}	
		else 
			System.out.println("Thanks for playing.");
	}

}
