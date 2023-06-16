package SnakeLadder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadderGame {
	private static final int WINNING_POSITION = 100;
	private static final int TOTAL_DICE_SIDES = 6;
	private static final int TOTAL_SNAKES = 6;
	private static final int TOTAL_LADDERS = 6;

	private static final Map<Integer, Integer> snakePositions = new HashMap<>();
	private static final Map<Integer, Integer> ladderPositions = new HashMap<>();

	private static void initializeSnakesAndLadders() {
		// Initialize snake positions
		snakePositions.put(16, 6);
		snakePositions.put(47, 26);
		snakePositions.put(49, 11);
		snakePositions.put(56, 53);
		snakePositions.put(62, 19);
		snakePositions.put(64, 60);

		// Initialize ladder positions
		ladderPositions.put(1, 38);
		ladderPositions.put(4, 14);
		ladderPositions.put(9, 31);
		ladderPositions.put(21, 42);
		ladderPositions.put(28, 84);
		ladderPositions.put(36, 44);
	}

	private static int checkSnakeOrLadder(int currentPosition) {
		if (snakePositions.containsKey(currentPosition)) {
			int newPosition = snakePositions.get(currentPosition);
			System.out.println("Oh no! Snake bite! Go back to position " + newPosition);
			return newPosition;
		} else if (ladderPositions.containsKey(currentPosition)) {
			int newPosition = ladderPositions.get(currentPosition);
			System.out.println("Yay! Ladder climb! Advance to position " + newPosition);
			return newPosition;
		}
		return currentPosition;
	}

	public static void main(String[] args) {
		initializeSnakesAndLadders();
		playSnakeAndLadder();
	}

	private static int rollDice() {
		Random random = new Random();
		return random.nextInt(TOTAL_DICE_SIDES) + 1;
	}

	private static int calculateNewPosition(int currentPosition, int diceValue) {
		int newPosition = currentPosition + diceValue;
		if (newPosition > WINNING_POSITION) {
			newPosition = currentPosition;
		}
		return newPosition;
	}

	private static void playSnakeAndLadder() {
		int currentPlayer = 1;
		int player1Position = 0;
		int player2Position = 0;

		Scanner scanner = new Scanner(System.in);

		while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {
			System.out.println("Player " + currentPlayer + ", press Enter to roll the dice...");
			scanner.nextLine();

			int diceValue = rollDice(); // 1-6
			System.out.println("Player " + currentPlayer + " rolled a " + diceValue);

			if (currentPlayer == 1) {
				player1Position = calculateNewPosition(player1Position, diceValue);
				player1Position = checkSnakeOrLadder(player1Position);
				System.out.println("Player 1's position: " + player1Position);
				if (player1Position == WINNING_POSITION) {
					System.out.println("Player 1 wins!");
					break;
				}
			} else {
				player2Position = calculateNewPosition(player2Position, diceValue);
				player2Position = checkSnakeOrLadder(player2Position);
				System.out.println("Player 2's position: " + player2Position);
				if (player2Position == WINNING_POSITION) {
					System.out.println("Player 2 wins!");
					break;
				}
			}

			currentPlayer = (currentPlayer == 1) ? 2 : 1;
			System.out.println();
		}
	}

}
