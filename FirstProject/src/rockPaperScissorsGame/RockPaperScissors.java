package rockPaperScissorsGame;

import java.util.Random;

public class RockPaperScissors {

	public static int computerInt;
	public static RockPaperScissorsGame computerPlay;

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(playGame(RockPaperScissorsGame.ROCK));
			System.out.println(playGame(RockPaperScissorsGame.PAPER));
		}
	}

	public static RockPaperScissorsGame game() {

		Random generator = new Random();
		computerInt = generator.nextInt(3);

		if (computerInt == 0) {
			computerPlay = RockPaperScissorsGame.ROCK;
		} else if (computerInt == 1) {
			computerPlay = RockPaperScissorsGame.PAPER;
		} else if (computerInt == 2) {
			computerPlay = RockPaperScissorsGame.SCISSORS;
		}
		return computerPlay;
	}

	private static String playGame(RockPaperScissorsGame player) {
		RockPaperScissorsGame computerPlay = game();

		if (computerPlay == player) {
			return "Player chose:" + player + ". computer chose:" + computerPlay + ". Its a tie!";
		} else if (computerPlay == RockPaperScissorsGame.ROCK && player == RockPaperScissorsGame.PAPER) {
			return "Player chose:" + player + ". computer chose:" + computerPlay + ". Player wins!";
		} else if (computerPlay == RockPaperScissorsGame.ROCK && player == RockPaperScissorsGame.SCISSORS) {
			return "Player chose:" + player + ". computer chose:" + computerPlay + ". computer wins!";
		} else if (computerPlay == RockPaperScissorsGame.PAPER && player == RockPaperScissorsGame.SCISSORS) {
			return "Player chose:" + player + ". computer chose:" + computerPlay + ". Player wins!";
		} else if (computerPlay == RockPaperScissorsGame.PAPER && player == RockPaperScissorsGame.ROCK) {
			return "Player chose:" + player + ". computer chose:" + computerPlay + ". computer wins!";
		} else if (computerPlay == RockPaperScissorsGame.SCISSORS && player == RockPaperScissorsGame.PAPER) {
			return "Player chose:" + player + ". computer chose:" + computerPlay + ". computer wins!";
		} else if (computerPlay == RockPaperScissorsGame.SCISSORS && player == RockPaperScissorsGame.ROCK) {
			return "Player chose:" + player + ". computer chose:" + computerPlay + ". Player wins!";
		}
		return "Error!!";
	}

}
