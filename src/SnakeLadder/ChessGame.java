package SnakeLadder;

import java.util.Scanner;

public class ChessGame {
	private static final int BOARD_SIZE = 8;
	private Piece[][] board;
	private boolean whiteTurn;

	public ChessGame() {
		board = new Piece[BOARD_SIZE][BOARD_SIZE];
		initializeBoard();
		whiteTurn = true;
	}

	private void initializeBoard() {
		// Initialize the board with pieces in their 
		// starting positions

		// Place white pieces
		board[0][0] = new Rook(Color.WHITE);
		board[0][1] = new Knight(Color.WHITE);
		board[0][2] = new Bishop(Color.WHITE);
		board[0][3] = new Queen(Color.WHITE);
		board[0][4] = new King(Color.WHITE);
		board[0][5] = new Bishop(Color.WHITE);
		board[0][6] = new Knight(Color.WHITE);
		board[0][7] = new Rook(Color.WHITE);
		for (int i = 0; i < BOARD_SIZE; i++) {
			board[1][i] = new Pawn(Color.WHITE);
		}

		// Place black pieces
		board[7][0] = new Rook(Color.BLACK);
		board[7][1] = new Knight(Color.BLACK);
		board[7][2] = new Bishop(Color.BLACK);
		board[7][3] = new Queen(Color.BLACK);
		board[7][4] = new King(Color.BLACK);
		board[7][5] = new Bishop(Color.BLACK);
		board[7][6] = new Knight(Color.BLACK);
		board[7][7] = new Rook(Color.BLACK);
		for (int i = 0; i < BOARD_SIZE; i++) {
			board[6][i] = new Pawn(Color.BLACK);
		}
	}

	public void play() {
		Scanner scanner = new Scanner(System.in);
		boolean gameOver = false;

		while (!gameOver) {
			drawBoard();
			System.out.println((whiteTurn ? "White's" : "Black's") + " turn.");

			System.out.print("Enter source position (e.g., a2): ");
			String sourcePosition = scanner.nextLine();

			System.out.print("Enter target position (e.g., a4): ");
			String targetPosition = scanner.nextLine();

			int sourceX = sourcePosition.charAt(1) - '1';
			int sourceY = sourcePosition.charAt(0) - 'a';
			int targetX = targetPosition.charAt(1) - '1';
			int targetY = targetPosition.charAt(0) - 'a';

			if (isValidMove(sourceX, sourceY, targetX, targetY)) {
				movePiece(sourceX, sourceY, targetX, targetY);
				whiteTurn = !whiteTurn;
			} else {
				System.out.println("Invalid move. Try again.");
			}

			// Check for game termination conditions, e.g., checkmate, stalemate, etc.
			// ...

			// Sample condition: Terminate the game after 10 moves (5 moves per player)
			if (whiteTurn && board[targetX][targetY] instanceof King && targetY == 6) {
				gameOver = true;
			}
		}
		scanner.close();
	}

	private boolean isValidMove(int sourceX, int sourceY, int targetX, int targetY) {
		// Implement move validation logic here
		// ...
		return true;
	}

	private void movePiece(int sourceX, int sourceY, int targetX, int targetY) {
		Piece piece = board[sourceX][sourceY];
		board[targetX][targetY] = piece;
		board[sourceX][sourceY] = null;
	}

	private void drawBoard() {
		System.out.println("  a b c d e f g h");
		for (int i = 0; i < BOARD_SIZE; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < BOARD_SIZE; j++) {
				Piece piece = board[i][j];
				if (piece == null) {
					System.out.print("- ");
				} else {
					System.out.print(piece.getSymbol() + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ChessGame game = new ChessGame();
		game.play();
	}
}

abstract class Piece {
	private Color color;

	public Piece(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public abstract String getSymbol();
}

class Pawn extends Piece {
	public Pawn(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♙" : "♟";
	}
}

class Rook extends Piece {
	public Rook(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♖" : "♜";
	}
}

class Knight extends Piece {
	public Knight(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♘" : "♞";
	}
}

class Bishop extends Piece {
	public Bishop(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♗" : "♝";
	}
}

class Queen extends Piece {
	public Queen(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♕" : "♛";
	}
}

class King extends Piece {
	public King(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♔" : "♚";
	}
}

enum Color {
	WHITE, BLACK
}
