import java.util.Scanner;
import java.util.Random;
public class RockPaperGame {
    public static void main(String[] args)
	{
		int userNum,compNum;

		boolean playAgain = true;

		String yesNo;
		char ch;

		Scanner sc = new Scanner(System.in);
		
		

		do {
			int userScore = 0, compScore = 0;

			while(userScore < 3 && compScore <  3)
			{
				System.out.println("\n\tChoose the given number\n ");
				System.out.println("0 - Rock \t 1 - Paper \t 2 - Scissor\n");
				userNum = sc.nextInt();

				Random rd = new Random();
				compNum = rd.nextInt(3);

				if(userNum == compNum)
				{
					System.out.println("\nDraw\n");
				}else if(userNum == 0 && compNum == 2 ||  userNum == 1 && compNum == 0 || userNum == 2 && compNum == 1 )
				{
					System.out.println("\nPlayer wins!\n");
					userScore++;
				}
				else{
					System.out.println("\nComputer wins!\n");
					compScore++;
				}

				System.out.println("Player score : " + userScore);
				System.out.println("Computer Score : " + compScore);

				if(userScore == 3)
				{
					System.out.println("\nFinal : Player wins : " + userScore);
				}else if(compScore == 3)
				{
					System.out.println("\nFinal : Computer wins : " + compScore);
				}
			}
			System.out.println("Do you want to continue [Y/N]");
			yesNo = sc.next();
			yesNo = yesNo.toUpperCase();
			ch = yesNo.charAt(0);

			if(ch == 'Y')
			{
				playAgain = true;
			}else if(ch == 'N')
			{
				playAgain = false;
			}
		} while (playAgain);
		System.out.println("Game end");
	}	
}

