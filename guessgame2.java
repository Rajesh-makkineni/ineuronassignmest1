package Search;
import java.util.*;
class Guesser1
{
	int guessNum;
	int guessNum()
	 {
		 Scanner few=new Scanner(System.in);
		 System.out.println("guesser pls enter the number :");
		 guessNum = few.nextInt();
		 while(guessNum<0 || guessNum>10) {
				System.out.println("player pls type the   number that in range 0 to 10");
				guessNum=few.nextInt();	
			}	
		 System.out.println(guessNum);
		 return guessNum;
	 }
}
class player1
{
	int GuessNum;
	int GuessNum()
	{
		Scanner few=new Scanner(System.in);
		System.out.println("player pls the number that you guessed");
		GuessNum=few.nextInt();
		while(GuessNum<0 || GuessNum>10) {
			System.out.println("player pls the number that in range 0 to 10");
			GuessNum=few.nextInt();	
		}
		return GuessNum;
	}
}
class ump
{
	int NumFromGuesser;
	int NumFromPlayer1;
	int NumFromPlayer2;
	int NumFromPlayer3;
	
	void collectNumFromGusser()
	{
		Guesser1 g=new Guesser1();
		NumFromGuesser=g.guessNum();
		
	}
	void collectNumFromPlayers()
	{
		player1 p1=new player1();
		player1 p2=new player1();
		player1 p3=new player1();
		System.out.print("Player 1  ");
		NumFromPlayer1=p1.GuessNum();
		System.out.print("Player 2  ");
		NumFromPlayer2=p2.GuessNum();
		System.out.print("Player 3  ");
		NumFromPlayer3=p3.GuessNum();
		System.out.println(NumFromPlayer1+NumFromPlayer2+NumFromPlayer3);
	}
	void compare()
	{
		if(NumFromGuesser==NumFromPlayer1)
		{
			if (NumFromPlayer2==NumFromPlayer1) {
				System.out.println("Game tired palyer 1 and player 2 won");
			}
			else if(NumFromPlayer3==NumFromPlayer1) {
				System.out.println("Game tired palyer 1 and player 3 won");
			}
			else {
				System.out.println("player 1 won the game");
			}
		}
		else if(NumFromGuesser==NumFromPlayer2)
		{
			
			System.out.println(" player 2 won the game");
		}
		else if(NumFromGuesser==NumFromPlayer3)
		{
			System.out.println(" player 3 won the game");
		}
		else
		{
			System.out.print("\tall of you!\n\tlose the game");
		}
	}
	
}


public class guessgame2 {

	public static void main(String[] args) {
		ump u=new ump();
		u.collectNumFromGusser();
		u.collectNumFromPlayers();
		u.compare();
	}

}
