import java.util.Random;
import java.util.Scanner;	// Add interaction 
// Nicholas Christiny, Programmer

public class RPGSimulator
{
	public static void main(String args[]) throws InterruptedException
	{
		Random rand1 = new Random();
		Random rand2 = new Random();
		String mission1 = "Capture the Castle";
		String mission2 = "Enter the Hidden City";
		String mission3 = "Rescue the Princess";
		String mission4 = "Traverse the Forest";
		String mission5 = "Locate the Tunnel Entrance";
		// Add new missions
		// TODO  Adding missions takes changing same data in different places, refactor
		String mission6 = "Drink All the Ale in the Tavern";
		String mission7 = "Conquer the Seven Kingdoms";
		String mission8 = "Infiltrate the Thieves Guild";
		
		String player1 = "", player2 = "";
		char letter = '\0', role = '\0';
		
		// Multiple games option
		// TODO Strings are expensive: consider Boolean when possible
		Boolean playAgain = true;
		String strPlayAgain;
		Scanner sc = new Scanner(System.in);
		
		
		while (playAgain == true) {                         
			// initial health and treasures for the two players
			int number = 0, health1 = 100, health2 = 100;
			int treasure1 = 100, treasure2 = 100, encounter = 0;
			// define your role
			role = (char)(rand1.nextInt(26) + 'a');
			if(role >= 'a' && role <= 'm') 
			{
				player1 = "protagonist";
				player2 = "opponent";
			}
			else 
			{
				player1 = "opponent";
				player2 = "protagonist";
			}
			System.out.println("you are the " + player1);
			// define your mission
			number = rand2.nextInt(8) + 1;
			System.out.print("your mission is: ");
			switch(number)
			{
			case 1: System.out.println(mission1); break;
			case 2: System.out.println(mission2); break;
			case 3: System.out.println(mission3); break;
			case 4: System.out.println(mission4); break;
			case 5: System.out.println(mission5); break;
			// New missions - remember to increment variable number
			case 6: System.out.println(mission6); break;
			case 7: System.out.println(mission7); break;
			case 8: System.out.println(mission8); break;
			}
			System.out.println("");
			
			// Add "cloaking mode" to mission1
			if (number == 1){
				System.out.println("Luckily for this mission, you have donned a\nCloak of Concealment + Xtra HP.\n");
				// if player1 is "protagonist" then add bonus to health1
				// if player1 is "opponent" then add bonus to health2
				if (player1 == "protagonist"){ 
					System.out.println("Added 200 HP to " + player1);
					health1 += 200;
				}
				else {
					System.out.println("Added 200 HP to " + player1);
					health2 += 200;
				}
				System.out.println("Have fun storming the castle!\n");
			}
			
			// Add extra character to mission that helps both the players, game lasts longer
			// TODO could make it so the NPC can have a random effect at each encounter
			if (number == 8){
				System.out.print("Your pal the Vermillion Rapscallion will\n\"assist\" both you and your opponent in this mission");
				System.out.println("\nin the form of bonus health and treasure!");
				System.out.println("");
				health1 += 60;
				health2 += 60;
				treasure1 += 120;
				treasure2 += 120;
			}
			
			// let the game simulation commence (limit the # of encounters)
			for (encounter = 1; encounter <= 20; encounter++)
			{
				letter = (char)(rand1.nextInt(3) + 'a');
				number = rand2.nextInt(10) + 1;
				// randomly encounter the enemy
				if(letter == 'a' || letter == 'b')
					//if(mission == 1 || mission == 2 || mission == 3)
				{
					health1 -= 10;
					health2 += 15;
					treasure1 += 10;
					treasure2 -= 10;
					//Thread.sleep(5000);
					System.out.print("battle: " + encounter);
					System.out.println("\t" + "health" + "\t" + "treasure");
					System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
					System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
					System.out.println("");
					//encounter++;
				}	
				else if(letter == 'c' || letter == 'd')
				{
					health1 += 20;
					health2 -= 30;
					treasure1 += 40;
					treasure2 -= 20;
					//Thread.sleep(500);
					System.out.print("battle: " + encounter);
					System.out.println("\t" + "health" + "\t" + "treasure");
					System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
					System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
					System.out.println("");
					//break;
				}
				else
				{
					health1 += 30;
					health2 -= 20;
					treasure1 -= 30;
					treasure2 += 20;
					//Thread.sleep(500);
					System.out.print("battle: " + encounter);
					System.out.println("\t" + "health" + "\t" + "treasure");
					System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
					System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
					System.out.println("");
					//break;
				}
				health1 -= 5;
				health2 -= 5;
				treasure1 -= 5;
				treasure2 -= 5;

				if (health1 <= 0 || health2 <= 0 || treasure1 <= 0 || treasure2 <= 0)
				{	
					if (health1 <= 0 || treasure1 <= 0) 
						System.out.println("You have died from lack of health and/or treasure.");
					else
						// TODO it appears the odds are stacked against player2
						// some game balance is needed
						System.out.println("Player 2 has died from lack of health and/or treasure.");
					break;
				}

				// Add bonus health and treasure if survive after 5 encounters
				// Relocated to AFTER the death condition, in order to only award bonus only if encounter 5 is survived
				if (encounter == 5) {
					System.out.println("Congratulations! Bonus health and treasure \nreceived for surviving 5 encounters.");
					System.out.println("");
					health1 += 150;
					health2 += 150;
					treasure1 += 250;
					treasure2 += 250;
				}
				
				// Add congratulatory message if both players survive after 20 encounters
				if (encounter == 20) {
					System.out.println("You and your worthy opponent have stuggled\nmightily. You have both decided a disarmament pact\nis in order and agree to put down your weapons. \nYou both grow fat from your wealth and\nsettle down to make families.\nAs the years go on, the terrible conflict seems but\na distant memory. Eventually you find yourself\nin bed surrounded by warm, loving faces.\nYou die peacefully in your sleep.");
				}
			}
			
			System.out.println("*************** GAME OVER ************************\n");
			System.out.println("simulation has ended\n");
			System.out.println("results:\n");
			System.out.println("\t\t" + "health" + "\t" + "treasure");
			System.out.println(player1 + "\t" + health1 + "\t" + treasure1);
			System.out.println(player2 + "\t" + health2 + "\t" + treasure2);
			// TODO Who won and who died of lack of health/treasure? 
			// TODO Add mission dependent success and failure messages
			System.out.println("Play again? Y/N");
			strPlayAgain = sc.next().toLowerCase();
			if (strPlayAgain.charAt(0) == 'n') 
				playAgain = false;
		}
		System.out.println("Farewell adventurer.");
		sc.close();
	}
}
