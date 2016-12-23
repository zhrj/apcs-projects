import java.util.Scanner;

public class PP5_11 {

	
	public static void main(String[] args) {
		
		int playerPoints = 0;
		int compPoints = 0;
		int compTurnPoints = 0;
		int playerTurnPoints = 0;
		int winner = 100;
		Boolean badRoll = false;
		Boolean isPlayerTurn = true;
		PairOfDice d1 = new PairOfDice();
		PairOfDice d2 = new PairOfDice();
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Welcome to Pig.");
	
	while (playerPoints <= winner && compPoints <= winner) { //main loop of the game, makes sure that it only runs if winning score has not been reached
		
		if ((playerPoints <= winner || compPoints <= winner) && isPlayerTurn == true){ //loop for player turn

			while (playerPoints <= winner && compPoints <= winner) { //loops the "yes" or "no" prompt 
				System.out.println("Type 'y' to roll and 'n' to end turn.");
				String answer = scan.nextLine();
				
				if (answer.equalsIgnoreCase("y")){
					d1.roll();
					if (d1.getDie1() == 1 || d1.getDie2() ==1){
						System.out.println("You rolled a 1, turn is over and you've lost your turn points.");
						playerTurnPoints = 0;
						System.out.println("Your accumulated points: " + playerPoints);
						break; //breaks out of the "yes" or "no" prompt
					}
					if (d1.getDie1() ==1 && d1.getDie2() == 1){
						System.out.println("Your rolled two 1's, unlucky!");
						playerTurnPoints = 0;
						playerPoints = 0;
						System.out.println("Your accumulated points are now 0.");
						break;
					}
					else {
						playerTurnPoints = playerTurnPoints + (d1.getDie1() + d1.getDie2());
						System.out.println("Your current turn points: " + playerTurnPoints);
					}
			    }
				
				if (answer.equalsIgnoreCase("n")) 
				{
					playerPoints = playerPoints + playerTurnPoints;
					System.out.println("Your accumulated points: " + playerPoints);
					playerTurnPoints = 0;
					break;
				}
			}
			isPlayerTurn = false;
		}
			
		if (playerPoints <= winner && compPoints <= winner && isPlayerTurn == false){	//loop for computer turn
			compTurnPoints = 0;
			
			while (compTurnPoints < 20 || badRoll == false){ //main loop for computer turn, makes sure that it hasn't rolled a 1 and turn points  are < 20
				d2.roll();
				if (d2.getDie1() == 1 || d2.getDie2() ==1){
					System.out.println("Computer rolled a 1! Turn points nullified.");
					compTurnPoints = 0;
					badRoll = true;
					break; //breaks out of the compTurnPoints loop
				}
				if (d2.getDie1() ==1 && d2.getDie2() == 1){
					System.out.println("Computer rolled two 1's, lucky you! Accumulated points: 0");
					compPoints = 0;
					badRoll = true;
					break; //breaks out of the compTurnPoints loop
				}
				else {
					compTurnPoints = compTurnPoints + d2.getDie1() + d2.getDie2();
					System.out.println("Computer's current turn points:" + compTurnPoints);
				}
				
			}
			
		}
		compPoints = compPoints + compTurnPoints;
		System.out.println("Computer's turn has ended. Accumulated points: " + compPoints);
		isPlayerTurn = true; //makes sure that the player's turn loop is executed
	
		
	}	
	
	System.out.println("End of the game!");
	System.out.println("Player's score was: " + playerPoints);
	System.out.println("Computer's score was: " + compPoints);
	}

}
