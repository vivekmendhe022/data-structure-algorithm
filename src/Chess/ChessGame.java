package Chess;

public class ChessGame {

	private static int BOARD_SIZE = 8;
	private Piece[][] board;
	private boolean whiteTurn;

	public ChessGame() {
		board = new Piece[BOARD_SIZE][BOARD_SIZE];
		initializeBoard();
		whiteTurn = true;
	}

	// initializeBoard the board
	private void initializeBoard() {
		// Initialize the board with piece in thier starting position.

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
			board[1][i]=new Pawn(Color.WHITE);
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
			board[6][i]=new Pawn(Color.BLACK);
		}
	}

	private void drawBoard() {
		System.out.println(" a b c d e f g h ");
		for (int i = 0; i < BOARD_SIZE; i++) {

		}
	}

}
